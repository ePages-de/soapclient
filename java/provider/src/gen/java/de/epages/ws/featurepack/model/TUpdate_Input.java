/**
 * TUpdate_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.featurepack.model;


/**
 * input arguments of a single update() call.
 *         a set of optional feature pack specific attributes that will
 * be updated.
 *         the path element is mandatory.
 *         all others are optional.
 */
public class TUpdate_Input  implements java.io.Serializable {
    /* feature pack path */
    private java.lang.String path;

    /* flag indicating whether or not the feature pack is activated */
    private java.lang.Boolean isActive;

    /* how often is the feature pack applicable to a shop */
    private java.math.BigInteger allowMax;

    /* localized name of feature pack (see epagestypes:TLocalizedValue) */
    private de.epages.ws.common.model.TLocalizedValue[] name;

    /* localized description of feature pack (see epagestypes:TLocalizedValue) */
    private de.epages.ws.common.model.TLocalizedValue[] description;

    /* list of attributes to update (see epagestypes:ListOfAttributes) */
    private de.epages.ws.common.model.TAttribute[] attributes;

    /* list of features with their maxvalues to update */
    private de.epages.ws.featurepack.model.TFeature[] features;

    public TUpdate_Input() {
    }

    public TUpdate_Input(
           java.lang.String path,
           java.lang.Boolean isActive,
           java.math.BigInteger allowMax,
           de.epages.ws.common.model.TLocalizedValue[] name,
           de.epages.ws.common.model.TLocalizedValue[] description,
           de.epages.ws.common.model.TAttribute[] attributes,
           de.epages.ws.featurepack.model.TFeature[] features) {
           this.path = path;
           this.isActive = isActive;
           this.allowMax = allowMax;
           this.name = name;
           this.description = description;
           this.attributes = attributes;
           this.features = features;
    }


    /**
     * Gets the path value for this TUpdate_Input.
     * 
     * @return path   * feature pack path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TUpdate_Input.
     * 
     * @param path   * feature pack path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the isActive value for this TUpdate_Input.
     * 
     * @return isActive   * flag indicating whether or not the feature pack is activated
     */
    public java.lang.Boolean getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this TUpdate_Input.
     * 
     * @param isActive   * flag indicating whether or not the feature pack is activated
     */
    public void setIsActive(java.lang.Boolean isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the allowMax value for this TUpdate_Input.
     * 
     * @return allowMax   * how often is the feature pack applicable to a shop
     */
    public java.math.BigInteger getAllowMax() {
        return allowMax;
    }


    /**
     * Sets the allowMax value for this TUpdate_Input.
     * 
     * @param allowMax   * how often is the feature pack applicable to a shop
     */
    public void setAllowMax(java.math.BigInteger allowMax) {
        this.allowMax = allowMax;
    }


    /**
     * Gets the name value for this TUpdate_Input.
     * 
     * @return name   * localized name of feature pack (see epagestypes:TLocalizedValue)
     */
    public de.epages.ws.common.model.TLocalizedValue[] getName() {
        return name;
    }


    /**
     * Sets the name value for this TUpdate_Input.
     * 
     * @param name   * localized name of feature pack (see epagestypes:TLocalizedValue)
     */
    public void setName(de.epages.ws.common.model.TLocalizedValue[] name) {
        this.name = name;
    }


    /**
     * Gets the description value for this TUpdate_Input.
     * 
     * @return description   * localized description of feature pack (see epagestypes:TLocalizedValue)
     */
    public de.epages.ws.common.model.TLocalizedValue[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TUpdate_Input.
     * 
     * @param description   * localized description of feature pack (see epagestypes:TLocalizedValue)
     */
    public void setDescription(de.epages.ws.common.model.TLocalizedValue[] description) {
        this.description = description;
    }


    /**
     * Gets the attributes value for this TUpdate_Input.
     * 
     * @return attributes   * list of attributes to update (see epagestypes:ListOfAttributes)
     */
    public de.epages.ws.common.model.TAttribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this TUpdate_Input.
     * 
     * @param attributes   * list of attributes to update (see epagestypes:ListOfAttributes)
     */
    public void setAttributes(de.epages.ws.common.model.TAttribute[] attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the features value for this TUpdate_Input.
     * 
     * @return features   * list of features with their maxvalues to update
     */
    public de.epages.ws.featurepack.model.TFeature[] getFeatures() {
        return features;
    }


    /**
     * Sets the features value for this TUpdate_Input.
     * 
     * @param features   * list of features with their maxvalues to update
     */
    public void setFeatures(de.epages.ws.featurepack.model.TFeature[] features) {
        this.features = features;
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
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath()))) &&
            ((this.isActive==null && other.getIsActive()==null) || 
             (this.isActive!=null &&
              this.isActive.equals(other.getIsActive()))) &&
            ((this.allowMax==null && other.getAllowMax()==null) || 
             (this.allowMax!=null &&
              this.allowMax.equals(other.getAllowMax()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes()))) &&
            ((this.features==null && other.getFeatures()==null) || 
             (this.features!=null &&
              java.util.Arrays.equals(this.features, other.getFeatures())));
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
        if (getIsActive() != null) {
            _hashCode += getIsActive().hashCode();
        }
        if (getAllowMax() != null) {
            _hashCode += getAllowMax().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TUpdate_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/FeaturePackTypes/2005/03", "TUpdate_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("allowMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AllowMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TAttribute"));
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
