/**
 * TRemoveShopType_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.featurepack.model;


/**
 * input arguments of a single removeShopType() call.
 *         the path and shopTypes elements are mandatory.
 */
public class TRemoveShopType_Input  implements java.io.Serializable {
    /* feature pack path */
    private java.lang.String path;

    /* list of shop types (pathes) to remove from the list of shoptypes
     * the feature pack is available for */
    private java.lang.String[] shopTypes;

    public TRemoveShopType_Input() {
    }

    public TRemoveShopType_Input(
           java.lang.String path,
           java.lang.String[] shopTypes) {
           this.path = path;
           this.shopTypes = shopTypes;
    }


    /**
     * Gets the path value for this TRemoveShopType_Input.
     * 
     * @return path   * feature pack path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TRemoveShopType_Input.
     * 
     * @param path   * feature pack path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the shopTypes value for this TRemoveShopType_Input.
     * 
     * @return shopTypes   * list of shop types (pathes) to remove from the list of shoptypes
     * the feature pack is available for
     */
    public java.lang.String[] getShopTypes() {
        return shopTypes;
    }


    /**
     * Sets the shopTypes value for this TRemoveShopType_Input.
     * 
     * @param shopTypes   * list of shop types (pathes) to remove from the list of shoptypes
     * the feature pack is available for
     */
    public void setShopTypes(java.lang.String[] shopTypes) {
        this.shopTypes = shopTypes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TRemoveShopType_Input)) return false;
        TRemoveShopType_Input other = (TRemoveShopType_Input) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath()))) &&
            ((this.shopTypes==null && other.getShopTypes()==null) || 
             (this.shopTypes!=null &&
              java.util.Arrays.equals(this.shopTypes, other.getShopTypes())));
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
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
        }
        if (getShopTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShopTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShopTypes(), i);
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
        new org.apache.axis.description.TypeDesc(TRemoveShopType_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/FeaturePackTypes/2005/03", "TRemoveShopType_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ShopTypes"));
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
