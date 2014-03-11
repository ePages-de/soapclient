/**
 * TPriceListScalePrice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.pricelistassignment.model;


/**
 * a single pricelists with scale price information.
 */
public class TPriceListScalePrice  implements java.io.Serializable {
    /* the pricelist (a object path) */
    private java.lang.String priceList;

    /* list of scale prices for this product and this pricelist (see
     * pricelistassignmenttypes:TScalePrice) */
    private de.epages.ws.pricelistassignment.model.TScalePrice[] scalePrices;

    public TPriceListScalePrice() {
    }

    public TPriceListScalePrice(
           java.lang.String priceList,
           de.epages.ws.pricelistassignment.model.TScalePrice[] scalePrices) {
           this.priceList = priceList;
           this.scalePrices = scalePrices;
    }


    /**
     * Gets the priceList value for this TPriceListScalePrice.
     * 
     * @return priceList   * the pricelist (a object path)
     */
    public java.lang.String getPriceList() {
        return priceList;
    }


    /**
     * Sets the priceList value for this TPriceListScalePrice.
     * 
     * @param priceList   * the pricelist (a object path)
     */
    public void setPriceList(java.lang.String priceList) {
        this.priceList = priceList;
    }


    /**
     * Gets the scalePrices value for this TPriceListScalePrice.
     * 
     * @return scalePrices   * list of scale prices for this product and this pricelist (see
     * pricelistassignmenttypes:TScalePrice)
     */
    public de.epages.ws.pricelistassignment.model.TScalePrice[] getScalePrices() {
        return scalePrices;
    }


    /**
     * Sets the scalePrices value for this TPriceListScalePrice.
     * 
     * @param scalePrices   * list of scale prices for this product and this pricelist (see
     * pricelistassignmenttypes:TScalePrice)
     */
    public void setScalePrices(de.epages.ws.pricelistassignment.model.TScalePrice[] scalePrices) {
        this.scalePrices = scalePrices;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TPriceListScalePrice)) return false;
        TPriceListScalePrice other = (TPriceListScalePrice) obj;
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
            ((this.scalePrices==null && other.getScalePrices()==null) || 
             (this.scalePrices!=null &&
              java.util.Arrays.equals(this.scalePrices, other.getScalePrices())));
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
        if (getScalePrices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScalePrices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScalePrices(), i);
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
        new org.apache.axis.description.TypeDesc(TPriceListScalePrice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TPriceListScalePrice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PriceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scalePrices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ScalePrices"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TScalePrice"));
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
