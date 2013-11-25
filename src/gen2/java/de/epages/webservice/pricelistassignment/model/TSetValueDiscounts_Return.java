/**
 * TSetValueDiscounts_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.pricelistassignment.model;


/**
 * a single return value of a setValueDiscounts() call.
 *         the product and pricelist path will be always returned.
 *         the error element will be returned in case of error.
 *         the updated flag will be returned if no error has occured.
 */
public class TSetValueDiscounts_Return  implements java.io.Serializable {
    private java.lang.String product;

    private java.lang.String priceList;

    /* a boolean flag indicating that this product was updated */
    private java.lang.Boolean updated;

    /* error object (see epagestypes:TError) */
    private de.epages.webservice.common.model.TError error;

    public TSetValueDiscounts_Return() {
    }

    public TSetValueDiscounts_Return(
           java.lang.String product,
           java.lang.String priceList,
           java.lang.Boolean updated,
           de.epages.webservice.common.model.TError error) {
           this.product = product;
           this.priceList = priceList;
           this.updated = updated;
           this.error = error;
    }


    /**
     * Gets the product value for this TSetValueDiscounts_Return.
     * 
     * @return product
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this TSetValueDiscounts_Return.
     * 
     * @param product
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the priceList value for this TSetValueDiscounts_Return.
     * 
     * @return priceList
     */
    public java.lang.String getPriceList() {
        return priceList;
    }


    /**
     * Sets the priceList value for this TSetValueDiscounts_Return.
     * 
     * @param priceList
     */
    public void setPriceList(java.lang.String priceList) {
        this.priceList = priceList;
    }


    /**
     * Gets the updated value for this TSetValueDiscounts_Return.
     * 
     * @return updated   * a boolean flag indicating that this product was updated
     */
    public java.lang.Boolean getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this TSetValueDiscounts_Return.
     * 
     * @param updated   * a boolean flag indicating that this product was updated
     */
    public void setUpdated(java.lang.Boolean updated) {
        this.updated = updated;
    }


    /**
     * Gets the error value for this TSetValueDiscounts_Return.
     * 
     * @return error   * error object (see epagestypes:TError)
     */
    public de.epages.webservice.common.model.TError getError() {
        return error;
    }


    /**
     * Sets the error value for this TSetValueDiscounts_Return.
     * 
     * @param error   * error object (see epagestypes:TError)
     */
    public void setError(de.epages.webservice.common.model.TError error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TSetValueDiscounts_Return)) return false;
        TSetValueDiscounts_Return other = (TSetValueDiscounts_Return) obj;
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
            ((this.priceList==null && other.getPriceList()==null) || 
             (this.priceList!=null &&
              this.priceList.equals(other.getPriceList()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
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
        if (getPriceList() != null) {
            _hashCode += getPriceList().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TSetValueDiscounts_Return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TSetValueDiscounts_Return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PriceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updated"));
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
