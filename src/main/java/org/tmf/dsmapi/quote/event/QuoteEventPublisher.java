package org.tmf.dsmapi.quote.event;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Asynchronous;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.tmf.dsmapi.commons.exceptions.BadUsageException;
import org.tmf.dsmapi.quote.model.Quote;
import org.tmf.dsmapi.hub.Hub;
import org.tmf.dsmapi.hub.HubFacade;

/**
 *
 * Should be async or called with MDB
 */
@Stateless
@Asynchronous
public class QuoteEventPublisher implements QuoteEventPublisherLocal {

    @EJB
    HubFacade hubFacade;
    @EJB
    QuoteEventFacade eventFacade;
    @EJB
    QuoteRESTEventPublisherLocal restEventPublisherLocal;

    /** 
     * Add business logic below. (Right-click in editor and choose
     * "Insert Code > Add Business Method")
     * Access Hubs using callbacks and send to http publisher 
     *(pool should be configured around the RESTEventPublisher bean)
     * Loop into array of Hubs
     * Call RestEventPublisher - Need to implement resend policy plus eviction
     * Filtering is done in RestEventPublisher based on query expression
    */ 
    @Override
    public void publish(QuoteEvent event) {
        try {
            eventFacade.create(event);
        } catch (BadUsageException ex) {
            Logger.getLogger(QuoteEventPublisher.class.getName()).log(Level.SEVERE, null, ex);
        }

        List<Hub> hubList = hubFacade.findAll();
        Iterator<Hub> it = hubList.iterator();
        while (it.hasNext()) {
            Hub hub = it.next();
            restEventPublisherLocal.publish(hub, event);
        }
    }

    @Override
    public void createNotification(Quote bean, Date date) {
        QuoteEvent event = new QuoteEvent();
        event.setEventTime(date);
        event.setEventType(QuoteEventTypeEnum.QuoteCreationNotification);
        //event.setResource(bean);
        publish(event);

    }

    @Override
    public void deletionNotification(Quote bean, Date date) {
        QuoteEvent event = new QuoteEvent();
        event.setEventTime(date);
        event.setEventType(QuoteEventTypeEnum.QuoteDeletionNotification);
        //event.setResource(bean);
        publish(event);
    }
	
    @Override
    public void updateNotification(Quote bean, Date date) {
        QuoteEvent event = new QuoteEvent();
        event.setEventTime(date);
        event.setEventType(QuoteEventTypeEnum.QuoteUpdateNotification);
        //event.setResource(bean);
        publish(event);
    }

    @Override
    public void valueChangedNotification(Quote bean, Date date) {
        QuoteEvent event = new QuoteEvent();
        event.setEventTime(date);
        event.setEventType(QuoteEventTypeEnum.QuoteValueChangeNotification);
        //event.setResource(bean);
        publish(event);
    }

    @Override
    public void statusChangedNotification(Quote bean, Date date) {
        QuoteEvent event = new QuoteEvent();
        event.setEventTime(date);
        event.setEventType(QuoteEventTypeEnum.QuoteStatusChangedNotification);
        //event.setResource(bean);
        publish(event);
    }

}
