/**
 * TGetPreDefAttributeInfo_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.producttype2.model;


/**
 * a single return value of a getPreDefAttributeInfo() call.
 *         the alias will be always returned.
 *         the error element will be returned in case of error.
 *         the other elements will be returned if no error has occured.
 */
public class TGetPreDefAttributeInfo_Return  implements java.io.Serializable {
    private java.lang.String alias;

    private java.lang.String path;

    private java.math.BigInteger position;

    /* the predefined attribute value in case it's product attribute
     * is not localizable */
    private java.lang.String valueString;

    /* the predefined attribute value in case it's product attribute
     * is localizable */
    private de.epages.ws.common.model.TLocalizedValue[] valueLocString;

    /* error object (see epagestypes:TError) */
    private de.epages.ws.common.model.TError error;

    public TGetPreDefAttributeInfo_Return() {
    }

    public TGetPreDefAttributeInfo_Return(
           java.lang.String alias,
           java.lang.String path,
           java.math.BigInteger position,
           java.lang.String valueString,
           de.epages.ws.common.model.TLocalizedValue[] valueLocString,
           de.epages.ws.common.model.TError error) {
           this.alias = alias;
           this.path = path;
           this.position = position;
           this.valueString = valueString;
           this.valueLocString = valueLocString;
           this.error = error;
    }


    /**
     * Gets the alias value for this TGetPreDefAttributeInfo_Return.
     * 
     * @return alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TGetPreDefAttributeInfo_Return.
     * 
     * @param alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the path value for this TGetPreDefAttributeInfo_Return.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TGetPreDefAttributeInfo_Return.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the position value for this TGetPreDefAttributeInfo_Return.
     * 
     * @return position
     */
    public java.math.BigInteger getPosition() {
        return position;
    }


    /**
     * Sets the position value for this TGetPreDefAttributeInfo_Return.
     * 
     * @param position
     */
    public void setPosition(java.math.BigInteger position) {
        this.position = position;
    }


    /**
     * Gets the valueString value for this TGetPreDefAttributeInfo_Return.
     * 
     * @return valueString   * the predefined attribute value in case it's product attribute
     * is not localizable
     */
    public java.lang.String getValueString() {
        return valueString;
    }


    /**
     * Sets the valueString value for this TGetPreDefAttributeInfo_Return.
     * 
     * @param valueString   * the predefined attribute value in case it's product attribute
     * is not localizable
     */
    public void setValueString(java.lang.String valueString) {
        this.valueString = valueString;
    }


    /**
     * Gets the valueLocString value for this TGetPreDefAttributeInfo_Return.
     * 
     * @return valueLocString   * the predefined attribute value in case it's product attribute
     * is localizable
     */
    public de.epages.ws.common.model.TLocalizedValue[] getValueLocString() {
        return valueLocString;
    }


    /**
     * Sets the valueLocString value for this TGetPreDefAttributeInfo_Return.
     * 
     * @param valueLocString   * the predefined attribute value in case it's product attribute
     * is localizable
     */
    public void setValueLocString(de.epages.ws.common.model.TLocalizedValue[] valueLocString) {
        this.valueLocString = valueLocString;
    }


    /**
     * Gets the error value for this TGetPreDefAttributeInfo_Return.
     * 
     * @return error   * error object (see epagestypes:TError)
     */
    public de.epages.ws.common.model.TError getError() {
        return error;
    }


    /**
     * Sets the error value for this TGetPreDefAttributeInfo_Return.
     * 
     * @param error   * error object (see epagestypes:TError)
     */
    public void setError(de.epages.ws.common.model.TError error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TGetPreDefAttributeInfo_Return)) return false;
        TGetPreDefAttributeInfo_Return other = (TGetPreDefAttributeInfo_Return) obj;
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
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath()))) &&
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition()))) &&
            ((this.valueString==null && other.getValueString()==null) || 
             (this.valueString!=null &&
              this.valueString.equals(other.getValueString()))) &&
            ((this.valueLocString==null && other.getValueLocString()==null) || 
             (this.valueLocString!=null &&
              java.util.Arrays.equals(this.valueLocString, other.getValueLocString()))) &&
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
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
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
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TGetPreDefAttributeInfo_Return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TGetPreDefAttributeInfo_Return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
