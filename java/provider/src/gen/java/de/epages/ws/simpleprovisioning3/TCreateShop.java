/**
 * TCreateShop.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */


/**
 * shop data required to create a new shop
 */
public class TCreateShop  implements java.io.Serializable {
    /* unique shop identifier */
    private java.lang.String alias;

    /* shop type alias */
    private java.lang.String shopType;

    /* set to true to keep the new shop closed by provider; defaults
     * to false */
    private java.lang.Boolean isClosed;

    /* true if the shop is in trial period */
    private java.lang.Boolean isTrialShop;

    /* true if the shop is used for test or support purposes */
    private java.lang.Boolean isInternalTestShop;

    /* domain name to access the shop */
    private java.lang.String domainName;

    /* true if an SSL certificate is installed for DomainName */
    private java.lang.Boolean hasSSLCertificate;

    /* merchant login name */
    private java.lang.String merchantLogin;

    /* merchant password in clear text */
    private java.lang.String merchantPassword;

    /* merchant email address */
    private java.lang.String merchantEMail;

    /* list of additional attributes (see epagestypes:ListOfAttributes) */
    private de.epages.ws.common.model.TAttribute[] additionalAttributes;

    public TCreateShop() {
    }

    public TCreateShop(
           java.lang.String alias,
           java.lang.String shopType,
           java.lang.Boolean isClosed,
           java.lang.Boolean isTrialShop,
           java.lang.Boolean isInternalTestShop,
           java.lang.String domainName,
           java.lang.Boolean hasSSLCertificate,
           java.lang.String merchantLogin,
           java.lang.String merchantPassword,
           java.lang.String merchantEMail,
           de.epages.ws.common.model.TAttribute[] additionalAttributes) {
           this.alias = alias;
           this.shopType = shopType;
           this.isClosed = isClosed;
           this.isTrialShop = isTrialShop;
           this.isInternalTestShop = isInternalTestShop;
           this.domainName = domainName;
           this.hasSSLCertificate = hasSSLCertificate;
           this.merchantLogin = merchantLogin;
           this.merchantPassword = merchantPassword;
           this.merchantEMail = merchantEMail;
           this.additionalAttributes = additionalAttributes;
    }


    /**
     * Gets the alias value for this TCreateShop.
     * 
     * @return alias   * unique shop identifier
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TCreateShop.
     * 
     * @param alias   * unique shop identifier
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the shopType value for this TCreateShop.
     * 
     * @return shopType   * shop type alias
     */
    public java.lang.String getShopType() {
        return shopType;
    }


    /**
     * Sets the shopType value for this TCreateShop.
     * 
     * @param shopType   * shop type alias
     */
    public void setShopType(java.lang.String shopType) {
        this.shopType = shopType;
    }


    /**
     * Gets the isClosed value for this TCreateShop.
     * 
     * @return isClosed   * set to true to keep the new shop closed by provider; defaults
     * to false
     */
    public java.lang.Boolean getIsClosed() {
        return isClosed;
    }


    /**
     * Sets the isClosed value for this TCreateShop.
     * 
     * @param isClosed   * set to true to keep the new shop closed by provider; defaults
     * to false
     */
    public void setIsClosed(java.lang.Boolean isClosed) {
        this.isClosed = isClosed;
    }


    /**
     * Gets the isTrialShop value for this TCreateShop.
     * 
     * @return isTrialShop   * true if the shop is in trial period
     */
    public java.lang.Boolean getIsTrialShop() {
        return isTrialShop;
    }


    /**
     * Sets the isTrialShop value for this TCreateShop.
     * 
     * @param isTrialShop   * true if the shop is in trial period
     */
    public void setIsTrialShop(java.lang.Boolean isTrialShop) {
        this.isTrialShop = isTrialShop;
    }


    /**
     * Gets the isInternalTestShop value for this TCreateShop.
     * 
     * @return isInternalTestShop   * true if the shop is used for test or support purposes
     */
    public java.lang.Boolean getIsInternalTestShop() {
        return isInternalTestShop;
    }


    /**
     * Sets the isInternalTestShop value for this TCreateShop.
     * 
     * @param isInternalTestShop   * true if the shop is used for test or support purposes
     */
    public void setIsInternalTestShop(java.lang.Boolean isInternalTestShop) {
        this.isInternalTestShop = isInternalTestShop;
    }


    /**
     * Gets the domainName value for this TCreateShop.
     * 
     * @return domainName   * domain name to access the shop
     */
    public java.lang.String getDomainName() {
        return domainName;
    }


    /**
     * Sets the domainName value for this TCreateShop.
     * 
     * @param domainName   * domain name to access the shop
     */
    public void setDomainName(java.lang.String domainName) {
        this.domainName = domainName;
    }


    /**
     * Gets the hasSSLCertificate value for this TCreateShop.
     * 
     * @return hasSSLCertificate   * true if an SSL certificate is installed for DomainName
     */
    public java.lang.Boolean getHasSSLCertificate() {
        return hasSSLCertificate;
    }


