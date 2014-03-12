/**
 * TGetInfoList_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.productattribute2.model;


/**
 * a single return value of a getInfoList call. the Alias will be
 * always returned. the error element will be returned in case of error.
 */
public class TGetInfoList_Return  implements java.io.Serializable {
    private java.lang.String alias;

    private de.epages.ws.common.model.TLocalizedValue[] name;

    private de.epages.ws.common.model.TLocalizedValue[] description;

    private java.lang.String path;

    private java.lang.String type;

    private boolean isVisible;

    private boolean isHTML;

    private boolean isUserDefined;

    private boolean isVariationAttribute;

    private java.lang.String productTypeAlias;

    private de.epages.ws.common.model.TLocalizedValue[] productTypeName;

    private de.epages.ws.productattribute2.model.TPreDefAttribute[] preDefAttributes;

    /* error object (see epagestypes:TError) */
    private de.epages.ws.common.model.TError error;

    public TGetInfoList_Return() {
    }

    public TGetInfoList_Return(
           java.lang.String alias,
           de.epages.ws.common.model.TLocalizedValue[] name,
           de.epages.ws.common.model.TLocalizedValue[] description,
           java.lang.String path,
           java.lang.String type,
           boolean isVisible,
           boolean isHTML,
           boolean isUserDefined,
           boolean isVariationAttribute,
           java.lang.String productTypeAlias,
           de.epages.ws.common.model.TLocalizedValue[] productTypeName,
           de.epages.ws.productattribute2.model.TPreDefAttribute[] preDefAttributes,
           de.epages.ws.common.model.TError error) {
           this.alias = alias;
           this.name = name;
           this.description = description;
           this.path = path;
           this.type = type;
           this.isVisible = isVisible;
           this.isHTML = isHTML;
           this.isUserDefined = isUserDefined;
           this.isVariationAttribute = isVariationAttribute;
           this.productTypeAlias = productTypeAlias;
           this.productTypeName = productTypeName;
           this.preDefAttributes = preDefAttributes;
           this.error = error;
    }


    /**
     * Gets the alias value for this TGetInfoList_Return.
     * 
     * @return alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TGetInfoList_Return.
     * 
     * @param alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the name value for this TGetInfoList_Return.
     * 
     * @return name
     */
    public de.epages.ws.common.model.TLocalizedValue[] getName() {
        return name;
    }


    /**
     * Sets the name value for this TGetInfoList_Return.
     * 
     * @param name
     */
    public void setName(de.epages.ws.common.model.TLocalizedValue[] name) {
        this.name = name;
    }


    /**
     * Gets the description value for this TGetInfoList_Return.
     * 
     * @return description
     */
    public de.epages.ws.common.model.TLocalizedValue[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TGetInfoList_Return.
     * 
     * @param description
     */
    public void setDescription(de.epages.ws.common.model.TLocalizedValue[] description) {
        this.description = description;
    }


    /**
     * Gets the path value for this TGetInfoList_Return.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TGetInfoList_Return.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the type value for this TGetInfoList_Return.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this TGetInfoList_Return.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the isVisible value for this TGetInfoList_Return.
     * 
     * @return isVisible
     */
    public boolean isIsVisible() {
        return isVisible;
    }


    /**
     * Sets the isVisible value for this TGetInfoList_Return.
     * 
     * @param isVisible
     */
    public void setIsVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }


    /**
     * Gets the isHTML value for this TGetInfoList_Return.
     * 
     * @return isHTML
     */
    public boolean isIsHTML() {
        return isHTML;
    }


    /**
     * Sets the isHTML value for this TGetInfoList_Return.
     * 
     * @param isHTML
     */
    public void setIsHTML(boolean isHTML) {
        this.isHTML = isHTML;
    }


    /**
     * Gets the isUserDefined value for this TGetInfoList_Return.
     * 
     * @return isUserDefined
     */
    public boolean isIsUserDefined() {
        return isUserDefined;
    }


    /**
     * Sets the isUserDefined value for this TGetInfoList_Return.
     * 
     * @param isUserDefined
     */
    public void setIsUserDefined(boolean isUserDefined) {
        this.isUserDefined = isUserDefined;
    }


