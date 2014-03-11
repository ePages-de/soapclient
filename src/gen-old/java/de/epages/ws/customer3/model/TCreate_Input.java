/**
 * TCreate_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.customer3.model;


/**
 * input arguments of a single create() customer call.
 *         a set of customer specific attributes that will be used to
 * create a customer.
 *         the alias element is optional, a new alias will be created
 * if omitted.
 *         customer group, tax area, tax model, currency, address are
 * mandatory.
 *         all others are optional.
 */
public class TCreate_Input  implements java.io.Serializable {
    /* customer alias */
    private java.lang.String alias;

    /* the customer's group (object path to group) */
    private java.lang.String customerGroup;

    /* customer's tax area (object path to tax area) */
    private java.lang.String taxArea;

    /* customer's tax model ("gross" or "net") */
    private java.lang.String taxModel;

    /* customer's currency (e.g. "EUR" or "USD") */
    private java.lang.String currencyID;

    private java.lang.Boolean isHtmlEMailAllowed;

    private java.lang.Boolean isDoOrderAllowed;

    private java.lang.String comment;

    private de.epages.ws.shop2.model.TAddressNamed billingAddress;

    /* list of assigned users (see customertypes:ListOfUserPaths) */
    private java.lang.String[] users;

    /* list of requested attributes (see epagestypes:ListOfAttributes) */
    private de.epages.ws.common.model.TAttribute[] attributes;

    public TCreate_Input() {
    }

    public TCreate_Input(
           java.lang.String alias,
           java.lang.String customerGroup,
           java.lang.String taxArea,
           java.lang.String taxModel,
           java.lang.String currencyID,
           java.lang.Boolean isHtmlEMailAllowed,
           java.lang.Boolean isDoOrderAllowed,
           java.lang.String comment,
           de.epages.ws.shop2.model.TAddressNamed billingAddress,
           java.lang.String[] users,
           de.epages.ws.common.model.TAttribute[] attributes) {
           this.alias = alias;
           this.customerGroup = customerGroup;
           this.taxArea = taxArea;
           this.taxModel = taxModel;
           this.currencyID = currencyID;
           this.isHtmlEMailAllowed = isHtmlEMailAllowed;
           this.isDoOrderAllowed = isDoOrderAllowed;
           this.comment = comment;
           this.billingAddress = billingAddress;
           this.users = users;
           this.attributes = attributes;
    }


    /**
     * Gets the alias value for this TCreate_Input.
     * 
     * @return alias   * customer alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TCreate_Input.
     * 
     * @param alias   * customer alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the customerGroup value for this TCreate_Input.
     * 
     * @return customerGroup   * the customer's group (object path to group)
     */
    public java.lang.String getCustomerGroup() {
        return customerGroup;
    }


    /**
     * Sets the customerGroup value for this TCreate_Input.
     * 
     * @param customerGroup   * the customer's group (object path to group)
     */
    public void setCustomerGroup(java.lang.String customerGroup) {
        this.customerGroup = customerGroup;
    }


    /**
     * Gets the taxArea value for this TCreate_Input.
     * 
     * @return taxArea   * customer's tax area (object path to tax area)
     */
    public java.lang.String getTaxArea() {
        return taxArea;
    }


    /**
     * Sets the taxArea value for this TCreate_Input.
     * 
     * @param taxArea   * customer's tax area (object path to tax area)
     */
    public void setTaxArea(java.lang.String taxArea) {
        this.taxArea = taxArea;
    }


    /**
     * Gets the taxModel value for this TCreate_Input.
     * 
     * @return taxModel   * customer's tax model ("gross" or "net")
     */
    public java.lang.String getTaxModel() {
        return taxModel;
    }


    /**
     * Sets the taxModel value for this TCreate_Input.
     * 
     * @param taxModel   * customer's tax model ("gross" or "net")
     */
    public void setTaxModel(java.lang.String taxModel) {
        this.taxModel = taxModel;
    }


