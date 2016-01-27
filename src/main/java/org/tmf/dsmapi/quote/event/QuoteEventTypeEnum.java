package org.tmf.dsmapi.quote.event;

public enum QuoteEventTypeEnum {

    QuoteCreationNotification("QuoteCreationNotification"),
    QuoteUpdateNotification("QuoteUpdateNotification"),
    QuoteDeletionNotification("QuoteDeletionNotification"),
    QuoteValueChangeNotification("QuoteValueChangeNotification"),
    QuoteStatusChangedNotification("QuoteStatusChangedNotification");

    private String text;

    QuoteEventTypeEnum(String text) {
        this.text = text;
    }

    /**
     *
     * @return
     */
    public String getText() {
        return this.text;
    }

    /**
     *
     * @param text
     * @return
     */
    public static QuoteEventTypeEnum fromString(String text) {
        if (text != null) {
            for (QuoteEventTypeEnum b : QuoteEventTypeEnum.values()) {
                if (text.equalsIgnoreCase(b.text)) {
                    return b;
                }
            }
        }
        return null;
    }

}