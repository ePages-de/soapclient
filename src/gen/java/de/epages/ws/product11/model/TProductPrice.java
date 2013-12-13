/*
 * XML Type:  TProductPrice
 * Namespace: urn://epages.de/WebService/ProductTypes/2013/01
 * Java type: de.epages.ws.product11.model.TProductPrice
 *
 * Automatically generated - do not modify.
 */
package de.epages.ws.product11.model;


/**
 * An XML TProductPrice(@urn://epages.de/WebService/ProductTypes/2013/01).
 *
 * This is a complex type.
 */
public interface TProductPrice extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TProductPrice.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C6BD768D9DEE5CC9F063BA9099B8004").resolveHandle("tproductprice2db6type");
    
    /**
     * Gets the "Price" element
     */
    float getPrice();
    
    /**
     * Gets (as xml) the "Price" element
     */
    org.apache.xmlbeans.XmlFloat xgetPrice();
    
    /**
     * Sets the "Price" element
     */
    void setPrice(float price);
    
    /**
     * Sets (as xml) the "Price" element
     */
    void xsetPrice(org.apache.xmlbeans.XmlFloat price);
    
    /**
     * Gets the "CurrencyID" element
     */
    java.lang.String getCurrencyID();
    
    /**
     * Gets (as xml) the "CurrencyID" element
     */
    org.apache.xmlbeans.XmlString xgetCurrencyID();
    
    /**
     * Sets the "CurrencyID" element
     */
    void setCurrencyID(java.lang.String currencyID);
    
    /**
     * Sets (as xml) the "CurrencyID" element
     */
    void xsetCurrencyID(org.apache.xmlbeans.XmlString currencyID);
    
    /**
     * Gets the "TaxModel" element
     */
    java.lang.String getTaxModel();
    
    /**
     * Gets (as xml) the "TaxModel" element
     */
    org.apache.xmlbeans.XmlString xgetTaxModel();
    
    /**
     * Sets the "TaxModel" element
     */
    void setTaxModel(java.lang.String taxModel);
    
    /**
     * Sets (as xml) the "TaxModel" element
     */
    void xsetTaxModel(org.apache.xmlbeans.XmlString taxModel);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.epages.ws.product11.model.TProductPrice newInstance() {
          return (de.epages.ws.product11.model.TProductPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.epages.ws.product11.model.TProductPrice newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.epages.ws.product11.model.TProductPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.epages.ws.product11.model.TProductPrice parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.epages.ws.product11.model.TProductPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.epages.ws.product11.model.TProductPrice parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.epages.ws.product11.model.TProductPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.epages.ws.product11.model.TProductPrice parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.model.TProductPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.epages.ws.product11.model.TProductPrice parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.model.TProductPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.epages.ws.product11.model.TProductPrice parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.model.TProductPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.epages.ws.product11.model.TProductPrice parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.model.TProductPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.epages.ws.product11.model.TProductPrice parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.model.TProductPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.epages.ws.product11.model.TProductPrice parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.model.TProductPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.epages.ws.product11.model.TProductPrice parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.model.TProductPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.epages.ws.product11.model.TProductPrice parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.model.TProductPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.epages.ws.product11.model.TProductPrice parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.epages.ws.product11.model.TProductPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.epages.ws.product11.model.TProductPrice parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.epages.ws.product11.model.TProductPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.epages.ws.product11.model.TProductPrice parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.epages.ws.product11.model.TProductPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.epages.ws.product11.model.TProductPrice parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.epages.ws.product11.model.TProductPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static de.epages.ws.product11.model.TProductPrice parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.epages.ws.product11.model.TProductPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static de.epages.ws.product11.model.TProductPrice parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.epages.ws.product11.model.TProductPrice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
