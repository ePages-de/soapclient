/**
 * TProductPrice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.product8.model;


/**
 * a single product price for a currency and a tax model.
 */
public class TProductPrice  implements java.io.Serializable {
    /* the actual price (in currency id) */
    private float price;

    /* the currency id (e.g. 'USD') */
    private java.lang.String currencyID;

    /* the tax model ('gross' or 'net') */
    private java.lang.String taxModel;

    public TProductPrice() {
    }

    public TProductPrice(
           float price,
           java.lang.String currencyID,
           java.lang.String taxModel) {
           this.price = price;
           this.currencyID = currencyID;
           this.taxModel = taxModel;
    }


    /**
     * Gets the price value for this TProductPrice.
     * 
     * @return price   * the actual price (in currency id)
     */
    public float getPrice() {
        return price;
    }


    /**
     * Sets the price value for this TProductPrice.
     * 
     * @param price   * the actual price (in currency id)
     */
    public void setPrice(float price) {
        this.price = price;
    }


    /**
     * Gets the currencyID value for this TProductPrice.
     * 
     * @return currencyID   * the currency id (e.g. 'USD')
     */
    public java.lang.String getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this TProductPrice.
     * 
     * @param currencyID   * the currency id (e.g. 'USD')
     */
    public void setCurrencyID(java.lang.String currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the taxModel value for this TProductPrice.
     * 
     * @return taxModel   * the tax model ('gross' or 'net')
     */
    public java.lang.String getTaxModel() {
        return taxModel;
    }


    /**
     * Sets the taxModel value for this TProductPrice.
     * 
     * @param taxModel   * the tax model ('gross' or 'net')
     */
    public void setTaxModel(java.lang.String taxModel) {
        this.taxModel = taxModel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TProductPrice)) return false;
        TProductPrice other = (TProductPrice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.price == other.getPrice() &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.taxModel==null && other.getTaxModel()==null) || 
             (this.taxModel!=null &&
              this.taxModel.equals(other.getTaxModel())));
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
        _hashCode += new Float(getPrice()).hashCode();
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getTaxModel() != null) {
            _hashCode += getTaxModel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TProductPrice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypes/2011/03", "TProductPrice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxModel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaxModel"));
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
