/**
 * TPriceListQuantityDiscount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.PriceListAssignmentService.Stub;


/**
 * a single pricelists with quantity discount information.
 */
public class TPriceListQuantityDiscount  implements java.io.Serializable {
    /* the pricelist (a object path) */
    private java.lang.String priceList;

    /* list of quantity discount for this product and this pricelist
     * (see pricelistassignmenttypes:TQuantityDiscount) */
    private de.epages.WebServices.PriceListAssignmentService.Stub.TQuantityDiscount[] quantityDiscounts;

    public TPriceListQuantityDiscount() {
    }

    public TPriceListQuantityDiscount(
           java.lang.String priceList,
           de.epages.WebServices.PriceListAssignmentService.Stub.TQuantityDiscount[] quantityDiscounts) {
           this.priceList = priceList;
           this.quantityDiscounts = quantityDiscounts;
    }


    /**
     * Gets the priceList value for this TPriceListQuantityDiscount.
     * 
     * @return priceList   * the pricelist (a object path)
     */
    public java.lang.String getPriceList() {
        return priceList;
    }


    /**
     * Sets the priceList value for this TPriceListQuantityDiscount.
     * 
     * @param priceList   * the pricelist (a object path)
     */
    public void setPriceList(java.lang.String priceList) {
        this.priceList = priceList;
    }


    /**
     * Gets the quantityDiscounts value for this TPriceListQuantityDiscount.
     * 
     * @return quantityDiscounts   * list of quantity discount for this product and this pricelist
     * (see pricelistassignmenttypes:TQuantityDiscount)
     */
    public de.epages.WebServices.PriceListAssignmentService.Stub.TQuantityDiscount[] getQuantityDiscounts() {
        return quantityDiscounts;
    }


    /**
     * Sets the quantityDiscounts value for this TPriceListQuantityDiscount.
     * 
     * @param quantityDiscounts   * list of quantity discount for this product and this pricelist
     * (see pricelistassignmenttypes:TQuantityDiscount)
     */
    public void setQuantityDiscounts(de.epages.WebServices.PriceListAssignmentService.Stub.TQuantityDiscount[] quantityDiscounts) {
        this.quantityDiscounts = quantityDiscounts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TPriceListQuantityDiscount)) return false;
        TPriceListQuantityDiscount other = (TPriceListQuantityDiscount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
        new org.apache.axis.description.TypeDesc(TPriceListQuantityDiscount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TPriceListQuantityDiscount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PriceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityDiscounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QuantityDiscounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TQuantityDiscount"));
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
