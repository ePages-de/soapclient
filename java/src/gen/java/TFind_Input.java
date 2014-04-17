/**
 * TFind_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */


/**
 * input structure of an find() customer call.
 *             a set of optional search parameters.
 */
public class TFind_Input  implements java.io.Serializable {
    /* search for part of customer name */
    private java.lang.String name;

    /* search for part of customer alias */
    private java.lang.String alias;

    /* search for part of user login */
    private java.lang.String login;

    /* search for part of customer email */
    private java.lang.String EMail;

    /* search for part of customer address (street) */
    private java.lang.String street;

    /* search for part of customer address (zipcode) */
    private java.lang.String zipcode;

    /* search for part of customer address (city) */
    private java.lang.String city;

    /* search for a specific customer group (path of customer group) */
    private java.lang.String customerGroup;

    /* search for customers updated only AFTER this Date and Time */
    private java.util.Calendar lastUpdate;

    /* search for customers that made at least this revenue */
    private java.lang.Float revenue;

    /* search for customer revenue in this currency (mandatory if
     * revenue is used) */
    private java.lang.String currencyID;

    /* search for customer revenue beginning with this date */
    private java.util.Calendar revenueFrom;

    /* search for customer revenue ending at this date */
    private java.util.Calendar revenueTo;

    /* search customers that bought this product (part of product
     * alias) */
    private java.lang.String product;

    /* search customers that bought a product beginning with this
     * date */
    private java.util.Calendar productFrom;

    /* search customers that bought a product ending at this date */
    private java.util.Calendar productTo;

    public TFind_Input() {
    }

    public TFind_Input(
           java.lang.String name,
           java.lang.String alias,
           java.lang.String login,
           java.lang.String EMail,
           java.lang.String street,
           java.lang.String zipcode,
           java.lang.String city,
           java.lang.String customerGroup,
           java.util.Calendar lastUpdate,
           java.lang.Float revenue,
           java.lang.String currencyID,
           java.util.Calendar revenueFrom,
           java.util.Calendar revenueTo,
           java.lang.String product,
           java.util.Calendar productFrom,
           java.util.Calendar productTo) {
           this.name = name;
           this.alias = alias;
           this.login = login;
           this.EMail = EMail;
           this.street = street;
           this.zipcode = zipcode;
           this.city = city;
           this.customerGroup = customerGroup;
           this.lastUpdate = lastUpdate;
           this.revenue = revenue;
           this.currencyID = currencyID;
           this.revenueFrom = revenueFrom;
           this.revenueTo = revenueTo;
           this.product = product;
           this.productFrom = productFrom;
           this.productTo = productTo;
    }


    /**
     * Gets the name value for this TFind_Input.
     * 
     * @return name   * search for part of customer name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TFind_Input.
     * 
     * @param name   * search for part of customer name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the alias value for this TFind_Input.
     * 
     * @return alias   * search for part of customer alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TFind_Input.
     * 
     * @param alias   * search for part of customer alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the login value for this TFind_Input.
     * 
     * @return login   * search for part of user login
     */
    public java.lang.String getLogin() {
        return login;
    }


    /**
     * Sets the login value for this TFind_Input.
     * 
     * @param login   * search for part of user login
     */
    public void setLogin(java.lang.String login) {
        this.login = login;
    }


    /**
     * Gets the EMail value for this TFind_Input.
     * 
     * @return EMail   * search for part of customer email
     */
    public java.lang.String getEMail() {
        return EMail;
    }


    /**
     * Sets the EMail value for this TFind_Input.
     * 
     * @param EMail   * search for part of customer email
     */
    public void setEMail(java.lang.String EMail) {
        this.EMail = EMail;
    }


    /**
     * Gets the street value for this TFind_Input.
     * 
     * @return street   * search for part of customer address (street)
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this TFind_Input.
     * 
     * @param street   * search for part of customer address (street)
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the zipcode value for this TFind_Input.
     * 
     * @return zipcode   * search for part of customer address (zipcode)
     */
    public java.lang.String getZipcode() {
        return zipcode;
    }


    /**
     * Sets the zipcode value for this TFind_Input.
     * 
     * @param zipcode   * search for part of customer address (zipcode)
     */
    public void setZipcode(java.lang.String zipcode) {
        this.zipcode = zipcode;
    }


    /**
     * Gets the city value for this TFind_Input.
     * 
     * @return city   * search for part of customer address (city)
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this TFind_Input.
     * 
     * @param city   * search for part of customer address (city)
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the customerGroup value for this TFind_Input.
     * 
     * @return customerGroup   * search for a specific customer group (path of customer group)
     */
    public java.lang.String getCustomerGroup() {
        return customerGroup;
    }


    /**
     * Sets the customerGroup value for this TFind_Input.
     * 
     * @param customerGroup   * search for a specific customer group (path of customer group)
     */
    public void setCustomerGroup(java.lang.String customerGroup) {
        this.customerGroup = customerGroup;
    }


    /**
     * Gets the lastUpdate value for this TFind_Input.
     * 
     * @return lastUpdate   * search for customers updated only AFTER this Date and Time
     */
    public java.util.Calendar getLastUpdate() {
        return lastUpdate;
    }


    /**
     * Sets the lastUpdate value for this TFind_Input.
     * 
     * @param lastUpdate   * search for customers updated only AFTER this Date and Time
     */
    public void setLastUpdate(java.util.Calendar lastUpdate) {
        this.lastUpdate = lastUpdate;
    }


