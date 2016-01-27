package org.tmf.dsmapi.quote.event;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.tmf.dsmapi.commons.facade.AbstractFacade;

@Stateless
public class QuoteEventFacade extends AbstractFacade<QuoteEvent>{
    
    @PersistenceContext(unitName = "DSQuotePU")
    private EntityManager em;
   

    
    /**
     *
     */
    public QuoteEventFacade() {
        super(QuoteEvent.class);
    }


    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
