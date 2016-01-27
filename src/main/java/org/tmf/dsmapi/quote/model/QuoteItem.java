//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.01.14 à 04:34:12 PM CET 
//


package org.tmf.dsmapi.quote.model;

import java.io.Serializable;
import java.util.ArrayList;
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


/**
 * <p>Classe Java pour QuoteItem complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="QuoteItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attachment" type="{http://orange.com/api/quoteManagement/tmf/v1/model/business}Attachment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatedParty" type="{http://orange.com/api/quoteManagement/tmf/v1/model/business}RelatedParty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="note" type="{http://orange.com/api/quoteManagement/tmf/v1/model/business}Note" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productOffering" type="{http://orange.com/api/quoteManagement/tmf/v1/model/business}ProductOffering" minOccurs="0"/>
 *         &lt;element name="product" type="{http://orange.com/api/quoteManagement/tmf/v1/model/business}Product" minOccurs="0"/>
 *         &lt;element name="itemQuoteProductOfferingPrice" type="{http://orange.com/api/quoteManagement/tmf/v1/model/business}QuoteProductOfferingPrice" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteItem", propOrder = {
    "id",
    "state",
    "action",
    "appointment",
    "attachment",
    "relatedParty",
    "note",
    "productOffering",
    "product",
    "itemQuoteProductOfferingPrice"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity(name = "QuoteItem")
@Table(name = "QUOTE_ITEM")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(length = 127)
public class QuoteItem
    implements Serializable
{

    private final static long serialVersionUID = 11L;
    protected String id;
    protected StateQuoteItem state;
    protected String action;
    protected String appointment;
    protected Attachment attachment;
    protected List<RelatedParty> relatedParty;
    protected List<Note> note;
    protected ProductOffering productOffering;
    protected Product product;
    protected List<QuoteProductOfferingPrice> itemQuoteProductOfferingPrice;
    
    protected Long hjid;

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ID", length = 255)
    public String getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété state.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "STATE_", length = 255)
    @Enumerated(EnumType.STRING)
    public StateQuoteItem getState() {
        return state;
    }

    /**
     * Définit la valeur de la propriété state.
     * 
     * @param value
     *     allowed object is
     *     {@link StateQuote }
     *     
     */
    public void setState(StateQuoteItem value) {
        this.state = value;
    }

    /**
     * Obtient la valeur de la propriété action.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ACTION_", length = 255)
    public String getAction() {
        return action;
    }

    /**
     * Définit la valeur de la propriété action.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Obtient la valeur de la propriété appointment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "APPOINTMENT_", length = 255)
    public String getAppointment() {
        return appointment;
    }

    /**
     * Définit la valeur de la propriété appointment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointment(String value) {
        this.appointment = value;
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
    @ManyToOne(targetEntity = Attachment.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ATTACHMENT_QUOTE_ITEM_HJID")
    public Attachment getAttachment() {
        return this.attachment;
    }

    /**
     * 
     * 
     */
    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    /**
     * Gets the value of the relatedParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedParty }
     * 
     * 
     */
    @OneToMany(targetEntity = RelatedParty.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "RELATED_PARTY_QUOTE_ITEM_HJID")
    public List<RelatedParty> getRelatedParty() {
        if (relatedParty == null) {
            relatedParty = new ArrayList<RelatedParty>();
        }
        return this.relatedParty;
    }

    /**
     * 
     * 
     */
    public void setRelatedParty(List<RelatedParty> relatedParty) {
        this.relatedParty = relatedParty;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Note }
     * 
     * 
     */
    @OneToMany(targetEntity = Note.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "NOTE_QUOTE_ITEM_HJID")
    public List<Note> getNote() {
        if (note == null) {
            note = new ArrayList<Note>();
        }
        return this.note;
    }

    /**
     * 
     * 
     */
    public void setNote(List<Note> note) {
        this.note = note;
    }

    /**
     * Obtient la valeur de la propriété productOffering.
     * 
     * @return
     *     possible object is
     *     {@link ProductOffering }
     *     
     */
    @ManyToOne(targetEntity = ProductOffering.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PRODUCT_OFFERING_QUOTE_ITEM__0")
    public ProductOffering getProductOffering() {
        return productOffering;
    }

    /**
     * Définit la valeur de la propriété productOffering.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductOffering }
     *     
     */
    public void setProductOffering(ProductOffering value) {
        this.productOffering = value;
    }

    /**
     * Obtient la valeur de la propriété product.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    @ManyToOne(targetEntity = Product.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PRODUCT_QUOTE_ITEM_HJID")
    public Product getProduct() {
        return product;
    }

    /**
     * Définit la valeur de la propriété product.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
    }

    /**
     * Gets the value of the itemQuoteProductOfferingPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemQuoteProductOfferingPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemQuoteProductOfferingPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteProductOfferingPrice }
     * 
     * 
     */
    @OneToMany(targetEntity = QuoteProductOfferingPrice.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ITEM_QUOTE_PRODUCT_OFFERING__1")
    public List<QuoteProductOfferingPrice> getItemQuoteProductOfferingPrice() {
        if (itemQuoteProductOfferingPrice == null) {
            itemQuoteProductOfferingPrice = new ArrayList<QuoteProductOfferingPrice>();
        }
        return this.itemQuoteProductOfferingPrice;
    }

    /**
     * 
     * 
     */
    public void setItemQuoteProductOfferingPrice(List<QuoteProductOfferingPrice> itemQuoteProductOfferingPrice) {
        this.itemQuoteProductOfferingPrice = itemQuoteProductOfferingPrice;
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
