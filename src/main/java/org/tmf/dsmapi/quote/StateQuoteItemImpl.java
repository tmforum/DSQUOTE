package org.tmf.dsmapi.quote;

import org.tmf.dsmapi.commons.workflow.StateModelBase;
import org.tmf.dsmapi.quote.model.StateQuote;
import org.tmf.dsmapi.quote.model.StateQuoteItem;

public class StateQuoteItemImpl extends StateModelBase<StateQuoteItem> {
    
    /**
     *
     */
    public StateQuoteItemImpl() {
        super(StateQuoteItem.class);
    }    

    /**
     *
     */
    @Override
    protected void draw() {
        // First
        fromFirst(StateQuoteItem.IN_PROGRESS).to(StateQuoteItem.APPROVED,
                StateQuoteItem.PENDING);

        // Somewhere
        from(StateQuoteItem.PENDING).to(StateQuoteItem.IN_PROGRESS);
        from(StateQuoteItem.APPROVED).to(StateQuoteItem.REJECTED);       

        // Final
        from(StateQuoteItem.REJECTED);
        from(StateQuoteItem.APPROVED);
    }
}
