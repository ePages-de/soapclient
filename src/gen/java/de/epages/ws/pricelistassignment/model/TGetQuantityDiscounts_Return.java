/**
 * TGetQuantityDiscounts_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.pricelistassignment.model;


/**
 * a single return value of a getQuantityDiscounts() call.
 *         the path will be always returned.
 *         the error element will be returned in case of error.
 *         all other elements will be returned if no error has occured.
 */
public class TGetQuantityDiscounts_Return  implements java.io.Serializable {
    /* product path */
    private java.lang.String product;

    /* list of requested pricelists (see pricelistassignmenttypes:TPriceListQuantityDiscount) */
    private de.epages.ws.pricelistassignment.model.TPriceListQuantityDiscount[] priceLists;

    /* error object (see epagestypes:TError) */
    private de.epages.ws.common.model.TError error;

    public TGetQuantityDiscounts_Return() {
    }

    public TGetQuantityDiscounts_Return(
           java.lang.String product,
           de.epages.ws.pricelistassignment.model.TPriceListQuantityDiscount[] priceLists,
           de.epages.ws.common.model.TError error) {
           this.product = product;
           this.priceLists = priceLists;
           this.error = error;
    }


    /**
     * Gets the product value for this TGetQuantityDiscounts_Return.
     * 
     * @return product   * product path
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this TGetQuantityDiscounts_Return.
     * 
     * @param product   * product path
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the priceLists value for this TGetQuantityDiscounts_Return.
     * 
     * @return priceLists   * list of requested pricelists (see pricelistassignmenttypes:TPriceListQuantityDiscount)
     */
    public de.epages.ws.pricelistassignment.model.TPriceListQuantityDiscount[] getPriceLists() {
        return priceLists;
    }


    /**
     * Sets the priceLists value for this TGetQuantityDiscounts_Return.
     * 
     * @param priceLists   * list of requested pricelists (see pricelistassignmenttypes:TPriceListQuantityDiscount)
     */
    public void setPriceLists(de.epages.ws.pricelistassignment.model.TPriceListQuantityDiscount[] priceLists) {
        this.priceLists = priceLists;
    }


    /**
     * Gets the error value for this TGetQuantityDiscounts_Return.
     * 
     * @return error   * error object (see epagestypes:TError)
     */
    public de.epages.ws.common.model.TError getError() {
        return error;
    }


    /**
     * Sets the error value for this TGetQuantityDiscounts_Return.
     * 
     * @param error   * error object (see epagestypes:TError)
     */
    public void setError(de.epages.ws.common.model.TError error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TGetQuantityDiscounts_Return)) return false;
        TGetQuantityDiscounts_Return other = (TGetQuantityDiscounts_Return) obj;
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
            ((this.priceLists==null && other.getPriceLists()==null) || 
             (this.priceLists!=null &&
              java.util.Arrays.equals(this.priceLists, other.getPriceLists()))) &&
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
        if (getPriceLists() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPriceLists());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPriceLists(), i);
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
        new org.apache.axis.description.TypeDesc(TGetQuantityDiscounts_Return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TGetQuantityDiscounts_Return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceLists");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PriceLists"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TPriceListQuantityDiscount"));
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
