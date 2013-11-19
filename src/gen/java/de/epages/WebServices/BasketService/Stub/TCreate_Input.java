/**
 * TCreate_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.BasketService.Stub;


/**
 * input arguments of a single create() basket call.
 *         a set of basket specific attributes that will be used to create
 * a order.
 *         the alias element is optional, a new alias will be created
 * if omitted.
 *         customer, creation date, line item container, billing address
 * are mandatory.
 *         all others are optional.
 */
public class TCreate_Input  implements java.io.Serializable {
    /* basket alias */
    private java.lang.String alias;

    /* basket's customer (object path to customer) */
    private java.lang.String customer;

    /* basket's user (object path to user) */
    private java.lang.String user;

    /* the products, payments, shipping etc. of this basket (see baskettypes:TLineItemContainerIn) */
    private de.epages.WebServices.BasketService.Stub.TLineItemContainerIn lineItemContainer;

    private de.epages.WebServices.BasketService.Stub.TAddressNamed billingAddress;

    private de.epages.WebServices.BasketService.Stub.TAddressNamed shippingAddress;

    /* list of requested attributes (see epagestypes:ListOfAttributes) */
    private de.epages.WebServices.BasketService.Stub.TAttribute[] attributes;

    public TCreate_Input() {
    }

    public TCreate_Input(
           java.lang.String alias,
           java.lang.String customer,
           java.lang.String user,
           de.epages.WebServices.BasketService.Stub.TLineItemContainerIn lineItemContainer,
           de.epages.WebServices.BasketService.Stub.TAddressNamed billingAddress,
           de.epages.WebServices.BasketService.Stub.TAddressNamed shippingAddress,
           de.epages.WebServices.BasketService.Stub.TAttribute[] attributes) {
           this.alias = alias;
           this.customer = customer;
           this.user = user;
           this.lineItemContainer = lineItemContainer;
           this.billingAddress = billingAddress;
           this.shippingAddress = shippingAddress;
           this.attributes = attributes;
    }


    /**
     * Gets the alias value for this TCreate_Input.
     * 
     * @return alias   * basket alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TCreate_Input.
     * 
     * @param alias   * basket alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the customer value for this TCreate_Input.
     * 
     * @return customer   * basket's customer (object path to customer)
     */
    public java.lang.String getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this TCreate_Input.
     * 
     * @param customer   * basket's customer (object path to customer)
     */
    public void setCustomer(java.lang.String customer) {
        this.customer = customer;
    }


    /**
     * Gets the user value for this TCreate_Input.
     * 
     * @return user   * basket's user (object path to user)
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this TCreate_Input.
     * 
     * @param user   * basket's user (object path to user)
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the lineItemContainer value for this TCreate_Input.
     * 
     * @return lineItemContainer   * the products, payments, shipping etc. of this basket (see baskettypes:TLineItemContainerIn)
     */
    public de.epages.WebServices.BasketService.Stub.TLineItemContainerIn getLineItemContainer() {
        return lineItemContainer;
    }


    /**
     * Sets the lineItemContainer value for this TCreate_Input.
     * 
     * @param lineItemContainer   * the products, payments, shipping etc. of this basket (see baskettypes:TLineItemContainerIn)
     */
    public void setLineItemContainer(de.epages.WebServices.BasketService.Stub.TLineItemContainerIn lineItemContainer) {
        this.lineItemContainer = lineItemContainer;
    }


    /**
     * Gets the billingAddress value for this TCreate_Input.
     * 
     * @return billingAddress
     */
    public de.epages.WebServices.BasketService.Stub.TAddressNamed getBillingAddress() {
        return billingAddress;
    }


    /**
     * Sets the billingAddress value for this TCreate_Input.
     * 
     * @param billingAddress
     */
    public void setBillingAddress(de.epages.WebServices.BasketService.Stub.TAddressNamed billingAddress) {
        this.billingAddress = billingAddress;
    }


    /**
     * Gets the shippingAddress value for this TCreate_Input.
     * 
     * @return shippingAddress
     */
    public de.epages.WebServices.BasketService.Stub.TAddressNamed getShippingAddress() {
        return shippingAddress;
    }


    /**
     * Sets the shippingAddress value for this TCreate_Input.
     * 
     * @param shippingAddress
     */
    public void setShippingAddress(de.epages.WebServices.BasketService.Stub.TAddressNamed shippingAddress) {
        this.shippingAddress = shippingAddress;
    }


    /**
     * Gets the attributes value for this TCreate_Input.
     * 
     * @return attributes   * list of requested attributes (see epagestypes:ListOfAttributes)
     */
    public de.epages.WebServices.BasketService.Stub.TAttribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this TCreate_Input.
     * 
     * @param attributes   * list of requested attributes (see epagestypes:ListOfAttributes)
     */
    public void setAttributes(de.epages.WebServices.BasketService.Stub.TAttribute[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCreate_Input)) return false;
        TCreate_Input other = (TCreate_Input) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alias==null && other.getAlias()==null) || 
             (this.alias!=null &&
              this.alias.equals(other.getAlias()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.lineItemContainer==null && other.getLineItemContainer()==null) || 
             (this.lineItemContainer!=null &&
              this.lineItemContainer.equals(other.getLineItemContainer()))) &&
            ((this.billingAddress==null && other.getBillingAddress()==null) || 
             (this.billingAddress!=null &&
              this.billingAddress.equals(other.getBillingAddress()))) &&
            ((this.shippingAddress==null && other.getShippingAddress()==null) || 
             (this.shippingAddress!=null &&
              this.shippingAddress.equals(other.getShippingAddress()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes())));
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
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getLineItemContainer() != null) {
            _hashCode += getLineItemContainer().hashCode();
        }
        if (getBillingAddress() != null) {
            _hashCode += getBillingAddress().hashCode();
        }
        if (getShippingAddress() != null) {
            _hashCode += getShippingAddress().hashCode();
        }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCreate_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TCreate_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "User"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemContainer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LineItemContainer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TLineItemContainerIn"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BillingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ShopTypes/2011/01", "TAddressNamed"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ShippingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ShopTypes/2011/01", "TAddressNamed"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TAttribute"));
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
