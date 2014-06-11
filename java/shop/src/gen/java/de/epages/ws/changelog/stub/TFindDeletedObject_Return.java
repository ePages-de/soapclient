/**
 * TFindDeletedObject_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.changelog.stub;

public class TFindDeletedObject_Return  implements java.io.Serializable {
    private de.epages.ws.changelog.stub.TFindDeletedObject[] deletedObjects;

    private java.util.Calendar latestDelete;

    public TFindDeletedObject_Return() {
    }

    public TFindDeletedObject_Return(
           de.epages.ws.changelog.stub.TFindDeletedObject[] deletedObjects,
           java.util.Calendar latestDelete) {
           this.deletedObjects = deletedObjects;
           this.latestDelete = latestDelete;
    }


    /**
     * Gets the deletedObjects value for this TFindDeletedObject_Return.
     * 
     * @return deletedObjects
     */
    public de.epages.ws.changelog.stub.TFindDeletedObject[] getDeletedObjects() {
        return deletedObjects;
    }


    /**
     * Sets the deletedObjects value for this TFindDeletedObject_Return.
     * 
     * @param deletedObjects
     */
    public void setDeletedObjects(de.epages.ws.changelog.stub.TFindDeletedObject[] deletedObjects) {
        this.deletedObjects = deletedObjects;
    }


    /**
     * Gets the latestDelete value for this TFindDeletedObject_Return.
     * 
     * @return latestDelete
     */
    public java.util.Calendar getLatestDelete() {
        return latestDelete;
    }


    /**
     * Sets the latestDelete value for this TFindDeletedObject_Return.
     * 
     * @param latestDelete
     */
    public void setLatestDelete(java.util.Calendar latestDelete) {
        this.latestDelete = latestDelete;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TFindDeletedObject_Return)) return false;
        TFindDeletedObject_Return other = (TFindDeletedObject_Return) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deletedObjects==null && other.getDeletedObjects()==null) || 
             (this.deletedObjects!=null &&
              java.util.Arrays.equals(this.deletedObjects, other.getDeletedObjects()))) &&
            ((this.latestDelete==null && other.getLatestDelete()==null) || 
             (this.latestDelete!=null &&
              this.latestDelete.equals(other.getLatestDelete())));
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
        if (getDeletedObjects() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeletedObjects());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeletedObjects(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLatestDelete() != null) {
            _hashCode += getLatestDelete().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TFindDeletedObject_Return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ChangeLogService/2014/06", "TFindDeletedObject_Return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deletedObjects");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DeletedObjects"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ChangeLogService/2014/06", "TFindDeletedObject"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latestDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LatestDelete"));
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
