//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.01.14 à 04:34:12 PM CET 
//


package org.tmf.dsmapi.quote.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.tmf.dsmapi.commons.utils.CustomJsonDateSerializer;


/**
 * <p>Classe Java pour QuoteAuthorization complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="QuoteAuthorization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorizationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="authorizationState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorizationSignatureRepresentation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attachment" type="{http://orange.com/api/quoteManagement/tmf/v1/model/business}Attachment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteAuthorization", propOrder = {
    "authorizationDate",
    "authorizationState",
    "authorizationSignatureRepresentation",
    "attachment"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity(name = "QuoteAuthorization")
@Table(name = "QUOTE_AUTHORIZATION")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(length = 127)
public class QuoteAuthorization
    implements Serializable
{

    private final static long serialVersionUID = 11L;
    @XmlElement(type = String.class)
    @JsonSerialize(using = CustomJsonDateSerializer.class)
    @XmlSchemaType(name = "dateTime")
    protected Date authorizationDate;
    protected String authorizationState;
    protected String authorizationSignatureRepresentation;
    protected List<Attachment> attachment;
    
    protected Long hjid;

    /**
     * Obtient la valeur de la propriété authorizationDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "AUTHORIZATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getAuthorizationDate() {
        return authorizationDate;
    }

    /**
     * Définit la valeur de la propriété authorizationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationDate(Date value) {
        this.authorizationDate = value;
    }

    /**
     * Obtient la valeur de la propriété authorizationState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "AUTHORIZATION_STATE", length = 255)
    public String getAuthorizationState() {
        return authorizationState;
    }

    /**
     * Définit la valeur de la propriété authorizationState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationState(String value) {
        this.authorizationState = value;
    }

    /**
     * Obtient la valeur de la propriété authorizationSignatureRepresentation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "AUTHORIZATION_SIGNATURE_REPR_0", length = 255)
    public String getAuthorizationSignatureRepresentation() {
        return authorizationSignatureRepresentation;
    }

    /**
     * Définit la valeur de la propriété authorizationSignatureRepresentation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationSignatureRepresentation(String value) {
        this.authorizationSignatureRepresentation = value;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attachment }
     * 
     * 
     */
    @OneToMany(targetEntity = Attachment.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ATTACHMENT_QUOTE_AUTHORIZATI_0")
    public List<Attachment> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<Attachment>();
        }
        return this.attachment;
    }

    /**
     * 
     * 
     */
    public void setAttachment(List<Attachment> attachment) {
        this.attachment = attachment;
    }

    /**
     * Obtient la valeur de la propriété hjid.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @com.fasterxml.jackson.annotation.JsonIgnore
    public Long getHjid() {
        return hjid;
    }

    /**
     * Définit la valeur de la propriété hjid.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

}
