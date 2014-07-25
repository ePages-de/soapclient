/**
 * TFindUpdatedObjects_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.changelog.stub;

public class TFindUpdatedObjects_Return  implements java.io.Serializable {
    private de.epages.ws.changelog.stub.TFindUpdatedObject[] updatedObjects;

    private java.util.Calendar latestUpdate;

    public TFindUpdatedObjects_Return() {
    }

    public TFindUpdatedObjects_Return(
           de.epages.ws.changelog.stub.TFindUpdatedObject[] updatedObjects,
           java.util.Calendar latestUpdate) {
           this.updatedObjects = updatedObjects;
           this.latestUpdate = latestUpdate;
    }


    /**
     * Gets the updatedObjects value for this TFindUpdatedObjects_Return.
     * 
     * @return updatedObjects
     */
    public de.epages.ws.changelog.stub.TFindUpdatedObject[] getUpdatedObjects() {
        return updatedObjects;
    }


    /**
     * Sets the updatedObjects value for this TFindUpdatedObjects_Return.
     * 
     * @param updatedObjects
     */
    public void setUpdatedObjects(de.epages.ws.changelog.stub.TFindUpdatedObject[] updatedObjects) {
        this.updatedObjects = updatedObjects;
    }


    /**
     * Gets the latestUpdate value for this TFindUpdatedObjects_Return.
     * 
     * @return latestUpdate
     */
    public java.util.Calendar getLatestUpdate() {
        return latestUpdate;
    }


    /**
     * Sets the latestUpdate value for this TFindUpdatedObjects_Return.
     * 
     * @param latestUpdate
     */
    public void setLatestUpdate(java.util.Calendar latestUpdate) {
        this.latestUpdate = latestUpdate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TFindUpdatedObjects_Return)) return false;
        TFindUpdatedObjects_Return other = (TFindUpdatedObjects_Return) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updatedObjects==null && other.getUpdatedObjects()==null) || 
             (this.updatedObjects!=null &&
              java.util.Arrays.equals(this.updatedObjects, other.getUpdatedObjects()))) &&
            ((this.latestUpdate==null && other.getLatestUpdate()==null) || 
             (this.latestUpdate!=null &&
              this.latestUpdate.equals(other.getLatestUpdate())));
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
        if (getUpdatedObjects() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUpdatedObjects());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUpdatedObjects(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLatestUpdate() != null) {
            _hashCode += getLatestUpdate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TFindUpdatedObjects_Return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ChangeLogService/2014/06", "TFindUpdatedObjects_Return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatedObjects");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UpdatedObjects"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ChangeLogService/2014/06", "TFindUpdatedObject"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latestUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LatestUpdate"));
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
