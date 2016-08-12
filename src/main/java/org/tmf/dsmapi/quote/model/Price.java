//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.01.14 à 04:34:12 PM CET 
//


package org.tmf.dsmapi.quote.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonInclude;


/**
 * <p>Classe Java pour Price complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Price">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="percentage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Price", propOrder = {
    "percentage",
    "override"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity(name = "Price")
@Table(name = "PRICE")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(length = 127)
public class Price
    implements Serializable
{

    private final static long serialVersionUID = 11L;
    protected Integer percentage;
    protected Double override;
    
    protected Long hjid;

    /**
     * Obtient la valeur de la propriété percentage.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "PERCENTAGE", precision = 10, scale = 0)
    public Integer getPercentage() {
        return percentage;
    }

    /**
     * Définit la valeur de la propriété percentage.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPercentage(Integer value) {
        this.percentage = value;
    }

    /**
     * Obtient la valeur de la propriété percentage.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "OVERRIDE", precision = 10, scale = 0)
    public Double getOverride() {
        return override;
    }

    /**
     * Définit la valeur de la propriété percentage.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverride(Double value) {
        this.override = value;
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
    
    public boolean equals(Price price) {
        if (null !=this.getOverride()&& null!=price.getOverride() 
                && !this.getOverride().equals(price.getOverride()) 
                || null!=this.getOverride()&& null==price.getOverride()
                || null==this.getOverride()&& null!=price.getOverride()) {
            return false;
        }
        if (null !=this.getPercentage()&& null!=price.getPercentage() 
                && !this.getPercentage().equals(price.getPercentage()) 
                || null!=this.getPercentage()&& null==price.getPercentage()
                || null==this.getPercentage()&& null!=price.getPercentage()) {
            return false;
        }
        return true;
    }

}
