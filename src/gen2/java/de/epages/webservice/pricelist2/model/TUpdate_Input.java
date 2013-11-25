/**
 * TUpdate_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.pricelist2.model;


/**
 * input arguments of a single update() pricelist call.
 *         a set of optional pricelist specific attributes that will
 * be updated.
 *         the path element is mandatory.
 *         all others are optional.
 */
public class TUpdate_Input  implements java.io.Serializable {
    /* pricelist path */
    private java.lang.String path;

    /* pricelist's name */
    private de.epages.webservice.common.model.TLocalizedValue[] name;

    /* pricelist's tax model ('gross' or 'net') */
    private java.lang.String taxModel;

    /* the begin of the price list's time frame */
    private java.util.Calendar validFrom;

    /* the end of the price list's time frame */
    private java.util.Calendar validTo;

    /* list of customer paths for this pricelist (see pricelisttypes:ListOfListOfCustomerPaths) */
    private java.lang.String[] customers;

    /* list of customer group paths for this pricelist (see pricelisttypes:ListOfListOfCustomerGroupPaths) */
    private java.lang.String[] customerGroups;

    /* list of requested attributes (see epagestypes:ListOfAttributes) */
    private de.epages.webservice.common.model.TAttribute[] attributes;

    /* list of global value discounts sorted by value ascending (see
     * ListOfGlobalValueDiscounts) */
    private de.epages.webservice.pricelist2.model.TGlobalValueDiscount[] globalValueDiscounts;

    public TUpdate_Input() {
    }

    public TUpdate_Input(
           java.lang.String path,
           de.epages.webservice.common.model.TLocalizedValue[] name,
           java.lang.String taxModel,
           java.util.Calendar validFrom,
           java.util.Calendar validTo,
           java.lang.String[] customers,
           java.lang.String[] customerGroups,
           de.epages.webservice.common.model.TAttribute[] attributes,
           de.epages.webservice.pricelist2.model.TGlobalValueDiscount[] globalValueDiscounts) {
           this.path = path;
           this.name = name;
           this.taxModel = taxModel;
           this.validFrom = validFrom;
           this.validTo = validTo;
           this.customers = customers;
           this.customerGroups = customerGroups;
           this.attributes = attributes;
           this.globalValueDiscounts = globalValueDiscounts;
    }


    /**
     * Gets the path value for this TUpdate_Input.
     * 
     * @return path   * pricelist path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TUpdate_Input.
     * 
     * @param path   * pricelist path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the name value for this TUpdate_Input.
     * 
     * @return name   * pricelist's name
     */
    public de.epages.webservice.common.model.TLocalizedValue[] getName() {
        return name;
    }


    /**
     * Sets the name value for this TUpdate_Input.
     * 
     * @param name   * pricelist's name
     */
    public void setName(de.epages.webservice.common.model.TLocalizedValue[] name) {
        this.name = name;
    }


    /**
     * Gets the taxModel value for this TUpdate_Input.
     * 
     * @return taxModel   * pricelist's tax model ('gross' or 'net')
     */
    public java.lang.String getTaxModel() {
        return taxModel;
    }


    /**
     * Sets the taxModel value for this TUpdate_Input.
     * 
     * @param taxModel   * pricelist's tax model ('gross' or 'net')
     */
    public void setTaxModel(java.lang.String taxModel) {
        this.taxModel = taxModel;
    }


    /**
     * Gets the validFrom value for this TUpdate_Input.
     * 
     * @return validFrom   * the begin of the price list's time frame
     */
    public java.util.Calendar getValidFrom() {
        return validFrom;
    }


    /**
     * Sets the validFrom value for this TUpdate_Input.
     * 
     * @param validFrom   * the begin of the price list's time frame
     */
    public void setValidFrom(java.util.Calendar validFrom) {
        this.validFrom = validFrom;
    }


    /**
     * Gets the validTo value for this TUpdate_Input.
     * 
     * @return validTo   * the end of the price list's time frame
     */
    public java.util.Calendar getValidTo() {
        return validTo;
    }


    /**
     * Sets the validTo value for this TUpdate_Input.
     * 
     * @param validTo   * the end of the price list's time frame
     */
    public void setValidTo(java.util.Calendar validTo) {
        this.validTo = validTo;
    }


    /**
     * Gets the customers value for this TUpdate_Input.
     * 
     * @return customers   * list of customer paths for this pricelist (see pricelisttypes:ListOfListOfCustomerPaths)
     */
    public java.lang.String[] getCustomers() {
        return customers;
    }


    /**
     * Sets the customers value for this TUpdate_Input.
     * 
     * @param customers   * list of customer paths for this pricelist (see pricelisttypes:ListOfListOfCustomerPaths)
     */
    public void setCustomers(java.lang.String[] customers) {
        this.customers = customers;
    }


    /**
     * Gets the customerGroups value for this TUpdate_Input.
     * 
     * @return customerGroups   * list of customer group paths for this pricelist (see pricelisttypes:ListOfListOfCustomerGroupPaths)
     */
    public java.lang.String[] getCustomerGroups() {
        return customerGroups;
    }


    /**
     * Sets the customerGroups value for this TUpdate_Input.
     * 
     * @param customerGroups   * list of customer group paths for this pricelist (see pricelisttypes:ListOfListOfCustomerGroupPaths)
     */
    public void setCustomerGroups(java.lang.String[] customerGroups) {
        this.customerGroups = customerGroups;
    }


    /**
     * Gets the attributes value for this TUpdate_Input.
     * 
     * @return attributes   * list of requested attributes (see epagestypes:ListOfAttributes)
     */
    public de.epages.webservice.common.model.TAttribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this TUpdate_Input.
     * 
     * @param attributes   * list of requested attributes (see epagestypes:ListOfAttributes)
     */
    public void setAttributes(de.epages.webservice.common.model.TAttribute[] attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the globalValueDiscounts value for this TUpdate_Input.
     * 
     * @return globalValueDiscounts   * list of global value discounts sorted by value ascending (see
     * ListOfGlobalValueDiscounts)
     */
    public de.epages.webservice.pricelist2.model.TGlobalValueDiscount[] getGlobalValueDiscounts() {
        return globalValueDiscounts;
    }


    /**
     * Sets the globalValueDiscounts value for this TUpdate_Input.
     * 
     * @param globalValueDiscounts   * list of global value discounts sorted by value ascending (see
     * ListOfGlobalValueDiscounts)
     */
    public void setGlobalValueDiscounts(de.epages.webservice.pricelist2.model.TGlobalValueDiscount[] globalValueDiscounts) {
        this.globalValueDiscounts = globalValueDiscounts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TUpdate_Input)) return false;
        TUpdate_Input other = (TUpdate_Input) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.taxModel==null && other.getTaxModel()==null) || 
             (this.taxModel!=null &&
              this.taxModel.equals(other.getTaxModel()))) &&
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
            ((this.globalValueDiscounts==null && other.getGlobalValueDiscounts()==null) || 
             (this.globalValueDiscounts!=null &&
              java.util.Arrays.equals(this.globalValueDiscounts, other.getGlobalValueDiscounts())));
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
        if (getTaxModel() != null) {
            _hashCode += getTaxModel().hashCode();
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
        if (getGlobalValueDiscounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGlobalValueDiscounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGlobalValueDiscounts(), i);
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
        new org.apache.axis.description.TypeDesc(TUpdate_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListTypes/2010/08", "TUpdate_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Path"));
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
        elemField.setFieldName("taxModel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaxModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("globalValueDiscounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GlobalValueDiscounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListTypes/2010/08", "TGlobalValueDiscount"));
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
