/**
 * TSetQuantityDiscounts_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.pricelistassignment.model;


/**
 * input arguments of a single setQuantityDiscounts() call.
 *         all elements are mandatory.
 */
public class TSetQuantityDiscounts_Input  implements java.io.Serializable {
    /* product (object path) */
    private java.lang.String product;

    /* price list (object path) */
    private java.lang.String priceList;

    /* list of quantity discounts to set (see pricelistassignmenttypes:TQuantityDiscount) */
    private de.epages.webservice.pricelistassignment.model.TQuantityDiscount[] quantityDiscounts;

    public TSetQuantityDiscounts_Input() {
    }

    public TSetQuantityDiscounts_Input(
           java.lang.String product,
           java.lang.String priceList,
           de.epages.webservice.pricelistassignment.model.TQuantityDiscount[] quantityDiscounts) {
           this.product = product;
           this.priceList = priceList;
           this.quantityDiscounts = quantityDiscounts;
    }


    /**
     * Gets the product value for this TSetQuantityDiscounts_Input.
     * 
     * @return product   * product (object path)
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this TSetQuantityDiscounts_Input.
     * 
     * @param product   * product (object path)
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the priceList value for this TSetQuantityDiscounts_Input.
     * 
     * @return priceList   * price list (object path)
     */
    public java.lang.String getPriceList() {
        return priceList;
    }


    /**
     * Sets the priceList value for this TSetQuantityDiscounts_Input.
     * 
     * @param priceList   * price list (object path)
     */
    public void setPriceList(java.lang.String priceList) {
        this.priceList = priceList;
    }


    /**
     * Gets the quantityDiscounts value for this TSetQuantityDiscounts_Input.
     * 
     * @return quantityDiscounts   * list of quantity discounts to set (see pricelistassignmenttypes:TQuantityDiscount)
     */
    public de.epages.webservice.pricelistassignment.model.TQuantityDiscount[] getQuantityDiscounts() {
        return quantityDiscounts;
    }


    /**
     * Sets the quantityDiscounts value for this TSetQuantityDiscounts_Input.
     * 
     * @param quantityDiscounts   * list of quantity discounts to set (see pricelistassignmenttypes:TQuantityDiscount)
     */
    public void setQuantityDiscounts(de.epages.webservice.pricelistassignment.model.TQuantityDiscount[] quantityDiscounts) {
        this.quantityDiscounts = quantityDiscounts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TSetQuantityDiscounts_Input)) return false;
        TSetQuantityDiscounts_Input other = (TSetQuantityDiscounts_Input) obj;
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
            ((this.quantityDiscounts==null && other.getQuantityDiscounts()==null) || 
             (this.quantityDiscounts!=null &&
              java.util.Arrays.equals(this.quantityDiscounts, other.getQuantityDiscounts())));
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
        if (getQuantityDiscounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityDiscounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityDiscounts(), i);
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
        new org.apache.axis.description.TypeDesc(TSetQuantityDiscounts_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TSetQuantityDiscounts_Input"));
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
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityDiscounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QuantityDiscounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TQuantityDiscount"));
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
