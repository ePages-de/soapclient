/**
 * TUpdate_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.customergroup2.model;


/**
 * input arguments of a single update() customer group call.
 *         a set of customer group specific attributes that will be used
 * to update to.
 */
public class TUpdate_Input  implements java.io.Serializable {
    /* customer group alias */
    private java.lang.String alias;

    /* localized name of group (see epagestypes:TLocalizedValue) */
    private de.epages.webservice.common.model.TLocalizedValue[] name;

    private java.lang.Boolean isNewMemberDefault;

    private java.lang.Boolean isNonMemberDefault;

    /* list of requested attributes (see epagestypes:ListOfAttributes) */
    private de.epages.webservice.common.model.TAttribute[] attributes;

    public TUpdate_Input() {
    }

    public TUpdate_Input(
           java.lang.String alias,
           de.epages.webservice.common.model.TLocalizedValue[] name,
           java.lang.Boolean isNewMemberDefault,
           java.lang.Boolean isNonMemberDefault,
           de.epages.webservice.common.model.TAttribute[] attributes) {
           this.alias = alias;
           this.name = name;
           this.isNewMemberDefault = isNewMemberDefault;
           this.isNonMemberDefault = isNonMemberDefault;
           this.attributes = attributes;
    }


    /**
     * Gets the alias value for this TUpdate_Input.
     * 
     * @return alias   * customer group alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TUpdate_Input.
     * 
     * @param alias   * customer group alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the name value for this TUpdate_Input.
     * 
     * @return name   * localized name of group (see epagestypes:TLocalizedValue)
     */
    public de.epages.webservice.common.model.TLocalizedValue[] getName() {
        return name;
    }


    /**
     * Sets the name value for this TUpdate_Input.
     * 
     * @param name   * localized name of group (see epagestypes:TLocalizedValue)
     */
    public void setName(de.epages.webservice.common.model.TLocalizedValue[] name) {
        this.name = name;
    }


    /**
     * Gets the isNewMemberDefault value for this TUpdate_Input.
     * 
     * @return isNewMemberDefault
     */
    public java.lang.Boolean getIsNewMemberDefault() {
        return isNewMemberDefault;
    }


    /**
     * Sets the isNewMemberDefault value for this TUpdate_Input.
     * 
     * @param isNewMemberDefault
     */
    public void setIsNewMemberDefault(java.lang.Boolean isNewMemberDefault) {
        this.isNewMemberDefault = isNewMemberDefault;
    }


    /**
     * Gets the isNonMemberDefault value for this TUpdate_Input.
     * 
     * @return isNonMemberDefault
     */
    public java.lang.Boolean getIsNonMemberDefault() {
        return isNonMemberDefault;
    }


    /**
     * Sets the isNonMemberDefault value for this TUpdate_Input.
     * 
     * @param isNonMemberDefault
     */
    public void setIsNonMemberDefault(java.lang.Boolean isNonMemberDefault) {
        this.isNonMemberDefault = isNonMemberDefault;
    }


    /**
     * Gets the attributes value for this TUpdate_Input.
     * 
     * @return attributes   * list of requested attributes (see epagestypes:ListOfAttributes)
     */
    public de.epages.webservice.common.model.TAttribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this TUpdate_Input.
     * 
     * @param attributes   * list of requested attributes (see epagestypes:ListOfAttributes)
     */
    public void setAttributes(de.epages.webservice.common.model.TAttribute[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TUpdate_Input)) return false;
        TUpdate_Input other = (TUpdate_Input) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.isNewMemberDefault==null && other.getIsNewMemberDefault()==null) || 
             (this.isNewMemberDefault!=null &&
              this.isNewMemberDefault.equals(other.getIsNewMemberDefault()))) &&
            ((this.isNonMemberDefault==null && other.getIsNonMemberDefault()==null) || 
             (this.isNonMemberDefault!=null &&
              this.isNonMemberDefault.equals(other.getIsNonMemberDefault()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes())));
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
        if (getName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsNewMemberDefault() != null) {
            _hashCode += getIsNewMemberDefault().hashCode();
        }
        if (getIsNonMemberDefault() != null) {
            _hashCode += getIsNonMemberDefault().hashCode();
        }
        if (getAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributes(), i);
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
        new org.apache.axis.description.TypeDesc(TUpdate_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/CustomerGroupTypes/2011/03", "TUpdate_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TLocalizedValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNewMemberDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsNewMemberDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNonMemberDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsNonMemberDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TAttribute"));
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
