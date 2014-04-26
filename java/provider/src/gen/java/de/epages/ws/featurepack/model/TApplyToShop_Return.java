/**
 * TApplyToShop_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.featurepack.model;


/**
 * a single return value of an applyToShop() call.
 *         path and shopref will be always returned.
 *         the error element will be returned in case of error.
 *         the applied flag be returned if no error has occured.
 */
public class TApplyToShop_Return  implements java.io.Serializable {
    private java.lang.String path;

    private java.lang.String shopRef;

    /* a boolean flag indicating whether or not this feature pack
     * was applied to the shop */
    private java.lang.Boolean applied;

    /* error object (see epagestypes:TError) */
    private de.epages.ws.common.model.TError error;

    public TApplyToShop_Return() {
    }

    public TApplyToShop_Return(
           java.lang.String path,
           java.lang.String shopRef,
           java.lang.Boolean applied,
           de.epages.ws.common.model.TError error) {
           this.path = path;
           this.shopRef = shopRef;
           this.applied = applied;
           this.error = error;
    }


    /**
     * Gets the path value for this TApplyToShop_Return.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TApplyToShop_Return.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the shopRef value for this TApplyToShop_Return.
     * 
     * @return shopRef
     */
    public java.lang.String getShopRef() {
        return shopRef;
    }


    /**
     * Sets the shopRef value for this TApplyToShop_Return.
     * 
     * @param shopRef
     */
    public void setShopRef(java.lang.String shopRef) {
        this.shopRef = shopRef;
    }


    /**
     * Gets the applied value for this TApplyToShop_Return.
     * 
     * @return applied   * a boolean flag indicating whether or not this feature pack
     * was applied to the shop
     */
    public java.lang.Boolean getApplied() {
        return applied;
    }


    /**
     * Sets the applied value for this TApplyToShop_Return.
     * 
     * @param applied   * a boolean flag indicating whether or not this feature pack
     * was applied to the shop
     */
    public void setApplied(java.lang.Boolean applied) {
        this.applied = applied;
    }


    /**
     * Gets the error value for this TApplyToShop_Return.
     * 
     * @return error   * error object (see epagestypes:TError)
     */
    public de.epages.ws.common.model.TError getError() {
        return error;
    }


    /**
     * Sets the error value for this TApplyToShop_Return.
     * 
     * @param error   * error object (see epagestypes:TError)
     */
    public void setError(de.epages.ws.common.model.TError error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TApplyToShop_Return)) return false;
        TApplyToShop_Return other = (TApplyToShop_Return) obj;
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
              this.shopRef.equals(other.getShopRef()))) &&
            ((this.applied==null && other.getApplied()==null) || 
             (this.applied!=null &&
              this.applied.equals(other.getApplied()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError())));
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
        if (getApplied() != null) {
            _hashCode += getApplied().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TApplyToShop_Return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/FeaturePackTypes/2005/03", "TApplyToShop_Return"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applied");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applied"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Error"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TError"));
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
