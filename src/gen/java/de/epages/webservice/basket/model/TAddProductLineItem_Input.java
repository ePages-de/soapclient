/**
 * TAddProductLineItem_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.basket.model;


/**
 * input object of a product line item to add to basket.
 */
public class TAddProductLineItem_Input  implements java.io.Serializable {
    /* path of a produc (e.g. Product/0815_42) */
    private java.lang.String path;

    /* quantity of the product line item */
    private float quantity;

    public TAddProductLineItem_Input() {
    }

    public TAddProductLineItem_Input(
           java.lang.String path,
           float quantity) {
           this.path = path;
           this.quantity = quantity;
    }


    /**
     * Gets the path value for this TAddProductLineItem_Input.
     * 
     * @return path   * path of a produc (e.g. Product/0815_42)
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TAddProductLineItem_Input.
     * 
     * @param path   * path of a produc (e.g. Product/0815_42)
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the quantity value for this TAddProductLineItem_Input.
     * 
     * @return quantity   * quantity of the product line item
     */
    public float getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this TAddProductLineItem_Input.
     * 
     * @param quantity   * quantity of the product line item
     */
    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TAddProductLineItem_Input)) return false;
        TAddProductLineItem_Input other = (TAddProductLineItem_Input) obj;
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
            this.quantity == other.getQuantity();
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
        _hashCode += new Float(getQuantity()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TAddProductLineItem_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TAddProductLineItem_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Quantity"));
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
