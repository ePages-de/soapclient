/**
 * TGlobalValueDiscount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.pricelist2.model;


/**
 * an global value discount definition
 *         the discount (percent) or absolute dicount
 *         is valid by value and greater...
 */
public class TGlobalValueDiscount  implements java.io.Serializable {
    /* value of basket
     *             dicount is valid from this start value */
    private float value;

    /* dicount percent by value */
    private java.lang.Float discount;

    /* absolute discount (will substracted from global value) */
    private java.lang.Float discountAbsolute;

    public TGlobalValueDiscount() {
    }

    public TGlobalValueDiscount(
           float value,
           java.lang.Float discount,
           java.lang.Float discountAbsolute) {
           this.value = value;
           this.discount = discount;
           this.discountAbsolute = discountAbsolute;
    }


    /**
     * Gets the value value for this TGlobalValueDiscount.
     * 
     * @return value   * value of basket
     *             dicount is valid from this start value
     */
    public float getValue() {
        return value;
    }


    /**
     * Sets the value value for this TGlobalValueDiscount.
     * 
     * @param value   * value of basket
     *             dicount is valid from this start value
     */
    public void setValue(float value) {
        this.value = value;
    }


    /**
     * Gets the discount value for this TGlobalValueDiscount.
     * 
     * @return discount   * dicount percent by value
     */
    public java.lang.Float getDiscount() {
        return discount;
    }


    /**
     * Sets the discount value for this TGlobalValueDiscount.
     * 
     * @param discount   * dicount percent by value
     */
    public void setDiscount(java.lang.Float discount) {
        this.discount = discount;
    }


    /**
     * Gets the discountAbsolute value for this TGlobalValueDiscount.
     * 
     * @return discountAbsolute   * absolute discount (will substracted from global value)
     */
    public java.lang.Float getDiscountAbsolute() {
        return discountAbsolute;
    }


    /**
     * Sets the discountAbsolute value for this TGlobalValueDiscount.
     * 
     * @param discountAbsolute   * absolute discount (will substracted from global value)
     */
    public void setDiscountAbsolute(java.lang.Float discountAbsolute) {
        this.discountAbsolute = discountAbsolute;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TGlobalValueDiscount)) return false;
        TGlobalValueDiscount other = (TGlobalValueDiscount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.value == other.getValue() &&
            ((this.discount==null && other.getDiscount()==null) || 
             (this.discount!=null &&
              this.discount.equals(other.getDiscount()))) &&
            ((this.discountAbsolute==null && other.getDiscountAbsolute()==null) || 
             (this.discountAbsolute!=null &&
              this.discountAbsolute.equals(other.getDiscountAbsolute())));
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
        _hashCode += new Float(getValue()).hashCode();
        if (getDiscount() != null) {
            _hashCode += getDiscount().hashCode();
        }
        if (getDiscountAbsolute() != null) {
            _hashCode += getDiscountAbsolute().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TGlobalValueDiscount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListTypes/2010/08", "TGlobalValueDiscount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Discount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountAbsolute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DiscountAbsolute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
