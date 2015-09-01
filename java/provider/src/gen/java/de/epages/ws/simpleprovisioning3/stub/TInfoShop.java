/**
 * TInfoShop.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */


package de.epages.ws.simpleprovisioning3.stub;

/**
 * shop data output by getInfo operation
 */
public class TInfoShop  implements java.io.Serializable {
    /* unique shop identifier */
    private java.lang.String alias;

    /* shop type alias */
    private java.lang.String shopType;

    /* store database identifier */
    private java.lang.String database;

    /* true if the shop is closed by provider */
    private boolean isClosed;

    /* true if the shop is deleted in the store database */
    private boolean isDeleted;

    /* true if the shop is in trial period */
    private boolean isTrialShop;

    /* true if the shop is used for test or support purposes */
    private boolean isInternalTestShop;

    /* domain name to access the shop */
    private java.lang.String domainName;

    /* true if the web server has an SSL certificate for the shop */
    private boolean hasSSLCertificate;

    /* merchant login name */
    private java.lang.String merchantLogin;

    /* merchant email address */
    private java.lang.String merchantEMail;

    /* date of last merchant login */
    private java.util.Calendar lastMerchantLoginDate;

    /* shop is marked for deletion */
    private boolean isMarkedForDel;

    /* URL of the shop */
    private java.lang.String storefrontURL;

    /* URL of the back-office of the shop */
    private java.lang.String backofficeURL;

    /* list of additional attributes (see epagestypes:ListOfAttributes) */
    private de.epages.ws.common.model.TAttribute[] additionalAttributes;

    public TInfoShop() {
    }

    public TInfoShop(
           java.lang.String alias,
           java.lang.String shopType,
           java.lang.String database,
           boolean isClosed,
           boolean isDeleted,
           boolean isTrialShop,
           boolean isInternalTestShop,
           java.lang.String domainName,
           boolean hasSSLCertificate,
           java.lang.String merchantLogin,
           java.lang.String merchantEMail,
           java.util.Calendar lastMerchantLoginDate,
           boolean isMarkedForDel,
           java.lang.String storefrontURL,
           java.lang.String backofficeURL,
           de.epages.ws.common.model.TAttribute[] additionalAttributes) {
           this.alias = alias;
           this.shopType = shopType;
           this.database = database;
           this.isClosed = isClosed;
           this.isDeleted = isDeleted;
           this.isTrialShop = isTrialShop;
           this.isInternalTestShop = isInternalTestShop;
           this.domainName = domainName;
           this.hasSSLCertificate = hasSSLCertificate;
           this.merchantLogin = merchantLogin;
           this.merchantEMail = merchantEMail;
           this.lastMerchantLoginDate = lastMerchantLoginDate;
           this.isMarkedForDel = isMarkedForDel;
           this.storefrontURL = storefrontURL;
           this.backofficeURL = backofficeURL;
           this.additionalAttributes = additionalAttributes;
    }


    /**
     * Gets the alias value for this TInfoShop.
     *
     * @return alias   * unique shop identifier
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TInfoShop.
     *
     * @param alias   * unique shop identifier
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the shopType value for this TInfoShop.
     *
     * @return shopType   * shop type alias
     */
    public java.lang.String getShopType() {
        return shopType;
    }


    /**
     * Sets the shopType value for this TInfoShop.
     *
     * @param shopType   * shop type alias
     */
    public void setShopType(java.lang.String shopType) {
        this.shopType = shopType;
    }


    /**
     * Gets the database value for this TInfoShop.
     *
     * @return database   * store database identifier
     */
    public java.lang.String getDatabase() {
        return database;
    }


    /**
     * Sets the database value for this TInfoShop.
     *
     * @param database   * store database identifier
     */
    public void setDatabase(java.lang.String database) {
        this.database = database;
    }


    /**
     * Gets the isClosed value for this TInfoShop.
     *
     * @return isClosed   * true if the shop is closed by provider
     */
    public boolean isIsClosed() {
        return isClosed;
    }


    /**
     * Sets the isClosed value for this TInfoShop.
     *
     * @param isClosed   * true if the shop is closed by provider
     */
    public void setIsClosed(boolean isClosed) {
        this.isClosed = isClosed;
    }


    /**
     * Gets the isDeleted value for this TInfoShop.
     *
     * @return isDeleted   * true if the shop is deleted in the store database
     */
    public boolean isIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this TInfoShop.
     *
     * @param isDeleted   * true if the shop is deleted in the store database
     */
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isTrialShop value for this TInfoShop.
     *
     * @return isTrialShop   * true if the shop is in trial period
     */
    public boolean isIsTrialShop() {
        return isTrialShop;
    }


