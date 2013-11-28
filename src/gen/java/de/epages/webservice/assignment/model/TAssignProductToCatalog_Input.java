/**
 * TAssignProductToCatalog_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.assignment.model;


/**
 * input value of a assignProductToCatalog() call.
 */
public class TAssignProductToCatalog_Input  implements java.io.Serializable {
    /* catalog object path */
    private java.lang.String catalog;

    /* product object path */
    private java.lang.String product;

    /* position in the list of products assigned to the catalog */
    private java.math.BigInteger position;

    public TAssignProductToCatalog_Input() {
    }

    public TAssignProductToCatalog_Input(
           java.lang.String catalog,
           java.lang.String product,
           java.math.BigInteger position) {
           this.catalog = catalog;
           this.product = product;
           this.position = position;
    }


    /**
     * Gets the catalog value for this TAssignProductToCatalog_Input.
     * 
     * @return catalog   * catalog object path
     */
    public java.lang.String getCatalog() {
        return catalog;
    }


    /**
     * Sets the catalog value for this TAssignProductToCatalog_Input.
     * 
     * @param catalog   * catalog object path
     */
    public void setCatalog(java.lang.String catalog) {
        this.catalog = catalog;
    }


    /**
     * Gets the product value for this TAssignProductToCatalog_Input.
     * 
     * @return product   * product object path
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this TAssignProductToCatalog_Input.
     * 
     * @param product   * product object path
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the position value for this TAssignProductToCatalog_Input.
     * 
     * @return position   * position in the list of products assigned to the catalog
     */
    public java.math.BigInteger getPosition() {
        return position;
    }


    /**
     * Sets the position value for this TAssignProductToCatalog_Input.
     * 
     * @param position   * position in the list of products assigned to the catalog
     */
    public void setPosition(java.math.BigInteger position) {
        this.position = position;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TAssignProductToCatalog_Input)) return false;
        TAssignProductToCatalog_Input other = (TAssignProductToCatalog_Input) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.catalog==null && other.getCatalog()==null) || 
             (this.catalog!=null &&
              this.catalog.equals(other.getCatalog()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition())));
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
        if (getCatalog() != null) {
            _hashCode += getCatalog().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TAssignProductToCatalog_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "TAssignProductToCatalog_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catalog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Catalog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
