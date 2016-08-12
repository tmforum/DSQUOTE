package org.tmf.dsmapi.quote;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import org.tmf.dsmapi.commons.jaxrs.PATCH;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.github.fge.jsonpatch.JsonPatch;
import com.github.fge.jsonpatch.JsonPatchException;
import com.github.fge.jsonpatch.diff.JsonDiff;
import org.tmf.dsmapi.commons.exceptions.BadUsageException;
import org.tmf.dsmapi.commons.exceptions.ExceptionType;
import org.tmf.dsmapi.commons.exceptions.UnknownResourceException;
import org.tmf.dsmapi.commons.utils.Jackson;
import org.tmf.dsmapi.commons.utils.URIParser;
import org.tmf.dsmapi.quote.model.Quote;
import org.tmf.dsmapi.quote.QuoteFacade;
import org.tmf.dsmapi.quote.event.QuoteEventPublisherLocal;

@Stateless
@Path("/quoteManagement/v1/quote")
public class QuoteResource {

    @EJB
    QuoteFacade quoteFacade;
    @EJB
    QuoteEventPublisherLocal publisher;

    public QuoteResource() {
    }

    @POST
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public Response create(Quote entity,@Context UriInfo info) throws BadUsageException, UnknownResourceException  {
        quoteFacade.checkCreation(entity);
        quoteFacade.create(entity);
        entity.setHref(info.getAbsolutePath() + "/" + entity.getId());
        quoteFacade.edit(entity);
        publisher.createNotification(entity, new Date());
        // 201
        Response response = Response.status(Response.Status.CREATED).entity(entity).build();
        return response;
    }

    @GET
    @Produces({"application/json"})
    public Response find(@Context UriInfo info) throws BadUsageException {

        // search queryParameters
        MultivaluedMap<String, String> queryParameters = info.getQueryParameters();

        Map<String, List<String>> mutableMap = new HashMap();
        for (Map.Entry<String, List<String>> e : queryParameters.entrySet()) {
            mutableMap.put(e.getKey(), e.getValue());
        }

        // fields to filter view
        Set<String> fieldSet = URIParser.getFieldsSelection(mutableMap);

        Set<Quote> resultList = findByCriteria(mutableMap);

        Response response;
        if (fieldSet.isEmpty() || fieldSet.contains(URIParser.ALL_FIELDS)) {
            response = Response.ok(resultList).build();
        } else {
            fieldSet.add(URIParser.ID_FIELD);
            List<ObjectNode> nodeList = Jackson.createNodes(resultList, fieldSet);
            response = Response.ok(nodeList).build();
        }
        return response;
    }

    // return Set of unique elements to avoid List with same elements in case of join
    private Set<Quote> findByCriteria(Map<String, List<String>> criteria) throws BadUsageException {

        List<Quote> resultList = null;
        if (criteria != null && !criteria.isEmpty()) {
            resultList = quoteFacade.findByCriteria(criteria, Quote.class);
        } else {
            resultList = quoteFacade.findAll();
        }
        if (resultList == null) {
            return new LinkedHashSet<Quote>();
        } else {
            return new LinkedHashSet<Quote>(resultList);
        }
    }

    
    @GET
    @Path("{id}")
    @Produces({"application/json"})
    public Response get(@PathParam("id") String id,  @Context UriInfo info) throws UnknownResourceException {

        Set<String> fieldSet = getFieldSet(info);

        //Quote quote = quoteFacade.find(id);
        Quote quote = quoteFacade.findQuoteById(id);
        Response response;
       
        // If the result list (list of bills) is not empty, it conains only 1 unique bill
        if (quote != null) {
            // 200
            if (fieldSet.isEmpty() || fieldSet.contains(URIParser.ALL_FIELDS)) {
                response = Response.ok(quote).build();
            } else {
                fieldSet.add(URIParser.ID_FIELD);
                ObjectNode node = Jackson.createNode(quote, fieldSet);
                response = Response.ok(node).build();
            }
        } else {
            // 404 not found
            response = Response.status(Response.Status.NOT_FOUND).build();
        }
        return response;
    }

    
    @GET
    @Path("{id}:(version={version})")
    @Produces({"application/json"})
    public Response getByVersion(@PathParam("id") String id,@PathParam("version") String ver,  @Context UriInfo info) throws BadUsageException {

        Set<String> fieldSet = getFieldSet(info);
        
        Quote quote = quoteFacade.findQuoteByIdAndVersion(id,ver);
        Response response;
        
        // If the result list (list of bills) is not empty, it conains only 1 unique bill
        if (quote != null) {
            // 200
            if (fieldSet.isEmpty() || fieldSet.contains(URIParser.ALL_FIELDS)) {
                response = Response.ok(quote).build();
            } else {
                fieldSet.add(URIParser.ID_FIELD);
                ObjectNode node = Jackson.createNode(quote, fieldSet);
                response = Response.ok(node).build();
            }
        } else {
            // 404 not found
            response = Response.status(Response.Status.NOT_FOUND).build();
        }
        return response;
        
    }
    
