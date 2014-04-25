/**
 * TUpdateShop.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.shopconfig2.stub;


/**
 * shop data to update an existing shop
 */
public class TUpdateShop  implements java.io.Serializable {
    /* unique shop name for the provider */
    private java.lang.String alias;

    /* shop type alias */
    private java.lang.String shopType;

    /* (ignored) */
    private java.lang.String database;

    /* (ignored) */
    private java.lang.String shopAlias;

    /* import file names */
    private java.lang.String[] importFiles;

    /* true if the shop is closed by provider */
    private java.lang.Boolean isClosed;

    /* domain name to access the shop */
    private java.lang.String domainName;

    /* true if the web server has an SSL certificate for the shop
     * (optional) */
    private java.lang.Boolean hasSSLCertificate;

    public TUpdateShop() {
    }

    public TUpdateShop(
           java.lang.String alias,
           java.lang.String shopType,
           java.lang.String database,
           java.lang.String shopAlias,
           java.lang.String[] importFiles,
           java.lang.Boolean isClosed,
           java.lang.String domainName,
           java.lang.Boolean hasSSLCertificate) {
           this.alias = alias;
           this.shopType = shopType;
           this.database = database;
           this.shopAlias = shopAlias;
           this.importFiles = importFiles;
           this.isClosed = isClosed;
           this.domainName = domainName;
           this.hasSSLCertificate = hasSSLCertificate;
    }


    /**
     * Gets the alias value for this TUpdateShop.
     * 
     * @return alias   * unique shop name for the provider
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TUpdateShop.
     * 
     * @param alias   * unique shop name for the provider
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the shopType value for this TUpdateShop.
     * 
     * @return shopType   * shop type alias
     */
    public java.lang.String getShopType() {
        return shopType;
    }


    /**
     * Sets the shopType value for this TUpdateShop.
     * 
     * @param shopType   * shop type alias
     */
    public void setShopType(java.lang.String shopType) {
        this.shopType = shopType;
    }


    /**
     * Gets the database value for this TUpdateShop.
     * 
     * @return database   * (ignored)
     */
    public java.lang.String getDatabase() {
        return database;
    }


    /**
     * Sets the database value for this TUpdateShop.
     * 
     * @param database   * (ignored)
     */
    public void setDatabase(java.lang.String database) {
        this.database = database;
    }


    /**
     * Gets the shopAlias value for this TUpdateShop.
     * 
     * @return shopAlias   * (ignored)
     */
    public java.lang.String getShopAlias() {
        return shopAlias;
    }


    /**
     * Sets the shopAlias value for this TUpdateShop.
     * 
     * @param shopAlias   * (ignored)
     */
    public void setShopAlias(java.lang.String shopAlias) {
        this.shopAlias = shopAlias;
    }


    /**
     * Gets the importFiles value for this TUpdateShop.
     * 
     * @return importFiles   * import file names
     */
    public java.lang.String[] getImportFiles() {
        return importFiles;
    }


    /**
     * Sets the importFiles value for this TUpdateShop.
     * 
     * @param importFiles   * import file names
     */
    public void setImportFiles(java.lang.String[] importFiles) {
        this.importFiles = importFiles;
    }


    /**
     * Gets the isClosed value for this TUpdateShop.
     * 
     * @return isClosed   * true if the shop is closed by provider
     */
    public java.lang.Boolean getIsClosed() {
        return isClosed;
    }


    /**
     * Sets the isClosed value for this TUpdateShop.
     * 
     * @param isClosed   * true if the shop is closed by provider
     */
    public void setIsClosed(java.lang.Boolean isClosed) {
        this.isClosed = isClosed;
    }


    /**
     * Gets the domainName value for this TUpdateShop.
     * 
     * @return domainName   * domain name to access the shop
     */
    public java.lang.String getDomainName() {
        return domainName;
    }


    /**
     * Sets the domainName value for this TUpdateShop.
     * 
     * @param domainName   * domain name to access the shop
     */
    public void setDomainName(java.lang.String domainName) {
        this.domainName = domainName;
    }


    /**
     * Gets the hasSSLCertificate value for this TUpdateShop.
     * 
     * @return hasSSLCertificate   * true if the web server has an SSL certificate for the shop
     * (optional)
     */
    public java.lang.Boolean getHasSSLCertificate() {
        return hasSSLCertificate;
    }


    /**
     * Sets the hasSSLCertificate value for this TUpdateShop.
     * 
     * @param hasSSLCertificate   * true if the web server has an SSL certificate for the shop
     * (optional)
     */
    public void setHasSSLCertificate(java.lang.Boolean hasSSLCertificate) {
        this.hasSSLCertificate = hasSSLCertificate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TUpdateShop)) return false;
        TUpdateShop other = (TUpdateShop) obj;
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
            ((this.shopAlias==null && other.getShopAlias()==null) || 
             (this.shopAlias!=null &&
              this.shopAlias.equals(other.getShopAlias()))) &&
            ((this.importFiles==null && other.getImportFiles()==null) || 
             (this.importFiles!=null &&
              java.util.Arrays.equals(this.importFiles, other.getImportFiles()))) &&
            ((this.isClosed==null && other.getIsClosed()==null) || 
             (this.isClosed!=null &&
              this.isClosed.equals(other.getIsClosed()))) &&
            ((this.domainName==null && other.getDomainName()==null) || 
             (this.domainName!=null &&
              this.domainName.equals(other.getDomainName()))) &&
            ((this.hasSSLCertificate==null && other.getHasSSLCertificate()==null) || 
             (this.hasSSLCertificate!=null &&
              this.hasSSLCertificate.equals(other.getHasSSLCertificate())));
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
        if (getShopAlias() != null) {
            _hashCode += getShopAlias().hashCode();
        }
        if (getImportFiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImportFiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImportFiles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsClosed() != null) {
            _hashCode += getIsClosed().hashCode();
        }
        if (getDomainName() != null) {
            _hashCode += getDomainName().hashCode();
        }
        if (getHasSSLCertificate() != null) {
            _hashCode += getHasSSLCertificate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TUpdateShop.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ShopConfigService/2005/11", "TUpdateShop"));
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
        elemField.setFieldName("shopAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ShopAlias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ImportFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
