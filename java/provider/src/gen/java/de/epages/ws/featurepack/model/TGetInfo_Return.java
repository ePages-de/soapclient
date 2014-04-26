/**
 * TGetInfo_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.featurepack.model;


/**
 * a single return value of a getInfo() call.
 *         the path will be always returned.
 *         the error element will be returned in case of error.
 *         all other elements will be returned if no error has occured.
 */
public class TGetInfo_Return  implements java.io.Serializable {
    /* feature pack object path */
    private java.lang.String path;

    /* number of active shops the feature pack is applied to */
    private java.math.BigInteger activeShopCount;

    /* number of shops the feature pack is applied to */
    private java.math.BigInteger shopCount;

    /* path to feature pack's class */
    private java.lang.String _class;

    /* how often is the feature pack applicable to a shop */
    private java.math.BigInteger allowMax;

    /* feature pack activated or not */
    private java.lang.Boolean isActive;

    /* localized name of feature pack (see epagestypes:TLocalizedValue) */
    private de.epages.ws.common.model.TLocalizedValue[] name;

    /* localized description of feature pack (see epagestypes:TLocalizedValue) */
    private de.epages.ws.common.model.TLocalizedValue[] description;

    /* list of features assigned to feature pack */
    private de.epages.ws.featurepack.model.TFeature[] features;

    /* list of shoptypes the feature pack is available for */
    private de.epages.ws.featurepack.model.TShopType[] shopTypes;

    /* list of requested attributes (see epagestypes:ListOfAttributes) */
    private de.epages.ws.common.model.TAttribute[] attributes;

    /* error object (see epagestypes:TError) */
    private de.epages.ws.common.model.TError error;

    public TGetInfo_Return() {
    }

    public TGetInfo_Return(
           java.lang.String path,
           java.math.BigInteger activeShopCount,
           java.math.BigInteger shopCount,
           java.lang.String _class,
           java.math.BigInteger allowMax,
           java.lang.Boolean isActive,
           de.epages.ws.common.model.TLocalizedValue[] name,
           de.epages.ws.common.model.TLocalizedValue[] description,
           de.epages.ws.featurepack.model.TFeature[] features,
           de.epages.ws.featurepack.model.TShopType[] shopTypes,
           de.epages.ws.common.model.TAttribute[] attributes,
           de.epages.ws.common.model.TError error) {
           this.path = path;
           this.activeShopCount = activeShopCount;
           this.shopCount = shopCount;
           this._class = _class;
           this.allowMax = allowMax;
           this.isActive = isActive;
           this.name = name;
           this.description = description;
           this.features = features;
           this.shopTypes = shopTypes;
           this.attributes = attributes;
           this.error = error;
    }


    /**
     * Gets the path value for this TGetInfo_Return.
     * 
     * @return path   * feature pack object path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TGetInfo_Return.
     * 
     * @param path   * feature pack object path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the activeShopCount value for this TGetInfo_Return.
     * 
     * @return activeShopCount   * number of active shops the feature pack is applied to
     */
    public java.math.BigInteger getActiveShopCount() {
        return activeShopCount;
    }


    /**
     * Sets the activeShopCount value for this TGetInfo_Return.
     * 
     * @param activeShopCount   * number of active shops the feature pack is applied to
     */
    public void setActiveShopCount(java.math.BigInteger activeShopCount) {
        this.activeShopCount = activeShopCount;
    }


    /**
     * Gets the shopCount value for this TGetInfo_Return.
     * 
     * @return shopCount   * number of shops the feature pack is applied to
     */
    public java.math.BigInteger getShopCount() {
        return shopCount;
    }


    /**
     * Sets the shopCount value for this TGetInfo_Return.
     * 
     * @param shopCount   * number of shops the feature pack is applied to
     */
    public void setShopCount(java.math.BigInteger shopCount) {
        this.shopCount = shopCount;
    }


    /**
     * Gets the _class value for this TGetInfo_Return.
     * 
     * @return _class   * path to feature pack's class
     */
    public java.lang.String get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this TGetInfo_Return.
     * 
     * @param _class   * path to feature pack's class
     */
    public void set_class(java.lang.String _class) {
        this._class = _class;
    }


    /**
     * Gets the allowMax value for this TGetInfo_Return.
     * 
     * @return allowMax   * how often is the feature pack applicable to a shop
     */
    public java.math.BigInteger getAllowMax() {
        return allowMax;
    }


    /**
     * Sets the allowMax value for this TGetInfo_Return.
     * 
     * @param allowMax   * how often is the feature pack applicable to a shop
     */
    public void setAllowMax(java.math.BigInteger allowMax) {
        this.allowMax = allowMax;
    }


