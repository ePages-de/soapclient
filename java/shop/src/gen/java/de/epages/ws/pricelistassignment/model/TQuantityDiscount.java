/**
 * TQuantityDiscount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.pricelistassignment.model;


/**
 * a single quantity discount.
 */
public class TQuantityDiscount  implements java.io.Serializable {
    /* discount's quantity */
    private float quantity;

    /* discount for this quantity */
    private float discount;

    public TQuantityDiscount() {
    }

    public TQuantityDiscount(
           float quantity,
           float discount) {
           this.quantity = quantity;
           this.discount = discount;
    }


    /**
     * Gets the quantity value for this TQuantityDiscount.
     * 
     * @return quantity   * discount's quantity
     */
    public float getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this TQuantityDiscount.
     * 
     * @param quantity   * discount's quantity
     */
    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the discount value for this TQuantityDiscount.
     * 
     * @return discount   * discount for this quantity
     */
    public float getDiscount() {
        return discount;
    }


    /**
     * Sets the discount value for this TQuantityDiscount.
     * 
     * @param discount   * discount for this quantity
     */
    public void setDiscount(float discount) {
        this.discount = discount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TQuantityDiscount)) return false;
        TQuantityDiscount other = (TQuantityDiscount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.quantity == other.getQuantity() &&
            this.discount == other.getDiscount();
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
        _hashCode += new Float(getQuantity()).hashCode();
        _hashCode += new Float(getDiscount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TQuantityDiscount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TQuantityDiscount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Discount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
