/**
 * TLocalizedLabelDownload.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.product14.model;

/**
 * a localized value and download.
 *         contains language, value and the file content in this language.
 */
public class TLocalizedLabelDownload  implements java.io.Serializable {
    /* language code (e.g. 'en') */
    private java.lang.String languageCode;

    /* Name of file. */
    private java.lang.String value;

    /* content of file */
    private byte[] fileContent;

    public TLocalizedLabelDownload() {
    }

    public TLocalizedLabelDownload(
           java.lang.String languageCode,
           java.lang.String value,
           byte[] fileContent) {
           this.languageCode = languageCode;
           this.value = value;
           this.fileContent = fileContent;
    }


    /**
     * Gets the languageCode value for this TLocalizedLabelDownload.
     * 
     * @return languageCode   * language code (e.g. 'en')
     */
    public java.lang.String getLanguageCode() {
        return languageCode;
    }


    /**
     * Sets the languageCode value for this TLocalizedLabelDownload.
     * 
     * @param languageCode   * language code (e.g. 'en')
     */
    public void setLanguageCode(java.lang.String languageCode) {
        this.languageCode = languageCode;
    }


    /**
     * Gets the value value for this TLocalizedLabelDownload.
     * 
     * @return value   * Name of file.
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this TLocalizedLabelDownload.
     * 
     * @param value   * Name of file.
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the fileContent value for this TLocalizedLabelDownload.
     * 
     * @return fileContent   * content of file
     */
    public byte[] getFileContent() {
        return fileContent;
    }


    /**
     * Sets the fileContent value for this TLocalizedLabelDownload.
     * 
     * @param fileContent   * content of file
     */
    public void setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TLocalizedLabelDownload)) return false;
        TLocalizedLabelDownload other = (TLocalizedLabelDownload) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.languageCode==null && other.getLanguageCode()==null) || 
             (this.languageCode!=null &&
              this.languageCode.equals(other.getLanguageCode()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.fileContent==null && other.getFileContent()==null) || 
             (this.fileContent!=null &&
              java.util.Arrays.equals(this.fileContent, other.getFileContent())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getLanguageCode() != null) {
            _hashCode += getLanguageCode().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getFileContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileContent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TLocalizedLabelDownload.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2015/01", "TLocalizedLabelDownload"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LanguageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileContent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FileContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
