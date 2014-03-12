/**
 * TProductLineItemOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.orderdocument.model;


/**
 * return object of an product line item.
 *         contains information about a single product of this order.
 */
public class TProductLineItemOut  implements java.io.Serializable {
    /* the class of the product line item */
    private java.lang.String _class;

    /* name of the product line item */
    private java.lang.String name;

    /* sku of the product line item */
    private java.lang.String SKU;

    /* the product object path of the product line item */
    private java.lang.String product;

    /* the tax class of the product line item (object path to tax
     * class) */
    private java.lang.String taxClass;

    /* the total price of the product line item */
    private float lineItemPrice;

    /* the price a single product */
    private float basePrice;

    /* quantity of the product line item */
    private float quantity;

    /* possible discount of the product line item */
    private float discount;

    /* the tax rate of the product line item */
    private float taxRate;

    /* the tax amount of the product line item */
    private float taxAmount;

    public TProductLineItemOut() {
    }

    public TProductLineItemOut(
           java.lang.String _class,
           java.lang.String name,
           java.lang.String SKU,
           java.lang.String product,
           java.lang.String taxClass,
           float lineItemPrice,
           float basePrice,
           float quantity,
           float discount,
           float taxRate,
           float taxAmount) {
           this._class = _class;
           this.name = name;
           this.SKU = SKU;
           this.product = product;
           this.taxClass = taxClass;
           this.lineItemPrice = lineItemPrice;
           this.basePrice = basePrice;
           this.quantity = quantity;
           this.discount = discount;
           this.taxRate = taxRate;
           this.taxAmount = taxAmount;
    }


    /**
     * Gets the _class value for this TProductLineItemOut.
     * 
     * @return _class   * the class of the product line item
     */
    public java.lang.String get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this TProductLineItemOut.
     * 
     * @param _class   * the class of the product line item
     */
    public void set_class(java.lang.String _class) {
        this._class = _class;
    }


    /**
     * Gets the name value for this TProductLineItemOut.
     * 
     * @return name   * name of the product line item
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TProductLineItemOut.
     * 
     * @param name   * name of the product line item
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the SKU value for this TProductLineItemOut.
     * 
     * @return SKU   * sku of the product line item
     */
    public java.lang.String getSKU() {
        return SKU;
    }


    /**
     * Sets the SKU value for this TProductLineItemOut.
     * 
     * @param SKU   * sku of the product line item
     */
    public void setSKU(java.lang.String SKU) {
        this.SKU = SKU;
    }


    /**
     * Gets the product value for this TProductLineItemOut.
     * 
     * @return product   * the product object path of the product line item
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this TProductLineItemOut.
     * 
     * @param product   * the product object path of the product line item
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the taxClass value for this TProductLineItemOut.
     * 
     * @return taxClass   * the tax class of the product line item (object path to tax
     * class)
     */
    public java.lang.String getTaxClass() {
        return taxClass;
    }


    /**
     * Sets the taxClass value for this TProductLineItemOut.
     * 
     * @param taxClass   * the tax class of the product line item (object path to tax
     * class)
     */
    public void setTaxClass(java.lang.String taxClass) {
        this.taxClass = taxClass;
    }


    /**
     * Gets the lineItemPrice value for this TProductLineItemOut.
     * 
     * @return lineItemPrice   * the total price of the product line item
     */
    public float getLineItemPrice() {
        return lineItemPrice;
    }


    /**
     * Sets the lineItemPrice value for this TProductLineItemOut.
     * 
     * @param lineItemPrice   * the total price of the product line item
     */
    public void setLineItemPrice(float lineItemPrice) {
        this.lineItemPrice = lineItemPrice;
    }


    /**
     * Gets the basePrice value for this TProductLineItemOut.
     * 
     * @return basePrice   * the price a single product
     */
    public float getBasePrice() {
        return basePrice;
    }


    /**
     * Sets the basePrice value for this TProductLineItemOut.
     * 
     * @param basePrice   * the price a single product
     */
    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }


    /**
     * Gets the quantity value for this TProductLineItemOut.
     * 
     * @return quantity   * quantity of the product line item
     */
    public float getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this TProductLineItemOut.
     * 
     * @param quantity   * quantity of the product line item
     */
    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the discount value for this TProductLineItemOut.
     * 
     * @return discount   * possible discount of the product line item
     */
    public float getDiscount() {
        return discount;
    }


    /**
     * Sets the discount value for this TProductLineItemOut.
     * 
     * @param discount   * possible discount of the product line item
     */
    public void setDiscount(float discount) {
        this.discount = discount;
    }


    /**
     * Gets the taxRate value for this TProductLineItemOut.
     * 
     * @return taxRate   * the tax rate of the product line item
     */
    public float getTaxRate() {
        return taxRate;
    }


    /**
     * Sets the taxRate value for this TProductLineItemOut.
     * 
     * @param taxRate   * the tax rate of the product line item
     */
    public void setTaxRate(float taxRate) {
        this.taxRate = taxRate;
    }


    /**
     * Gets the taxAmount value for this TProductLineItemOut.
     * 
     * @return taxAmount   * the tax amount of the product line item
     */
    public float getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this TProductLineItemOut.
     * 
     * @param taxAmount   * the tax amount of the product line item
     */
    public void setTaxAmount(float taxAmount) {
        this.taxAmount = taxAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TProductLineItemOut)) return false;
        TProductLineItemOut other = (TProductLineItemOut) obj;
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
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.taxClass==null && other.getTaxClass()==null) || 
             (this.taxClass!=null &&
              this.taxClass.equals(other.getTaxClass()))) &&
            this.lineItemPrice == other.getLineItemPrice() &&
            this.basePrice == other.getBasePrice() &&
            this.quantity == other.getQuantity() &&
            this.discount == other.getDiscount() &&
            this.taxRate == other.getTaxRate() &&
            this.taxAmount == other.getTaxAmount();
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
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getTaxClass() != null) {
            _hashCode += getTaxClass().hashCode();
        }
        _hashCode += new Float(getLineItemPrice()).hashCode();
        _hashCode += new Float(getBasePrice()).hashCode();
        _hashCode += new Float(getQuantity()).hashCode();
        _hashCode += new Float(getDiscount()).hashCode();
        _hashCode += new Float(getTaxRate()).hashCode();
        _hashCode += new Float(getTaxAmount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TProductLineItemOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/OrderDocumentTypes/2005/01", "TProductLineItemOut"));
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
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Product"));
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
        elemField.setFieldName("lineItemPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LineItemPrice"));
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
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Quantity"));
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
