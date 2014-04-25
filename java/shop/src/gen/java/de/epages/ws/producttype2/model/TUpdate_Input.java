/**
 * TUpdate_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.producttype2.model;


/**
 * input arguments of a single update() product type call.
 *         a set of optional product type specific attributes that will
 * be updated.
 *         the path element is mandatory.
 *         all others are optional.
 */
public class TUpdate_Input  implements java.io.Serializable {
    /* product type path */
    private java.lang.String path;

    /* product type's name */
    private de.epages.ws.common.model.TLocalizedValue[] name;

    /* layout template for product details display */
    private java.lang.String layoutContentBase;

    /* layout template for variations display */
    private java.lang.String layoutContentVariation;

    /* layout template for bundle products display */
    private java.lang.String layoutContentBundles;

    public TUpdate_Input() {
    }

    public TUpdate_Input(
           java.lang.String path,
           de.epages.ws.common.model.TLocalizedValue[] name,
           java.lang.String layoutContentBase,
           java.lang.String layoutContentVariation,
           java.lang.String layoutContentBundles) {
           this.path = path;
           this.name = name;
           this.layoutContentBase = layoutContentBase;
           this.layoutContentVariation = layoutContentVariation;
           this.layoutContentBundles = layoutContentBundles;
    }


    /**
     * Gets the path value for this TUpdate_Input.
     * 
     * @return path   * product type path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TUpdate_Input.
     * 
     * @param path   * product type path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the name value for this TUpdate_Input.
     * 
     * @return name   * product type's name
     */
    public de.epages.ws.common.model.TLocalizedValue[] getName() {
        return name;
    }


    /**
     * Sets the name value for this TUpdate_Input.
     * 
     * @param name   * product type's name
     */
    public void setName(de.epages.ws.common.model.TLocalizedValue[] name) {
        this.name = name;
    }


    /**
     * Gets the layoutContentBase value for this TUpdate_Input.
     * 
     * @return layoutContentBase   * layout template for product details display
     */
    public java.lang.String getLayoutContentBase() {
        return layoutContentBase;
    }


    /**
     * Sets the layoutContentBase value for this TUpdate_Input.
     * 
     * @param layoutContentBase   * layout template for product details display
     */
    public void setLayoutContentBase(java.lang.String layoutContentBase) {
        this.layoutContentBase = layoutContentBase;
    }


    /**
     * Gets the layoutContentVariation value for this TUpdate_Input.
     * 
     * @return layoutContentVariation   * layout template for variations display
     */
    public java.lang.String getLayoutContentVariation() {
        return layoutContentVariation;
    }


    /**
     * Sets the layoutContentVariation value for this TUpdate_Input.
     * 
     * @param layoutContentVariation   * layout template for variations display
     */
    public void setLayoutContentVariation(java.lang.String layoutContentVariation) {
        this.layoutContentVariation = layoutContentVariation;
    }


    /**
     * Gets the layoutContentBundles value for this TUpdate_Input.
     * 
     * @return layoutContentBundles   * layout template for bundle products display
     */
    public java.lang.String getLayoutContentBundles() {
        return layoutContentBundles;
    }


    /**
     * Sets the layoutContentBundles value for this TUpdate_Input.
     * 
     * @param layoutContentBundles   * layout template for bundle products display
     */
    public void setLayoutContentBundles(java.lang.String layoutContentBundles) {
        this.layoutContentBundles = layoutContentBundles;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
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
        new org.apache.axis.description.TypeDesc(TUpdate_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes/2007/11", "TUpdate_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Path"));
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
