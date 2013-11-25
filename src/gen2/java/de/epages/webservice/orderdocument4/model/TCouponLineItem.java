/**
 * TCouponLineItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.orderdocument4.model;


/**
 * return object of an coupon line item.
 *         contains information about a the coupon of this order.
 */
public class TCouponLineItem  implements java.io.Serializable {
    /* the class of the coupon line item */
    private java.lang.String _class;

    /* name of the coupon line item */
    private java.lang.String name;

    /* sku of the coupon line item (couponcode short) */
    private java.lang.String SKU;

    /* the tax class of the coupon line item (object path to tax class) */
    private java.lang.String taxClass;

    /* quantity of the coupon line item */
    private float quantity;

    /* the baseprice of the coupon line item */
    private float basePrice;

    /* the total price of the coupon line item */
    private float lineItemPrice;

    /* possible discount of the coupon line item */
    private float discount;

    /* the tax rate of the coupon line item */
    private float taxRate;

    /* the tax amount of the coupon line item */
    private float taxAmount;

    /* list of requested attributes (see epagestypes:ListOfAttributes) */
    private de.epages.webservice.common.model.TAttribute[] attributes;

    /* the CouponCode (path) of the coupon line item */
    private java.lang.String couponCode;

    public TCouponLineItem() {
    }

    public TCouponLineItem(
           java.lang.String _class,
           java.lang.String name,
           java.lang.String SKU,
           java.lang.String taxClass,
           float quantity,
           float basePrice,
           float lineItemPrice,
           float discount,
           float taxRate,
           float taxAmount,
           de.epages.webservice.common.model.TAttribute[] attributes,
           java.lang.String couponCode) {
           this._class = _class;
           this.name = name;
           this.SKU = SKU;
           this.taxClass = taxClass;
           this.quantity = quantity;
           this.basePrice = basePrice;
           this.lineItemPrice = lineItemPrice;
           this.discount = discount;
           this.taxRate = taxRate;
           this.taxAmount = taxAmount;
           this.attributes = attributes;
           this.couponCode = couponCode;
    }


    /**
     * Gets the _class value for this TCouponLineItem.
     * 
     * @return _class   * the class of the coupon line item
     */
    public java.lang.String get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this TCouponLineItem.
     * 
     * @param _class   * the class of the coupon line item
     */
    public void set_class(java.lang.String _class) {
        this._class = _class;
    }


    /**
     * Gets the name value for this TCouponLineItem.
     * 
     * @return name   * name of the coupon line item
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TCouponLineItem.
     * 
     * @param name   * name of the coupon line item
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the SKU value for this TCouponLineItem.
     * 
     * @return SKU   * sku of the coupon line item (couponcode short)
     */
    public java.lang.String getSKU() {
        return SKU;
    }


    /**
     * Sets the SKU value for this TCouponLineItem.
     * 
     * @param SKU   * sku of the coupon line item (couponcode short)
     */
    public void setSKU(java.lang.String SKU) {
        this.SKU = SKU;
    }


    /**
     * Gets the taxClass value for this TCouponLineItem.
     * 
     * @return taxClass   * the tax class of the coupon line item (object path to tax class)
     */
    public java.lang.String getTaxClass() {
        return taxClass;
    }


    /**
     * Sets the taxClass value for this TCouponLineItem.
     * 
     * @param taxClass   * the tax class of the coupon line item (object path to tax class)
     */
    public void setTaxClass(java.lang.String taxClass) {
        this.taxClass = taxClass;
    }


    /**
     * Gets the quantity value for this TCouponLineItem.
     * 
     * @return quantity   * quantity of the coupon line item
     */
    public float getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this TCouponLineItem.
     * 
     * @param quantity   * quantity of the coupon line item
     */
    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the basePrice value for this TCouponLineItem.
     * 
     * @return basePrice   * the baseprice of the coupon line item
     */
    public float getBasePrice() {
        return basePrice;
    }


