/**
 * TFindCreatedObjects_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.changelog.stub;

public class TFindCreatedObjects_Return  implements java.io.Serializable {
    private de.epages.ws.changelog.stub.TFindCreatedObject[] createdObjects;

    private java.util.Calendar latestCreate;

    public TFindCreatedObjects_Return() {
    }

    public TFindCreatedObjects_Return(
           de.epages.ws.changelog.stub.TFindCreatedObject[] createdObjects,
           java.util.Calendar latestCreate) {
           this.createdObjects = createdObjects;
           this.latestCreate = latestCreate;
    }


    /**
     * Gets the createdObjects value for this TFindCreatedObjects_Return.
     * 
     * @return createdObjects
     */
    public de.epages.ws.changelog.stub.TFindCreatedObject[] getCreatedObjects() {
        return createdObjects;
    }


    /**
     * Sets the createdObjects value for this TFindCreatedObjects_Return.
     * 
     * @param createdObjects
     */
    public void setCreatedObjects(de.epages.ws.changelog.stub.TFindCreatedObject[] createdObjects) {
        this.createdObjects = createdObjects;
    }


    /**
     * Gets the latestCreate value for this TFindCreatedObjects_Return.
     * 
     * @return latestCreate
     */
    public java.util.Calendar getLatestCreate() {
        return latestCreate;
    }


    /**
     * Sets the latestCreate value for this TFindCreatedObjects_Return.
     * 
     * @param latestCreate
     */
    public void setLatestCreate(java.util.Calendar latestCreate) {
        this.latestCreate = latestCreate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TFindCreatedObjects_Return)) return false;
        TFindCreatedObjects_Return other = (TFindCreatedObjects_Return) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createdObjects==null && other.getCreatedObjects()==null) || 
             (this.createdObjects!=null &&
              java.util.Arrays.equals(this.createdObjects, other.getCreatedObjects()))) &&
            ((this.latestCreate==null && other.getLatestCreate()==null) || 
             (this.latestCreate!=null &&
              this.latestCreate.equals(other.getLatestCreate())));
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
        if (getCreatedObjects() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedObjects());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedObjects(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLatestCreate() != null) {
            _hashCode += getLatestCreate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TFindCreatedObjects_Return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ChangeLogService/2014/06", "TFindCreatedObjects_Return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdObjects");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreatedObjects"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ChangeLogService/2014/06", "TFindCreatedObject"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latestCreate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LatestCreate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