    @PATCH
    @Path("{id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public Response patch(@PathParam("id") String id, Quote partialEntity) throws BadUsageException, UnknownResourceException {
        Response response = null;
        Quote currentEntity = quoteFacade.patchAttributs(id, null, partialEntity);

        // 200 OK + location
        response = Response.status(Response.Status.OK).entity(currentEntity).build();

        return response;
    }
    
    @PATCH
    @Path("{id}:(version={version})")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public Response patchWithVersion(@PathParam("id") String id,@PathParam("version") String ver, Quote partialEntity) throws BadUsageException, UnknownResourceException {
        Response response = null;
        Quote currentEntity = quoteFacade.patchAttributs(id, ver, partialEntity);

        // 200 OK + location
        response = Response.status(Response.Status.OK).entity(currentEntity).build();

        return response;
    }

    @PATCH
    @Path("{id}")
    @Consumes("application/json-patch+json")
    @Produces({"application/json"})
    public Response jsonPatch(@PathParam("id") String id, JsonPatch patch) throws BadUsageException, UnknownResourceException, JsonPatchException, JsonProcessingException {
        Response response = null;
        //recup de l'entity persistée
        //Quote currentEntity = quoteFacade.find(id);
        Quote currentEntity = quoteFacade.findQuoteById(id);
        if (currentEntity == null) {
            throw new BadUsageException(ExceptionType.BAD_USAGE_GENERIC,
                        "not found quote with id :" + id );
        }
        //creation d'un JsonNode avec l'entity persistée
        ObjectMapper mapper = new ObjectMapper();
        JsonNode currentNode = mapper.convertValue(currentEntity, JsonNode.class);
        //patch de ce jsonNode
        final JsonNode patchedNode = patch.apply(currentNode);
        //transforme le JsonNode en Bean
        Quote patchCategory = mapper.treeToValue(patchedNode, Quote.class);
        //appel à la persistence
        //check for modify
        quoteFacade.checkPatchAttributs(currentEntity,patchCategory);
        quoteFacade.edit(patchCategory);
        // 200 OK + location
        response = Response.status(Response.Status.OK).entity(patchCategory).build();
        return response;
    }

    @PATCH
    @Path("{id}:(version={version})")
    @Consumes("application/json-patch+json")
    @Produces({"application/json"})
    public Response jsonPatchWithVersion(@PathParam("id") String id ,@PathParam("version") String ver, JsonPatch patch) throws BadUsageException, UnknownResourceException, JsonPatchException, JsonProcessingException {
        Response response = null;
        //recup de l'entity persistée
        //Quote currentEntity = quoteFacade.find(id);
        Quote currentEntity = quoteFacade.findQuoteByIdAndVersion(id, ver);
        if (currentEntity == null) {
            throw new BadUsageException(ExceptionType.BAD_USAGE_GENERIC,
                        "not found quote with id :" + id + " and the version :" + ver);
        }
        //creation d'un JsonNode avec l'entity persistée
        ObjectMapper mapper = new ObjectMapper();
        JsonNode currentNode = mapper.convertValue(currentEntity, JsonNode.class);
        //patch de ce jsonNode
        final JsonNode patchedNode = patch.apply(currentNode);
        //transforme le JsonNode en Bean
        Quote patchCategory = mapper.treeToValue(patchedNode, Quote.class);
        ////check for modify
        quoteFacade.checkPatchAttributs(currentEntity,patchCategory);
        //appel à la persistence
        quoteFacade.edit(patchCategory);
        // 200 OK + location
        response = Response.status(Response.Status.OK).entity(patchCategory).build();
        return response;
    }
    
    @POST
    @Path("getjsonpatch/{id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public Response getJsonPatch(@PathParam("id") String id, Quote patchEntity) throws BadUsageException, UnknownResourceException {
        Response response = null;
        Quote currentEntity = quoteFacade.find(id);
        ObjectMapper mapper = new ObjectMapper();
        JsonNode currentNode = mapper.convertValue(currentEntity, JsonNode.class);
        JsonNode patchNode = mapper.convertValue(patchEntity, JsonNode.class);

        JsonPatch patch = JsonDiff.asJsonPatch(currentNode, patchNode);

        // 200 OK + location
        response = Response.status(Response.Status.OK).entity(patch).build();

        return response;
    }

    private Set<String> getFieldSet(UriInfo info) {
        // search queryParameters
        MultivaluedMap<String, String> queryParameters = info.getQueryParameters();

        Map<String, List<String>> mutableMap = new HashMap();
        for (Map.Entry<String, List<String>> e : queryParameters.entrySet()) {
            mutableMap.put(e.getKey(), e.getValue());
        }
        
        // fields to filter view
        Set<String> fieldSet = URIParser.getFieldsSelection(mutableMap);
        
        return fieldSet;
    }
}
