/**
 * TApplyToShop_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.featurepack.model;


/**
 * input arguments of a single applyToShop() call.
 *         the path and shopRef elements are mandatory.
 */
public class TApplyToShop_Input  implements java.io.Serializable {
    /* feature pack path */
    private java.lang.String path;

    /* path of the shop ref to apply the feature pack to */
    private java.lang.String shopRef;

    public TApplyToShop_Input() {
    }

    public TApplyToShop_Input(
           java.lang.String path,
           java.lang.String shopRef) {
           this.path = path;
           this.shopRef = shopRef;
    }


    /**
     * Gets the path value for this TApplyToShop_Input.
     * 
     * @return path   * feature pack path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TApplyToShop_Input.
     * 
     * @param path   * feature pack path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the shopRef value for this TApplyToShop_Input.
     * 
     * @return shopRef   * path of the shop ref to apply the feature pack to
     */
    public java.lang.String getShopRef() {
        return shopRef;
    }


    /**
     * Sets the shopRef value for this TApplyToShop_Input.
     * 
     * @param shopRef   * path of the shop ref to apply the feature pack to
     */
    public void setShopRef(java.lang.String shopRef) {
        this.shopRef = shopRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TApplyToShop_Input)) return false;
        TApplyToShop_Input other = (TApplyToShop_Input) obj;
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
            ((this.shopRef==null && other.getShopRef()==null) || 
             (this.shopRef!=null &&
              this.shopRef.equals(other.getShopRef())));
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
        if (getShopRef() != null) {
            _hashCode += getShopRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TApplyToShop_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/FeaturePackTypes/2005/03", "TApplyToShop_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ShopRef"));
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
