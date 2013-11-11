/**
 * TLineItemContainerOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.OrderService3.Stub;


/**
 * return object of an line item container.
 *         contains information about products, payments, shippings etc.
 * of this order.
 */
public class TLineItemContainerOut  implements java.io.Serializable {
    /* the locale id of the container (e.g. 'en_US') */
    private java.lang.String localeID;

    /* the language of the container */
    private java.lang.String languageCode;

    /* the currency of the container (e.g. 'EUR' or 'USD') */
    private java.lang.String currencyID;

    /* the tax area of the container (path to tax area object) */
    private java.lang.String taxArea;

    /* the name of the tax area of the container */
    private java.lang.String taxAreaName;

    /* the tax model of the container (net or gross) */
    private java.lang.String taxModel;

    /* the total price of the container */
    private float grandTotal;

    /* the total price of the container (without tax) */
    private float totalBeforeTax;

    /* the total tax of the container */
    private float totalTax;

    /* the container's product line items */
    private de.epages.WebServices.OrderService3.Stub.TProductLineItemOut[] productLineItems;

    /* the container's tax line items */
    private de.epages.WebServices.OrderService3.Stub.TTaxLineItem[] taxLineItems;

    /* the container's payment line item */
    private de.epages.WebServices.OrderService3.Stub.TPaymentLineItem paymentLineItem;

    /* the container's shipping line item */
    private de.epages.WebServices.OrderService3.Stub.TShippingLineItem shippingLineItem;

    public TLineItemContainerOut() {
    }

    public TLineItemContainerOut(
           java.lang.String localeID,
           java.lang.String languageCode,
           java.lang.String currencyID,
           java.lang.String taxArea,
           java.lang.String taxAreaName,
           java.lang.String taxModel,
           float grandTotal,
           float totalBeforeTax,
           float totalTax,
           de.epages.WebServices.OrderService3.Stub.TProductLineItemOut[] productLineItems,
           de.epages.WebServices.OrderService3.Stub.TTaxLineItem[] taxLineItems,
           de.epages.WebServices.OrderService3.Stub.TPaymentLineItem paymentLineItem,
           de.epages.WebServices.OrderService3.Stub.TShippingLineItem shippingLineItem) {
           this.localeID = localeID;
           this.languageCode = languageCode;
           this.currencyID = currencyID;
           this.taxArea = taxArea;
           this.taxAreaName = taxAreaName;
           this.taxModel = taxModel;
           this.grandTotal = grandTotal;
           this.totalBeforeTax = totalBeforeTax;
           this.totalTax = totalTax;
           this.productLineItems = productLineItems;
           this.taxLineItems = taxLineItems;
           this.paymentLineItem = paymentLineItem;
           this.shippingLineItem = shippingLineItem;
    }


    /**
     * Gets the localeID value for this TLineItemContainerOut.
     * 
     * @return localeID   * the locale id of the container (e.g. 'en_US')
     */
    public java.lang.String getLocaleID() {
        return localeID;
    }


    /**
     * Sets the localeID value for this TLineItemContainerOut.
     * 
     * @param localeID   * the locale id of the container (e.g. 'en_US')
     */
    public void setLocaleID(java.lang.String localeID) {
        this.localeID = localeID;
    }


    /**
     * Gets the languageCode value for this TLineItemContainerOut.
     * 
     * @return languageCode   * the language of the container
     */
    public java.lang.String getLanguageCode() {
        return languageCode;
    }


    /**
     * Sets the languageCode value for this TLineItemContainerOut.
     * 
     * @param languageCode   * the language of the container
     */
    public void setLanguageCode(java.lang.String languageCode) {
        this.languageCode = languageCode;
    }


