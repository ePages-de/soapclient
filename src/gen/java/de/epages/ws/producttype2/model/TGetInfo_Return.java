/**
 * TGetInfo_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.producttype2.model;


/**
 * a single return value of a getInfo() product type call.
 *         the path will be always returned.
 *         the error element will be returned in case of error.
 *         all other elements will be returned if no error has occured.
 */
public class TGetInfo_Return  implements java.io.Serializable {
    /* product type path */
    private java.lang.String path;

    /* product type alias */
    private java.lang.String alias;

    /* product type's name */
    private de.epages.ws.common.model.TLocalizedValue[] name;

    /* list of requested attributes (see epagestypes:ListOfAttributes) */
    private de.epages.ws.common.model.TAttribute[] attributes;

    /* error object (see epagestypes:TError) */
    private de.epages.ws.common.model.TError error;

    /* layout template for product details display */
    private java.lang.String layoutContentBase;

    /* layout template for variations display */
    private java.lang.String layoutContentVariation;

    /* layout template for bundle products display */
    private java.lang.String layoutContentBundles;

    public TGetInfo_Return() {
    }

    public TGetInfo_Return(
           java.lang.String path,
           java.lang.String alias,
           de.epages.ws.common.model.TLocalizedValue[] name,
           de.epages.ws.common.model.TAttribute[] attributes,
           de.epages.ws.common.model.TError error,
           java.lang.String layoutContentBase,
           java.lang.String layoutContentVariation,
           java.lang.String layoutContentBundles) {
           this.path = path;
           this.alias = alias;
           this.name = name;
           this.attributes = attributes;
           this.error = error;
           this.layoutContentBase = layoutContentBase;
           this.layoutContentVariation = layoutContentVariation;
           this.layoutContentBundles = layoutContentBundles;
    }


    /**
     * Gets the path value for this TGetInfo_Return.
     * 
     * @return path   * product type path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TGetInfo_Return.
     * 
     * @param path   * product type path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the alias value for this TGetInfo_Return.
     * 
     * @return alias   * product type alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TGetInfo_Return.
     * 
     * @param alias   * product type alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the name value for this TGetInfo_Return.
     * 
     * @return name   * product type's name
     */
    public de.epages.ws.common.model.TLocalizedValue[] getName() {
        return name;
    }


    /**
     * Sets the name value for this TGetInfo_Return.
     * 
     * @param name   * product type's name
     */
    public void setName(de.epages.ws.common.model.TLocalizedValue[] name) {
        this.name = name;
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


    /**
     * Gets the layoutContentBase value for this TGetInfo_Return.
     * 
     * @return layoutContentBase   * layout template for product details display
     */
    public java.lang.String getLayoutContentBase() {
        return layoutContentBase;
    }


    /**
     * Sets the layoutContentBase value for this TGetInfo_Return.
     * 
     * @param layoutContentBase   * layout template for product details display
     */
    public void setLayoutContentBase(java.lang.String layoutContentBase) {
        this.layoutContentBase = layoutContentBase;
    }


    /**
     * Gets the layoutContentVariation value for this TGetInfo_Return.
     * 
     * @return layoutContentVariation   * layout template for variations display
     */
    public java.lang.String getLayoutContentVariation() {
        return layoutContentVariation;
    }


    /**
     * Sets the layoutContentVariation value for this TGetInfo_Return.
     * 
     * @param layoutContentVariation   * layout template for variations display
     */
    public void setLayoutContentVariation(java.lang.String layoutContentVariation) {
        this.layoutContentVariation = layoutContentVariation;
    }


    /**
     * Gets the layoutContentBundles value for this TGetInfo_Return.
     * 
     * @return layoutContentBundles   * layout template for bundle products display
     */
    public java.lang.String getLayoutContentBundles() {
        return layoutContentBundles;
    }


    /**
     * Sets the layoutContentBundles value for this TGetInfo_Return.
     * 
     * @param layoutContentBundles   * layout template for bundle products display
     */
    public void setLayoutContentBundles(java.lang.String layoutContentBundles) {
        this.layoutContentBundles = layoutContentBundles;
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
            ((this.alias==null && other.getAlias()==null) || 
             (this.alias!=null &&
              this.alias.equals(other.getAlias()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.layoutContentBase==null && other.getLayoutContentBase()==null) || 
             (this.layoutContentBase!=null &&
              this.layoutContentBase.equals(other.getLayoutContentBase()))) &&
            ((this.layoutContentVariation==null && other.getLayoutContentVariation()==null) || 
             (this.layoutContentVariation!=null &&
              this.layoutContentVariation.equals(other.getLayoutContentVariation()))) &&
            ((this.layoutContentBundles==null && other.getLayoutContentBundles()==null) || 
             (this.layoutContentBundles!=null &&
              this.layoutContentBundles.equals(other.getLayoutContentBundles())));
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
        if (getLayoutContentBase() != null) {
            _hashCode += getLayoutContentBase().hashCode();
        }
        if (getLayoutContentVariation() != null) {
            _hashCode += getLayoutContentVariation().hashCode();
        }
        if (getLayoutContentBundles() != null) {
            _hashCode += getLayoutContentBundles().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TGetInfo_Return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes/2007/11", "TGetInfo_Return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layoutContentBase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Layout.Content-Base"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layoutContentVariation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Layout.Content-Variation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layoutContentBundles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Layout.Content-Bundles"));
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
