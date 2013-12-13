/*
 * XML Type:  TDownload
 * Namespace: urn://epages.de/WebService/ProductTypes/2013/01
 * Java type: de.epages.ws.product11.model.TDownload
 *
 * Automatically generated - do not modify.
 */
package de.epages.ws.product11.model;


/**
 * An XML TDownload(@urn://epages.de/WebService/ProductTypes/2013/01).
 *
 * This is a complex type.
 */
public interface TDownload extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TDownload.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5C6BD768D9DEE5CC9F063BA9099B8004").resolveHandle("tdownload7e24type");
    
    /**
     * Gets the "TargetUrl" element
     */
    java.lang.String getTargetUrl();
    
    /**
     * Gets (as xml) the "TargetUrl" element
     */
    org.apache.xmlbeans.XmlString xgetTargetUrl();
    
    /**
     * Sets the "TargetUrl" element
     */
    void setTargetUrl(java.lang.String targetUrl);
    
    /**
     * Sets (as xml) the "TargetUrl" element
     */
    void xsetTargetUrl(org.apache.xmlbeans.XmlString targetUrl);
    
    /**
     * Gets the "FileName" element
     */
    java.lang.String getFileName();
    
    /**
     * Gets (as xml) the "FileName" element
     */
    org.apache.xmlbeans.XmlString xgetFileName();
    
    /**
     * Sets the "FileName" element
     */
    void setFileName(java.lang.String fileName);
    
    /**
     * Sets (as xml) the "FileName" element
     */
    void xsetFileName(org.apache.xmlbeans.XmlString fileName);
    
    /**
     * Gets the "FileSize" element
     */
    float getFileSize();
    
    /**
     * Gets (as xml) the "FileSize" element
     */
    org.apache.xmlbeans.XmlFloat xgetFileSize();
    
    /**
     * Sets the "FileSize" element
     */
    void setFileSize(float fileSize);
    
    /**
     * Sets (as xml) the "FileSize" element
     */
    void xsetFileSize(org.apache.xmlbeans.XmlFloat fileSize);
    
    /**
     * Gets the "FileContent" element
     */
    byte[] getFileContent();
    
    /**
     * Gets (as xml) the "FileContent" element
     */
    org.apache.xmlbeans.XmlBase64Binary xgetFileContent();
    
    /**
     * True if has "FileContent" element
     */
    boolean isSetFileContent();
    
    /**
     * Sets the "FileContent" element
     */
    void setFileContent(byte[] fileContent);
    
    /**
     * Sets (as xml) the "FileContent" element
     */
    void xsetFileContent(org.apache.xmlbeans.XmlBase64Binary fileContent);
    
    /**
     * Unsets the "FileContent" element
     */
    void unsetFileContent();
    
    /**
     * Gets the "IsExternal" element
     */
    boolean getIsExternal();
    
    /**
     * Gets (as xml) the "IsExternal" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsExternal();
    
    /**
     * Sets the "IsExternal" element
     */
    void setIsExternal(boolean isExternal);
    
    /**
     * Sets (as xml) the "IsExternal" element
     */
    void xsetIsExternal(org.apache.xmlbeans.XmlBoolean isExternal);
    
    /**
     * Gets the "Position" element
     */
    java.math.BigInteger getPosition();
    
    /**
     * Gets (as xml) the "Position" element
     */
    org.apache.xmlbeans.XmlInteger xgetPosition();
    
    /**
     * True if has "Position" element
     */
    boolean isSetPosition();
    
    /**
     * Sets the "Position" element
     */
    void setPosition(java.math.BigInteger position);
    
    /**
     * Sets (as xml) the "Position" element
     */
    void xsetPosition(org.apache.xmlbeans.XmlInteger position);
    
    /**
     * Unsets the "Position" element
     */
    void unsetPosition();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.epages.ws.product11.model.TDownload newInstance() {
          return (de.epages.ws.product11.model.TDownload) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.epages.ws.product11.model.TDownload newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.epages.ws.product11.model.TDownload) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.epages.ws.product11.model.TDownload parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.epages.ws.product11.model.TDownload) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.epages.ws.product11.model.TDownload parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.epages.ws.product11.model.TDownload) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.epages.ws.product11.model.TDownload parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.model.TDownload) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.epages.ws.product11.model.TDownload parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.model.TDownload) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.epages.ws.product11.model.TDownload parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.model.TDownload) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.epages.ws.product11.model.TDownload parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.model.TDownload) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.epages.ws.product11.model.TDownload parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.model.TDownload) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.epages.ws.product11.model.TDownload parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.model.TDownload) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.epages.ws.product11.model.TDownload parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.model.TDownload) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.epages.ws.product11.model.TDownload parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.epages.ws.product11.model.TDownload) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.epages.ws.product11.model.TDownload parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.epages.ws.product11.model.TDownload) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.epages.ws.product11.model.TDownload parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.epages.ws.product11.model.TDownload) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.epages.ws.product11.model.TDownload parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.epages.ws.product11.model.TDownload) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.epages.ws.product11.model.TDownload parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.epages.ws.product11.model.TDownload) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static de.epages.ws.product11.model.TDownload parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.epages.ws.product11.model.TDownload) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static de.epages.ws.product11.model.TDownload parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.epages.ws.product11.model.TDownload) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
