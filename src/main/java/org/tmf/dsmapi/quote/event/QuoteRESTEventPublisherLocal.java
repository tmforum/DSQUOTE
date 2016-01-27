package org.tmf.dsmapi.quote.event;

import javax.ejb.Local;
import org.tmf.dsmapi.hub.Hub;

@Local
public interface QuoteRESTEventPublisherLocal {

    public void publish(Hub hub, QuoteEvent event);
    
}
