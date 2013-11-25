/**
 * TAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.common.model2;


/**
 * an attribute object with value.
 *         if used in get requests, the type will be returned, too.
 *         the type attribute is not mandatory on set requests.
 *         Value will be used for not-localized attributes.
 *         LocalizedValues will be used for localized attributes.
 *         FileContent will be used for file attributes.
 */
public class TAttribute  implements java.io.Serializable {
    /* name of attribute (unique identifier) */
    private java.lang.String name;

    /* value of attribute.
     *             epages objects will be serialized with their object path */
    private java.lang.String value;

    /* localized values of attribute.
     *             see epagestypes:ListOfLocalizedValues */
    private de.epages.webservice.common.model2.TLocalizedValue[] localizedValues;

    /* content of file if type file */
    private byte[] fileContent;

    /* type of attribute */
    private java.lang.String type;

    public TAttribute() {
    }

    public TAttribute(
           java.lang.String name,
           java.lang.String value,
           de.epages.webservice.common.model2.TLocalizedValue[] localizedValues,
           byte[] fileContent,
           java.lang.String type) {
           this.name = name;
           this.value = value;
           this.localizedValues = localizedValues;
           this.fileContent = fileContent;
           this.type = type;
    }


    /**
     * Gets the name value for this TAttribute.
     * 
     * @return name   * name of attribute (unique identifier)
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TAttribute.
     * 
     * @param name   * name of attribute (unique identifier)
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the value value for this TAttribute.
     * 
     * @return value   * value of attribute.
     *             epages objects will be serialized with their object path
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this TAttribute.
     * 
     * @param value   * value of attribute.
     *             epages objects will be serialized with their object path
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the localizedValues value for this TAttribute.
     * 
     * @return localizedValues   * localized values of attribute.
     *             see epagestypes:ListOfLocalizedValues
     */
    public de.epages.webservice.common.model2.TLocalizedValue[] getLocalizedValues() {
        return localizedValues;
    }


    /**
     * Sets the localizedValues value for this TAttribute.
     * 
     * @param localizedValues   * localized values of attribute.
     *             see epagestypes:ListOfLocalizedValues
     */
    public void setLocalizedValues(de.epages.webservice.common.model2.TLocalizedValue[] localizedValues) {
        this.localizedValues = localizedValues;
    }


    /**
     * Gets the fileContent value for this TAttribute.
     * 
     * @return fileContent   * content of file if type file
     */
    public byte[] getFileContent() {
        return fileContent;
    }


    /**
     * Sets the fileContent value for this TAttribute.
     * 
     * @param fileContent   * content of file if type file
     */
    public void setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
    }


    /**
     * Gets the type value for this TAttribute.
     * 
     * @return type   * type of attribute
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this TAttribute.
     * 
     * @param type   * type of attribute
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TAttribute)) return false;
        TAttribute other = (TAttribute) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.localizedValues==null && other.getLocalizedValues()==null) || 
             (this.localizedValues!=null &&
              java.util.Arrays.equals(this.localizedValues, other.getLocalizedValues()))) &&
            ((this.fileContent==null && other.getFileContent()==null) || 
             (this.fileContent!=null &&
              java.util.Arrays.equals(this.fileContent, other.getFileContent()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
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
        if (getFileContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileContent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TAttribute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2013/01", "TAttribute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2013/01", "TLocalizedValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileContent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FileContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
