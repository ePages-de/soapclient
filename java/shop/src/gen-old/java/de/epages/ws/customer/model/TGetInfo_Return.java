/**
 * TGetInfo_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.customer.model;


/**
 * a single return value of a getInfo() customer call.
 *         the path will be always returned.
 *         the error element will be returned in case of error.
 *         all other elements will be returned if no error has occured.
 */
public class TGetInfo_Return  implements java.io.Serializable {
    /* customer object path */
    private java.lang.String path;

    /* customer alias */
    private java.lang.String alias;

    /* path to customer's class */
    private java.lang.String _class;

    /* the customer's group (object path to group) */
    private java.lang.String customerGroup;

    /* customer's tax area (object path to tax area) */
    private java.lang.String taxArea;

    /* customer's tax model ("gross" or "net") */
    private java.lang.String taxModel;

    /* customer's currency:   obsolete */
    private java.lang.String currencyID;

    private java.lang.Boolean isHtmlEMailAllowed;

    private java.lang.Boolean isDoOrderAllowed;

    private java.lang.String comment;

    private de.epages.ws.shop.model.TAddress billingAddress;

    /* list of assigned users (see customertypes:ListOfUserPaths) */
    private java.lang.String[] users;

    /* list of requested attributes (see epagestypes:ListOfAttributes) */
    private de.epages.ws.common.model.TAttribute[] attributes;

    /* error object (see epagestypes:TError) */
    private de.epages.ws.common.model.TError error;

    public TGetInfo_Return() {
    }

    public TGetInfo_Return(
           java.lang.String path,
           java.lang.String alias,
           java.lang.String _class,
           java.lang.String customerGroup,
           java.lang.String taxArea,
           java.lang.String taxModel,
           java.lang.String currencyID,
           java.lang.Boolean isHtmlEMailAllowed,
           java.lang.Boolean isDoOrderAllowed,
           java.lang.String comment,
           de.epages.ws.shop.model.TAddress billingAddress,
           java.lang.String[] users,
           de.epages.ws.common.model.TAttribute[] attributes,
           de.epages.ws.common.model.TError error) {
           this.path = path;
           this.alias = alias;
           this._class = _class;
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
           this.error = error;
    }


    /**
     * Gets the path value for this TGetInfo_Return.
     * 
     * @return path   * customer object path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TGetInfo_Return.
     * 
     * @param path   * customer object path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the alias value for this TGetInfo_Return.
     * 
     * @return alias   * customer alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TGetInfo_Return.
     * 
     * @param alias   * customer alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the _class value for this TGetInfo_Return.
     * 
     * @return _class   * path to customer's class
     */
    public java.lang.String get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this TGetInfo_Return.
     * 
     * @param _class   * path to customer's class
     */
    public void set_class(java.lang.String _class) {
        this._class = _class;
    }


    /**
     * Gets the customerGroup value for this TGetInfo_Return.
     * 
     * @return customerGroup   * the customer's group (object path to group)
     */
    public java.lang.String getCustomerGroup() {
        return customerGroup;
    }


    /**
     * Sets the customerGroup value for this TGetInfo_Return.
     * 
     * @param customerGroup   * the customer's group (object path to group)
     */
    public void setCustomerGroup(java.lang.String customerGroup) {
        this.customerGroup = customerGroup;
    }


    /**
     * Gets the taxArea value for this TGetInfo_Return.
     * 
     * @return taxArea   * customer's tax area (object path to tax area)
     */
    public java.lang.String getTaxArea() {
        return taxArea;
    }


    /**
     * Sets the taxArea value for this TGetInfo_Return.
     * 
     * @param taxArea   * customer's tax area (object path to tax area)
     */
    public void setTaxArea(java.lang.String taxArea) {
        this.taxArea = taxArea;
    }


    /**
     * Gets the taxModel value for this TGetInfo_Return.
     * 
     * @return taxModel   * customer's tax model ("gross" or "net")
     */
    public java.lang.String getTaxModel() {
        return taxModel;
    }


    /**
     * Sets the taxModel value for this TGetInfo_Return.
     * 
     * @param taxModel   * customer's tax model ("gross" or "net")
     */
    public void setTaxModel(java.lang.String taxModel) {
        this.taxModel = taxModel;
    }


    /**
     * Gets the currencyID value for this TGetInfo_Return.
     * 
     * @return currencyID   * customer's currency:   obsolete
     */
    public java.lang.String getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this TGetInfo_Return.
     * 
     * @param currencyID   * customer's currency:   obsolete
     */
    public void setCurrencyID(java.lang.String currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the isHtmlEMailAllowed value for this TGetInfo_Return.
     * 
     * @return isHtmlEMailAllowed
     */
    public java.lang.Boolean getIsHtmlEMailAllowed() {
        return isHtmlEMailAllowed;
    }


    /**
     * Sets the isHtmlEMailAllowed value for this TGetInfo_Return.
     * 
     * @param isHtmlEMailAllowed
     */
    public void setIsHtmlEMailAllowed(java.lang.Boolean isHtmlEMailAllowed) {
        this.isHtmlEMailAllowed = isHtmlEMailAllowed;
    }


    /**
     * Gets the isDoOrderAllowed value for this TGetInfo_Return.
     * 
     * @return isDoOrderAllowed
     */
    public java.lang.Boolean getIsDoOrderAllowed() {
        return isDoOrderAllowed;
    }


    /**
     * Sets the isDoOrderAllowed value for this TGetInfo_Return.
     * 
     * @param isDoOrderAllowed
     */
    public void setIsDoOrderAllowed(java.lang.Boolean isDoOrderAllowed) {
        this.isDoOrderAllowed = isDoOrderAllowed;
    }


    /**
     * Gets the comment value for this TGetInfo_Return.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this TGetInfo_Return.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the billingAddress value for this TGetInfo_Return.
     * 
     * @return billingAddress
     */
    public de.epages.ws.shop.model.TAddress getBillingAddress() {
        return billingAddress;
    }


    /**
     * Sets the billingAddress value for this TGetInfo_Return.
     * 
     * @param billingAddress
     */
    public void setBillingAddress(de.epages.ws.shop.model.TAddress billingAddress) {
        this.billingAddress = billingAddress;
    }


    /**
     * Gets the users value for this TGetInfo_Return.
     * 
     * @return users   * list of assigned users (see customertypes:ListOfUserPaths)
     */
    public java.lang.String[] getUsers() {
        return users;
    }


    /**
     * Sets the users value for this TGetInfo_Return.
     * 
     * @param users   * list of assigned users (see customertypes:ListOfUserPaths)
     */
    public void setUsers(java.lang.String[] users) {
        this.users = users;
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
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath()))) &&
            ((this.alias==null && other.getAlias()==null) || 
             (this.alias!=null &&
              this.alias.equals(other.getAlias()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
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
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
        }
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/CustomerTypes/2005/01", "TGetInfo_Return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Class"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CustomerGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxArea");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaxArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("currencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ShopTypes/2005/01", "TAddress"));
        elemField.setMinOccurs(0);
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