    /**
     * Gets the currencyID value for this TCreate_Input.
     * 
     * @return currencyID   * customer's currency (e.g. "EUR" or "USD")
     */
    public java.lang.String getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this TCreate_Input.
     * 
     * @param currencyID   * customer's currency (e.g. "EUR" or "USD")
     */
    public void setCurrencyID(java.lang.String currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the isHtmlEMailAllowed value for this TCreate_Input.
     * 
     * @return isHtmlEMailAllowed
     */
    public java.lang.Boolean getIsHtmlEMailAllowed() {
        return isHtmlEMailAllowed;
    }


    /**
     * Sets the isHtmlEMailAllowed value for this TCreate_Input.
     * 
     * @param isHtmlEMailAllowed
     */
    public void setIsHtmlEMailAllowed(java.lang.Boolean isHtmlEMailAllowed) {
        this.isHtmlEMailAllowed = isHtmlEMailAllowed;
    }


    /**
     * Gets the isDoOrderAllowed value for this TCreate_Input.
     * 
     * @return isDoOrderAllowed
     */
    public java.lang.Boolean getIsDoOrderAllowed() {
        return isDoOrderAllowed;
    }


    /**
     * Sets the isDoOrderAllowed value for this TCreate_Input.
     * 
     * @param isDoOrderAllowed
     */
    public void setIsDoOrderAllowed(java.lang.Boolean isDoOrderAllowed) {
        this.isDoOrderAllowed = isDoOrderAllowed;
    }


    /**
     * Gets the comment value for this TCreate_Input.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this TCreate_Input.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the billingAddress value for this TCreate_Input.
     * 
     * @return billingAddress
     */
    public de.epages.ws.shop2.model.TAddressNamed getBillingAddress() {
        return billingAddress;
    }


    /**
     * Sets the billingAddress value for this TCreate_Input.
     * 
     * @param billingAddress
     */
    public void setBillingAddress(de.epages.ws.shop2.model.TAddressNamed billingAddress) {
        this.billingAddress = billingAddress;
    }


    /**
     * Gets the users value for this TCreate_Input.
     * 
     * @return users   * list of assigned users (see customertypes:ListOfUserPaths)
     */
    public java.lang.String[] getUsers() {
        return users;
    }


    /**
     * Sets the users value for this TCreate_Input.
     * 
     * @param users   * list of assigned users (see customertypes:ListOfUserPaths)
     */
    public void setUsers(java.lang.String[] users) {
        this.users = users;
    }


    /**
     * Gets the attributes value for this TCreate_Input.
     * 
     * @return attributes   * list of requested attributes (see epagestypes:ListOfAttributes)
     */
    public de.epages.ws.common.model.TAttribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this TCreate_Input.
     * 
     * @param attributes   * list of requested attributes (see epagestypes:ListOfAttributes)
     */
    public void setAttributes(de.epages.ws.common.model.TAttribute[] attributes) {
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
            ((this.customerGroup==null && other.getCustomerGroup()==null) || 
             (this.customerGroup!=null &&
              this.customerGroup.equals(other.getCustomerGroup()))) &&
            ((this.taxArea==null && other.getTaxArea()==null) || 
             (this.taxArea!=null &&
              this.taxArea.equals(other.getTaxArea()))) &&
            ((this.taxModel==null && other.getTaxModel()==null) || 
             (this.taxModel!=null &&
              this.taxModel.equals(other.getTaxModel()))) &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.isHtmlEMailAllowed==null && other.getIsHtmlEMailAllowed()==null) || 
             (this.isHtmlEMailAllowed!=null &&
              this.isHtmlEMailAllowed.equals(other.getIsHtmlEMailAllowed()))) &&
            ((this.isDoOrderAllowed==null && other.getIsDoOrderAllowed()==null) || 
             (this.isDoOrderAllowed!=null &&
              this.isDoOrderAllowed.equals(other.getIsDoOrderAllowed()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.billingAddress==null && other.getBillingAddress()==null) || 
             (this.billingAddress!=null &&
              this.billingAddress.equals(other.getBillingAddress()))) &&
            ((this.users==null && other.getUsers()==null) || 
             (this.users!=null &&
              java.util.Arrays.equals(this.users, other.getUsers()))) &&
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
        if (getCustomerGroup() != null) {
            _hashCode += getCustomerGroup().hashCode();
        }
        if (getTaxArea() != null) {
            _hashCode += getTaxArea().hashCode();
        }
        if (getTaxModel() != null) {
            _hashCode += getTaxModel().hashCode();
        }
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getIsHtmlEMailAllowed() != null) {
            _hashCode += getIsHtmlEMailAllowed().hashCode();
        }
        if (getIsDoOrderAllowed() != null) {
            _hashCode += getIsDoOrderAllowed().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getBillingAddress() != null) {
            _hashCode += getBillingAddress().hashCode();
        }
        if (getUsers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/CustomerTypes/2007/08", "TCreate_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CustomerGroup"));
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
        elemField.setFieldName("taxModel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaxModel"));
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
        elemField.setFieldName("isHtmlEMailAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsHtmlEMailAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDoOrderAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsDoOrderAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BillingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ShopTypes/2006/07", "TAddressNamed"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("users");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Users"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TAttribute"));
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
