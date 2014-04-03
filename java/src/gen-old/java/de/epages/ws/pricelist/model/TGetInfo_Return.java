/**
 * TGetInfo_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.pricelist.model;


/**
 * a single return value of a getInfo() pricelist call.
 *         the path will be always returned.
 *         the error element will be returned in case of error.
 *         all other elements will be returned if no error has occured.
 */
public class TGetInfo_Return  implements java.io.Serializable {
    /* pricelist path */
    private java.lang.String path;

    /* pricelist alias */
    private java.lang.String alias;

    /* pricelist class (object path) */
    private java.lang.String _class;

    /* pricelist's name */
    private de.epages.ws.common.model.TLocalizedValue[] name;

    /* pricelist's currency (e.g. 'USD') */
    private java.lang.String currencyID;

    /* pricelist's tax model ('gross' or 'net') */
    private java.lang.String taxModel;

    /* indicates, if the price list's time frame matches with the
     * current time */
    private java.lang.Boolean isEffective;

    /* the begin of the price list's time frame */
    private java.util.Calendar validFrom;

    /* the end of the price list's time frame */
    private java.util.Calendar validTo;

    /* list of paths to customers, that are assigned to the pricelist
     * (see pricelisttypes:ListOfCustomerPaths) */
    private java.lang.String[] customers;

