/**
 * TFindCreates_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.changelog.stub;

public class TFindCreates_Return  implements java.io.Serializable {
    private de.epages.ws.changelog.stub.TFindCreates[] deletes;

    private java.util.Calendar latestCreate;

    public TFindCreates_Return() {
    }

    public TFindCreates_Return(
           de.epages.ws.changelog.stub.TFindCreates[] deletes,
           java.util.Calendar latestCreate) {
           this.deletes = deletes;
           this.latestCreate = latestCreate;
    }


    /**
     * Gets the deletes value for this TFindCreates_Return.
     * 
     * @return deletes
     */
    public de.epages.ws.changelog.stub.TFindCreates[] getDeletes() {
        return deletes;
    }


    /**
     * Sets the deletes value for this TFindCreates_Return.
     * 
     * @param deletes
     */
    public void setDeletes(de.epages.ws.changelog.stub.TFindCreates[] deletes) {
        this.deletes = deletes;
    }


    /**
     * Gets the latestCreate value for this TFindCreates_Return.
     * 
     * @return latestCreate
     */
    public java.util.Calendar getLatestCreate() {
        return latestCreate;
    }


    /**
     * Sets the latestCreate value for this TFindCreates_Return.
     * 
     * @param latestCreate
     */
    public void setLatestCreate(java.util.Calendar latestCreate) {
        this.latestCreate = latestCreate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TFindCreates_Return)) return false;
        TFindCreates_Return other = (TFindCreates_Return) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deletes==null && other.getDeletes()==null) || 
             (this.deletes!=null &&
              java.util.Arrays.equals(this.deletes, other.getDeletes()))) &&
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
        if (getDeletes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeletes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeletes(), i);
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
        new org.apache.axis.description.TypeDesc(TFindCreates_Return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ChangeLogService/2014/06", "TFindCreates_Return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deletes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Deletes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ChangeLogService/2014/06", "TFindCreates"));
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
