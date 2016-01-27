//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.01.14 à 04:34:12 PM CET 
//


package org.tmf.dsmapi.quote.model;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonInclude;


/**
 * <p>Classe Java pour QuoteProductOfferingPrice complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="QuoteProductOfferingPrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="priceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recurringChargePeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quotePriceAlteration" type="{http://orange.com/api/quoteManagement/tmf/v1/model/business}QuotePriceAlteration" minOccurs="0"/>
 *         &lt;element name="price" type="{http://orange.com/api/quoteManagement/tmf/v1/model/business}Price" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteProductOfferingPrice", propOrder = {
    "priceType",
    "recurringChargePeriod",
    "priceCondition",
    "quotePriceAlteration",
    "price"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity(name = "QuoteProductOfferingPrice")
@Table(name = "QUOTE_PRODUCT_OFFERING_PRICE")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(length = 127)
public class QuoteProductOfferingPrice
    implements Serializable
{

    private final static long serialVersionUID = 11L;
    protected String priceType;
    protected String recurringChargePeriod;
    protected String priceCondition;
    protected QuotePriceAlteration quotePriceAlteration;
    protected Price price;
    
    protected Long hjid;

    /**
     * Obtient la valeur de la propriété priceType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PRICE_TYPE", length = 255)
    public String getPriceType() {
        return priceType;
    }

    /**
     * Définit la valeur de la propriété priceType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceType(String value) {
        this.priceType = value;
    }

    /**
     * Obtient la valeur de la propriété recurringChargePeriod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "RECURRING_CHARGE_PERIOD", length = 255)
    public String getRecurringChargePeriod() {
        return recurringChargePeriod;
    }

    /**
     * Définit la valeur de la propriété recurringChargePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurringChargePeriod(String value) {
        this.recurringChargePeriod = value;
    }

    /**
     * Obtient la valeur de la propriété priceCondition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PRICE_CONDITION", length = 255)
    public String getPriceCondition() {
        return priceCondition;
    }

    /**
     * Définit la valeur de la propriété priceCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceCondition(String value) {
        this.priceCondition = value;
    }

    /**
     * Obtient la valeur de la propriété quotePriceAlteration.
     * 
     * @return
     *     possible object is
     *     {@link QuotePriceAlteration }
     *     
     */
    @ManyToOne(targetEntity = QuotePriceAlteration.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "QUOTE_PRICE_ALTERATION_QUOTE_0")
    public QuotePriceAlteration getQuotePriceAlteration() {
        return quotePriceAlteration;
    }

    /**
     * Définit la valeur de la propriété quotePriceAlteration.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotePriceAlteration }
     *     
     */
    public void setQuotePriceAlteration(QuotePriceAlteration value) {
        this.quotePriceAlteration = value;
    }

    /**
     * Obtient la valeur de la propriété price.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    @ManyToOne(targetEntity = Price.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PRICE_QUOTE_PRODUCT_OFFERING_0")
    public Price getPrice() {
        return price;
    }

    /**
     * Définit la valeur de la propriété price.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setPrice(Price value) {
        this.price = value;
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
