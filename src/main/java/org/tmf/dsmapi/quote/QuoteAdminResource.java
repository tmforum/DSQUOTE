package org.tmf.dsmapi.quote;

import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.tmf.dsmapi.commons.exceptions.BadUsageException;
import org.tmf.dsmapi.commons.exceptions.ExceptionType;
import org.tmf.dsmapi.commons.exceptions.UnknownResourceException;
import org.tmf.dsmapi.commons.jaxrs.Report;
import org.tmf.dsmapi.quote.model.Quote;
import org.tmf.dsmapi.quote.QuoteFacade;
import org.tmf.dsmapi.quote.event.QuoteEvent;
import org.tmf.dsmapi.quote.event.QuoteEventFacade;
import org.tmf.dsmapi.quote.event.QuoteEventPublisherLocal;

@Stateless
@Path("admin/quote")
public class QuoteAdminResource {

    @EJB
    QuoteFacade quoteFacade;
    @EJB
    QuoteEventFacade eventFacade;

    @GET
    @Produces({"application/json"})
    public List<Quote> findAll() {
        return quoteFacade.findAll();
    }

    /**
     *
     * For test purpose only
     * @param entities
     * @return
     */
    @POST
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public Response post(List<Quote> entities) {

        if (entities == null) {
            return Response.status(Response.Status.BAD_REQUEST.getStatusCode()).build();
        }

        int previousRows = quoteFacade.count();
        int affectedRows=0;

        // Try to persist entities
        try {
            for (Quote entitie : entities) {
//                quoteFacade.checkCreation(entitie);
                quoteFacade.create(entitie);
//                entitie.setHref(info.getAbsolutePath() + "/" + Long.toString(entitie.getId()));
//                quoteFacade.edit(entitie);
                affectedRows = affectedRows + 1;
            }
        } catch (BadUsageException e) {
            return Response.status(Response.Status.BAD_REQUEST.getStatusCode()).build();
        }

        Report stat = new Report(quoteFacade.count());
        stat.setAffectedRows(affectedRows);
        stat.setPreviousRows(previousRows);

        // 201 OK
        return Response.created(null).
                entity(stat).
                build();
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public Response update(@PathParam("id") String id, Quote entity) throws UnknownResourceException {
        Response response = null;
        Quote quote = quoteFacade.find(id);
        if (quote != null) {
            entity.setId(id);
            quoteFacade.edit(entity);
            // 200 OK + location
            response = Response.status(Response.Status.OK).entity(entity).build();

        } else {
            // 404 not found
            response = Response.status(Response.Status.NOT_FOUND).build();
        }
        return response;
    }

    /**
     *
     * For test purpose only
     * @return
     * @throws org.tmf.dsmapi.commons.exceptions.UnknownResourceException
     */
    @DELETE
    public Report deleteAll() throws UnknownResourceException {

        eventFacade.removeAll();
        int previousRows = quoteFacade.count();
        quoteFacade.removeAll();
        List<Quote> pis = quoteFacade.findAll();
        for (Quote pi : pis) {
            delete(pi.getId());
        }

        int currentRows = quoteFacade.count();
        int affectedRows = previousRows - currentRows;

        Report stat = new Report(currentRows);
        stat.setAffectedRows(affectedRows);
        stat.setPreviousRows(previousRows);

        return stat;
    }

    /**
     *
     * For test purpose only
     * @param id
     * @return
     * @throws UnknownResourceException
     */
    @DELETE
    @Path("{id}:(version={version})")
    public Response delete(@PathParam("id") String id, @PathParam("version") String ver) throws UnknownResourceException {
        int previousRows = quoteFacade.count();
        //Quote entity = quoteFacade.find(id);
        Quote entity = quoteFacade.findQuoteByIdAndVersion(id, ver);
        if (entity == null) {
            throw new UnknownResourceException(ExceptionType.UNKNOWN_RESOURCE,
                        "not found quote with id :" + id + " and the version :" + ver);
        }
        try {
            //Pause for 4 seconds to finish notification
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(QuoteAdminResource.class.getName()).log(Level.SEVERE, null, ex);
        }
        // remove event(s) binding to the resource
        List<QuoteEvent> events = eventFacade.findAll();
        for (QuoteEvent event : events) {
//            if (event.getResource().getId().equals(id)) {
//                eventFacade.remove(event.getId());
//            }
        }
        //remove resource
        quoteFacade.removeQuoteWithVersion(entity);

        int affectedRows = 1;
        Report stat = new Report(quoteFacade.count());
        stat.setAffectedRows(affectedRows);
        stat.setPreviousRows(previousRows);

        // 200 
        Response response = Response.ok(stat).build();
        return response;
    }

    /**
     *
     * For test purpose only
     * @param id
     * @return
     * @throws UnknownResourceException
     */
    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") String id) throws UnknownResourceException {
        int previousRows = quoteFacade.count();
        List<Quote> allEntity = quoteFacade.findAllQuoteById(id);
        if (null == allEntity || allEntity.isEmpty()) {
            throw new UnknownResourceException(ExceptionType.UNKNOWN_RESOURCE,
                        "not found quote with id :" + id);
        }
        try {
            //Pause for 4 seconds to finish notification
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(QuoteAdminResource.class.getName()).log(Level.SEVERE, null, ex);
        }
        // remove event(s) binding to the resource
        List<QuoteEvent> events = eventFacade.findAll();
        for (QuoteEvent event : events) {
//            if (event.getResource().getId().equals(id)) {
//                eventFacade.remove(event.getId());
//            }
        }
        //remove resource
        quoteFacade.removeAllQuote(allEntity);

        int affectedRows = 1;
        Report stat = new Report(quoteFacade.count());
        //stat.setAffectedRows(affectedRows);
        stat.setAffectedRows(allEntity.size());
        stat.setPreviousRows(previousRows);

        // 200 
        Response response = Response.ok(stat).build();
        return response;
    }
    
    @GET
    @Produces({"application/json"})
    @Path("event")
    public List<QuoteEvent> findAllEvents() {
        return eventFacade.findAll();
    }

    @DELETE
    @Path("event")
    public Report deleteAllEvent() {

        int previousRows = eventFacade.count();
        eventFacade.removeAll();
        int currentRows = eventFacade.count();
        int affectedRows = previousRows - currentRows;

        Report stat = new Report(currentRows);
        stat.setAffectedRows(affectedRows);
        stat.setPreviousRows(previousRows);

        return stat;
    }

    @DELETE
    @Path("event/{id}")
    public Response deleteEvent(@PathParam("id") String id) throws UnknownResourceException {

        int previousRows = eventFacade.count();
        List<QuoteEvent> events = eventFacade.findAll();
        for (QuoteEvent event : events) {
//            if (event.getResource().getId().equals(id)) {
//                eventFacade.remove(event.getId());
//
//            }
        }
        int currentRows = eventFacade.count();
        int affectedRows = previousRows - currentRows;

        Report stat = new Report(currentRows);
        stat.setAffectedRows(affectedRows);
        stat.setPreviousRows(previousRows);

        // 200 
        Response response = Response.ok(stat).build();
        return response;
    }

    /**
     *
     * @return
     */
    @GET
    @Path("count")
    @Produces({"application/json"})
    public Report count() {
        return new Report(quoteFacade.count());
    }
}
