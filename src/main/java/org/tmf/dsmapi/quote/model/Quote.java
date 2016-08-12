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
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.persistence.IdClass;
import org.tmf.dsmapi.commons.utils.CustomJsonDateSerializer;


/**
 * <p>Classe Java pour Quote complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Quote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billingAccount" type="{http://orange.com/api/quoteManagement/tmf/v1/model/business}BillingAccount" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="state" type="{http://orange.com/api/quoteManagement/tmf/v1/model/business}StateQuote" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="href" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quoteDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="effectiveQuoteCompletionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="quoteCompletionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="notificationContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validFor" type="{http://orange.com/api/quoteManagement/tmf/v1/model/business}ValidFor" minOccurs="0"/>
 *         &lt;element name="note" type="{http://orange.com/api/quoteManagement/tmf/v1/model/business}Note" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="characteristic" type="{http://orange.com/api/quoteManagement/tmf/v1/model/business}Characteristic" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://orange.com/api/quoteManagement/tmf/v1/model/business}Customer" minOccurs="0"/>
 *         &lt;element name="relatedParty" type="{http://orange.com/api/quoteManagement/tmf/v1/model/business}RelatedParty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="agreement" type="{http://orange.com/api/quoteManagement/tmf/v1/model/business}Agreement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="quoteAuthorization" type="{http://orange.com/api/quoteManagement/tmf/v1/model/business}QuoteAuthorization" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="quoteProductOfferingPrice" type="{http://orange.com/api/quoteManagement/tmf/v1/model/business}QuoteProductOfferingPrice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="quoteItem" type="{http://orange.com/api/quoteManagement/tmf/v1/model/business}QuoteItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quote", propOrder = {
    "billingAccount",
    "state",
    "id",
    "href",
    "externalId",
    "description",
    "category",
    "version",
    "quoteDate",
    "effectiveQuoteCompletionDate",
    "quoteCompletionDate",
    "notificationContact",
    "validFor",
    "note",
    "characteristic",
    "customer",
    "relatedParty",
    "agreement",
    "quoteAuthorization",
    "quoteProductOfferingPrice",
    "quoteItem"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity(name = "Quote")
@Table(name = "QUOTE")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(length = 127)
@IdClass(QuotePK.class)
public class Quote
    implements Serializable
{

    private final static long serialVersionUID = 11L;
    protected List<BillingAccount> billingAccount;
    protected StateQuote state;
    protected String id;
    protected String href;
    protected String externalId;
    protected String description;
    protected String category;
    protected String version;
    @XmlElement(type = String.class)
    @JsonSerialize(using = CustomJsonDateSerializer.class)
    @XmlSchemaType(name = "dateTime")
    protected Date quoteDate;
    @XmlElement(type = String.class)
    @JsonSerialize(using = CustomJsonDateSerializer.class)
    @XmlSchemaType(name = "dateTime")
    protected Date effectiveQuoteCompletionDate;
    @XmlElement(type = String.class)
    @JsonSerialize(using = CustomJsonDateSerializer.class)
    @XmlSchemaType(name = "dateTime")
    protected Date quoteCompletionDate;
    protected String notificationContact;
    protected ValidFor validFor;
    protected List<Note> note;
    protected List<Characteristic> characteristic;
    protected Customer customer;
    protected List<RelatedParty> relatedParty;
    protected List<Agreement> agreement;
    protected List<QuoteAuthorization> quoteAuthorization;
    protected List<QuoteProductOfferingPrice> quoteProductOfferingPrice;
    protected List<QuoteItem> quoteItem;

    /**
     * Gets the value of the billingAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingAccount }
     * 
     * 
     */
    @OneToMany(targetEntity = BillingAccount.class, cascade = {
        CascadeType.ALL
    })
    //@JoinColumn(name = "BILLING_ACCOUNT_QUOTE_ID")
    @JoinColumns({
        @JoinColumn(name = "BILLING_ACCOUNT_QUOTE_ID",referencedColumnName = "ID"),
        @JoinColumn(name = "BILLING_ACCOUNT_QUOTE_VERSION",referencedColumnName = "VERSION_")
    })
    public List<BillingAccount> getBillingAccount() {
        if (billingAccount == null) {
            billingAccount = new ArrayList<BillingAccount>();
        }
        return this.billingAccount;
    }

    /**
     * 
     * 
     */
    public void setBillingAccount(List<BillingAccount> billingAccount) {
        this.billingAccount = billingAccount;
    }

    /**
     * Obtient la valeur de la propriété state.
     * 
     * @return
     *     possible object is
     *     {@link StateQuote }
     *     
     */
    @Basic
    @Column(name = "STATE_", length = 255)
    @Enumerated(EnumType.STRING)
    public StateQuote getState() {
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
    public void setState(StateQuote value) {
        this.state = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Id
    @Column(name = "ID",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
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
     * Obtient la valeur de la propriété href.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "HREF", length = 255)
    public String getHref() {
        return href;
    }

    /**
     * Définit la valeur de la propriété href.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Obtient la valeur de la propriété externalId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "EXTERNAL_ID", length = 255)
    public String getExternalId() {
        return externalId;
    }

    /**
     * Définit la valeur de la propriété externalId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Obtient la valeur de la propriété description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DESCRIPTION", length = 255)
    public String getDescription() {
        return description;
    }

    /**
     * Définit la valeur de la propriété description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtient la valeur de la propriété category.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CATEGORY", length = 255)
    public String getCategory() {
        return category;
    }

    /**
     * Définit la valeur de la propriété category.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Obtient la valeur de la propriété version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Id
    @Column(name = "VERSION_",nullable = false, length = 255)
    public String getVersion() {
        return version;
    }

    /**
     * Définit la valeur de la propriété version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Obtient la valeur de la propriété quoteDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "QUOTE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getQuoteDate() {
        return quoteDate;
    }

    /**
     * Définit la valeur de la propriété quoteDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteDate(Date value) {
        this.quoteDate = value;
    }

    /**
     * Obtient la valeur de la propriété effectiveQuoteCompletionDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "EFFECTIVE_QUOTE_COMPLETION_D_0")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getEffectiveQuoteCompletionDate() {
        return effectiveQuoteCompletionDate;
    }

    /**
     * Définit la valeur de la propriété effectiveQuoteCompletionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveQuoteCompletionDate(Date value) {
        this.effectiveQuoteCompletionDate = value;
    }

    /**
     * Obtient la valeur de la propriété quoteCompletionDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "QUOTE_COMPLETION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getQuoteCompletionDate() {
        return quoteCompletionDate;
    }

    /**
     * Définit la valeur de la propriété quoteCompletionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteCompletionDate(Date value) {
        this.quoteCompletionDate = value;
    }

    /**
     * Obtient la valeur de la propriété notificationContact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "NOTIFICATION_CONTACT", length = 255)
    public String getNotificationContact() {
        return notificationContact;
    }

    /**
     * Définit la valeur de la propriété notificationContact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationContact(String value) {
        this.notificationContact = value;
    }

    /**
     * Obtient la valeur de la propriété validFor.
     * 
     * @return
     *     possible object is
     *     {@link ValidFor }
     *     
     */
    @ManyToOne(targetEntity = ValidFor.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "VALID_FOR_QUOTE_HJID")
    public ValidFor getValidFor() {
        return validFor;
    }

    /**
     * Définit la valeur de la propriété validFor.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidFor }
     *     
     */
    public void setValidFor(ValidFor value) {
        this.validFor = value;
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
    //@JoinColumn(name = "NOTE_QUOTE_ID", referencedColumnName = "ID")
    @JoinColumns({
        @JoinColumn(name = "NOTE_QUOTE_ID",referencedColumnName = "ID"),
        @JoinColumn(name = "NOTE_QUOTE_VERSION",referencedColumnName = "VERSION_")
    })
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
     * Gets the value of the characteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Characteristic }
     * 
     * 
     */
    @OneToMany(targetEntity = Characteristic.class, cascade = {
        CascadeType.ALL
    })
    //@JoinColumn(name = "CHARACTERISTIC_QUOTE_ID", referencedColumnName = "ID")
    @JoinColumns({
        @JoinColumn(name = "CHARACTERISTIC_QUOTE_ID",referencedColumnName = "ID"),
        @JoinColumn(name = "CHARACTERISTIC_QUOTE_VERSION",referencedColumnName = "VERSION_")
    })
    public List<Characteristic> getCharacteristic() {
        if (characteristic == null) {
            characteristic = new ArrayList<Characteristic>();
        }
        return this.characteristic;
    }

    /**
     * 
     * 
     */
    public void setCharacteristic(List<Characteristic> characteristic) {
        this.characteristic = characteristic;
    }

    /**
     * Obtient la valeur de la propriété customer.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    @ManyToOne(targetEntity = Customer.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CUSTOMER_QUOTE_HJID")
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Définit la valeur de la propriété customer.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomer(Customer value) {
        this.customer = value;
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
    @JoinColumns({
        @JoinColumn(name = "RELATED_PARTY_QUOTE_ID",referencedColumnName = "ID"),
        @JoinColumn(name = "RELATED_PARTY_QUOTE_VERSION",referencedColumnName = "VERSION_")
    })
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
     * Gets the value of the agreement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agreement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgreement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Agreement }
     * 
     * 
     */
    @OneToMany(targetEntity = Agreement.class, cascade = {
        CascadeType.ALL
    })
    //@JoinColumn(name = "AGREEMENT_QUOTE_ID")
    @JoinColumns({
        @JoinColumn(name = "AGREEMENT_QUOTE_ID",referencedColumnName = "ID"),
        @JoinColumn(name = "AGREEMENT_QUOTE_VERSION",referencedColumnName = "VERSION_")
    })
    public List<Agreement> getAgreement() {
        if (agreement == null) {
            agreement = new ArrayList<Agreement>();
        }
        return this.agreement;
    }

    /**
     * 
     * 
     */
    public void setAgreement(List<Agreement> agreement) {
        this.agreement = agreement;
    }

    /**
     * Gets the value of the QuoteAuthorization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the QuoteAuthorization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuoteAuthorization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteAuthorization }
     * 
     * 
     */
    @OneToMany(targetEntity = QuoteAuthorization.class, cascade = {
        CascadeType.ALL
    })
    //@JoinColumn(name = "QUOTE_AUTHORIZATION_QUOTE_ID")
    @JoinColumns({
        @JoinColumn(name = "QUOTE_AUTHORIZATION_QUOTE_ID",referencedColumnName = "ID"),
        @JoinColumn(name = "QUOTE_AUTHORIZATION_QUOTE_VERSION",referencedColumnName = "VERSION_")
    })
    public List<QuoteAuthorization> getQuoteAuthorization() {
        if (quoteAuthorization == null) {
            quoteAuthorization = new ArrayList<QuoteAuthorization>();
        }
        return this.quoteAuthorization;
    }
    
    /**
     * 
     * 
     */
    public void setQuoteAuthorization(List<QuoteAuthorization> quoteAuthorization) {
        this.quoteAuthorization = quoteAuthorization;
    }
    
    /**
     * Gets the value of the quoteProductOfferingPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quoteProductOfferingPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuoteProductOfferingPrice().add(newItem);
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
    //@JoinColumn(name = "QUOTE_PRODUCT_OFFERING_PRICE_0")
    @JoinColumns({
        @JoinColumn(name = "QUOTE_PRODUCT_OFFERING_PRICE_QUOTE_ID",referencedColumnName = "ID"),
        @JoinColumn(name = "QUOTE_PRODUCT_OFFERING_PRICE_QUOTE_VERSION",referencedColumnName = "VERSION_")
    })
    public List<QuoteProductOfferingPrice> getQuoteProductOfferingPrice() {
        if (quoteProductOfferingPrice == null) {
            quoteProductOfferingPrice = new ArrayList<QuoteProductOfferingPrice>();
        }
        return this.quoteProductOfferingPrice;
    }

    /**
     * 
     * 
     */
    public void setQuoteProductOfferingPrice(List<QuoteProductOfferingPrice> quoteProductOfferingPrice) {
        this.quoteProductOfferingPrice = quoteProductOfferingPrice;
    }

    /**
     * Gets the value of the quoteItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quoteItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuoteItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteItem }
     * 
     * 
     */
    @OneToMany(targetEntity = QuoteItem.class, cascade = {
        CascadeType.ALL
    })
    //@JoinColumn(name = "QUOTE_ITEM_QUOTE_ID")
    @JoinColumns({
        @JoinColumn(name = "QUOTE_ITEM_QUOTE_ID",referencedColumnName = "ID"),
        @JoinColumn(name = "QUOTE_ITEM_QUOTE_VERSION",referencedColumnName = "VERSION_")
    })
    public List<QuoteItem> getQuoteItem() {
        if (quoteItem == null) {
            quoteItem = new ArrayList<QuoteItem>();
        }
        return this.quoteItem;
    }

    /**
     * 
     * 
     */
    public void setQuoteItem(List<QuoteItem> quoteItem) {
        this.quoteItem = quoteItem;
    }

}