    /**
     * Gets the isActive value for this TGetInfo_Return.
     * 
     * @return isActive   * feature pack activated or not
     */
    public java.lang.Boolean getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this TGetInfo_Return.
     * 
     * @param isActive   * feature pack activated or not
     */
    public void setIsActive(java.lang.Boolean isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the name value for this TGetInfo_Return.
     * 
     * @return name   * localized name of feature pack (see epagestypes:TLocalizedValue)
     */
    public de.epages.ws.common.model.TLocalizedValue[] getName() {
        return name;
    }


    /**
     * Sets the name value for this TGetInfo_Return.
     * 
     * @param name   * localized name of feature pack (see epagestypes:TLocalizedValue)
     */
    public void setName(de.epages.ws.common.model.TLocalizedValue[] name) {
        this.name = name;
    }


    /**
     * Gets the description value for this TGetInfo_Return.
     * 
     * @return description   * localized description of feature pack (see epagestypes:TLocalizedValue)
     */
    public de.epages.ws.common.model.TLocalizedValue[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TGetInfo_Return.
     * 
     * @param description   * localized description of feature pack (see epagestypes:TLocalizedValue)
     */
    public void setDescription(de.epages.ws.common.model.TLocalizedValue[] description) {
        this.description = description;
    }


    /**
     * Gets the features value for this TGetInfo_Return.
     * 
     * @return features   * list of features assigned to feature pack
     */
    public de.epages.ws.featurepack.model.TFeature[] getFeatures() {
        return features;
    }


    /**
     * Sets the features value for this TGetInfo_Return.
     * 
     * @param features   * list of features assigned to feature pack
     */
    public void setFeatures(de.epages.ws.featurepack.model.TFeature[] features) {
        this.features = features;
    }


    /**
     * Gets the shopTypes value for this TGetInfo_Return.
     * 
     * @return shopTypes   * list of shoptypes the feature pack is available for
     */
    public de.epages.ws.featurepack.model.TShopType[] getShopTypes() {
        return shopTypes;
    }


    /**
     * Sets the shopTypes value for this TGetInfo_Return.
     * 
     * @param shopTypes   * list of shoptypes the feature pack is available for
     */
    public void setShopTypes(de.epages.ws.featurepack.model.TShopType[] shopTypes) {
        this.shopTypes = shopTypes;
    }


    /**
     * Gets the attributes value for this TGetInfo_Return.
     * 
     * @return attributes   * list of requested attributes (see epagestypes:ListOfAttributes)
     */
    public de.epages.ws.common.model.TAttribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this TGetInfo_Return.
     * 
     * @param attributes   * list of requested attributes (see epagestypes:ListOfAttributes)
     */
    public void setAttributes(de.epages.ws.common.model.TAttribute[] attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the error value for this TGetInfo_Return.
     * 
     * @return error   * error object (see epagestypes:TError)
     */
    public de.epages.ws.common.model.TError getError() {
        return error;
    }


    /**
     * Sets the error value for this TGetInfo_Return.
     * 
     * @param error   * error object (see epagestypes:TError)
     */
    public void setError(de.epages.ws.common.model.TError error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TGetInfo_Return)) return false;
        TGetInfo_Return other = (TGetInfo_Return) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath()))) &&
            ((this.activeShopCount==null && other.getActiveShopCount()==null) || 
             (this.activeShopCount!=null &&
              this.activeShopCount.equals(other.getActiveShopCount()))) &&
            ((this.shopCount==null && other.getShopCount()==null) || 
             (this.shopCount!=null &&
              this.shopCount.equals(other.getShopCount()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.allowMax==null && other.getAllowMax()==null) || 
             (this.allowMax!=null &&
              this.allowMax.equals(other.getAllowMax()))) &&
            ((this.isActive==null && other.getIsActive()==null) || 
             (this.isActive!=null &&
              this.isActive.equals(other.getIsActive()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.features==null && other.getFeatures()==null) || 
             (this.features!=null &&
              java.util.Arrays.equals(this.features, other.getFeatures()))) &&
            ((this.shopTypes==null && other.getShopTypes()==null) || 
             (this.shopTypes!=null &&
              java.util.Arrays.equals(this.shopTypes, other.getShopTypes()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes()))) &&
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
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
        }
        if (getActiveShopCount() != null) {
            _hashCode += getActiveShopCount().hashCode();
        }
        if (getShopCount() != null) {
            _hashCode += getShopCount().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getAllowMax() != null) {
            _hashCode += getAllowMax().hashCode();
        }
        if (getIsActive() != null) {
            _hashCode += getIsActive().hashCode();
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
        if (getFeatures() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeatures());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeatures(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShopTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShopTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShopTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TGetInfo_Return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/FeaturePackTypes/2005/03", "TGetInfo_Return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeShopCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ActiveShopCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ShopCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Class"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AllowMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsActive"));
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
        elemField.setFieldName("features");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Features"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/FeaturePackTypes/2005/03", "TFeature"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ShopTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/FeaturePackTypes/2005/03", "TShopType"));
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
