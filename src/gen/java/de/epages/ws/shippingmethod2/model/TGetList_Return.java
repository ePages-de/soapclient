/**
 * TGetList_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.shippingmethod2.model;


/**
 * a single return value of a getList call.
 *         contains only the object path.
 */
public class TGetList_Return  implements java.io.Serializable {
    /* object path of the shipping method */
    private java.lang.String path;

    /* shipping method's name */
    private de.epages.ws.common.model.TLocalizedValue[] name;

    /* path of the shipping type */
    private java.lang.String shippingType;

    /* path of the shipping tax class */
    private java.lang.String taxClass;

    /* path of the shipping region */
    private java.lang.String region;

    public TGetList_Return() {
    }

    public TGetList_Return(
           java.lang.String path,
           de.epages.ws.common.model.TLocalizedValue[] name,
           java.lang.String shippingType,
           java.lang.String taxClass,
           java.lang.String region) {
           this.path = path;
           this.name = name;
           this.shippingType = shippingType;
           this.taxClass = taxClass;
           this.region = region;
    }


    /**
     * Gets the path value for this TGetList_Return.
     * 
     * @return path   * object path of the shipping method
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TGetList_Return.
     * 
     * @param path   * object path of the shipping method
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the name value for this TGetList_Return.
     * 
     * @return name   * shipping method's name
     */
    public de.epages.ws.common.model.TLocalizedValue[] getName() {
        return name;
    }


    /**
     * Sets the name value for this TGetList_Return.
     * 
     * @param name   * shipping method's name
     */
    public void setName(de.epages.ws.common.model.TLocalizedValue[] name) {
        this.name = name;
    }


    /**
     * Gets the shippingType value for this TGetList_Return.
     * 
     * @return shippingType   * path of the shipping type
     */
    public java.lang.String getShippingType() {
        return shippingType;
    }


    /**
     * Sets the shippingType value for this TGetList_Return.
     * 
     * @param shippingType   * path of the shipping type
     */
    public void setShippingType(java.lang.String shippingType) {
        this.shippingType = shippingType;
    }


    /**
     * Gets the taxClass value for this TGetList_Return.
     * 
     * @return taxClass   * path of the shipping tax class
     */
    public java.lang.String getTaxClass() {
        return taxClass;
    }


    /**
     * Sets the taxClass value for this TGetList_Return.
     * 
     * @param taxClass   * path of the shipping tax class
     */
    public void setTaxClass(java.lang.String taxClass) {
        this.taxClass = taxClass;
    }


    /**
     * Gets the region value for this TGetList_Return.
     * 
     * @return region   * path of the shipping region
     */
    public java.lang.String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this TGetList_Return.
     * 
     * @param region   * path of the shipping region
     */
    public void setRegion(java.lang.String region) {
        this.region = region;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TGetList_Return)) return false;
        TGetList_Return other = (TGetList_Return) obj;
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
            ((this.shippingType==null && other.getShippingType()==null) || 
             (this.shippingType!=null &&
              this.shippingType.equals(other.getShippingType()))) &&
            ((this.taxClass==null && other.getTaxClass()==null) || 
             (this.taxClass!=null &&
              this.taxClass.equals(other.getTaxClass()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion())));
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
        if (getShippingType() != null) {
            _hashCode += getShippingType().hashCode();
        }
        if (getTaxClass() != null) {
            _hashCode += getTaxClass().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TGetList_Return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ShippingMethodTypes/2012/07", "TGetList_Return"));
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
        elemField.setFieldName("shippingType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ShippingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaxClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