    /**
     * Gets the isVariationAttribute value for this TGetInfoList_Return.
     * 
     * @return isVariationAttribute
     */
    public boolean isIsVariationAttribute() {
        return isVariationAttribute;
    }


    /**
     * Sets the isVariationAttribute value for this TGetInfoList_Return.
     * 
     * @param isVariationAttribute
     */
    public void setIsVariationAttribute(boolean isVariationAttribute) {
        this.isVariationAttribute = isVariationAttribute;
    }


    /**
     * Gets the productTypeAlias value for this TGetInfoList_Return.
     * 
     * @return productTypeAlias
     */
    public java.lang.String getProductTypeAlias() {
        return productTypeAlias;
    }


    /**
     * Sets the productTypeAlias value for this TGetInfoList_Return.
     * 
     * @param productTypeAlias
     */
    public void setProductTypeAlias(java.lang.String productTypeAlias) {
        this.productTypeAlias = productTypeAlias;
    }


    /**
     * Gets the productTypeName value for this TGetInfoList_Return.
     * 
     * @return productTypeName
     */
    public de.epages.ws.common.model.TLocalizedValue[] getProductTypeName() {
        return productTypeName;
    }


    /**
     * Sets the productTypeName value for this TGetInfoList_Return.
     * 
     * @param productTypeName
     */
    public void setProductTypeName(de.epages.ws.common.model.TLocalizedValue[] productTypeName) {
        this.productTypeName = productTypeName;
    }


    /**
     * Gets the preDefAttributes value for this TGetInfoList_Return.
     * 
     * @return preDefAttributes
     */
    public de.epages.ws.productattribute2.model.TPreDefAttribute[] getPreDefAttributes() {
        return preDefAttributes;
    }


    /**
     * Sets the preDefAttributes value for this TGetInfoList_Return.
     * 
     * @param preDefAttributes
     */
    public void setPreDefAttributes(de.epages.ws.productattribute2.model.TPreDefAttribute[] preDefAttributes) {
        this.preDefAttributes = preDefAttributes;
    }


    /**
     * Gets the error value for this TGetInfoList_Return.
     * 
     * @return error   * error object (see epagestypes:TError)
     */
    public de.epages.ws.common.model.TError getError() {
        return error;
    }


    /**
     * Sets the error value for this TGetInfoList_Return.
     * 
     * @param error   * error object (see epagestypes:TError)
     */
    public void setError(de.epages.ws.common.model.TError error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TGetInfoList_Return)) return false;
        TGetInfoList_Return other = (TGetInfoList_Return) obj;
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
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.isVisible == other.isIsVisible() &&
            this.isHTML == other.isIsHTML() &&
            this.isUserDefined == other.isIsUserDefined() &&
            this.isVariationAttribute == other.isIsVariationAttribute() &&
            ((this.productTypeAlias==null && other.getProductTypeAlias()==null) || 
             (this.productTypeAlias!=null &&
              this.productTypeAlias.equals(other.getProductTypeAlias()))) &&
            ((this.productTypeName==null && other.getProductTypeName()==null) || 
             (this.productTypeName!=null &&
              java.util.Arrays.equals(this.productTypeName, other.getProductTypeName()))) &&
            ((this.preDefAttributes==null && other.getPreDefAttributes()==null) || 
             (this.preDefAttributes!=null &&
              java.util.Arrays.equals(this.preDefAttributes, other.getPreDefAttributes()))) &&
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
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += (isIsVisible() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsHTML() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsUserDefined() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsVariationAttribute() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getProductTypeAlias() != null) {
            _hashCode += getProductTypeAlias().hashCode();
        }
        if (getProductTypeName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductTypeName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductTypeName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPreDefAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreDefAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreDefAttributes(), i);
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
        new org.apache.axis.description.TypeDesc(TGetInfoList_Return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductAttributeTypes/2007/01", "TGetInfoList_Return"));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TLocalizedValue"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("isUserDefined");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsUserDefined"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVariationAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsVariationAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productTypeAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProductTypeAlias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProductTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TLocalizedValue"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preDefAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PreDefAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductAttributeTypes/2007/01", "TPreDefAttribute"));
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
