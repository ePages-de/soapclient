/**
 * TLineItemContainerIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.order4.model;


/**
 * input object of an line item container.
 *         contains information about products, payments, shippings etc.
 * of this order.
 *         tax area, product line items, payment and shipping are mandatory.
 * all others are optional.
 */
public class TLineItemContainerIn  implements java.io.Serializable {
    /* the locale id of the container (e.g. 'en_US') */
    private java.lang.String localeID;

    /* the language of the container */
    private java.lang.String languageCode;

    /* the currency of the container (e.g. 'EUR' or 'USD') */
    private java.lang.String currencyID;

    /* the tax area of the container (path to tax area object) */
    private java.lang.String taxArea;

    /* the tax model of the container (net or gross) */
    private java.lang.String taxModel;

    /* the container's product line items */
    private de.epages.webservice.order4.model.TProductLineItemIn[] productLineItems;

    /* the container's payment method (object path to payment method) */
    private java.lang.String paymentMethod;

    /* the container's shipping method (object path to shipping method) */
    private java.lang.String shippingMethod;

    public TLineItemContainerIn() {
    }

    public TLineItemContainerIn(
           java.lang.String localeID,
           java.lang.String languageCode,
           java.lang.String currencyID,
           java.lang.String taxArea,
           java.lang.String taxModel,
           de.epages.webservice.order4.model.TProductLineItemIn[] productLineItems,
           java.lang.String paymentMethod,
           java.lang.String shippingMethod) {
           this.localeID = localeID;
           this.languageCode = languageCode;
           this.currencyID = currencyID;
           this.taxArea = taxArea;
           this.taxModel = taxModel;
           this.productLineItems = productLineItems;
           this.paymentMethod = paymentMethod;
           this.shippingMethod = shippingMethod;
    }


    /**
     * Gets the localeID value for this TLineItemContainerIn.
     * 
     * @return localeID   * the locale id of the container (e.g. 'en_US')
     */
    public java.lang.String getLocaleID() {
        return localeID;
    }


    /**
     * Sets the localeID value for this TLineItemContainerIn.
     * 
     * @param localeID   * the locale id of the container (e.g. 'en_US')
     */
    public void setLocaleID(java.lang.String localeID) {
        this.localeID = localeID;
    }


    /**
     * Gets the languageCode value for this TLineItemContainerIn.
     * 
     * @return languageCode   * the language of the container
     */
    public java.lang.String getLanguageCode() {
        return languageCode;
    }


    /**
     * Sets the languageCode value for this TLineItemContainerIn.
     * 
     * @param languageCode   * the language of the container
     */
    public void setLanguageCode(java.lang.String languageCode) {
        this.languageCode = languageCode;
    }


    /**
     * Gets the currencyID value for this TLineItemContainerIn.
     * 
     * @return currencyID   * the currency of the container (e.g. 'EUR' or 'USD')
     */
    public java.lang.String getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this TLineItemContainerIn.
     * 
     * @param currencyID   * the currency of the container (e.g. 'EUR' or 'USD')
     */
    public void setCurrencyID(java.lang.String currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the taxArea value for this TLineItemContainerIn.
     * 
     * @return taxArea   * the tax area of the container (path to tax area object)
     */
    public java.lang.String getTaxArea() {
        return taxArea;
    }


    /**
     * Sets the taxArea value for this TLineItemContainerIn.
     * 
     * @param taxArea   * the tax area of the container (path to tax area object)
     */
    public void setTaxArea(java.lang.String taxArea) {
        this.taxArea = taxArea;
    }


    /**
     * Gets the taxModel value for this TLineItemContainerIn.
     * 
     * @return taxModel   * the tax model of the container (net or gross)
     */
    public java.lang.String getTaxModel() {
        return taxModel;
    }


    /**
     * Sets the taxModel value for this TLineItemContainerIn.
     * 
     * @param taxModel   * the tax model of the container (net or gross)
     */
    public void setTaxModel(java.lang.String taxModel) {
        this.taxModel = taxModel;
    }


    /**
     * Gets the productLineItems value for this TLineItemContainerIn.
     * 
     * @return productLineItems   * the container's product line items
     */
    public de.epages.webservice.order4.model.TProductLineItemIn[] getProductLineItems() {
        return productLineItems;
    }


    /**
     * Sets the productLineItems value for this TLineItemContainerIn.
     * 
     * @param productLineItems   * the container's product line items
     */
    public void setProductLineItems(de.epages.webservice.order4.model.TProductLineItemIn[] productLineItems) {
        this.productLineItems = productLineItems;
    }


    /**
     * Gets the paymentMethod value for this TLineItemContainerIn.
     * 
     * @return paymentMethod   * the container's payment method (object path to payment method)
     */
    public java.lang.String getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this TLineItemContainerIn.
     * 
     * @param paymentMethod   * the container's payment method (object path to payment method)
     */
    public void setPaymentMethod(java.lang.String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the shippingMethod value for this TLineItemContainerIn.
     * 
     * @return shippingMethod   * the container's shipping method (object path to shipping method)
     */
    public java.lang.String getShippingMethod() {
        return shippingMethod;
    }


    /**
     * Sets the shippingMethod value for this TLineItemContainerIn.
     * 
     * @param shippingMethod   * the container's shipping method (object path to shipping method)
     */
    public void setShippingMethod(java.lang.String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TLineItemContainerIn)) return false;
        TLineItemContainerIn other = (TLineItemContainerIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.localeID==null && other.getLocaleID()==null) || 
             (this.localeID!=null &&
              this.localeID.equals(other.getLocaleID()))) &&
            ((this.languageCode==null && other.getLanguageCode()==null) || 
             (this.languageCode!=null &&
              this.languageCode.equals(other.getLanguageCode()))) &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.taxArea==null && other.getTaxArea()==null) || 
             (this.taxArea!=null &&
              this.taxArea.equals(other.getTaxArea()))) &&
            ((this.taxModel==null && other.getTaxModel()==null) || 
             (this.taxModel!=null &&
              this.taxModel.equals(other.getTaxModel()))) &&
            ((this.productLineItems==null && other.getProductLineItems()==null) || 
             (this.productLineItems!=null &&
              java.util.Arrays.equals(this.productLineItems, other.getProductLineItems()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod()))) &&
            ((this.shippingMethod==null && other.getShippingMethod()==null) || 
             (this.shippingMethod!=null &&
              this.shippingMethod.equals(other.getShippingMethod())));
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
        if (getLocaleID() != null) {
            _hashCode += getLocaleID().hashCode();
        }
        if (getLanguageCode() != null) {
            _hashCode += getLanguageCode().hashCode();
        }
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getTaxArea() != null) {
            _hashCode += getTaxArea().hashCode();
        }
        if (getTaxModel() != null) {
            _hashCode += getTaxModel().hashCode();
        }
        if (getProductLineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductLineItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductLineItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        if (getShippingMethod() != null) {
            _hashCode += getShippingMethod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TLineItemContainerIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/OrderTypes/2008/05", "TLineItemContainerIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localeID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LocaleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LanguageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxArea");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaxArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxModel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaxModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productLineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProductLineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/OrderTypes/2008/05", "TProductLineItemIn"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PaymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ShippingMethod"));
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
