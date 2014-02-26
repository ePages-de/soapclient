/**
 * TUpdate_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.basket.model;


/**
 * a single return value of a update() basket call.
 *         the path will be always returned.
 *         the error element will be returned in case of error.
 *         the updated flag will be returned if no error has occured.
 */
public class TUpdate_Return  implements java.io.Serializable {
    private java.lang.String path;

    /* a boolean flag indicating that this basket was updated */
    private java.lang.Boolean updated;

    /* error object (see epagestypes:TError) */
    private de.epages.ws.common.model.TError error;

    /* list of form error objects (see formtypes:TListOfFormErrors) */
    private de.epages.ws.form.model.TFormError[] formErrors;

    public TUpdate_Return() {
    }

    public TUpdate_Return(
           java.lang.String path,
           java.lang.Boolean updated,
           de.epages.ws.common.model.TError error,
           de.epages.ws.form.model.TFormError[] formErrors) {
           this.path = path;
           this.updated = updated;
           this.error = error;
           this.formErrors = formErrors;
    }


    /**
     * Gets the path value for this TUpdate_Return.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TUpdate_Return.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the updated value for this TUpdate_Return.
     * 
     * @return updated   * a boolean flag indicating that this basket was updated
     */
    public java.lang.Boolean getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this TUpdate_Return.
     * 
     * @param updated   * a boolean flag indicating that this basket was updated
     */
    public void setUpdated(java.lang.Boolean updated) {
        this.updated = updated;
    }


    /**
     * Gets the error value for this TUpdate_Return.
     * 
     * @return error   * error object (see epagestypes:TError)
     */
    public de.epages.ws.common.model.TError getError() {
        return error;
    }


    /**
     * Sets the error value for this TUpdate_Return.
     * 
     * @param error   * error object (see epagestypes:TError)
     */
    public void setError(de.epages.ws.common.model.TError error) {
        this.error = error;
    }


    /**
     * Gets the formErrors value for this TUpdate_Return.
     * 
     * @return formErrors   * list of form error objects (see formtypes:TListOfFormErrors)
     */
    public de.epages.ws.form.model.TFormError[] getFormErrors() {
        return formErrors;
    }


    /**
     * Sets the formErrors value for this TUpdate_Return.
     * 
     * @param formErrors   * list of form error objects (see formtypes:TListOfFormErrors)
     */
    public void setFormErrors(de.epages.ws.form.model.TFormError[] formErrors) {
        this.formErrors = formErrors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TUpdate_Return)) return false;
        TUpdate_Return other = (TUpdate_Return) obj;
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
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.formErrors==null && other.getFormErrors()==null) || 
             (this.formErrors!=null &&
              java.util.Arrays.equals(this.formErrors, other.getFormErrors())));
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
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getFormErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFormErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFormErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TUpdate_Return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TUpdate_Return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updated"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FormErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/FormTypes/2014/02", "TFormError"));
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