    /* list of paths to customer groups, that are assigned to the
     * pricelist
     *             (see pricelisttypes:ListOfCustomerGroupPaths) */
    private java.lang.String[] customerGroups;

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
           de.epages.ws.common.model.TLocalizedValue[] name,
           java.lang.String currencyID,
           java.lang.String taxModel,
           java.lang.Boolean isEffective,
           java.util.Calendar validFrom,
           java.util.Calendar validTo,
           java.lang.String[] customers,
           java.lang.String[] customerGroups,
           de.epages.ws.common.model.TAttribute[] attributes,
           de.epages.ws.common.model.TError error) {
           this.path = path;
           this.alias = alias;
           this._class = _class;
           this.name = name;
           this.currencyID = currencyID;
           this.taxModel = taxModel;
           this.isEffective = isEffective;
           this.validFrom = validFrom;
           this.validTo = validTo;
           this.customers = customers;
           this.customerGroups = customerGroups;
           this.attributes = attributes;
           this.error = error;
    }


    /**
     * Gets the path value for this TGetInfo_Return.
     * 
     * @return path   * pricelist path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TGetInfo_Return.
     * 
     * @param path   * pricelist path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the alias value for this TGetInfo_Return.
     * 
     * @return alias   * pricelist alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TGetInfo_Return.
     * 
     * @param alias   * pricelist alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the _class value for this TGetInfo_Return.
     * 
     * @return _class   * pricelist class (object path)
     */
    public java.lang.String get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this TGetInfo_Return.
     * 
     * @param _class   * pricelist class (object path)
     */
    public void set_class(java.lang.String _class) {
        this._class = _class;
    }


    /**
     * Gets the name value for this TGetInfo_Return.
     * 
     * @return name   * pricelist's name
     */
    public de.epages.ws.common.model.TLocalizedValue[] getName() {
        return name;
    }


    /**
     * Sets the name value for this TGetInfo_Return.
     * 
     * @param name   * pricelist's name
     */
    public void setName(de.epages.ws.common.model.TLocalizedValue[] name) {
        this.name = name;
    }


    /**
     * Gets the currencyID value for this TGetInfo_Return.
     * 
     * @return currencyID   * pricelist's currency (e.g. 'USD')
     */
    public java.lang.String getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this TGetInfo_Return.
     * 
     * @param currencyID   * pricelist's currency (e.g. 'USD')
     */
    public void setCurrencyID(java.lang.String currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the taxModel value for this TGetInfo_Return.
     * 
     * @return taxModel   * pricelist's tax model ('gross' or 'net')
     */
    public java.lang.String getTaxModel() {
        return taxModel;
    }


    /**
     * Sets the taxModel value for this TGetInfo_Return.
     * 
     * @param taxModel   * pricelist's tax model ('gross' or 'net')
     */
    public void setTaxModel(java.lang.String taxModel) {
        this.taxModel = taxModel;
    }


    /**
     * Gets the isEffective value for this TGetInfo_Return.
     * 
     * @return isEffective   * indicates, if the price list's time frame matches with the
     * current time
     */
    public java.lang.Boolean getIsEffective() {
        return isEffective;
    }


    /**
     * Sets the isEffective value for this TGetInfo_Return.
     * 
     * @param isEffective   * indicates, if the price list's time frame matches with the
     * current time
     */
    public void setIsEffective(java.lang.Boolean isEffective) {
        this.isEffective = isEffective;
    }


    /**
     * Gets the validFrom value for this TGetInfo_Return.
     * 
     * @return validFrom   * the begin of the price list's time frame
     */
    public java.util.Calendar getValidFrom() {
        return validFrom;
    }


    /**
     * Sets the validFrom value for this TGetInfo_Return.
     * 
     * @param validFrom   * the begin of the price list's time frame
     */
    public void setValidFrom(java.util.Calendar validFrom) {
        this.validFrom = validFrom;
    }


    /**
     * Gets the validTo value for this TGetInfo_Return.
     * 
     * @return validTo   * the end of the price list's time frame
     */
    public java.util.Calendar getValidTo() {
        return validTo;
    }


    /**
     * Sets the validTo value for this TGetInfo_Return.
     * 
     * @param validTo   * the end of the price list's time frame
     */
    public void setValidTo(java.util.Calendar validTo) {
        this.validTo = validTo;
    }


    /**
     * Gets the customers value for this TGetInfo_Return.
     * 
     * @return customers   * list of paths to customers, that are assigned to the pricelist
     * (see pricelisttypes:ListOfCustomerPaths)
     */
    public java.lang.String[] getCustomers() {
        return customers;
    }


    /**
     * Sets the customers value for this TGetInfo_Return.
     * 
     * @param customers   * list of paths to customers, that are assigned to the pricelist
     * (see pricelisttypes:ListOfCustomerPaths)
     */
    public void setCustomers(java.lang.String[] customers) {
        this.customers = customers;
    }


    /**
     * Gets the customerGroups value for this TGetInfo_Return.
     * 
     * @return customerGroups   * list of paths to customer groups, that are assigned to the
     * pricelist
     *             (see pricelisttypes:ListOfCustomerGroupPaths)
     */
    public java.lang.String[] getCustomerGroups() {
        return customerGroups;
    }


    /**
     * Sets the customerGroups value for this TGetInfo_Return.
     * 
     * @param customerGroups   * list of paths to customer groups, that are assigned to the
     * pricelist
     *             (see pricelisttypes:ListOfCustomerGroupPaths)
     */
    public void setCustomerGroups(java.lang.String[] customerGroups) {
        this.customerGroups = customerGroups;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.taxModel==null && other.getTaxModel()==null) || 
             (this.taxModel!=null &&
              this.taxModel.equals(other.getTaxModel()))) &&
            ((this.isEffective==null && other.getIsEffective()==null) || 
             (this.isEffective!=null &&
              this.isEffective.equals(other.getIsEffective()))) &&
            ((this.validFrom==null && other.getValidFrom()==null) || 
             (this.validFrom!=null &&
              this.validFrom.equals(other.getValidFrom()))) &&
            ((this.validTo==null && other.getValidTo()==null) || 
             (this.validTo!=null &&
              this.validTo.equals(other.getValidTo()))) &&
            ((this.customers==null && other.getCustomers()==null) || 
             (this.customers!=null &&
              java.util.Arrays.equals(this.customers, other.getCustomers()))) &&
            ((this.customerGroups==null && other.getCustomerGroups()==null) || 
             (this.customerGroups!=null &&
              java.util.Arrays.equals(this.customerGroups, other.getCustomerGroups()))) &&
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
        if (getName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getTaxModel() != null) {
            _hashCode += getTaxModel().hashCode();
        }
        if (getIsEffective() != null) {
            _hashCode += getIsEffective().hashCode();
        }
        if (getValidFrom() != null) {
            _hashCode += getValidFrom().hashCode();
        }
        if (getValidTo() != null) {
            _hashCode += getValidTo().hashCode();
        }
        if (getCustomers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomerGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerGroups(), i);
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListTypes/2005/01", "TGetInfo_Return"));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Class"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TLocalizedValue"));
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
        elemField.setFieldName("taxModel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaxModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEffective");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsEffective"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValidFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValidTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Customers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CustomerGroups"));
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
