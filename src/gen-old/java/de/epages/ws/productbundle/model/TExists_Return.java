/**
 * TExists_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.productbundle.model;


/**
 * return value of a exists() call.
 *         Product and BundledProduct will be always returned.
 *         the Error element will be returned in case of error.
 *         all other elements will be returned if no error has occured.
 */
public class TExists_Return  implements java.io.Serializable {
    /* product object path */
    private java.lang.String product;

    /* catalog object path */
    private java.lang.String bundledProduct;

    /* is product assigned to catalog */
    private java.lang.Boolean exists;

    /* error object (see epagestypes:TError) */
    private de.epages.ws.common.model.TError error;

    public TExists_Return() {
    }

    public TExists_Return(
           java.lang.String product,
           java.lang.String bundledProduct,
           java.lang.Boolean exists,
           de.epages.ws.common.model.TError error) {
           this.product = product;
           this.bundledProduct = bundledProduct;
           this.exists = exists;
           this.error = error;
    }


    /**
     * Gets the product value for this TExists_Return.
     * 
     * @return product   * product object path
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this TExists_Return.
     * 
     * @param product   * product object path
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the bundledProduct value for this TExists_Return.
     * 
     * @return bundledProduct   * catalog object path
     */
    public java.lang.String getBundledProduct() {
        return bundledProduct;
    }


    /**
     * Sets the bundledProduct value for this TExists_Return.
     * 
     * @param bundledProduct   * catalog object path
     */
    public void setBundledProduct(java.lang.String bundledProduct) {
        this.bundledProduct = bundledProduct;
    }


    /**
     * Gets the exists value for this TExists_Return.
     * 
     * @return exists   * is product assigned to catalog
     */
    public java.lang.Boolean getExists() {
        return exists;
    }


    /**
     * Sets the exists value for this TExists_Return.
     * 
     * @param exists   * is product assigned to catalog
     */
    public void setExists(java.lang.Boolean exists) {
        this.exists = exists;
    }


    /**
     * Gets the error value for this TExists_Return.
     * 
     * @return error   * error object (see epagestypes:TError)
     */
    public de.epages.ws.common.model.TError getError() {
        return error;
    }


    /**
     * Sets the error value for this TExists_Return.
     * 
     * @param error   * error object (see epagestypes:TError)
     */
    public void setError(de.epages.ws.common.model.TError error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TExists_Return)) return false;
        TExists_Return other = (TExists_Return) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.bundledProduct==null && other.getBundledProduct()==null) || 
             (this.bundledProduct!=null &&
              this.bundledProduct.equals(other.getBundledProduct()))) &&
            ((this.exists==null && other.getExists()==null) || 
             (this.exists!=null &&
              this.exists.equals(other.getExists()))) &&
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
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getBundledProduct() != null) {
            _hashCode += getBundledProduct().hashCode();
        }
        if (getExists() != null) {
            _hashCode += getExists().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TExists_Return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleTypes/2007/07", "TExists_Return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundledProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BundledProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exists");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exists"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