    /**
     * Sets the isTrialShop value for this TInfoShop.
     *
     * @param isTrialShop   * true if the shop is in trial period
     */
    public void setIsTrialShop(boolean isTrialShop) {
        this.isTrialShop = isTrialShop;
    }


    /**
     * Gets the isInternalTestShop value for this TInfoShop.
     *
     * @return isInternalTestShop   * true if the shop is used for test or support purposes
     */
    public boolean isIsInternalTestShop() {
        return isInternalTestShop;
    }


    /**
     * Sets the isInternalTestShop value for this TInfoShop.
     *
     * @param isInternalTestShop   * true if the shop is used for test or support purposes
     */
    public void setIsInternalTestShop(boolean isInternalTestShop) {
        this.isInternalTestShop = isInternalTestShop;
    }


    /**
     * Gets the domainName value for this TInfoShop.
     *
     * @return domainName   * domain name to access the shop
     */
    public java.lang.String getDomainName() {
        return domainName;
    }


    /**
     * Sets the domainName value for this TInfoShop.
     *
     * @param domainName   * domain name to access the shop
     */
    public void setDomainName(java.lang.String domainName) {
        this.domainName = domainName;
    }


    /**
     * Gets the hasSSLCertificate value for this TInfoShop.
     *
     * @return hasSSLCertificate   * true if the web server has an SSL certificate for the shop
     */
    public boolean isHasSSLCertificate() {
        return hasSSLCertificate;
    }


    /**
     * Sets the hasSSLCertificate value for this TInfoShop.
     *
     * @param hasSSLCertificate   * true if the web server has an SSL certificate for the shop
     */
    public void setHasSSLCertificate(boolean hasSSLCertificate) {
        this.hasSSLCertificate = hasSSLCertificate;
    }


    /**
     * Gets the merchantLogin value for this TInfoShop.
     *
     * @return merchantLogin   * merchant login name
     */
    public java.lang.String getMerchantLogin() {
        return merchantLogin;
    }


    /**
     * Sets the merchantLogin value for this TInfoShop.
     *
     * @param merchantLogin   * merchant login name
     */
    public void setMerchantLogin(java.lang.String merchantLogin) {
        this.merchantLogin = merchantLogin;
    }


    /**
     * Gets the merchantEMail value for this TInfoShop.
     *
     * @return merchantEMail   * merchant email address
     */
    public java.lang.String getMerchantEMail() {
        return merchantEMail;
    }


    /**
     * Sets the merchantEMail value for this TInfoShop.
     *
     * @param merchantEMail   * merchant email address
     */
    public void setMerchantEMail(java.lang.String merchantEMail) {
        this.merchantEMail = merchantEMail;
    }


    /**
     * Gets the lastMerchantLoginDate value for this TInfoShop.
     *
     * @return lastMerchantLoginDate   * date of last merchant login
     */
    public java.util.Calendar getLastMerchantLoginDate() {
        return lastMerchantLoginDate;
    }


    /**
     * Sets the lastMerchantLoginDate value for this TInfoShop.
     *
     * @param lastMerchantLoginDate   * date of last merchant login
     */
    public void setLastMerchantLoginDate(java.util.Calendar lastMerchantLoginDate) {
        this.lastMerchantLoginDate = lastMerchantLoginDate;
    }


    /**
     * Gets the isMarkedForDel value for this TInfoShop.
     *
     * @return isMarkedForDel   * shop is marked for deletion
     */
    public boolean isIsMarkedForDel() {
        return isMarkedForDel;
    }


    /**
     * Sets the isMarkedForDel value for this TInfoShop.
     *
     * @param isMarkedForDel   * shop is marked for deletion
     */
    public void setIsMarkedForDel(boolean isMarkedForDel) {
        this.isMarkedForDel = isMarkedForDel;
    }


    /**
     * Gets the storefrontURL value for this TInfoShop.
     *
     * @return storefrontURL   * URL of the shop
     */
    public java.lang.String getStorefrontURL() {
        return storefrontURL;
    }


    /**
     * Sets the storefrontURL value for this TInfoShop.
     *
     * @param storefrontURL   * URL of the shop
     */
    public void setStorefrontURL(java.lang.String storefrontURL) {
        this.storefrontURL = storefrontURL;
    }


    /**
     * Gets the backofficeURL value for this TInfoShop.
     *
     * @return backofficeURL   * URL of the back-office of the shop
     */
    public java.lang.String getBackofficeURL() {
        return backofficeURL;
    }


