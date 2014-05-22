/**
 * TAssignSubShopToMasterShop.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.multistoreconfig.stub;


/**
 * list of aliases of subshops
 */
public class TAssignSubShopToMasterShop  implements java.io.Serializable {
    /* shop name for the mastershop */
    private java.lang.String masterShopAlias;

    /* shop name for the subshop */
    private java.lang.String masterShopAlias2;

    public TAssignSubShopToMasterShop() {
    }

    public TAssignSubShopToMasterShop(
           java.lang.String masterShopAlias,
           java.lang.String masterShopAlias2) {
           this.masterShopAlias = masterShopAlias;
           this.masterShopAlias2 = masterShopAlias2;
    }


    /**
     * Gets the masterShopAlias value for this TAssignSubShopToMasterShop.
     * 
     * @return masterShopAlias   * shop name for the mastershop
     */
    public java.lang.String getMasterShopAlias() {
        return masterShopAlias;
    }


    /**
     * Sets the masterShopAlias value for this TAssignSubShopToMasterShop.
     * 
     * @param masterShopAlias   * shop name for the mastershop
     */
    public void setMasterShopAlias(java.lang.String masterShopAlias) {
        this.masterShopAlias = masterShopAlias;
    }


    /**
     * Gets the masterShopAlias2 value for this TAssignSubShopToMasterShop.
     * 
     * @return masterShopAlias2   * shop name for the subshop
     */
    public java.lang.String getMasterShopAlias2() {
        return masterShopAlias2;
    }


    /**
     * Sets the masterShopAlias2 value for this TAssignSubShopToMasterShop.
     * 
     * @param masterShopAlias2   * shop name for the subshop
     */
    public void setMasterShopAlias2(java.lang.String masterShopAlias2) {
        this.masterShopAlias2 = masterShopAlias2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TAssignSubShopToMasterShop)) return false;
        TAssignSubShopToMasterShop other = (TAssignSubShopToMasterShop) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.masterShopAlias==null && other.getMasterShopAlias()==null) || 
             (this.masterShopAlias!=null &&
              this.masterShopAlias.equals(other.getMasterShopAlias()))) &&
            ((this.masterShopAlias2==null && other.getMasterShopAlias2()==null) || 
             (this.masterShopAlias2!=null &&
              this.masterShopAlias2.equals(other.getMasterShopAlias2())));
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
        if (getMasterShopAlias() != null) {
            _hashCode += getMasterShopAlias().hashCode();
        }
        if (getMasterShopAlias2() != null) {
            _hashCode += getMasterShopAlias2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TAssignSubShopToMasterShop.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/MultiStoreConfigService/2011/08", "TAssignSubShopToMasterShop"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterShopAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MasterShopAlias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterShopAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MasterShopAlias"));
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