    /**
     * Gets the revenue value for this TFind_Input.
     * 
     * @return revenue   * search for customers that made at least this revenue
     */
    public java.lang.Float getRevenue() {
        return revenue;
    }


    /**
     * Sets the revenue value for this TFind_Input.
     * 
     * @param revenue   * search for customers that made at least this revenue
     */
    public void setRevenue(java.lang.Float revenue) {
        this.revenue = revenue;
    }


    /**
     * Gets the currencyID value for this TFind_Input.
     * 
     * @return currencyID   * search for customer revenue in this currency (mandatory if
     * revenue is used)
     */
    public java.lang.String getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this TFind_Input.
     * 
     * @param currencyID   * search for customer revenue in this currency (mandatory if
     * revenue is used)
     */
    public void setCurrencyID(java.lang.String currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the revenueFrom value for this TFind_Input.
     * 
     * @return revenueFrom   * search for customer revenue beginning with this date
     */
    public java.util.Calendar getRevenueFrom() {
        return revenueFrom;
    }


    /**
     * Sets the revenueFrom value for this TFind_Input.
     * 
     * @param revenueFrom   * search for customer revenue beginning with this date
     */
    public void setRevenueFrom(java.util.Calendar revenueFrom) {
        this.revenueFrom = revenueFrom;
    }


    /**
     * Gets the revenueTo value for this TFind_Input.
     * 
     * @return revenueTo   * search for customer revenue ending at this date
     */
    public java.util.Calendar getRevenueTo() {
        return revenueTo;
    }


    /**
     * Sets the revenueTo value for this TFind_Input.
     * 
     * @param revenueTo   * search for customer revenue ending at this date
     */
    public void setRevenueTo(java.util.Calendar revenueTo) {
        this.revenueTo = revenueTo;
    }


    /**
     * Gets the product value for this TFind_Input.
     * 
     * @return product   * search customers that bought this product (part of product
     * alias)
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this TFind_Input.
     * 
     * @param product   * search customers that bought this product (part of product
     * alias)
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the productFrom value for this TFind_Input.
     * 
     * @return productFrom   * search customers that bought a product beginning with this
     * date
     */
    public java.util.Calendar getProductFrom() {
        return productFrom;
    }


    /**
     * Sets the productFrom value for this TFind_Input.
     * 
     * @param productFrom   * search customers that bought a product beginning with this
     * date
     */
    public void setProductFrom(java.util.Calendar productFrom) {
        this.productFrom = productFrom;
    }


    /**
     * Gets the productTo value for this TFind_Input.
     * 
     * @return productTo   * search customers that bought a product ending at this date
     */
    public java.util.Calendar getProductTo() {
        return productTo;
    }


    /**
     * Sets the productTo value for this TFind_Input.
     * 
     * @param productTo   * search customers that bought a product ending at this date
     */
    public void setProductTo(java.util.Calendar productTo) {
        this.productTo = productTo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TFind_Input)) return false;
        TFind_Input other = (TFind_Input) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.alias==null && other.getAlias()==null) || 
             (this.alias!=null &&
              this.alias.equals(other.getAlias()))) &&
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin()))) &&
            ((this.EMail==null && other.getEMail()==null) || 
             (this.EMail!=null &&
              this.EMail.equals(other.getEMail()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.zipcode==null && other.getZipcode()==null) || 
             (this.zipcode!=null &&
              this.zipcode.equals(other.getZipcode()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.customerGroup==null && other.getCustomerGroup()==null) || 
             (this.customerGroup!=null &&
              this.customerGroup.equals(other.getCustomerGroup()))) &&
            ((this.lastUpdate==null && other.getLastUpdate()==null) || 
             (this.lastUpdate!=null &&
              this.lastUpdate.equals(other.getLastUpdate()))) &&
            ((this.revenue==null && other.getRevenue()==null) || 
             (this.revenue!=null &&
              this.revenue.equals(other.getRevenue()))) &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.revenueFrom==null && other.getRevenueFrom()==null) || 
             (this.revenueFrom!=null &&
              this.revenueFrom.equals(other.getRevenueFrom()))) &&
            ((this.revenueTo==null && other.getRevenueTo()==null) || 
             (this.revenueTo!=null &&
              this.revenueTo.equals(other.getRevenueTo()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.productFrom==null && other.getProductFrom()==null) || 
             (this.productFrom!=null &&
              this.productFrom.equals(other.getProductFrom()))) &&
            ((this.productTo==null && other.getProductTo()==null) || 
             (this.productTo!=null &&
              this.productTo.equals(other.getProductTo())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        if (getEMail() != null) {
            _hashCode += getEMail().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getZipcode() != null) {
            _hashCode += getZipcode().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCustomerGroup() != null) {
            _hashCode += getCustomerGroup().hashCode();
        }
        if (getLastUpdate() != null) {
            _hashCode += getLastUpdate().hashCode();
        }
        if (getRevenue() != null) {
            _hashCode += getRevenue().hashCode();
        }
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getRevenueFrom() != null) {
            _hashCode += getRevenueFrom().hashCode();
        }
        if (getRevenueTo() != null) {
            _hashCode += getRevenueTo().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getProductFrom() != null) {
            _hashCode += getProductFrom().hashCode();
        }
        if (getProductTo() != null) {
            _hashCode += getProductTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TFind_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/CustomerService/2014/04", "TFind_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Login"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EMail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Zipcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "City"));
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
        elemField.setFieldName("lastUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revenue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Revenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
        elemField.setFieldName("revenueFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RevenueFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revenueTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RevenueTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProductFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProductTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
