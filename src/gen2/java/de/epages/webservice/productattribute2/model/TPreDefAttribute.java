/**
 * TPreDefAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.productattribute2.model;


/**
 * an pre defined attribute value. Value will be used for not-localized
 * attributes. LocalizedValues will be used for localized attributes.
 */
public class TPreDefAttribute  implements java.io.Serializable {
    /* name of attribute (unique identifier) */
    private java.lang.String alias;

    /* value of attribute. epages objects will be serialized with
     * their object path */
    private java.lang.String value;

    /* localized values of attribute. see epagestypes:ListOfLocalizedValues */
    private de.epages.webservice.common.model.TLocalizedValue[] localizedValues;

    public TPreDefAttribute() {
    }

    public TPreDefAttribute(
           java.lang.String alias,
           java.lang.String value,
           de.epages.webservice.common.model.TLocalizedValue[] localizedValues) {
           this.alias = alias;
           this.value = value;
           this.localizedValues = localizedValues;
    }


    /**
     * Gets the alias value for this TPreDefAttribute.
     * 
     * @return alias   * name of attribute (unique identifier)
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TPreDefAttribute.
     * 
     * @param alias   * name of attribute (unique identifier)
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the value value for this TPreDefAttribute.
     * 
     * @return value   * value of attribute. epages objects will be serialized with
     * their object path
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this TPreDefAttribute.
     * 
     * @param value   * value of attribute. epages objects will be serialized with
     * their object path
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the localizedValues value for this TPreDefAttribute.
     * 
     * @return localizedValues   * localized values of attribute. see epagestypes:ListOfLocalizedValues
     */
    public de.epages.webservice.common.model.TLocalizedValue[] getLocalizedValues() {
        return localizedValues;
    }


    /**
     * Sets the localizedValues value for this TPreDefAttribute.
     * 
     * @param localizedValues   * localized values of attribute. see epagestypes:ListOfLocalizedValues
     */
    public void setLocalizedValues(de.epages.webservice.common.model.TLocalizedValue[] localizedValues) {
        this.localizedValues = localizedValues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TPreDefAttribute)) return false;
        TPreDefAttribute other = (TPreDefAttribute) obj;
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
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.localizedValues==null && other.getLocalizedValues()==null) || 
             (this.localizedValues!=null &&
              java.util.Arrays.equals(this.localizedValues, other.getLocalizedValues())));
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
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getLocalizedValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocalizedValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocalizedValues(), i);
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
        new org.apache.axis.description.TypeDesc(TPreDefAttribute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductAttributeTypes/2007/01", "TPreDefAttribute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizedValues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LocalizedValues"));
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
