/**
 * TGetProductAttributeInfo_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.ProductTypeService2.Stub;


/**
 * a single return value of a getProductAttributeInfo() call.
 *         the alias will be always returned.
 *         the error element will be returned in case of error.
 *         the other elements will be returned if no error has occured.
 */
public class TGetProductAttributeInfo_Return  implements java.io.Serializable {
    private java.lang.String alias;

    private java.lang.String path;

    private java.math.BigInteger position;

    /* the product attribute type (one of Boolean, Date, DateTime,
     * File, Float, Integer, LocalizedFile, LocalizedString, Money, PreDefLocalizedString,
     * PreDefMultiLocalizedString, PreDefMultiString, PreDefString, String,
     * Time) */
    private java.lang.String type;

    /* IsVisible flag */
    private java.lang.Boolean isVisible;

    /* IsHTML flag */
    private java.lang.Boolean isHTML;

    /* product attribute's name */
    private de.epages.WebServices.ProductTypeService2.Stub.TLocalizedValue[] name;

    /* product attribute's description (tool tip text) */
    private de.epages.WebServices.ProductTypeService2.Stub.TLocalizedValue[] description;

    /* error object (see epagestypes:TError) */
    private de.epages.WebServices.ProductTypeService2.Stub.TError error;

    public TGetProductAttributeInfo_Return() {
    }

    public TGetProductAttributeInfo_Return(
           java.lang.String alias,
           java.lang.String path,
           java.math.BigInteger position,
           java.lang.String type,
           java.lang.Boolean isVisible,
           java.lang.Boolean isHTML,
           de.epages.WebServices.ProductTypeService2.Stub.TLocalizedValue[] name,
           de.epages.WebServices.ProductTypeService2.Stub.TLocalizedValue[] description,
           de.epages.WebServices.ProductTypeService2.Stub.TError error) {
           this.alias = alias;
           this.path = path;
           this.position = position;
           this.type = type;
           this.isVisible = isVisible;
           this.isHTML = isHTML;
           this.name = name;
           this.description = description;
           this.error = error;
    }


    /**
     * Gets the alias value for this TGetProductAttributeInfo_Return.
     * 
     * @return alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TGetProductAttributeInfo_Return.
     * 
     * @param alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the path value for this TGetProductAttributeInfo_Return.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TGetProductAttributeInfo_Return.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the position value for this TGetProductAttributeInfo_Return.
     * 
     * @return position
     */
    public java.math.BigInteger getPosition() {
        return position;
    }


    /**
     * Sets the position value for this TGetProductAttributeInfo_Return.
     * 
     * @param position
     */
    public void setPosition(java.math.BigInteger position) {
        this.position = position;
    }


    /**
     * Gets the type value for this TGetProductAttributeInfo_Return.
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
     * Sets the type value for this TGetProductAttributeInfo_Return.
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
     * Gets the isVisible value for this TGetProductAttributeInfo_Return.
     * 
     * @return isVisible   * IsVisible flag
     */
    public java.lang.Boolean getIsVisible() {
        return isVisible;
    }


    /**
     * Sets the isVisible value for this TGetProductAttributeInfo_Return.
     * 
     * @param isVisible   * IsVisible flag
     */
    public void setIsVisible(java.lang.Boolean isVisible) {
        this.isVisible = isVisible;
    }


    /**
     * Gets the isHTML value for this TGetProductAttributeInfo_Return.
     * 
     * @return isHTML   * IsHTML flag
     */
    public java.lang.Boolean getIsHTML() {
        return isHTML;
    }


    /**
     * Sets the isHTML value for this TGetProductAttributeInfo_Return.
     * 
     * @param isHTML   * IsHTML flag
     */
    public void setIsHTML(java.lang.Boolean isHTML) {
        this.isHTML = isHTML;
    }


    /**
     * Gets the name value for this TGetProductAttributeInfo_Return.
     * 
     * @return name   * product attribute's name
     */
    public de.epages.WebServices.ProductTypeService2.Stub.TLocalizedValue[] getName() {
        return name;
    }


    /**
     * Sets the name value for this TGetProductAttributeInfo_Return.
     * 
     * @param name   * product attribute's name
     */
    public void setName(de.epages.WebServices.ProductTypeService2.Stub.TLocalizedValue[] name) {
        this.name = name;
    }


    /**
     * Gets the description value for this TGetProductAttributeInfo_Return.
     * 
     * @return description   * product attribute's description (tool tip text)
     */
    public de.epages.WebServices.ProductTypeService2.Stub.TLocalizedValue[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TGetProductAttributeInfo_Return.
     * 
     * @param description   * product attribute's description (tool tip text)
     */
    public void setDescription(de.epages.WebServices.ProductTypeService2.Stub.TLocalizedValue[] description) {
        this.description = description;
    }


    /**
     * Gets the error value for this TGetProductAttributeInfo_Return.
     * 
     * @return error   * error object (see epagestypes:TError)
     */
    public de.epages.WebServices.ProductTypeService2.Stub.TError getError() {
        return error;
    }


    /**
     * Sets the error value for this TGetProductAttributeInfo_Return.
     * 
     * @param error   * error object (see epagestypes:TError)
     */
    public void setError(de.epages.WebServices.ProductTypeService2.Stub.TError error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TGetProductAttributeInfo_Return)) return false;
        TGetProductAttributeInfo_Return other = (TGetProductAttributeInfo_Return) obj;
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
            ((this.isVisible==null && other.getIsVisible()==null) || 
             (this.isVisible!=null &&
              this.isVisible.equals(other.getIsVisible()))) &&
            ((this.isHTML==null && other.getIsHTML()==null) || 
             (this.isHTML!=null &&
              this.isHTML.equals(other.getIsHTML()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getIsVisible() != null) {
            _hashCode += getIsVisible().hashCode();
        }
        if (getIsHTML() != null) {
            _hashCode += getIsHTML().hashCode();
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
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TGetProductAttributeInfo_Return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TGetProductAttributeInfo_Return"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