    /**
     * Sets the backofficeURL value for this TInfoShop.
     *
     * @param backofficeURL   * URL of the back-office of the shop
     */
    public void setBackofficeURL(java.lang.String backofficeURL) {
        this.backofficeURL = backofficeURL;
    }


    /**
     * Gets the additionalAttributes value for this TInfoShop.
     *
     * @return additionalAttributes   * list of additional attributes (see epagestypes:ListOfAttributes)
     */
    public de.epages.ws.common.model.TAttribute[] getAdditionalAttributes() {
        return additionalAttributes;
    }


    /**
     * Sets the additionalAttributes value for this TInfoShop.
     *
     * @param additionalAttributes   * list of additional attributes (see epagestypes:ListOfAttributes)
     */
    public void setAdditionalAttributes(de.epages.ws.common.model.TAttribute[] additionalAttributes) {
        this.additionalAttributes = additionalAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TInfoShop)) return false;
        TInfoShop other = (TInfoShop) obj;
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
            ((this.shopType==null && other.getShopType()==null) ||
             (this.shopType!=null &&
              this.shopType.equals(other.getShopType()))) &&
            ((this.database==null && other.getDatabase()==null) ||
             (this.database!=null &&
              this.database.equals(other.getDatabase()))) &&
            this.isClosed == other.isIsClosed() &&
            this.isDeleted == other.isIsDeleted() &&
            this.isTrialShop == other.isIsTrialShop() &&
            this.isInternalTestShop == other.isIsInternalTestShop() &&
            ((this.domainName==null && other.getDomainName()==null) ||
             (this.domainName!=null &&
              this.domainName.equals(other.getDomainName()))) &&
            this.hasSSLCertificate == other.isHasSSLCertificate() &&
            ((this.merchantLogin==null && other.getMerchantLogin()==null) ||
             (this.merchantLogin!=null &&
              this.merchantLogin.equals(other.getMerchantLogin()))) &&
            ((this.merchantEMail==null && other.getMerchantEMail()==null) ||
             (this.merchantEMail!=null &&
              this.merchantEMail.equals(other.getMerchantEMail()))) &&
            ((this.lastMerchantLoginDate==null && other.getLastMerchantLoginDate()==null) ||
             (this.lastMerchantLoginDate!=null &&
              this.lastMerchantLoginDate.equals(other.getLastMerchantLoginDate()))) &&
            this.isMarkedForDel == other.isIsMarkedForDel() &&
            ((this.storefrontURL==null && other.getStorefrontURL()==null) ||
             (this.storefrontURL!=null &&
              this.storefrontURL.equals(other.getStorefrontURL()))) &&
            ((this.backofficeURL==null && other.getBackofficeURL()==null) ||
             (this.backofficeURL!=null &&
              this.backofficeURL.equals(other.getBackofficeURL()))) &&
            ((this.additionalAttributes==null && other.getAdditionalAttributes()==null) ||
             (this.additionalAttributes!=null &&
              java.util.Arrays.equals(this.additionalAttributes, other.getAdditionalAttributes())));
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
        if (getShopType() != null) {
            _hashCode += getShopType().hashCode();
        }
        if (getDatabase() != null) {
            _hashCode += getDatabase().hashCode();
        }
        _hashCode += (isIsClosed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsDeleted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsTrialShop() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsInternalTestShop() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDomainName() != null) {
            _hashCode += getDomainName().hashCode();
        }
        _hashCode += (isHasSSLCertificate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMerchantLogin() != null) {
            _hashCode += getMerchantLogin().hashCode();
        }
        if (getMerchantEMail() != null) {
            _hashCode += getMerchantEMail().hashCode();
        }
        if (getLastMerchantLoginDate() != null) {
            _hashCode += getLastMerchantLoginDate().hashCode();
        }
        _hashCode += (isIsMarkedForDel() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStorefrontURL() != null) {
            _hashCode += getStorefrontURL().hashCode();
        }
        if (getBackofficeURL() != null) {
            _hashCode += getBackofficeURL().hashCode();
        }
        if (getAdditionalAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalAttributes(), i);
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
        new org.apache.axis.description.TypeDesc(TInfoShop.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/SimpleProvisioningService/2014/11", "TInfoShop"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ShopType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("database");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Database"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsClosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDeleted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsDeleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTrialShop");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsTrialShop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInternalTestShop");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsInternalTestShop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DomainName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasSSLCertificate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HasSSLCertificate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MerchantLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantEMail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MerchantEMail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastMerchantLoginDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastMerchantLoginDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMarkedForDel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsMarkedForDel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storefrontURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StorefrontURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backofficeURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BackofficeURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AdditionalAttributes"));
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
