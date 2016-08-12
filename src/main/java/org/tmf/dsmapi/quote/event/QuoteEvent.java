package org.tmf.dsmapi.quote.event;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import org.tmf.dsmapi.commons.utils.CustomJsonDateSerializer;
import org.tmf.dsmapi.quote.model.Quote;

@XmlRootElement
@Entity
@Table(name="Event_Quote")
@JsonPropertyOrder(value = {"eventId","eventTime", "eventType", "resource"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuoteEvent implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = CustomJsonDateSerializer.class)
    private Date eventTime;

    @Enumerated(value = EnumType.STRING)
    private QuoteEventTypeEnum eventType;

//    @JsonIgnore
//    @OneToOne(targetEntity = Quote.class, cascade ={ CascadeType.MERGE, CascadeType.REFRESH, CascadeType.REMOVE, CascadeType.DETACH}, fetch = FetchType.EAGER)
//    @JoinColumns({
//        @JoinColumn(name="QUOTE_ID",  referencedColumnName="ID"),
//        @JoinColumn(name="QUOTE_VERSION", referencedColumnName="VERSION_")
//    })
//    private Quote resource; //check for object

    @JsonProperty("eventId")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public QuoteEventTypeEnum getEventType() {
        return eventType;
    }

    public void setEventType(QuoteEventTypeEnum eventType) {
        this.eventType = eventType;
    }

    
//    public Quote getResource() {
//        return resource;
//    }
//
//    public void setResource(Quote resource) {
//        this.resource = resource;
//    }

    @JsonAutoDetect(fieldVisibility = ANY)
    class EventBody {
        private Quote entity;
        public Quote getQuote() {
            return entity;
        }
        public EventBody(Quote entity) { 
        this.entity = entity;
		}
    }

//	@JsonProperty("event")
//	public EventBody getEvent() {
//	   return new EventBody(getResource() );
//	}

    @Override
    public String toString() {
        return "QuoteEvent{" + "id=" + id + ", eventTime=" + eventTime + ", eventType=" + eventType
                //+ ", event=" + resource 
                + '}';
    }

}
