/**
 * TShopCount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.shopcount.stub;


/**
 * number of shops in one database
 *             having the same shop type
 *             that are not deleted and not internal test shops
 */
public class TShopCount  implements java.io.Serializable {
    /* shop type alias */
    private java.lang.String shopType;

    /* store database identifier */
    private java.lang.String database;

    /* shop count (IsTrialShop && IsClosed && !IsPreCreated) */
    private int trial_Closed;

    /* shop count (IsTrialShop && !IsClosed && !IsPreCreated) */
    private int trial_NotClosed;

    /* shop count (!IsTrialShop && IsClosed && !IsPreCreated) */
    private int notTrial_Closed;

    /* shop count (!IsTrialShop && !IsClosed && !IsPreCreated) */
    private int notTrial_NotClosed;

    /* shop count (IsPreCreated) */
    private int preCreated;

    public TShopCount() {
    }

    public TShopCount(
           java.lang.String shopType,
           java.lang.String database,
           int trial_Closed,
           int trial_NotClosed,
           int notTrial_Closed,
           int notTrial_NotClosed,
           int preCreated) {
           this.shopType = shopType;
           this.database = database;
           this.trial_Closed = trial_Closed;
           this.trial_NotClosed = trial_NotClosed;
           this.notTrial_Closed = notTrial_Closed;
           this.notTrial_NotClosed = notTrial_NotClosed;
           this.preCreated = preCreated;
    }


    /**
     * Gets the shopType value for this TShopCount.
     * 
     * @return shopType   * shop type alias
     */
    public java.lang.String getShopType() {
        return shopType;
    }


    /**
     * Sets the shopType value for this TShopCount.
     * 
     * @param shopType   * shop type alias
     */
    public void setShopType(java.lang.String shopType) {
        this.shopType = shopType;
    }


    /**
     * Gets the database value for this TShopCount.
     * 
     * @return database   * store database identifier
     */
    public java.lang.String getDatabase() {
        return database;
    }


    /**
     * Sets the database value for this TShopCount.
     * 
     * @param database   * store database identifier
     */
    public void setDatabase(java.lang.String database) {
        this.database = database;
    }


    /**
     * Gets the trial_Closed value for this TShopCount.
     * 
     * @return trial_Closed   * shop count (IsTrialShop && IsClosed && !IsPreCreated)
     */
    public int getTrial_Closed() {
        return trial_Closed;
    }


    /**
     * Sets the trial_Closed value for this TShopCount.
     * 
     * @param trial_Closed   * shop count (IsTrialShop && IsClosed && !IsPreCreated)
     */
    public void setTrial_Closed(int trial_Closed) {
        this.trial_Closed = trial_Closed;
    }


    /**
     * Gets the trial_NotClosed value for this TShopCount.
     * 
     * @return trial_NotClosed   * shop count (IsTrialShop && !IsClosed && !IsPreCreated)
     */
    public int getTrial_NotClosed() {
        return trial_NotClosed;
    }


    /**
     * Sets the trial_NotClosed value for this TShopCount.
     * 
     * @param trial_NotClosed   * shop count (IsTrialShop && !IsClosed && !IsPreCreated)
     */
    public void setTrial_NotClosed(int trial_NotClosed) {
        this.trial_NotClosed = trial_NotClosed;
    }


    /**
     * Gets the notTrial_Closed value for this TShopCount.
     * 
     * @return notTrial_Closed   * shop count (!IsTrialShop && IsClosed && !IsPreCreated)
     */
    public int getNotTrial_Closed() {
        return notTrial_Closed;
    }


    /**
     * Sets the notTrial_Closed value for this TShopCount.
     * 
     * @param notTrial_Closed   * shop count (!IsTrialShop && IsClosed && !IsPreCreated)
     */
    public void setNotTrial_Closed(int notTrial_Closed) {
        this.notTrial_Closed = notTrial_Closed;
    }


    /**
     * Gets the notTrial_NotClosed value for this TShopCount.
     * 
     * @return notTrial_NotClosed   * shop count (!IsTrialShop && !IsClosed && !IsPreCreated)
     */
    public int getNotTrial_NotClosed() {
        return notTrial_NotClosed;
    }


    /**
     * Sets the notTrial_NotClosed value for this TShopCount.
     * 
     * @param notTrial_NotClosed   * shop count (!IsTrialShop && !IsClosed && !IsPreCreated)
     */
    public void setNotTrial_NotClosed(int notTrial_NotClosed) {
        this.notTrial_NotClosed = notTrial_NotClosed;
    }


    /**
     * Gets the preCreated value for this TShopCount.
     * 
     * @return preCreated   * shop count (IsPreCreated)
     */
    public int getPreCreated() {
        return preCreated;
    }


    /**
     * Sets the preCreated value for this TShopCount.
     * 
     * @param preCreated   * shop count (IsPreCreated)
     */
    public void setPreCreated(int preCreated) {
        this.preCreated = preCreated;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TShopCount)) return false;
        TShopCount other = (TShopCount) obj;
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
            this.trial_Closed == other.getTrial_Closed() &&
            this.trial_NotClosed == other.getTrial_NotClosed() &&
            this.notTrial_Closed == other.getNotTrial_Closed() &&
            this.notTrial_NotClosed == other.getNotTrial_NotClosed() &&
            this.preCreated == other.getPreCreated();
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
        _hashCode += getTrial_Closed();
        _hashCode += getTrial_NotClosed();
        _hashCode += getNotTrial_Closed();
        _hashCode += getNotTrial_NotClosed();
        _hashCode += getPreCreated();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TShopCount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ShopCountService/2006/08", "TShopCount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("trial_Closed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Trial_Closed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trial_NotClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Trial_NotClosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notTrial_Closed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NotTrial_Closed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notTrial_NotClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NotTrial_NotClosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PreCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
