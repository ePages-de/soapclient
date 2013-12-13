/*
 * An XML document type.
 * Localname: update
 * Namespace: urn://epages.de/WebService/ProductService/2013/01
 * Java type: de.epages.ws.product11.stub.UpdateDocument
 *
 * Automatically generated - do not modify.
 */
package de.epages.ws.product11.stub;


/**
 * A document containing one update(@urn://epages.de/WebService/ProductService/2013/01) element.
 *
 * This is a complex type.
 */
public interface UpdateDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C6BD768D9DEE5CC9F063BA9099B8004").resolveHandle("update69efdoctype");
    
    /**
     * Gets the "update" element
     */
    de.epages.ws.product11.stub.UpdateDocument.Update getUpdate();
    
    /**
     * Sets the "update" element
     */
    void setUpdate(de.epages.ws.product11.stub.UpdateDocument.Update update);
    
    /**
     * Appends and returns a new empty "update" element
     */
    de.epages.ws.product11.stub.UpdateDocument.Update addNewUpdate();
    
    /**
     * An XML update(@urn://epages.de/WebService/ProductService/2013/01).
     *
     * This is a complex type.
     */
    public interface Update extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Update.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C6BD768D9DEE5CC9F063BA9099B8004").resolveHandle("updated76aelemtype");
        
        /**
         * Gets the "Products" element
         */
        de.epages.ws.product11.stub.TypeUpdateIn getProducts();
        
        /**
         * Tests for nil "Products" element
         */
        boolean isNilProducts();
        
        /**
         * Sets the "Products" element
         */
        void setProducts(de.epages.ws.product11.stub.TypeUpdateIn products);
        
        /**
         * Appends and returns a new empty "Products" element
         */
        de.epages.ws.product11.stub.TypeUpdateIn addNewProducts();
        
        /**
         * Nils the "Products" element
         */
        void setNilProducts();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static de.epages.ws.product11.stub.UpdateDocument.Update newInstance() {
              return (de.epages.ws.product11.stub.UpdateDocument.Update) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.epages.ws.product11.stub.UpdateDocument.Update newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.epages.ws.product11.stub.UpdateDocument.Update) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.epages.ws.product11.stub.UpdateDocument newInstance() {
          return (de.epages.ws.product11.stub.UpdateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.epages.ws.product11.stub.UpdateDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.epages.ws.product11.stub.UpdateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.epages.ws.product11.stub.UpdateDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.epages.ws.product11.stub.UpdateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.epages.ws.product11.stub.UpdateDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.epages.ws.product11.stub.UpdateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.epages.ws.product11.stub.UpdateDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.stub.UpdateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.epages.ws.product11.stub.UpdateDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.stub.UpdateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.epages.ws.product11.stub.UpdateDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.stub.UpdateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.epages.ws.product11.stub.UpdateDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.stub.UpdateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.epages.ws.product11.stub.UpdateDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.stub.UpdateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.epages.ws.product11.stub.UpdateDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.stub.UpdateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.epages.ws.product11.stub.UpdateDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.stub.UpdateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.epages.ws.product11.stub.UpdateDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.stub.UpdateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.epages.ws.product11.stub.UpdateDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.epages.ws.product11.stub.UpdateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.epages.ws.product11.stub.UpdateDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.epages.ws.product11.stub.UpdateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.epages.ws.product11.stub.UpdateDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.epages.ws.product11.stub.UpdateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.epages.ws.product11.stub.UpdateDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.epages.ws.product11.stub.UpdateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static de.epages.ws.product11.stub.UpdateDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.epages.ws.product11.stub.UpdateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static de.epages.ws.product11.stub.UpdateDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.epages.ws.product11.stub.UpdateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
