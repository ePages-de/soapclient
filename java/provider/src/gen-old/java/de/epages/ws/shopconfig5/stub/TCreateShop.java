/**
 * TCreateShop.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.shopconfig5.stub;


/**
 * shop data required to create a new shop
 */
public class TCreateShop  implements java.io.Serializable {
    /* unique shop name for the provider */
    private java.lang.String alias;

    /* shop type alias */
    private java.lang.String shopType;

    /* store database identifier. If the database is
     *                 not specified, then the shop is created in the default
     * database
     *                 of the provider. */
    private java.lang.String database;

    /* unique shop name for the database */
    private java.lang.String shopAlias;

    /* import file names for shop data, example products etc..
     *                 If this parameter is missing or an emptay array, then
     * the import file
     *                 for the shop type (selected in PBO) is used. The files
     * must be accessible
     *                 by the application server. (optional) */
    private java.lang.String[] importFiles;

    /* set to true to keep the new shop closed by provider; defaults
     * to false */
    private java.lang.Boolean isClosed;

    /* true if the shop is in trial period */
    private java.lang.Boolean isTrialShop;

    /* true if the shop is used for test or support purposes */
    private java.lang.Boolean isInternalTestShop;

    /* domain name to access the shop (optional) */
    private java.lang.String domainName;

    /* true if an SSL certificate is installed for DomainName */
    private java.lang.Boolean hasSSLCertificate;

    /* script name part that identifies the shop */
    private java.lang.String webServerScriptNamePart;

    /* directory on the application server where image files
     *                 for the new shop are located. These files are copied
     * to the public shop
     *                 directory. (optional) */
    private java.lang.String publicFilesDir;

    public TCreateShop() {
    }

    public TCreateShop(
           java.lang.String alias,
           java.lang.String shopType,
           java.lang.String database,
           java.lang.String shopAlias,
           java.lang.String[] importFiles,
           java.lang.Boolean isClosed,
           java.lang.Boolean isTrialShop,
           java.lang.Boolean isInternalTestShop,
           java.lang.String domainName,
           java.lang.Boolean hasSSLCertificate,
           java.lang.String webServerScriptNamePart,
           java.lang.String publicFilesDir) {
           this.alias = alias;
           this.shopType = shopType;
           this.database = database;
           this.shopAlias = shopAlias;
           this.importFiles = importFiles;
           this.isClosed = isClosed;
           this.isTrialShop = isTrialShop;
           this.isInternalTestShop = isInternalTestShop;
           this.domainName = domainName;
           this.hasSSLCertificate = hasSSLCertificate;
           this.webServerScriptNamePart = webServerScriptNamePart;
           this.publicFilesDir = publicFilesDir;
    }


    /**
     * Gets the alias value for this TCreateShop.
     * 
     * @return alias   * unique shop name for the provider
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TCreateShop.
     * 
     * @param alias   * unique shop name for the provider
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
     * Gets the database value for this TCreateShop.
     * 
     * @return database   * store database identifier. If the database is
     *                 not specified, then the shop is created in the default
     * database
     *                 of the provider.
     */
    public java.lang.String getDatabase() {
        return database;
    }


    /**
     * Sets the database value for this TCreateShop.
     * 
     * @param database   * store database identifier. If the database is
     *                 not specified, then the shop is created in the default
     * database
     *                 of the provider.
     */
    public void setDatabase(java.lang.String database) {
        this.database = database;
    }


    /**
     * Gets the shopAlias value for this TCreateShop.
     * 
     * @return shopAlias   * unique shop name for the database
     */
    public java.lang.String getShopAlias() {
        return shopAlias;
    }


    /**
     * Sets the shopAlias value for this TCreateShop.
     * 
     * @param shopAlias   * unique shop name for the database
     */
    public void setShopAlias(java.lang.String shopAlias) {
        this.shopAlias = shopAlias;
    }


    /**
     * Gets the importFiles value for this TCreateShop.
     * 
     * @return importFiles   * import file names for shop data, example products etc..
     *                 If this parameter is missing or an emptay array, then
     * the import file
     *                 for the shop type (selected in PBO) is used. The files
     * must be accessible
     *                 by the application server. (optional)
     */
    public java.lang.String[] getImportFiles() {
        return importFiles;
    }


    /**
     * Sets the importFiles value for this TCreateShop.
     * 
     * @param importFiles   * import file names for shop data, example products etc..
     *                 If this parameter is missing or an emptay array, then
     * the import file
     *                 for the shop type (selected in PBO) is used. The files
     * must be accessible
     *                 by the application server. (optional)
     */
    public void setImportFiles(java.lang.String[] importFiles) {
        this.importFiles = importFiles;
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
     * @return domainName   * domain name to access the shop (optional)
     */
    public java.lang.String getDomainName() {
        return domainName;
    }


    /**
     * Sets the domainName value for this TCreateShop.
     * 
     * @param domainName   * domain name to access the shop (optional)
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
     * Gets the webServerScriptNamePart value for this TCreateShop.
     * 
     * @return webServerScriptNamePart   * script name part that identifies the shop
     */
    public java.lang.String getWebServerScriptNamePart() {
        return webServerScriptNamePart;
    }


    /**
     * Sets the webServerScriptNamePart value for this TCreateShop.
     * 
     * @param webServerScriptNamePart   * script name part that identifies the shop
     */
    public void setWebServerScriptNamePart(java.lang.String webServerScriptNamePart) {
        this.webServerScriptNamePart = webServerScriptNamePart;
    }


    /**
     * Gets the publicFilesDir value for this TCreateShop.
     * 
     * @return publicFilesDir   * directory on the application server where image files
     *                 for the new shop are located. These files are copied
     * to the public shop
     *                 directory. (optional)
     */
    public java.lang.String getPublicFilesDir() {
        return publicFilesDir;
    }


    /**
     * Sets the publicFilesDir value for this TCreateShop.
     * 
     * @param publicFilesDir   * directory on the application server where image files
     *                 for the new shop are located. These files are copied
     * to the public shop
     *                 directory. (optional)
     */
    public void setPublicFilesDir(java.lang.String publicFilesDir) {
        this.publicFilesDir = publicFilesDir;
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
            ((this.webServerScriptNamePart==null && other.getWebServerScriptNamePart()==null) || 
             (this.webServerScriptNamePart!=null &&
              this.webServerScriptNamePart.equals(other.getWebServerScriptNamePart()))) &&
            ((this.publicFilesDir==null && other.getPublicFilesDir()==null) || 
             (this.publicFilesDir!=null &&
              this.publicFilesDir.equals(other.getPublicFilesDir())));
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
        if (getWebServerScriptNamePart() != null) {
            _hashCode += getWebServerScriptNamePart().hashCode();
        }
        if (getPublicFilesDir() != null) {
            _hashCode += getPublicFilesDir().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCreateShop.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ShopConfigService/2009/04", "TCreateShop"));
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
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ShopAlias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("webServerScriptNamePart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WebServerScriptNamePart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicFilesDir");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PublicFilesDir"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
