/**
 * TAssignedCatalog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.assignment.model;


/**
 * a catalog a product is assigned to
 */
public class TAssignedCatalog  implements java.io.Serializable {
    private java.lang.String path;

    private boolean assigned;

    private boolean assignedWithParent;

    public TAssignedCatalog() {
    }

    public TAssignedCatalog(
           java.lang.String path,
           boolean assigned,
           boolean assignedWithParent) {
           this.path = path;
           this.assigned = assigned;
           this.assignedWithParent = assignedWithParent;
    }


    /**
     * Gets the path value for this TAssignedCatalog.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TAssignedCatalog.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the assigned value for this TAssignedCatalog.
     * 
     * @return assigned
     */
    public boolean isAssigned() {
        return assigned;
    }


    /**
     * Sets the assigned value for this TAssignedCatalog.
     * 
     * @param assigned
     */
    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }


    /**
     * Gets the assignedWithParent value for this TAssignedCatalog.
     * 
     * @return assignedWithParent
     */
    public boolean isAssignedWithParent() {
        return assignedWithParent;
    }


    /**
     * Sets the assignedWithParent value for this TAssignedCatalog.
     * 
     * @param assignedWithParent
     */
    public void setAssignedWithParent(boolean assignedWithParent) {
        this.assignedWithParent = assignedWithParent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TAssignedCatalog)) return false;
        TAssignedCatalog other = (TAssignedCatalog) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath()))) &&
            this.assigned == other.isAssigned() &&
            this.assignedWithParent == other.isAssignedWithParent();
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
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
        }
        _hashCode += (isAssigned() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAssignedWithParent() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TAssignedCatalog.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "TAssignedCatalog"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedWithParent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assignedWithParent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
