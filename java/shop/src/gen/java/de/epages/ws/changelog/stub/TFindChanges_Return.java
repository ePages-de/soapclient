/**
 * TFindChanges_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.changelog.stub;

public class TFindChanges_Return  implements java.io.Serializable {
    private de.epages.ws.changelog.stub.TFindCreates_Return updateSet;

    private de.epages.ws.changelog.stub.TFindDeletes_Return updateSet2;

    private de.epages.ws.changelog.stub.TFindUpdates_Return updateSet3;

    public TFindChanges_Return() {
    }

    public TFindChanges_Return(
           de.epages.ws.changelog.stub.TFindCreates_Return updateSet,
           de.epages.ws.changelog.stub.TFindDeletes_Return updateSet2,
           de.epages.ws.changelog.stub.TFindUpdates_Return updateSet3) {
           this.updateSet = updateSet;
           this.updateSet2 = updateSet2;
           this.updateSet3 = updateSet3;
    }


    /**
     * Gets the updateSet value for this TFindChanges_Return.
     * 
     * @return updateSet
     */
    public de.epages.ws.changelog.stub.TFindCreates_Return getUpdateSet() {
        return updateSet;
    }


    /**
     * Sets the updateSet value for this TFindChanges_Return.
     * 
     * @param updateSet
     */
    public void setUpdateSet(de.epages.ws.changelog.stub.TFindCreates_Return updateSet) {
        this.updateSet = updateSet;
    }


    /**
     * Gets the updateSet2 value for this TFindChanges_Return.
     * 
     * @return updateSet2
     */
    public de.epages.ws.changelog.stub.TFindDeletes_Return getUpdateSet2() {
        return updateSet2;
    }


    /**
     * Sets the updateSet2 value for this TFindChanges_Return.
     * 
     * @param updateSet2
     */
    public void setUpdateSet2(de.epages.ws.changelog.stub.TFindDeletes_Return updateSet2) {
        this.updateSet2 = updateSet2;
    }


    /**
     * Gets the updateSet3 value for this TFindChanges_Return.
     * 
     * @return updateSet3
     */
    public de.epages.ws.changelog.stub.TFindUpdates_Return getUpdateSet3() {
        return updateSet3;
    }


    /**
     * Sets the updateSet3 value for this TFindChanges_Return.
     * 
     * @param updateSet3
     */
    public void setUpdateSet3(de.epages.ws.changelog.stub.TFindUpdates_Return updateSet3) {
        this.updateSet3 = updateSet3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TFindChanges_Return)) return false;
        TFindChanges_Return other = (TFindChanges_Return) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateSet==null && other.getUpdateSet()==null) || 
             (this.updateSet!=null &&
              this.updateSet.equals(other.getUpdateSet()))) &&
            ((this.updateSet2==null && other.getUpdateSet2()==null) || 
             (this.updateSet2!=null &&
              this.updateSet2.equals(other.getUpdateSet2()))) &&
            ((this.updateSet3==null && other.getUpdateSet3()==null) || 
             (this.updateSet3!=null &&
              this.updateSet3.equals(other.getUpdateSet3())));
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
        if (getUpdateSet() != null) {
            _hashCode += getUpdateSet().hashCode();
        }
        if (getUpdateSet2() != null) {
            _hashCode += getUpdateSet2().hashCode();
        }
        if (getUpdateSet3() != null) {
            _hashCode += getUpdateSet3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TFindChanges_Return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ChangeLogService/2014/06", "TFindChanges_Return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UpdateSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ChangeLogService/2014/06", "TFindCreates_Return"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UpdateSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ChangeLogService/2014/06", "TFindDeletes_Return"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UpdateSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ChangeLogService/2014/06", "TFindUpdates_Return"));
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
