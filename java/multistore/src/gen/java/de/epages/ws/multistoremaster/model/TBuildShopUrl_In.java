/**
 * TBuildShopUrl_In.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.multistoremaster.model;


/**
 * input value of a buildShopUrl() call.
 */
public class TBuildShopUrl_In  implements java.io.Serializable {
    /* name of sub shop store */
    private java.lang.String subShopStore;

    /* guid of sub shop basket. */
    private java.lang.String basketGUID;

    public TBuildShopUrl_In() {
    }

    public TBuildShopUrl_In(
           java.lang.String subShopStore,
           java.lang.String basketGUID) {
           this.subShopStore = subShopStore;
           this.basketGUID = basketGUID;
    }


    /**
     * Gets the subShopStore value for this TBuildShopUrl_In.
     * 
     * @return subShopStore   * name of sub shop store
     */
    public java.lang.String getSubShopStore() {
        return subShopStore;
    }


    /**
     * Sets the subShopStore value for this TBuildShopUrl_In.
     * 
     * @param subShopStore   * name of sub shop store
     */
    public void setSubShopStore(java.lang.String subShopStore) {
        this.subShopStore = subShopStore;
    }


    /**
     * Gets the basketGUID value for this TBuildShopUrl_In.
     * 
     * @return basketGUID   * guid of sub shop basket.
     */
    public java.lang.String getBasketGUID() {
        return basketGUID;
    }


    /**
     * Sets the basketGUID value for this TBuildShopUrl_In.
     * 
     * @param basketGUID   * guid of sub shop basket.
     */
    public void setBasketGUID(java.lang.String basketGUID) {
        this.basketGUID = basketGUID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TBuildShopUrl_In)) return false;
        TBuildShopUrl_In other = (TBuildShopUrl_In) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subShopStore==null && other.getSubShopStore()==null) || 
             (this.subShopStore!=null &&
              this.subShopStore.equals(other.getSubShopStore()))) &&
            ((this.basketGUID==null && other.getBasketGUID()==null) || 
             (this.basketGUID!=null &&
              this.basketGUID.equals(other.getBasketGUID())));
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
        if (getSubShopStore() != null) {
            _hashCode += getSubShopStore().hashCode();
        }
        if (getBasketGUID() != null) {
            _hashCode += getBasketGUID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TBuildShopUrl_In.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/MultiStoreMasterTypes/2013/06", "TBuildShopUrl_In"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subShopStore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubShopStore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basketGUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BasketGUID"));
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
