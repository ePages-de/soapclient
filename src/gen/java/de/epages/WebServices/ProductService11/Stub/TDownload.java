/**
 * TDownload.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.ProductService11.Stub;


/**
 * data of download file
 */
public class TDownload  implements java.io.Serializable {
    /* url to download file */
    private java.lang.String targetUrl;

    /* Name of file. */
    private java.lang.String fileName;

    /* size of file */
    private float fileSize;

    /* content of file */
    private byte[] fileContent;

    /* True if file is saved on external server. */
    private boolean isExternal;

    /* position of download in the list (step distance 10) */
    private java.math.BigInteger position;

    public TDownload() {
    }

    public TDownload(
           java.lang.String targetUrl,
           java.lang.String fileName,
           float fileSize,
           byte[] fileContent,
           boolean isExternal,
           java.math.BigInteger position) {
           this.targetUrl = targetUrl;
           this.fileName = fileName;
           this.fileSize = fileSize;
           this.fileContent = fileContent;
           this.isExternal = isExternal;
           this.position = position;
    }


    /**
     * Gets the targetUrl value for this TDownload.
     * 
     * @return targetUrl   * url to download file
     */
    public java.lang.String getTargetUrl() {
        return targetUrl;
    }


    /**
     * Sets the targetUrl value for this TDownload.
     * 
     * @param targetUrl   * url to download file
     */
    public void setTargetUrl(java.lang.String targetUrl) {
        this.targetUrl = targetUrl;
    }


    /**
     * Gets the fileName value for this TDownload.
     * 
     * @return fileName   * Name of file.
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this TDownload.
     * 
     * @param fileName   * Name of file.
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the fileSize value for this TDownload.
     * 
     * @return fileSize   * size of file
     */
    public float getFileSize() {
        return fileSize;
    }


    /**
     * Sets the fileSize value for this TDownload.
     * 
     * @param fileSize   * size of file
     */
    public void setFileSize(float fileSize) {
        this.fileSize = fileSize;
    }


    /**
     * Gets the fileContent value for this TDownload.
     * 
     * @return fileContent   * content of file
     */
    public byte[] getFileContent() {
        return fileContent;
    }


    /**
     * Sets the fileContent value for this TDownload.
     * 
     * @param fileContent   * content of file
     */
    public void setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
    }


    /**
     * Gets the isExternal value for this TDownload.
     * 
     * @return isExternal   * True if file is saved on external server.
     */
    public boolean isIsExternal() {
        return isExternal;
    }


    /**
     * Sets the isExternal value for this TDownload.
     * 
     * @param isExternal   * True if file is saved on external server.
     */
    public void setIsExternal(boolean isExternal) {
        this.isExternal = isExternal;
    }


    /**
     * Gets the position value for this TDownload.
     * 
     * @return position   * position of download in the list (step distance 10)
     */
    public java.math.BigInteger getPosition() {
        return position;
    }


    /**
     * Sets the position value for this TDownload.
     * 
     * @param position   * position of download in the list (step distance 10)
     */
    public void setPosition(java.math.BigInteger position) {
        this.position = position;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TDownload)) return false;
        TDownload other = (TDownload) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetUrl==null && other.getTargetUrl()==null) || 
             (this.targetUrl!=null &&
              this.targetUrl.equals(other.getTargetUrl()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            this.fileSize == other.getFileSize() &&
            ((this.fileContent==null && other.getFileContent()==null) || 
             (this.fileContent!=null &&
              java.util.Arrays.equals(this.fileContent, other.getFileContent()))) &&
            this.isExternal == other.isIsExternal() &&
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition())));
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
        if (getTargetUrl() != null) {
            _hashCode += getTargetUrl().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        _hashCode += new Float(getFileSize()).hashCode();
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
        _hashCode += (isIsExternal() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TDownload.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2013/01", "TDownload"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TargetUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileContent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FileContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isExternal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsExternal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
