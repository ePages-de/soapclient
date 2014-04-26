/**
 * Type_GetCount_In.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.shopcount.stub;


/**
 * specifies the conditions for shops to be counted
 */
public class Type_GetCount_In  implements java.io.Serializable {
    /* shop type alias */
    private java.lang.String shopType;

    /* store database identifier */
    private java.lang.String database;

    /* 0 - do not count closed shops; 1 - count only closed shops;
     * else - count both */
    private java.lang.Integer isClosed;

    /* 0 - do not count shops in trial period; 1 - count only shops
     * in trial period; else - count both */
    private java.lang.Integer isTrialShop;

    /* 0 - do not count internal test shops; 1 - count only internal
     * test shops; else - count both */
    private java.lang.Integer isInternalTestShop;

    /* 0 - do not count pre-created shops; 1 - count only pre-created
     * shops; 2 - count both */
    private java.lang.Integer isPreCreated;

    /* 0 - do not count deleted shops; 1 - count only deleted shops;
     * 2 - count both */
    private java.lang.Integer isDeleted;

    public Type_GetCount_In() {
    }

    public Type_GetCount_In(
           java.lang.String shopType,
           java.lang.String database,
           java.lang.Integer isClosed,
           java.lang.Integer isTrialShop,
           java.lang.Integer isInternalTestShop,
           java.lang.Integer isPreCreated,
           java.lang.Integer isDeleted) {
           this.shopType = shopType;
           this.database = database;
           this.isClosed = isClosed;
           this.isTrialShop = isTrialShop;
           this.isInternalTestShop = isInternalTestShop;
           this.isPreCreated = isPreCreated;
           this.isDeleted = isDeleted;
    }


    /**
     * Gets the shopType value for this Type_GetCount_In.
     * 
     * @return shopType   * shop type alias
     */
    public java.lang.String getShopType() {
        return shopType;
    }


    /**
     * Sets the shopType value for this Type_GetCount_In.
     * 
     * @param shopType   * shop type alias
     */
    public void setShopType(java.lang.String shopType) {
        this.shopType = shopType;
    }


    /**
     * Gets the database value for this Type_GetCount_In.
     * 
     * @return database   * store database identifier
     */
    public java.lang.String getDatabase() {
        return database;
    }


    /**
     * Sets the database value for this Type_GetCount_In.
     * 
     * @param database   * store database identifier
     */
    public void setDatabase(java.lang.String database) {
        this.database = database;
    }


    /**
     * Gets the isClosed value for this Type_GetCount_In.
     * 
     * @return isClosed   * 0 - do not count closed shops; 1 - count only closed shops;
     * else - count both
     */
    public java.lang.Integer getIsClosed() {
        return isClosed;
    }


    /**
     * Sets the isClosed value for this Type_GetCount_In.
     * 
     * @param isClosed   * 0 - do not count closed shops; 1 - count only closed shops;
     * else - count both
     */
    public void setIsClosed(java.lang.Integer isClosed) {
        this.isClosed = isClosed;
    }


    /**
     * Gets the isTrialShop value for this Type_GetCount_In.
     * 
     * @return isTrialShop   * 0 - do not count shops in trial period; 1 - count only shops
     * in trial period; else - count both
     */
    public java.lang.Integer getIsTrialShop() {
        return isTrialShop;
    }


    /**
     * Sets the isTrialShop value for this Type_GetCount_In.
     * 
     * @param isTrialShop   * 0 - do not count shops in trial period; 1 - count only shops
     * in trial period; else - count both
     */
    public void setIsTrialShop(java.lang.Integer isTrialShop) {
        this.isTrialShop = isTrialShop;
    }


    /**
     * Gets the isInternalTestShop value for this Type_GetCount_In.
     * 
     * @return isInternalTestShop   * 0 - do not count internal test shops; 1 - count only internal
     * test shops; else - count both
     */
    public java.lang.Integer getIsInternalTestShop() {
        return isInternalTestShop;
    }


    /**
     * Sets the isInternalTestShop value for this Type_GetCount_In.
     * 
     * @param isInternalTestShop   * 0 - do not count internal test shops; 1 - count only internal
     * test shops; else - count both
     */
    public void setIsInternalTestShop(java.lang.Integer isInternalTestShop) {
        this.isInternalTestShop = isInternalTestShop;
    }


    /**
     * Gets the isPreCreated value for this Type_GetCount_In.
     * 
     * @return isPreCreated   * 0 - do not count pre-created shops; 1 - count only pre-created
     * shops; 2 - count both
     */
    public java.lang.Integer getIsPreCreated() {
        return isPreCreated;
    }


    /**
     * Sets the isPreCreated value for this Type_GetCount_In.
     * 
     * @param isPreCreated   * 0 - do not count pre-created shops; 1 - count only pre-created
     * shops; 2 - count both
     */
    public void setIsPreCreated(java.lang.Integer isPreCreated) {
        this.isPreCreated = isPreCreated;
    }


    /**
     * Gets the isDeleted value for this Type_GetCount_In.
     * 
     * @return isDeleted   * 0 - do not count deleted shops; 1 - count only deleted shops;
     * 2 - count both
     */
    public java.lang.Integer getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Type_GetCount_In.
     * 
     * @param isDeleted   * 0 - do not count deleted shops; 1 - count only deleted shops;
     * 2 - count both
     */
    public void setIsDeleted(java.lang.Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Type_GetCount_In)) return false;
        Type_GetCount_In other = (Type_GetCount_In) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shopType==null && other.getShopType()==null) || 
             (this.shopType!=null &&
              this.shopType.equals(other.getShopType()))) &&
            ((this.database==null && other.getDatabase()==null) || 
             (this.database!=null &&
              this.database.equals(other.getDatabase()))) &&
            ((this.isClosed==null && other.getIsClosed()==null) || 
             (this.isClosed!=null &&
              this.isClosed.equals(other.getIsClosed()))) &&
            ((this.isTrialShop==null && other.getIsTrialShop()==null) || 
             (this.isTrialShop!=null &&
              this.isTrialShop.equals(other.getIsTrialShop()))) &&
            ((this.isInternalTestShop==null && other.getIsInternalTestShop()==null) || 
             (this.isInternalTestShop!=null &&
              this.isInternalTestShop.equals(other.getIsInternalTestShop()))) &&
            ((this.isPreCreated==null && other.getIsPreCreated()==null) || 
             (this.isPreCreated!=null &&
              this.isPreCreated.equals(other.getIsPreCreated()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted())));
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
        if (getShopType() != null) {
            _hashCode += getShopType().hashCode();
        }
        if (getDatabase() != null) {
            _hashCode += getDatabase().hashCode();
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
        if (getIsPreCreated() != null) {
            _hashCode += getIsPreCreated().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Type_GetCount_In.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ShopCountService/2006/08", "type_GetCount_In"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("isClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsClosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTrialShop");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsTrialShop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInternalTestShop");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsInternalTestShop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPreCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsPreCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDeleted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsDeleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