    /**
     * Gets the currencyID value for this TLineItemContainerOut.
     * 
     * @return currencyID   * the currency of the container (e.g. 'EUR' or 'USD')
     */
    public java.lang.String getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this TLineItemContainerOut.
     * 
     * @param currencyID   * the currency of the container (e.g. 'EUR' or 'USD')
     */
    public void setCurrencyID(java.lang.String currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the taxArea value for this TLineItemContainerOut.
     * 
     * @return taxArea   * the tax area of the container (path to tax area object)
     */
    public java.lang.String getTaxArea() {
        return taxArea;
    }


    /**
     * Sets the taxArea value for this TLineItemContainerOut.
     * 
     * @param taxArea   * the tax area of the container (path to tax area object)
     */
    public void setTaxArea(java.lang.String taxArea) {
        this.taxArea = taxArea;
    }


    /**
     * Gets the taxAreaName value for this TLineItemContainerOut.
     * 
     * @return taxAreaName   * the name of the tax area of the container
     */
    public java.lang.String getTaxAreaName() {
        return taxAreaName;
    }


    /**
     * Sets the taxAreaName value for this TLineItemContainerOut.
     * 
     * @param taxAreaName   * the name of the tax area of the container
     */
    public void setTaxAreaName(java.lang.String taxAreaName) {
        this.taxAreaName = taxAreaName;
    }


    /**
     * Gets the taxModel value for this TLineItemContainerOut.
     * 
     * @return taxModel   * the tax model of the container (net or gross)
     */
    public java.lang.String getTaxModel() {
        return taxModel;
    }


    /**
     * Sets the taxModel value for this TLineItemContainerOut.
     * 
     * @param taxModel   * the tax model of the container (net or gross)
     */
    public void setTaxModel(java.lang.String taxModel) {
        this.taxModel = taxModel;
    }


    /**
     * Gets the grandTotal value for this TLineItemContainerOut.
     * 
     * @return grandTotal   * the total price of the container
     */
    public float getGrandTotal() {
        return grandTotal;
    }


    /**
     * Sets the grandTotal value for this TLineItemContainerOut.
     * 
     * @param grandTotal   * the total price of the container
     */
    public void setGrandTotal(float grandTotal) {
        this.grandTotal = grandTotal;
    }


    /**
     * Gets the totalBeforeTax value for this TLineItemContainerOut.
     * 
     * @return totalBeforeTax   * the total price of the container (without tax)
     */
    public float getTotalBeforeTax() {
        return totalBeforeTax;
    }


    /**
     * Sets the totalBeforeTax value for this TLineItemContainerOut.
     * 
     * @param totalBeforeTax   * the total price of the container (without tax)
     */
    public void setTotalBeforeTax(float totalBeforeTax) {
        this.totalBeforeTax = totalBeforeTax;
    }


    /**
     * Gets the totalTax value for this TLineItemContainerOut.
     * 
     * @return totalTax   * the total tax of the container
     */
    public float getTotalTax() {
        return totalTax;
    }


    /**
     * Sets the totalTax value for this TLineItemContainerOut.
     * 
     * @param totalTax   * the total tax of the container
     */
    public void setTotalTax(float totalTax) {
        this.totalTax = totalTax;
    }


    /**
     * Gets the productLineItems value for this TLineItemContainerOut.
     * 
     * @return productLineItems   * the container's product line items
     */
    public de.epages.WebServices.OrderService3.Stub.TProductLineItemOut[] getProductLineItems() {
        return productLineItems;
    }


    /**
     * Sets the productLineItems value for this TLineItemContainerOut.
     * 
     * @param productLineItems   * the container's product line items
     */
    public void setProductLineItems(de.epages.WebServices.OrderService3.Stub.TProductLineItemOut[] productLineItems) {
        this.productLineItems = productLineItems;
    }


    /**
     * Gets the taxLineItems value for this TLineItemContainerOut.
     * 
     * @return taxLineItems   * the container's tax line items
     */
    public de.epages.WebServices.OrderService3.Stub.TTaxLineItem[] getTaxLineItems() {
        return taxLineItems;
    }


    /**
     * Sets the taxLineItems value for this TLineItemContainerOut.
     * 
     * @param taxLineItems   * the container's tax line items
     */
    public void setTaxLineItems(de.epages.WebServices.OrderService3.Stub.TTaxLineItem[] taxLineItems) {
        this.taxLineItems = taxLineItems;
    }


    /**
     * Gets the paymentLineItem value for this TLineItemContainerOut.
     * 
     * @return paymentLineItem   * the container's payment line item
     */
    public de.epages.WebServices.OrderService3.Stub.TPaymentLineItem getPaymentLineItem() {
        return paymentLineItem;
    }


    /**
     * Sets the paymentLineItem value for this TLineItemContainerOut.
     * 
     * @param paymentLineItem   * the container's payment line item
     */
    public void setPaymentLineItem(de.epages.WebServices.OrderService3.Stub.TPaymentLineItem paymentLineItem) {
        this.paymentLineItem = paymentLineItem;
    }


    /**
     * Gets the shippingLineItem value for this TLineItemContainerOut.
     * 
     * @return shippingLineItem   * the container's shipping line item
     */
    public de.epages.WebServices.OrderService3.Stub.TShippingLineItem getShippingLineItem() {
        return shippingLineItem;
    }


    /**
     * Sets the shippingLineItem value for this TLineItemContainerOut.
     * 
     * @param shippingLineItem   * the container's shipping line item
     */
    public void setShippingLineItem(de.epages.WebServices.OrderService3.Stub.TShippingLineItem shippingLineItem) {
        this.shippingLineItem = shippingLineItem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TLineItemContainerOut)) return false;
        TLineItemContainerOut other = (TLineItemContainerOut) obj;
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
            ((this.taxAreaName==null && other.getTaxAreaName()==null) || 
             (this.taxAreaName!=null &&
              this.taxAreaName.equals(other.getTaxAreaName()))) &&
            ((this.taxModel==null && other.getTaxModel()==null) || 
             (this.taxModel!=null &&
              this.taxModel.equals(other.getTaxModel()))) &&
            this.grandTotal == other.getGrandTotal() &&
            this.totalBeforeTax == other.getTotalBeforeTax() &&
            this.totalTax == other.getTotalTax() &&
            ((this.productLineItems==null && other.getProductLineItems()==null) || 
             (this.productLineItems!=null &&
              java.util.Arrays.equals(this.productLineItems, other.getProductLineItems()))) &&
            ((this.taxLineItems==null && other.getTaxLineItems()==null) || 
             (this.taxLineItems!=null &&
              java.util.Arrays.equals(this.taxLineItems, other.getTaxLineItems()))) &&
            ((this.paymentLineItem==null && other.getPaymentLineItem()==null) || 
             (this.paymentLineItem!=null &&
              this.paymentLineItem.equals(other.getPaymentLineItem()))) &&
            ((this.shippingLineItem==null && other.getShippingLineItem()==null) || 
             (this.shippingLineItem!=null &&
              this.shippingLineItem.equals(other.getShippingLineItem())));
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
        if (getTaxAreaName() != null) {
            _hashCode += getTaxAreaName().hashCode();
        }
        if (getTaxModel() != null) {
            _hashCode += getTaxModel().hashCode();
        }
        _hashCode += new Float(getGrandTotal()).hashCode();
        _hashCode += new Float(getTotalBeforeTax()).hashCode();
        _hashCode += new Float(getTotalTax()).hashCode();
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
        if (getTaxLineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxLineItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxLineItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentLineItem() != null) {
            _hashCode += getPaymentLineItem().hashCode();
        }
        if (getShippingLineItem() != null) {
            _hashCode += getShippingLineItem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TLineItemContainerOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/OrderTypes/2007/08", "TLineItemContainerOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localeID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LocaleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LanguageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxArea");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaxArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAreaName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaxAreaName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxModel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaxModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grandTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GrandTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalBeforeTax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TotalBeforeTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalTax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TotalTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productLineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProductLineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/OrderTypes/2007/08", "TProductLineItemOut"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxLineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaxLineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/OrderTypes/2007/08", "TTaxLineItem"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentLineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PaymentLineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/OrderTypes/2007/08", "TPaymentLineItem"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingLineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ShippingLineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/OrderTypes/2007/08", "TShippingLineItem"));
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
