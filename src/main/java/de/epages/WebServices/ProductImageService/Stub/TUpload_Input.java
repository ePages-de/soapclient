/**
 * TUpload_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.ProductImageService.Stub;

public class TUpload_Input  implements java.io.Serializable {
    /* list of filecontents and filenames */
    private de.epages.WebServices.ProductImageService.Stub.TImageData[] imageData;

    /* the filenames for the slideshow, separated with ";" */
    private java.lang.String imagesSlideShowString;

    public TUpload_Input() {
    }

    public TUpload_Input(
           de.epages.WebServices.ProductImageService.Stub.TImageData[] imageData,
           java.lang.String imagesSlideShowString) {
           this.imageData = imageData;
           this.imagesSlideShowString = imagesSlideShowString;
    }


    /**
     * Gets the imageData value for this TUpload_Input.
     * 
     * @return imageData   * list of filecontents and filenames
     */
    public de.epages.WebServices.ProductImageService.Stub.TImageData[] getImageData() {
        return imageData;
    }


    /**
     * Sets the imageData value for this TUpload_Input.
     * 
     * @param imageData   * list of filecontents and filenames
     */
    public void setImageData(de.epages.WebServices.ProductImageService.Stub.TImageData[] imageData) {
        this.imageData = imageData;
    }


    /**
     * Gets the imagesSlideShowString value for this TUpload_Input.
     * 
     * @return imagesSlideShowString   * the filenames for the slideshow, separated with ";"
     */
    public java.lang.String getImagesSlideShowString() {
        return imagesSlideShowString;
    }


    /**
     * Sets the imagesSlideShowString value for this TUpload_Input.
     * 
     * @param imagesSlideShowString   * the filenames for the slideshow, separated with ";"
     */
    public void setImagesSlideShowString(java.lang.String imagesSlideShowString) {
        this.imagesSlideShowString = imagesSlideShowString;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TUpload_Input)) return false;
        TUpload_Input other = (TUpload_Input) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.imageData==null && other.getImageData()==null) || 
             (this.imageData!=null &&
              java.util.Arrays.equals(this.imageData, other.getImageData()))) &&
            ((this.imagesSlideShowString==null && other.getImagesSlideShowString()==null) || 
             (this.imagesSlideShowString!=null &&
              this.imagesSlideShowString.equals(other.getImagesSlideShowString())));
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
        if (getImageData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImageData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImageData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getImagesSlideShowString() != null) {
            _hashCode += getImagesSlideShowString().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TUpload_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductImageTypes/2006/03", "TUpload_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ImageData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductImageTypes/2006/03", "TImageData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imagesSlideShowString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ImagesSlideShowString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
