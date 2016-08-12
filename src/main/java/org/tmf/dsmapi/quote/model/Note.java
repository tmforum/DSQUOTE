//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.01.14 à 04:34:12 PM CET 
//


package org.tmf.dsmapi.quote.model;

import java.io.Serializable;
import java.util.Date;
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
 * <p>Classe Java pour Note complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Note">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Note", propOrder = {
    "text",
    "date",
    "author"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity(name = "Note")
@Table(name = "NOTE")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(length = 127)
public class Note
    implements Serializable
{

    private final static long serialVersionUID = 11L;
    protected String text;
    @XmlElement(type = String.class)
    @JsonSerialize(using = CustomJsonDateSerializer.class)
    @XmlSchemaType(name = "dateTime")
    protected Date date;
    protected String author;
    
    protected Long hjid;

    /**
     * Obtient la valeur de la propriété text.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "TEXT", length = 255)
    public String getText() {
        return text;
    }

    /**
     * Définit la valeur de la propriété text.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Obtient la valeur de la propriété date.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DATE_")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getDate() {
        return date;
    }

    /**
     * Définit la valeur de la propriété date.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(Date value) {
        this.date = value;
    }

    /**
     * Obtient la valeur de la propriété author.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "AUTHOR", length = 255)
    public String getAuthor() {
        return author;
    }

    /**
     * Définit la valeur de la propriété author.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
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
    
    public boolean equals(Note note) {
        if ((null!=this.getAuthor()&& null!= note.getAuthor() 
                && !this.getAuthor().equals(note.getAuthor()))
                || null!=this.getAuthor()&& null==note.getAuthor()
                || null==this.getAuthor()&& null!=note.getAuthor() ) {
            return false;
        }
        if ((null!=this.getText()&& null!= note.getText() 
                && !this.getText().equals(note.getText()))
                || null!=this.getText()&& null==note.getText()
                || null==this.getText()&& null!=note.getText() ) {
            return false;
        }
        if ((null!=this.getDate()&& null!= note.getDate() 
                && !this.getDate().toString().equals(note.getDate().toString()))
                || null!=this.getDate()&& null==note.getDate()
                || null==this.getDate()&& null!=note.getDate() ) {
            return false;
        }
        
        return true;
    }
}
