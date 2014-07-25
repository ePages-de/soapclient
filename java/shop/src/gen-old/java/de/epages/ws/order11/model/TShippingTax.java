/**
 * TShippingTax.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.order11.model;


/**
 * part of shipping tax related to tax class
 */
public class TShippingTax  implements java.io.Serializable {
    /* object path to tax class */
    private java.lang.String taxClass;

    /* the tax rate of the tax part */
    private float taxRate;

    /* the tax amount of the tax part */
    private float taxAmount;

    /* the tax amount of the tax part */
    private float value;

    public TShippingTax() {
    }

    public TShippingTax(
           java.lang.String taxClass,
           float taxRate,
           float taxAmount,
           float value) {
           this.taxClass = taxClass;
           this.taxRate = taxRate;
           this.taxAmount = taxAmount;
           this.value = value;
    }


    /**
     * Gets the taxClass value for this TShippingTax.
     * 
     * @return taxClass   * object path to tax class
     */
    public java.lang.String getTaxClass() {
        return taxClass;
    }


    /**
     * Sets the taxClass value for this TShippingTax.
     * 
     * @param taxClass   * object path to tax class
     */
    public void setTaxClass(java.lang.String taxClass) {
        this.taxClass = taxClass;
    }


    /**
     * Gets the taxRate value for this TShippingTax.
     * 
     * @return taxRate   * the tax rate of the tax part
     */
    public float getTaxRate() {
        return taxRate;
    }


    /**
     * Sets the taxRate value for this TShippingTax.
     * 
     * @param taxRate   * the tax rate of the tax part
     */
    public void setTaxRate(float taxRate) {
        this.taxRate = taxRate;
    }


    /**
     * Gets the taxAmount value for this TShippingTax.
     * 
     * @return taxAmount   * the tax amount of the tax part
     */
    public float getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this TShippingTax.
     * 
     * @param taxAmount   * the tax amount of the tax part
     */
    public void setTaxAmount(float taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the value value for this TShippingTax.
     * 
     * @return value   * the tax amount of the tax part
     */
    public float getValue() {
        return value;
    }


    /**
     * Sets the value value for this TShippingTax.
     * 
     * @param value   * the tax amount of the tax part
     */
    public void setValue(float value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TShippingTax)) return false;
        TShippingTax other = (TShippingTax) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxClass==null && other.getTaxClass()==null) || 
             (this.taxClass!=null &&
              this.taxClass.equals(other.getTaxClass()))) &&
            this.taxRate == other.getTaxRate() &&
            this.taxAmount == other.getTaxAmount() &&
            this.value == other.getValue();
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
        if (getTaxClass() != null) {
            _hashCode += getTaxClass().hashCode();
        }
        _hashCode += new Float(getTaxRate()).hashCode();
        _hashCode += new Float(getTaxAmount()).hashCode();
        _hashCode += new Float(getValue()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TShippingTax.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/OrderTypes/2013/01", "TShippingTax"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaxClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaxRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Value"));
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
