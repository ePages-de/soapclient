/**
 * TGetInfo_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.basket.model;


/**
 * a single return value of a getInfo() basket call.
 *         the guid will be always returned.
 *         the error element will be returned in case of error.
 *         all other elements will be returned if no error has occured.
 */
public class TGetInfo_Return  implements java.io.Serializable {
    /* basket GUID */
    private java.lang.String GUID;

    /* basket alias */
    private java.lang.String alias;

    /* path to basket's class */
    private java.lang.String _class;

    /* basket's customer (object path to customer) */
    private java.lang.String customer;

    /* basket's user (object path to user) */
    private java.lang.String user;

    /* basket's creation date */
    private java.util.Calendar creationDate;

    /* the products, payments, shipping etc. of this basket (see baskettypes:TLineItemContainerOut) */
    private de.epages.ws.basket.model.TLineItemContainerOut lineItemContainer;

    private de.epages.ws.shop3.model.TAddressNamed billingAddress;

    private de.epages.ws.shop3.model.TAddressNamed shippingAddress;

    /* list of requested attributes (see epagestypes:ListOfAttributes) */
    private de.epages.ws.common.model.TAttribute[] attributes;

    /* error object (see epagestypes:TError) */
    private de.epages.ws.common.model.TError error;

    public TGetInfo_Return() {
    }

    public TGetInfo_Return(
           java.lang.String GUID,
           java.lang.String alias,
           java.lang.String _class,
           java.lang.String customer,
           java.lang.String user,
           java.util.Calendar creationDate,
           de.epages.ws.basket.model.TLineItemContainerOut lineItemContainer,
           de.epages.ws.shop3.model.TAddressNamed billingAddress,
           de.epages.ws.shop3.model.TAddressNamed shippingAddress,
           de.epages.ws.common.model.TAttribute[] attributes,
           de.epages.ws.common.model.TError error) {
           this.GUID = GUID;
           this.alias = alias;
           this._class = _class;
           this.customer = customer;
           this.user = user;
           this.creationDate = creationDate;
           this.lineItemContainer = lineItemContainer;
           this.billingAddress = billingAddress;
           this.shippingAddress = shippingAddress;
           this.attributes = attributes;
           this.error = error;
    }


    /**
     * Gets the GUID value for this TGetInfo_Return.
     * 
     * @return GUID   * basket GUID
     */
    public java.lang.String getGUID() {
        return GUID;
    }


    /**
     * Sets the GUID value for this TGetInfo_Return.
     * 
     * @param GUID   * basket GUID
     */
    public void setGUID(java.lang.String GUID) {
        this.GUID = GUID;
    }


    /**
     * Gets the alias value for this TGetInfo_Return.
     * 
     * @return alias   * basket alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TGetInfo_Return.
     * 
     * @param alias   * basket alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the _class value for this TGetInfo_Return.
     * 
     * @return _class   * path to basket's class
     */
    public java.lang.String get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this TGetInfo_Return.
     * 
     * @param _class   * path to basket's class
     */
    public void set_class(java.lang.String _class) {
        this._class = _class;
    }


    /**
     * Gets the customer value for this TGetInfo_Return.
     * 
     * @return customer   * basket's customer (object path to customer)
     */
    public java.lang.String getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this TGetInfo_Return.
     * 
     * @param customer   * basket's customer (object path to customer)
     */
    public void setCustomer(java.lang.String customer) {
        this.customer = customer;
    }


    /**
     * Gets the user value for this TGetInfo_Return.
     * 
     * @return user   * basket's user (object path to user)
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this TGetInfo_Return.
     * 
     * @param user   * basket's user (object path to user)
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the creationDate value for this TGetInfo_Return.
     * 
     * @return creationDate   * basket's creation date
     */
    public java.util.Calendar getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this TGetInfo_Return.
     * 
     * @param creationDate   * basket's creation date
     */
    public void setCreationDate(java.util.Calendar creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the lineItemContainer value for this TGetInfo_Return.
     * 
     * @return lineItemContainer   * the products, payments, shipping etc. of this basket (see baskettypes:TLineItemContainerOut)
     */
    public de.epages.ws.basket.model.TLineItemContainerOut getLineItemContainer() {
        return lineItemContainer;
    }


    /**
     * Sets the lineItemContainer value for this TGetInfo_Return.
     * 
     * @param lineItemContainer   * the products, payments, shipping etc. of this basket (see baskettypes:TLineItemContainerOut)
     */
    public void setLineItemContainer(de.epages.ws.basket.model.TLineItemContainerOut lineItemContainer) {
        this.lineItemContainer = lineItemContainer;
    }


    /**
     * Gets the billingAddress value for this TGetInfo_Return.
     * 
     * @return billingAddress
     */
    public de.epages.ws.shop3.model.TAddressNamed getBillingAddress() {
        return billingAddress;
    }


    /**
     * Sets the billingAddress value for this TGetInfo_Return.
     * 
     * @param billingAddress
     */
    public void setBillingAddress(de.epages.ws.shop3.model.TAddressNamed billingAddress) {
        this.billingAddress = billingAddress;
    }


    /**
     * Gets the shippingAddress value for this TGetInfo_Return.
     * 
     * @return shippingAddress
     */
    public de.epages.ws.shop3.model.TAddressNamed getShippingAddress() {
        return shippingAddress;
    }


    /**
     * Sets the shippingAddress value for this TGetInfo_Return.
     * 
     * @param shippingAddress
     */
    public void setShippingAddress(de.epages.ws.shop3.model.TAddressNamed shippingAddress) {
        this.shippingAddress = shippingAddress;
    }


    /**
     * Gets the attributes value for this TGetInfo_Return.
     * 
     * @return attributes   * list of requested attributes (see epagestypes:ListOfAttributes)
     */
    public de.epages.ws.common.model.TAttribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this TGetInfo_Return.
     * 
     * @param attributes   * list of requested attributes (see epagestypes:ListOfAttributes)
     */
    public void setAttributes(de.epages.ws.common.model.TAttribute[] attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the error value for this TGetInfo_Return.
     * 
     * @return error   * error object (see epagestypes:TError)
     */
    public de.epages.ws.common.model.TError getError() {
        return error;
    }


    /**
     * Sets the error value for this TGetInfo_Return.
     * 
     * @param error   * error object (see epagestypes:TError)
     */
    public void setError(de.epages.ws.common.model.TError error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TGetInfo_Return)) return false;
        TGetInfo_Return other = (TGetInfo_Return) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GUID==null && other.getGUID()==null) || 
             (this.GUID!=null &&
              this.GUID.equals(other.getGUID()))) &&
            ((this.alias==null && other.getAlias()==null) || 
             (this.alias!=null &&
              this.alias.equals(other.getAlias()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
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
              java.util.Arrays.equals(this.attributes, other.getAttributes()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError())));
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
        if (getGUID() != null) {
            _hashCode += getGUID().hashCode();
        }
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
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
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TGetInfo_Return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TGetInfo_Return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Class"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemContainer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LineItemContainer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TLineItemContainerOut"));
        elemField.setMinOccurs(0);
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Error"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TError"));
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
