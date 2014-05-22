/**
 * TInfoMultiStoreConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.multistoreconfig.stub;


/**
 * shop data to show an existing mastershop
 */
public class TInfoMultiStoreConfig  implements java.io.Serializable {
    /* unique shop name for the provider */
    private java.lang.String alias;

    /* object path of the shop within the store database */
    private java.lang.String objectPath;

    /* true if the shop has mastershop feature. */
    private boolean isMasterShop;

    /* list of aliases of subshops */
    private java.lang.String[] subShops;

    public TInfoMultiStoreConfig() {
    }

    public TInfoMultiStoreConfig(
           java.lang.String alias,
           java.lang.String objectPath,
           boolean isMasterShop,
           java.lang.String[] subShops) {
           this.alias = alias;
           this.objectPath = objectPath;
           this.isMasterShop = isMasterShop;
           this.subShops = subShops;
    }


    /**
     * Gets the alias value for this TInfoMultiStoreConfig.
     * 
     * @return alias   * unique shop name for the provider
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TInfoMultiStoreConfig.
     * 
     * @param alias   * unique shop name for the provider
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the objectPath value for this TInfoMultiStoreConfig.
     * 
     * @return objectPath   * object path of the shop within the store database
     */
    public java.lang.String getObjectPath() {
        return objectPath;
    }


    /**
     * Sets the objectPath value for this TInfoMultiStoreConfig.
     * 
     * @param objectPath   * object path of the shop within the store database
     */
    public void setObjectPath(java.lang.String objectPath) {
        this.objectPath = objectPath;
    }


    /**
     * Gets the isMasterShop value for this TInfoMultiStoreConfig.
     * 
     * @return isMasterShop   * true if the shop has mastershop feature.
     */
    public boolean isIsMasterShop() {
        return isMasterShop;
    }


    /**
     * Sets the isMasterShop value for this TInfoMultiStoreConfig.
     * 
     * @param isMasterShop   * true if the shop has mastershop feature.
     */
    public void setIsMasterShop(boolean isMasterShop) {
        this.isMasterShop = isMasterShop;
    }


    /**
     * Gets the subShops value for this TInfoMultiStoreConfig.
     * 
     * @return subShops   * list of aliases of subshops
     */
    public java.lang.String[] getSubShops() {
        return subShops;
    }


    /**
     * Sets the subShops value for this TInfoMultiStoreConfig.
     * 
     * @param subShops   * list of aliases of subshops
     */
    public void setSubShops(java.lang.String[] subShops) {
        this.subShops = subShops;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TInfoMultiStoreConfig)) return false;
        TInfoMultiStoreConfig other = (TInfoMultiStoreConfig) obj;
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
            ((this.objectPath==null && other.getObjectPath()==null) || 
             (this.objectPath!=null &&
              this.objectPath.equals(other.getObjectPath()))) &&
            this.isMasterShop == other.isIsMasterShop() &&
            ((this.subShops==null && other.getSubShops()==null) || 
             (this.subShops!=null &&
              java.util.Arrays.equals(this.subShops, other.getSubShops())));
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
        if (getObjectPath() != null) {
            _hashCode += getObjectPath().hashCode();
        }
        _hashCode += (isIsMasterShop() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSubShops() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubShops());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubShops(), i);
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
        new org.apache.axis.description.TypeDesc(TInfoMultiStoreConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/MultiStoreConfigService/2011/08", "TInfoMultiStoreConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("isMasterShop");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsMasterShop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subShops");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubShops"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