    /**
     * Sets the basePrice value for this TCouponLineItem.
     * 
     * @param basePrice   * the baseprice of the coupon line item
     */
    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }


    /**
     * Gets the lineItemPrice value for this TCouponLineItem.
     * 
     * @return lineItemPrice   * the total price of the coupon line item
     */
    public float getLineItemPrice() {
        return lineItemPrice;
    }


    /**
     * Sets the lineItemPrice value for this TCouponLineItem.
     * 
     * @param lineItemPrice   * the total price of the coupon line item
     */
    public void setLineItemPrice(float lineItemPrice) {
        this.lineItemPrice = lineItemPrice;
    }


    /**
     * Gets the discount value for this TCouponLineItem.
     * 
     * @return discount   * possible discount of the coupon line item
     */
    public float getDiscount() {
        return discount;
    }


    /**
     * Sets the discount value for this TCouponLineItem.
     * 
     * @param discount   * possible discount of the coupon line item
     */
    public void setDiscount(float discount) {
        this.discount = discount;
    }


    /**
     * Gets the taxRate value for this TCouponLineItem.
     * 
     * @return taxRate   * the tax rate of the coupon line item
     */
    public float getTaxRate() {
        return taxRate;
    }


    /**
     * Sets the taxRate value for this TCouponLineItem.
     * 
     * @param taxRate   * the tax rate of the coupon line item
     */
    public void setTaxRate(float taxRate) {
        this.taxRate = taxRate;
    }


    /**
     * Gets the taxAmount value for this TCouponLineItem.
     * 
     * @return taxAmount   * the tax amount of the coupon line item
     */
    public float getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this TCouponLineItem.
     * 
     * @param taxAmount   * the tax amount of the coupon line item
     */
    public void setTaxAmount(float taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the attributes value for this TCouponLineItem.
     * 
     * @return attributes   * list of requested attributes (see epagestypes:ListOfAttributes)
     */
    public de.epages.webservice.common.model.TAttribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this TCouponLineItem.
     * 
     * @param attributes   * list of requested attributes (see epagestypes:ListOfAttributes)
     */
    public void setAttributes(de.epages.webservice.common.model.TAttribute[] attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the couponCode value for this TCouponLineItem.
     * 
     * @return couponCode   * the CouponCode (path) of the coupon line item
     */
    public java.lang.String getCouponCode() {
        return couponCode;
    }


    /**
     * Sets the couponCode value for this TCouponLineItem.
     * 
     * @param couponCode   * the CouponCode (path) of the coupon line item
     */
    public void setCouponCode(java.lang.String couponCode) {
        this.couponCode = couponCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCouponLineItem)) return false;
        TCouponLineItem other = (TCouponLineItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.SKU==null && other.getSKU()==null) || 
             (this.SKU!=null &&
              this.SKU.equals(other.getSKU()))) &&
            ((this.taxClass==null && other.getTaxClass()==null) || 
             (this.taxClass!=null &&
              this.taxClass.equals(other.getTaxClass()))) &&
            this.quantity == other.getQuantity() &&
            this.basePrice == other.getBasePrice() &&
            this.lineItemPrice == other.getLineItemPrice() &&
            this.discount == other.getDiscount() &&
            this.taxRate == other.getTaxRate() &&
            this.taxAmount == other.getTaxAmount() &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes()))) &&
            ((this.couponCode==null && other.getCouponCode()==null) || 
             (this.couponCode!=null &&
              this.couponCode.equals(other.getCouponCode())));
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
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSKU() != null) {
            _hashCode += getSKU().hashCode();
        }
        if (getTaxClass() != null) {
            _hashCode += getTaxClass().hashCode();
        }
        _hashCode += new Float(getQuantity()).hashCode();
        _hashCode += new Float(getBasePrice()).hashCode();
        _hashCode += new Float(getLineItemPrice()).hashCode();
        _hashCode += new Float(getDiscount()).hashCode();
        _hashCode += new Float(getTaxRate()).hashCode();
        _hashCode += new Float(getTaxAmount()).hashCode();
        if (getAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCouponCode() != null) {
            _hashCode += getCouponCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCouponLineItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/OrderDocumentTypes/2008/05", "TCouponLineItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Class"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SKU");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SKU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaxClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BasePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LineItemPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Discount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaxRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TAttribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("couponCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CouponCode"));
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
