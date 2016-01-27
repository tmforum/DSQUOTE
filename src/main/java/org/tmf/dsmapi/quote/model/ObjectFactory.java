//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.01.14 à 04:34:12 PM CET 
//


package org.tmf.dsmapi.quote.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tmf.dsmapi.quote.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Product_QNAME = new QName("http://orange.com/api/quoteManagement/tmf/v1/model/business", "Product");
    private final static QName _QuoteProductOfferingPrice_QNAME = new QName("http://orange.com/api/quoteManagement/tmf/v1/model/business", "QuoteProductOfferingPrice");
    private final static QName _QuoteItem_QNAME = new QName("http://orange.com/api/quoteManagement/tmf/v1/model/business", "QuoteItem");
    private final static QName _ProductOffering_QNAME = new QName("http://orange.com/api/quoteManagement/tmf/v1/model/business", "ProductOffering");
    private final static QName _ProductRelationship_QNAME = new QName("http://orange.com/api/quoteManagement/tmf/v1/model/business", "ProductRelationship");
    private final static QName _Customer_QNAME = new QName("http://orange.com/api/quoteManagement/tmf/v1/model/business", "Customer");
    private final static QName _Characteristic_QNAME = new QName("http://orange.com/api/quoteManagement/tmf/v1/model/business", "Characteristic");
    private final static QName _Attachment_QNAME = new QName("http://orange.com/api/quoteManagement/tmf/v1/model/business", "Attachment");
    private final static QName _BillingAccount_QNAME = new QName("http://orange.com/api/quoteManagement/tmf/v1/model/business", "BillingAccount");
    private final static QName _ValidFor_QNAME = new QName("http://orange.com/api/quoteManagement/tmf/v1/model/business", "ValidFor");
    private final static QName _QuoteAuthorization_QNAME = new QName("http://orange.com/api/quoteManagement/tmf/v1/model/business", "QuoteAuthorization");
    private final static QName _Note_QNAME = new QName("http://orange.com/api/quoteManagement/tmf/v1/model/business", "Note");
    private final static QName _Price_QNAME = new QName("http://orange.com/api/quoteManagement/tmf/v1/model/business", "Price");
    private final static QName _Quote_QNAME = new QName("http://orange.com/api/quoteManagement/tmf/v1/model/business", "Quote");
    private final static QName _Agreement_QNAME = new QName("http://orange.com/api/quoteManagement/tmf/v1/model/business", "Agreement");
    private final static QName _RelatedParty_QNAME = new QName("http://orange.com/api/quoteManagement/tmf/v1/model/business", "RelatedParty");
    private final static QName _QuotePriceAlteration_QNAME = new QName("http://orange.com/api/quoteManagement/tmf/v1/model/business", "QuotePriceAlteration");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tmf.dsmapi.quote.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link Characteristic }
     * 
     */
    public Characteristic createCharacteristic() {
        return new Characteristic();
    }

    /**
     * Create an instance of {@link Attachment }
     * 
     */
    public Attachment createAttachment() {
        return new Attachment();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link QuoteProductOfferingPrice }
     * 
     */
    public QuoteProductOfferingPrice createQuoteProductOfferingPrice() {
        return new QuoteProductOfferingPrice();
    }

    /**
     * Create an instance of {@link QuoteItem }
     * 
     */
    public QuoteItem createQuoteItem() {
        return new QuoteItem();
    }

    /**
     * Create an instance of {@link ProductOffering }
     * 
     */
    public ProductOffering createProductOffering() {
        return new ProductOffering();
    }

    /**
     * Create an instance of {@link ProductRelationship }
     * 
     */
    public ProductRelationship createProductRelationship() {
        return new ProductRelationship();
    }

    /**
     * Create an instance of {@link ValidFor }
     * 
     */
    public ValidFor createValidFor() {
        return new ValidFor();
    }

    /**
     * Create an instance of {@link Note }
     * 
     */
    public Note createNote() {
        return new Note();
    }

    /**
     * Create an instance of {@link QuoteAuthorization }
     * 
     */
    public QuoteAuthorization createQuoteAuthorization() {
        return new QuoteAuthorization();
    }

    /**
     * Create an instance of {@link BillingAccount }
     * 
     */
    public BillingAccount createBillingAccount() {
        return new BillingAccount();
    }

    /**
     * Create an instance of {@link RelatedParty }
     * 
     */
    public RelatedParty createRelatedParty() {
        return new RelatedParty();
    }

    /**
     * Create an instance of {@link Agreement }
     * 
     */
    public Agreement createAgreement() {
        return new Agreement();
    }

    /**
     * Create an instance of {@link Quote }
     * 
     */
    public Quote createQuote() {
        return new Quote();
    }

    /**
     * Create an instance of {@link Price }
     * 
     */
    public Price createPrice() {
        return new Price();
    }

    /**
     * Create an instance of {@link QuotePriceAlteration }
     * 
     */
    public QuotePriceAlteration createQuotePriceAlteration() {
        return new QuotePriceAlteration();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orange.com/api/quoteManagement/tmf/v1/model/business", name = "Product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteProductOfferingPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orange.com/api/quoteManagement/tmf/v1/model/business", name = "QuoteProductOfferingPrice")
    public JAXBElement<QuoteProductOfferingPrice> createQuoteProductOfferingPrice(QuoteProductOfferingPrice value) {
        return new JAXBElement<QuoteProductOfferingPrice>(_QuoteProductOfferingPrice_QNAME, QuoteProductOfferingPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orange.com/api/quoteManagement/tmf/v1/model/business", name = "QuoteItem")
    public JAXBElement<QuoteItem> createQuoteItem(QuoteItem value) {
        return new JAXBElement<QuoteItem>(_QuoteItem_QNAME, QuoteItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductOffering }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orange.com/api/quoteManagement/tmf/v1/model/business", name = "ProductOffering")
    public JAXBElement<ProductOffering> createProductOffering(ProductOffering value) {
        return new JAXBElement<ProductOffering>(_ProductOffering_QNAME, ProductOffering.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductRelationship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orange.com/api/quoteManagement/tmf/v1/model/business", name = "ProductRelationship")
    public JAXBElement<ProductRelationship> createProductRelationship(ProductRelationship value) {
        return new JAXBElement<ProductRelationship>(_ProductRelationship_QNAME, ProductRelationship.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orange.com/api/quoteManagement/tmf/v1/model/business", name = "Customer")
    public JAXBElement<Customer> createCustomer(Customer value) {
        return new JAXBElement<Customer>(_Customer_QNAME, Customer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Characteristic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orange.com/api/quoteManagement/tmf/v1/model/business", name = "Characteristic")
    public JAXBElement<Characteristic> createCharacteristic(Characteristic value) {
        return new JAXBElement<Characteristic>(_Characteristic_QNAME, Characteristic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Attachment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orange.com/api/quoteManagement/tmf/v1/model/business", name = "Attachment")
    public JAXBElement<Attachment> createAttachment(Attachment value) {
        return new JAXBElement<Attachment>(_Attachment_QNAME, Attachment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orange.com/api/quoteManagement/tmf/v1/model/business", name = "BillingAccount")
    public JAXBElement<BillingAccount> createBillingAccount(BillingAccount value) {
        return new JAXBElement<BillingAccount>(_BillingAccount_QNAME, BillingAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidFor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orange.com/api/quoteManagement/tmf/v1/model/business", name = "ValidFor")
    public JAXBElement<ValidFor> createValidFor(ValidFor value) {
        return new JAXBElement<ValidFor>(_ValidFor_QNAME, ValidFor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteAuthorization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orange.com/api/quoteManagement/tmf/v1/model/business", name = "QuoteAuthorization")
    public JAXBElement<QuoteAuthorization> createQuoteAuthorization(QuoteAuthorization value) {
        return new JAXBElement<QuoteAuthorization>(_QuoteAuthorization_QNAME, QuoteAuthorization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Note }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orange.com/api/quoteManagement/tmf/v1/model/business", name = "Note")
    public JAXBElement<Note> createNote(Note value) {
        return new JAXBElement<Note>(_Note_QNAME, Note.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Price }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orange.com/api/quoteManagement/tmf/v1/model/business", name = "Price")
    public JAXBElement<Price> createPrice(Price value) {
        return new JAXBElement<Price>(_Price_QNAME, Price.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orange.com/api/quoteManagement/tmf/v1/model/business", name = "Quote")
    public JAXBElement<Quote> createQuote(Quote value) {
        return new JAXBElement<Quote>(_Quote_QNAME, Quote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Agreement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orange.com/api/quoteManagement/tmf/v1/model/business", name = "Agreement")
    public JAXBElement<Agreement> createAgreement(Agreement value) {
        return new JAXBElement<Agreement>(_Agreement_QNAME, Agreement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelatedParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orange.com/api/quoteManagement/tmf/v1/model/business", name = "RelatedParty")
    public JAXBElement<RelatedParty> createRelatedParty(RelatedParty value) {
        return new JAXBElement<RelatedParty>(_RelatedParty_QNAME, RelatedParty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuotePriceAlteration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orange.com/api/quoteManagement/tmf/v1/model/business", name = "QuotePriceAlteration")
    public JAXBElement<QuotePriceAlteration> createQuotePriceAlteration(QuotePriceAlteration value) {
        return new JAXBElement<QuotePriceAlteration>(_QuotePriceAlteration_QNAME, QuotePriceAlteration.class, null, value);
    }

}
