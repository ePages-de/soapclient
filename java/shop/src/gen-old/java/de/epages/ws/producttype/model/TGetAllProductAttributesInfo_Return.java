/**
 * TGetAllProductAttributesInfo_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.producttype.model;


/**
 * a single return value of a getAllProductAttributesInfo() call.
 */
public class TGetAllProductAttributesInfo_Return  implements java.io.Serializable {
    private java.lang.String alias;

    private java.lang.String path;

    private java.math.BigInteger position;

    /* the product attribute type (one of Boolean, Date, DateTime,
     * File, Float, Integer, LocalizedFile, LocalizedString, Money, PreDefLocalizedString,
     * PreDefMultiLocalizedString, PreDefMultiString, PreDefString, String,
     * Time) */
    private java.lang.String type;

    /* IsVisible flag */
    private boolean isVisible;

    /* IsHTML flag */
    private boolean isHTML;

    /* product attribute's name */
    private de.epages.ws.common.model.TLocalizedValue[] name;

    /* product attribute's description (tool tip text) */
    private de.epages.ws.common.model.TLocalizedValue[] description;

    public TGetAllProductAttributesInfo_Return() {
    }

    public TGetAllProductAttributesInfo_Return(
           java.lang.String alias,
           java.lang.String path,
           java.math.BigInteger position,
           java.lang.String type,
           boolean isVisible,
           boolean isHTML,
           de.epages.ws.common.model.TLocalizedValue[] name,
           de.epages.ws.common.model.TLocalizedValue[] description) {
           this.alias = alias;
           this.path = path;
           this.position = position;
           this.type = type;
           this.isVisible = isVisible;
           this.isHTML = isHTML;
           this.name = name;
           this.description = description;
    }


    /**
     * Gets the alias value for this TGetAllProductAttributesInfo_Return.
     * 
     * @return alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TGetAllProductAttributesInfo_Return.
     * 
     * @param alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the path value for this TGetAllProductAttributesInfo_Return.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TGetAllProductAttributesInfo_Return.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the position value for this TGetAllProductAttributesInfo_Return.
     * 
     * @return position
     */
    public java.math.BigInteger getPosition() {
        return position;
    }


    /**
     * Sets the position value for this TGetAllProductAttributesInfo_Return.
     * 
     * @param position
     */
    public void setPosition(java.math.BigInteger position) {
        this.position = position;
    }


    /**
     * Gets the type value for this TGetAllProductAttributesInfo_Return.
     * 
     * @return type   * the product attribute type (one of Boolean, Date, DateTime,
     * File, Float, Integer, LocalizedFile, LocalizedString, Money, PreDefLocalizedString,
     * PreDefMultiLocalizedString, PreDefMultiString, PreDefString, String,
     * Time)
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this TGetAllProductAttributesInfo_Return.
     * 
     * @param type   * the product attribute type (one of Boolean, Date, DateTime,
     * File, Float, Integer, LocalizedFile, LocalizedString, Money, PreDefLocalizedString,
     * PreDefMultiLocalizedString, PreDefMultiString, PreDefString, String,
     * Time)
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the isVisible value for this TGetAllProductAttributesInfo_Return.
     * 
     * @return isVisible   * IsVisible flag
     */
    public boolean isIsVisible() {
        return isVisible;
    }


    /**
     * Sets the isVisible value for this TGetAllProductAttributesInfo_Return.
     * 
     * @param isVisible   * IsVisible flag
     */
    public void setIsVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }


    /**
     * Gets the isHTML value for this TGetAllProductAttributesInfo_Return.
     * 
     * @return isHTML   * IsHTML flag
     */
    public boolean isIsHTML() {
        return isHTML;
    }


    /**
     * Sets the isHTML value for this TGetAllProductAttributesInfo_Return.
     * 
     * @param isHTML   * IsHTML flag
     */
    public void setIsHTML(boolean isHTML) {
        this.isHTML = isHTML;
    }


    /**
     * Gets the name value for this TGetAllProductAttributesInfo_Return.
     * 
     * @return name   * product attribute's name
     */
    public de.epages.ws.common.model.TLocalizedValue[] getName() {
        return name;
    }


    /**
     * Sets the name value for this TGetAllProductAttributesInfo_Return.
     * 
     * @param name   * product attribute's name
     */
    public void setName(de.epages.ws.common.model.TLocalizedValue[] name) {
        this.name = name;
    }


    /**
     * Gets the description value for this TGetAllProductAttributesInfo_Return.
     * 
     * @return description   * product attribute's description (tool tip text)
     */
    public de.epages.ws.common.model.TLocalizedValue[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TGetAllProductAttributesInfo_Return.
     * 
     * @param description   * product attribute's description (tool tip text)
     */
    public void setDescription(de.epages.ws.common.model.TLocalizedValue[] description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TGetAllProductAttributesInfo_Return)) return false;
        TGetAllProductAttributesInfo_Return other = (TGetAllProductAttributesInfo_Return) obj;
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
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.isVisible == other.isIsVisible() &&
            this.isHTML == other.isIsHTML() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += (isIsVisible() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsHTML() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TGetAllProductAttributesInfo_Return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes/2007/10", "TGetAllProductAttributesInfo_Return"));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVisible");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsVisible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isHTML");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsHTML"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TLocalizedValue"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TLocalizedValue"));
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
