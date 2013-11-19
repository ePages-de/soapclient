/**
 * TGiftCouponLineItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.BasketService.Stub;


/**
 * return object of an coupon line item.
 *         contains information about a the coupon of this order.
 */
public class TGiftCouponLineItem  implements java.io.Serializable {
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
    private de.epages.WebServices.BasketService.Stub.TAttribute[] attributes;

    /* the CouponCode (path) of the coupon line item */
    private java.lang.String couponCode;

    /* idicates if shipping costs are included in gift coupon line
     * item */
    private boolean inclShippingCosts;

    public TGiftCouponLineItem() {
    }

    public TGiftCouponLineItem(
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
           de.epages.WebServices.BasketService.Stub.TAttribute[] attributes,
           java.lang.String couponCode,
           boolean inclShippingCosts) {
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
           this.inclShippingCosts = inclShippingCosts;
    }


    /**
     * Gets the _class value for this TGiftCouponLineItem.
     * 
     * @return _class   * the class of the coupon line item
     */
    public java.lang.String get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this TGiftCouponLineItem.
     * 
     * @param _class   * the class of the coupon line item
     */
    public void set_class(java.lang.String _class) {
        this._class = _class;
    }


    /**
     * Gets the name value for this TGiftCouponLineItem.
     * 
     * @return name   * name of the coupon line item
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TGiftCouponLineItem.
     * 
     * @param name   * name of the coupon line item
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the SKU value for this TGiftCouponLineItem.
     * 
     * @return SKU   * sku of the coupon line item (couponcode short)
     */
    public java.lang.String getSKU() {
        return SKU;
    }


    /**
     * Sets the SKU value for this TGiftCouponLineItem.
     * 
     * @param SKU   * sku of the coupon line item (couponcode short)
     */
    public void setSKU(java.lang.String SKU) {
        this.SKU = SKU;
    }


    /**
     * Gets the taxClass value for this TGiftCouponLineItem.
     * 
     * @return taxClass   * the tax class of the coupon line item (object path to tax class)
     */
    public java.lang.String getTaxClass() {
        return taxClass;
    }


    /**
     * Sets the taxClass value for this TGiftCouponLineItem.
     * 
     * @param taxClass   * the tax class of the coupon line item (object path to tax class)
     */
    public void setTaxClass(java.lang.String taxClass) {
        this.taxClass = taxClass;
    }


    /**
     * Gets the quantity value for this TGiftCouponLineItem.
     * 
     * @return quantity   * quantity of the coupon line item
     */
    public float getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this TGiftCouponLineItem.
     * 
     * @param quantity   * quantity of the coupon line item
     */
    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the basePrice value for this TGiftCouponLineItem.
     * 
     * @return basePrice   * the baseprice of the coupon line item
     */
    public float getBasePrice() {
        return basePrice;
    }


    /**
     * Sets the basePrice value for this TGiftCouponLineItem.
     * 
     * @param basePrice   * the baseprice of the coupon line item
     */
    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }


    /**
     * Gets the lineItemPrice value for this TGiftCouponLineItem.
     * 
     * @return lineItemPrice   * the total price of the coupon line item
     */
    public float getLineItemPrice() {
        return lineItemPrice;
    }


    /**
     * Sets the lineItemPrice value for this TGiftCouponLineItem.
     * 
     * @param lineItemPrice   * the total price of the coupon line item
     */
    public void setLineItemPrice(float lineItemPrice) {
        this.lineItemPrice = lineItemPrice;
    }


    /**
     * Gets the discount value for this TGiftCouponLineItem.
     * 
     * @return discount   * possible discount of the coupon line item
     */
    public float getDiscount() {
        return discount;
    }


    /**
     * Sets the discount value for this TGiftCouponLineItem.
     * 
     * @param discount   * possible discount of the coupon line item
     */
    public void setDiscount(float discount) {
        this.discount = discount;
    }


    /**
     * Gets the taxRate value for this TGiftCouponLineItem.
     * 
     * @return taxRate   * the tax rate of the coupon line item
     */
    public float getTaxRate() {
        return taxRate;
    }


    /**
     * Sets the taxRate value for this TGiftCouponLineItem.
     * 
     * @param taxRate   * the tax rate of the coupon line item
     */
    public void setTaxRate(float taxRate) {
        this.taxRate = taxRate;
    }


    /**
     * Gets the taxAmount value for this TGiftCouponLineItem.
     * 
     * @return taxAmount   * the tax amount of the coupon line item
     */
    public float getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this TGiftCouponLineItem.
     * 
     * @param taxAmount   * the tax amount of the coupon line item
     */
    public void setTaxAmount(float taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the attributes value for this TGiftCouponLineItem.
     * 
     * @return attributes   * list of requested attributes (see epagestypes:ListOfAttributes)
     */
    public de.epages.WebServices.BasketService.Stub.TAttribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this TGiftCouponLineItem.
     * 
     * @param attributes   * list of requested attributes (see epagestypes:ListOfAttributes)
     */
    public void setAttributes(de.epages.WebServices.BasketService.Stub.TAttribute[] attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the couponCode value for this TGiftCouponLineItem.
     * 
     * @return couponCode   * the CouponCode (path) of the coupon line item
     */
    public java.lang.String getCouponCode() {
        return couponCode;
    }


    /**
     * Sets the couponCode value for this TGiftCouponLineItem.
     * 
     * @param couponCode   * the CouponCode (path) of the coupon line item
     */
    public void setCouponCode(java.lang.String couponCode) {
        this.couponCode = couponCode;
    }


    /**
     * Gets the inclShippingCosts value for this TGiftCouponLineItem.
     * 
     * @return inclShippingCosts   * idicates if shipping costs are included in gift coupon line
     * item
     */
    public boolean isInclShippingCosts() {
        return inclShippingCosts;
    }


    /**
     * Sets the inclShippingCosts value for this TGiftCouponLineItem.
     * 
     * @param inclShippingCosts   * idicates if shipping costs are included in gift coupon line
     * item
     */
    public void setInclShippingCosts(boolean inclShippingCosts) {
        this.inclShippingCosts = inclShippingCosts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TGiftCouponLineItem)) return false;
        TGiftCouponLineItem other = (TGiftCouponLineItem) obj;
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
              this.couponCode.equals(other.getCouponCode()))) &&
            this.inclShippingCosts == other.isInclShippingCosts();
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
        _hashCode += (isInclShippingCosts() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TGiftCouponLineItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TGiftCouponLineItem"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inclShippingCosts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InclShippingCosts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
