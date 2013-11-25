/**
 * TCreatePreDefAttribute_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.producttype2.model;


/**
 * input arguments of a single createPreDefAttribute call.
 *         a set of optional predefined attribute specific attributes
 * that will be set.
 *         the alias element is mandatory.
 *         all others are optional.
 */
public class TCreatePreDefAttribute_Input  implements java.io.Serializable {
    /* predefined attribute alias */
    private java.lang.String alias;

    private java.math.BigInteger position;

    /* the predefined attribute value in case it's product attribute
     * is not localizable */
    private java.lang.String valueString;

    /* the predefined attribute value in case it's product attribute
     * is localizable */
    private de.epages.webservice.common.model.TLocalizedValue[] valueLocString;

    public TCreatePreDefAttribute_Input() {
    }

    public TCreatePreDefAttribute_Input(
           java.lang.String alias,
           java.math.BigInteger position,
           java.lang.String valueString,
           de.epages.webservice.common.model.TLocalizedValue[] valueLocString) {
           this.alias = alias;
           this.position = position;
           this.valueString = valueString;
           this.valueLocString = valueLocString;
    }


    /**
     * Gets the alias value for this TCreatePreDefAttribute_Input.
     * 
     * @return alias   * predefined attribute alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TCreatePreDefAttribute_Input.
     * 
     * @param alias   * predefined attribute alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the position value for this TCreatePreDefAttribute_Input.
     * 
     * @return position
     */
    public java.math.BigInteger getPosition() {
        return position;
    }


    /**
     * Sets the position value for this TCreatePreDefAttribute_Input.
     * 
     * @param position
     */
    public void setPosition(java.math.BigInteger position) {
        this.position = position;
    }


    /**
     * Gets the valueString value for this TCreatePreDefAttribute_Input.
     * 
     * @return valueString   * the predefined attribute value in case it's product attribute
     * is not localizable
     */
    public java.lang.String getValueString() {
        return valueString;
    }


    /**
     * Sets the valueString value for this TCreatePreDefAttribute_Input.
     * 
     * @param valueString   * the predefined attribute value in case it's product attribute
     * is not localizable
     */
    public void setValueString(java.lang.String valueString) {
        this.valueString = valueString;
    }


    /**
     * Gets the valueLocString value for this TCreatePreDefAttribute_Input.
     * 
     * @return valueLocString   * the predefined attribute value in case it's product attribute
     * is localizable
     */
    public de.epages.webservice.common.model.TLocalizedValue[] getValueLocString() {
        return valueLocString;
    }


    /**
     * Sets the valueLocString value for this TCreatePreDefAttribute_Input.
     * 
     * @param valueLocString   * the predefined attribute value in case it's product attribute
     * is localizable
     */
    public void setValueLocString(de.epages.webservice.common.model.TLocalizedValue[] valueLocString) {
        this.valueLocString = valueLocString;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCreatePreDefAttribute_Input)) return false;
        TCreatePreDefAttribute_Input other = (TCreatePreDefAttribute_Input) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alias==null && other.getAlias()==null) || 
             (this.alias!=null &&
              this.alias.equals(other.getAlias()))) &&
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition()))) &&
            ((this.valueString==null && other.getValueString()==null) || 
             (this.valueString!=null &&
              this.valueString.equals(other.getValueString()))) &&
            ((this.valueLocString==null && other.getValueLocString()==null) || 
             (this.valueLocString!=null &&
              java.util.Arrays.equals(this.valueLocString, other.getValueLocString())));
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
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        if (getValueString() != null) {
            _hashCode += getValueString().hashCode();
        }
        if (getValueLocString() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValueLocString());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValueLocString(), i);
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
        new org.apache.axis.description.TypeDesc(TCreatePreDefAttribute_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TCreatePreDefAttribute_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValueString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueLocString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValueLocString"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TLocalizedValue"));
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