    /**
     * Sets the hasSSLCertificate value for this TCreateShop.
     * 
     * @param hasSSLCertificate   * true if an SSL certificate is installed for DomainName
     */
    public void setHasSSLCertificate(java.lang.Boolean hasSSLCertificate) {
        this.hasSSLCertificate = hasSSLCertificate;
    }


    /**
     * Gets the merchantLogin value for this TCreateShop.
     * 
     * @return merchantLogin   * merchant login name
     */
    public java.lang.String getMerchantLogin() {
        return merchantLogin;
    }


    /**
     * Sets the merchantLogin value for this TCreateShop.
     * 
     * @param merchantLogin   * merchant login name
     */
    public void setMerchantLogin(java.lang.String merchantLogin) {
        this.merchantLogin = merchantLogin;
    }


    /**
     * Gets the merchantPassword value for this TCreateShop.
     * 
     * @return merchantPassword   * merchant password in clear text
     */
    public java.lang.String getMerchantPassword() {
        return merchantPassword;
    }


    /**
     * Sets the merchantPassword value for this TCreateShop.
     * 
     * @param merchantPassword   * merchant password in clear text
     */
    public void setMerchantPassword(java.lang.String merchantPassword) {
        this.merchantPassword = merchantPassword;
    }


    /**
     * Gets the merchantEMail value for this TCreateShop.
     * 
     * @return merchantEMail   * merchant email address
     */
    public java.lang.String getMerchantEMail() {
        return merchantEMail;
    }


    /**
     * Sets the merchantEMail value for this TCreateShop.
     * 
     * @param merchantEMail   * merchant email address
     */
    public void setMerchantEMail(java.lang.String merchantEMail) {
        this.merchantEMail = merchantEMail;
    }


    /**
     * Gets the additionalAttributes value for this TCreateShop.
     * 
     * @return additionalAttributes   * list of additional attributes (see epagestypes:ListOfAttributes)
     */
    public de.epages.ws.common.model.TAttribute[] getAdditionalAttributes() {
        return additionalAttributes;
    }


    /**
     * Sets the additionalAttributes value for this TCreateShop.
     * 
     * @param additionalAttributes   * list of additional attributes (see epagestypes:ListOfAttributes)
     */
    public void setAdditionalAttributes(de.epages.ws.common.model.TAttribute[] additionalAttributes) {
        this.additionalAttributes = additionalAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCreateShop)) return false;
        TCreateShop other = (TCreateShop) obj;
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
            ((this.isClosed==null && other.getIsClosed()==null) || 
             (this.isClosed!=null &&
              this.isClosed.equals(other.getIsClosed()))) &&
            ((this.isTrialShop==null && other.getIsTrialShop()==null) || 
             (this.isTrialShop!=null &&
              this.isTrialShop.equals(other.getIsTrialShop()))) &&
            ((this.isInternalTestShop==null && other.getIsInternalTestShop()==null) || 
             (this.isInternalTestShop!=null &&
              this.isInternalTestShop.equals(other.getIsInternalTestShop()))) &&
            ((this.domainName==null && other.getDomainName()==null) || 
             (this.domainName!=null &&
              this.domainName.equals(other.getDomainName()))) &&
            ((this.hasSSLCertificate==null && other.getHasSSLCertificate()==null) || 
             (this.hasSSLCertificate!=null &&
              this.hasSSLCertificate.equals(other.getHasSSLCertificate()))) &&
            ((this.merchantLogin==null && other.getMerchantLogin()==null) || 
             (this.merchantLogin!=null &&
              this.merchantLogin.equals(other.getMerchantLogin()))) &&
            ((this.merchantPassword==null && other.getMerchantPassword()==null) || 
             (this.merchantPassword!=null &&
              this.merchantPassword.equals(other.getMerchantPassword()))) &&
            ((this.merchantEMail==null && other.getMerchantEMail()==null) || 
             (this.merchantEMail!=null &&
              this.merchantEMail.equals(other.getMerchantEMail()))) &&
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
        if (getIsClosed() != null) {
            _hashCode += getIsClosed().hashCode();
        }
        if (getIsTrialShop() != null) {
            _hashCode += getIsTrialShop().hashCode();
        }
        if (getIsInternalTestShop() != null) {
            _hashCode += getIsInternalTestShop().hashCode();
        }
        if (getDomainName() != null) {
            _hashCode += getDomainName().hashCode();
        }
        if (getHasSSLCertificate() != null) {
            _hashCode += getHasSSLCertificate().hashCode();
        }
        if (getMerchantLogin() != null) {
            _hashCode += getMerchantLogin().hashCode();
        }
        if (getMerchantPassword() != null) {
            _hashCode += getMerchantPassword().hashCode();
        }
        if (getMerchantEMail() != null) {
            _hashCode += getMerchantEMail().hashCode();
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
        new org.apache.axis.description.TypeDesc(TCreateShop.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/SimpleProvisioningService/2014/11", "TCreateShop"));
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
        elemField.setFieldName("isClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsClosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTrialShop");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsTrialShop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInternalTestShop");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsInternalTestShop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DomainName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasSSLCertificate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HasSSLCertificate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MerchantLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MerchantPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantEMail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MerchantEMail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
