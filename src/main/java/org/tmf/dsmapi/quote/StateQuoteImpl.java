package org.tmf.dsmapi.quote;

import org.tmf.dsmapi.commons.workflow.StateModelBase;
import org.tmf.dsmapi.quote.model.StateQuote;

public class StateQuoteImpl extends StateModelBase<StateQuote> {
    
    /**
     *
     */
    public StateQuoteImpl() {
        super(StateQuote.class);
    }    

    /**
     *
     */
    @Override
    protected void draw() {
        // First
        fromFirst(StateQuote.IN_PROGRESS).to(StateQuote.APPROVED,
                StateQuote.PENDING,
                StateQuote.CANCELLED);

        // Somewhere
        from(StateQuote.PENDING).to(StateQuote.IN_PROGRESS, StateQuote.CANCELLED);
        from(StateQuote.APPROVED).to(StateQuote.ACCEPTED, StateQuote.REJECTED);       
        from(StateQuote.REJECTED).to(StateQuote.IN_PROGRESS);       

        // Final
        from(StateQuote.CANCELLED);
        from(StateQuote.ACCEPTED);
        from(StateQuote.REJECTED);
    }
}
