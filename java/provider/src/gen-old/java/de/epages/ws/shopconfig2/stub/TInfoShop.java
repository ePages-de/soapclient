/**
 * TInfoShop.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.shopconfig2.stub;


/**
 * shop data to update an existing shop
 */
public class TInfoShop  implements java.io.Serializable {
    /* unique shop name for the provider */
    private java.lang.String alias;

    /* shop type alias */
    private java.lang.String shopType;

    /* store database identifier */
    private java.lang.String database;

    /* provider of shop */
    private java.lang.String provider;

    /* object path of the shop within the store database */
    private java.lang.String objectPath;

    /* true if the shop is closed by provider */
    private boolean isClosed;

    /* true if the shop is deleted in the store database */
    private boolean isDeleted;

    /* domain name to access the shop */
    private java.lang.String domainName;

    /* true if the web server has an SSL certificate for the shop */
    private boolean hasSSLCertificate;

    public TInfoShop() {
    }

    public TInfoShop(
           java.lang.String alias,
           java.lang.String shopType,
           java.lang.String database,
           java.lang.String provider,
           java.lang.String objectPath,
           boolean isClosed,
           boolean isDeleted,
           java.lang.String domainName,
           boolean hasSSLCertificate) {
           this.alias = alias;
           this.shopType = shopType;
           this.database = database;
           this.provider = provider;
           this.objectPath = objectPath;
           this.isClosed = isClosed;
           this.isDeleted = isDeleted;
           this.domainName = domainName;
           this.hasSSLCertificate = hasSSLCertificate;
    }


    /**
     * Gets the alias value for this TInfoShop.
     * 
     * @return alias   * unique shop name for the provider
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TInfoShop.
     * 
     * @param alias   * unique shop name for the provider
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
     * Gets the provider value for this TInfoShop.
     * 
     * @return provider   * provider of shop
     */
    public java.lang.String getProvider() {
        return provider;
    }


    /**
     * Sets the provider value for this TInfoShop.
     * 
     * @param provider   * provider of shop
     */
    public void setProvider(java.lang.String provider) {
        this.provider = provider;
    }


    /**
     * Gets the objectPath value for this TInfoShop.
     * 
     * @return objectPath   * object path of the shop within the store database
     */
    public java.lang.String getObjectPath() {
        return objectPath;
    }


    /**
     * Sets the objectPath value for this TInfoShop.
     * 
     * @param objectPath   * object path of the shop within the store database
     */
    public void setObjectPath(java.lang.String objectPath) {
        this.objectPath = objectPath;
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
            ((this.provider==null && other.getProvider()==null) || 
             (this.provider!=null &&
              this.provider.equals(other.getProvider()))) &&
            ((this.objectPath==null && other.getObjectPath()==null) || 
             (this.objectPath!=null &&
              this.objectPath.equals(other.getObjectPath()))) &&
            this.isClosed == other.isIsClosed() &&
            this.isDeleted == other.isIsDeleted() &&
            ((this.domainName==null && other.getDomainName()==null) || 
             (this.domainName!=null &&
              this.domainName.equals(other.getDomainName()))) &&
            this.hasSSLCertificate == other.isHasSSLCertificate();
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
        if (getProvider() != null) {
            _hashCode += getProvider().hashCode();
        }
        if (getObjectPath() != null) {
            _hashCode += getObjectPath().hashCode();
        }
        _hashCode += (isIsClosed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsDeleted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDomainName() != null) {
            _hashCode += getDomainName().hashCode();
        }
        _hashCode += (isHasSSLCertificate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TInfoShop.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ShopConfigService/2005/11", "TInfoShop"));
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
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("database");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Database"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provider");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Provider"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectPath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ObjectPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
