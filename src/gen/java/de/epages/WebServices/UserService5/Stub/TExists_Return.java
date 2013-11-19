/**
 * TExists_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.UserService5.Stub;


/**
 * a single return value of a exists() user call.
 *         the path will be always returned.
 *         the error element will be returned in case of error.
 *         the exists flag will be returned if no error has occured.
 */
public class TExists_Return  implements java.io.Serializable {
    private java.lang.String path;

    /* a boolean flag indicating that this user exists */
    private java.lang.Boolean exists;

    /* error object (see epagestypes:TError) */
    private de.epages.WebServices.UserService5.Stub.TError error;

    public TExists_Return() {
    }

    public TExists_Return(
           java.lang.String path,
           java.lang.Boolean exists,
           de.epages.WebServices.UserService5.Stub.TError error) {
           this.path = path;
           this.exists = exists;
           this.error = error;
    }


    /**
     * Gets the path value for this TExists_Return.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TExists_Return.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the exists value for this TExists_Return.
     * 
     * @return exists   * a boolean flag indicating that this user exists
     */
    public java.lang.Boolean getExists() {
        return exists;
    }


    /**
     * Sets the exists value for this TExists_Return.
     * 
     * @param exists   * a boolean flag indicating that this user exists
     */
    public void setExists(java.lang.Boolean exists) {
        this.exists = exists;
    }


    /**
     * Gets the error value for this TExists_Return.
     * 
     * @return error   * error object (see epagestypes:TError)
     */
    public de.epages.WebServices.UserService5.Stub.TError getError() {
        return error;
    }


    /**
     * Sets the error value for this TExists_Return.
     * 
     * @param error   * error object (see epagestypes:TError)
     */
    public void setError(de.epages.WebServices.UserService5.Stub.TError error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TExists_Return)) return false;
        TExists_Return other = (TExists_Return) obj;
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
            ((this.exists==null && other.getExists()==null) || 
             (this.exists!=null &&
              this.exists.equals(other.getExists()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError())));
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
        if (getExists() != null) {
            _hashCode += getExists().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TExists_Return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/UserTypes/2011/03", "TExists_Return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exists");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exists"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Error"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TError"));
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
