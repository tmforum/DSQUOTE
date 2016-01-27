package org.tmf.dsmapi.quote.event;

import java.util.Date;
import javax.ejb.Local;
import org.tmf.dsmapi.quote.model.Quote;


@Local
public interface QuoteEventPublisherLocal {

    void publish(QuoteEvent event);

    /**
     *
     * CreateNotification
     * @param bean the bean which has been created
     * @param date the creation date
     */
    public void createNotification(Quote bean, Date date);

    /**
     *
     * DeletionNotification
     * @param bean the bean which has been deleted
     * @param date the deletion date
     */
    public void deletionNotification(Quote bean, Date date);

    /**
     *
     * UpdateNotification (PATCH)
     * @param bean the bean which has been updated
     * @param date the update date
     */
    public void updateNotification(Quote bean, Date date);

    /**
     *
     * ValueChangeNotification
     * @param bean the bean which has been changed
     * @param date the change date
     */
    public void valueChangedNotification(Quote bean, Date date);

    public void statusChangedNotification(Quote bean, Date date);

}
