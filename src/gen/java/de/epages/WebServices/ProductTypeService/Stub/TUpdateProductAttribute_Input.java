/**
 * TUpdateProductAttribute_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.ProductTypeService.Stub;


/**
 * input arguments of a single updateProductAttribute call.
 *         a set of optional product attribute specific attributes that
 * will be updated.
 *         the alias element is mandatory.
 *         all others are optional.
 */
public class TUpdateProductAttribute_Input  implements java.io.Serializable {
    /* product attribute alias */
    private java.lang.String alias;

    /* product attribute's name */
    private de.epages.WebServices.ProductTypeService.Stub.TLocalizedValue[] name;

    /* product attribute's description (tool tip text) */
    private de.epages.WebServices.ProductTypeService.Stub.TLocalizedValue[] description;

    private java.math.BigInteger position;

    /* is product attribute visible in storefront? */
    private java.lang.Boolean isVisible;

    /* are HTML tags supported? */
    private java.lang.Boolean isHTML;

    public TUpdateProductAttribute_Input() {
    }

    public TUpdateProductAttribute_Input(
           java.lang.String alias,
           de.epages.WebServices.ProductTypeService.Stub.TLocalizedValue[] name,
           de.epages.WebServices.ProductTypeService.Stub.TLocalizedValue[] description,
           java.math.BigInteger position,
           java.lang.Boolean isVisible,
           java.lang.Boolean isHTML) {
           this.alias = alias;
           this.name = name;
           this.description = description;
           this.position = position;
           this.isVisible = isVisible;
           this.isHTML = isHTML;
    }


    /**
     * Gets the alias value for this TUpdateProductAttribute_Input.
     * 
     * @return alias   * product attribute alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TUpdateProductAttribute_Input.
     * 
     * @param alias   * product attribute alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the name value for this TUpdateProductAttribute_Input.
     * 
     * @return name   * product attribute's name
     */
    public de.epages.WebServices.ProductTypeService.Stub.TLocalizedValue[] getName() {
        return name;
    }


    /**
     * Sets the name value for this TUpdateProductAttribute_Input.
     * 
     * @param name   * product attribute's name
     */
    public void setName(de.epages.WebServices.ProductTypeService.Stub.TLocalizedValue[] name) {
        this.name = name;
    }


    /**
     * Gets the description value for this TUpdateProductAttribute_Input.
     * 
     * @return description   * product attribute's description (tool tip text)
     */
    public de.epages.WebServices.ProductTypeService.Stub.TLocalizedValue[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TUpdateProductAttribute_Input.
     * 
     * @param description   * product attribute's description (tool tip text)
     */
    public void setDescription(de.epages.WebServices.ProductTypeService.Stub.TLocalizedValue[] description) {
        this.description = description;
    }


    /**
     * Gets the position value for this TUpdateProductAttribute_Input.
     * 
     * @return position
     */
    public java.math.BigInteger getPosition() {
        return position;
    }


    /**
     * Sets the position value for this TUpdateProductAttribute_Input.
     * 
     * @param position
     */
    public void setPosition(java.math.BigInteger position) {
        this.position = position;
    }


    /**
     * Gets the isVisible value for this TUpdateProductAttribute_Input.
     * 
     * @return isVisible   * is product attribute visible in storefront?
     */
    public java.lang.Boolean getIsVisible() {
        return isVisible;
    }


    /**
     * Sets the isVisible value for this TUpdateProductAttribute_Input.
     * 
     * @param isVisible   * is product attribute visible in storefront?
     */
    public void setIsVisible(java.lang.Boolean isVisible) {
        this.isVisible = isVisible;
    }


    /**
     * Gets the isHTML value for this TUpdateProductAttribute_Input.
     * 
     * @return isHTML   * are HTML tags supported?
     */
    public java.lang.Boolean getIsHTML() {
        return isHTML;
    }


    /**
     * Sets the isHTML value for this TUpdateProductAttribute_Input.
     * 
     * @param isHTML   * are HTML tags supported?
     */
    public void setIsHTML(java.lang.Boolean isHTML) {
        this.isHTML = isHTML;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TUpdateProductAttribute_Input)) return false;
        TUpdateProductAttribute_Input other = (TUpdateProductAttribute_Input) obj;
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition()))) &&
            ((this.isVisible==null && other.getIsVisible()==null) || 
             (this.isVisible!=null &&
              this.isVisible.equals(other.getIsVisible()))) &&
            ((this.isHTML==null && other.getIsHTML()==null) || 
             (this.isHTML!=null &&
              this.isHTML.equals(other.getIsHTML())));
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
        if (getDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        if (getIsVisible() != null) {
            _hashCode += getIsVisible().hashCode();
        }
        if (getIsHTML() != null) {
            _hashCode += getIsHTML().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TUpdateProductAttribute_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes/2007/10", "TUpdateProductAttribute_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TLocalizedValue"));
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
        elemField.setFieldName("isVisible");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsVisible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isHTML");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsHTML"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
