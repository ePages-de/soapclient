/**
 * TFormError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.form.model;


/**
 * an form error object
 */
public class TFormError  implements java.io.Serializable {
    /* the error code return from the form validation.
     *             this is a list of general codes which may be returned:
     * DATETIME_TOO_LARGE
     *               DATETIME_TOO_SMALL
     *               FORMAT_NOT_TIME
     *               FORMAT_NOT_DATE
     *               FORMAT_NOT_DATETIME
     *               FORMAT_NOT_FLOAT
     *               FORMAT_NOT_INTEGER
     *               FORMAT_NOT_MONEY
     *               FORMAT_NOT_IPADDRESS
     *               FORMAT_NOT_EMAILADDRESS
     *               FORMAT_NOT_URL
     *               FORMAT_NOT_DOMAIN
     *               INTEGER_TOO_LARGE
     *               INTEGER_TOO_SMALL
     *               FLOAT_TOO_LARGE
     *               FLOAT_TOO_SMALL
     *               STRING_EMPTY
     *               STRING_TOO_LONG
     *               STRING_TOO_SHORT
     *               FILE_TOO_LONG
     *               FILE_TOO_SMALL
     *               FILE_NOT_UPLOADED
     *               SMTP_FALSE_MAIL_FORMAT
     *               TLE_ERROR
     *               PasswordWithSpaces */
    private java.lang.String code;

    /* the field name */
    private java.lang.String fieldName;

    /* the field value */
    private java.lang.String fieldValue;

    public TFormError() {
    }

    public TFormError(
           java.lang.String code,
           java.lang.String fieldName,
           java.lang.String fieldValue) {
           this.code = code;
           this.fieldName = fieldName;
           this.fieldValue = fieldValue;
    }


    /**
     * Gets the code value for this TFormError.
     * 
     * @return code   * the error code return from the form validation.
     *             this is a list of general codes which may be returned:
     * DATETIME_TOO_LARGE
     *               DATETIME_TOO_SMALL
     *               FORMAT_NOT_TIME
     *               FORMAT_NOT_DATE
     *               FORMAT_NOT_DATETIME
     *               FORMAT_NOT_FLOAT
     *               FORMAT_NOT_INTEGER
     *               FORMAT_NOT_MONEY
     *               FORMAT_NOT_IPADDRESS
     *               FORMAT_NOT_EMAILADDRESS
     *               FORMAT_NOT_URL
     *               FORMAT_NOT_DOMAIN
     *               INTEGER_TOO_LARGE
     *               INTEGER_TOO_SMALL
     *               FLOAT_TOO_LARGE
     *               FLOAT_TOO_SMALL
     *               STRING_EMPTY
     *               STRING_TOO_LONG
     *               STRING_TOO_SHORT
     *               FILE_TOO_LONG
     *               FILE_TOO_SMALL
     *               FILE_NOT_UPLOADED
     *               SMTP_FALSE_MAIL_FORMAT
     *               TLE_ERROR
     *               PasswordWithSpaces
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this TFormError.
     * 
     * @param code   * the error code return from the form validation.
     *             this is a list of general codes which may be returned:
     * DATETIME_TOO_LARGE
     *               DATETIME_TOO_SMALL
     *               FORMAT_NOT_TIME
     *               FORMAT_NOT_DATE
     *               FORMAT_NOT_DATETIME
     *               FORMAT_NOT_FLOAT
     *               FORMAT_NOT_INTEGER
     *               FORMAT_NOT_MONEY
     *               FORMAT_NOT_IPADDRESS
     *               FORMAT_NOT_EMAILADDRESS
     *               FORMAT_NOT_URL
     *               FORMAT_NOT_DOMAIN
     *               INTEGER_TOO_LARGE
     *               INTEGER_TOO_SMALL
     *               FLOAT_TOO_LARGE
     *               FLOAT_TOO_SMALL
     *               STRING_EMPTY
     *               STRING_TOO_LONG
     *               STRING_TOO_SHORT
     *               FILE_TOO_LONG
     *               FILE_TOO_SMALL
     *               FILE_NOT_UPLOADED
     *               SMTP_FALSE_MAIL_FORMAT
     *               TLE_ERROR
     *               PasswordWithSpaces
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the fieldName value for this TFormError.
     * 
     * @return fieldName   * the field name
     */
    public java.lang.String getFieldName() {
        return fieldName;
    }


    /**
     * Sets the fieldName value for this TFormError.
     * 
     * @param fieldName   * the field name
     */
    public void setFieldName(java.lang.String fieldName) {
        this.fieldName = fieldName;
    }


    /**
     * Gets the fieldValue value for this TFormError.
     * 
     * @return fieldValue   * the field value
     */
    public java.lang.String getFieldValue() {
        return fieldValue;
    }


    /**
     * Sets the fieldValue value for this TFormError.
     * 
     * @param fieldValue   * the field value
     */
    public void setFieldValue(java.lang.String fieldValue) {
        this.fieldValue = fieldValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TFormError)) return false;
        TFormError other = (TFormError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.fieldName==null && other.getFieldName()==null) || 
             (this.fieldName!=null &&
              this.fieldName.equals(other.getFieldName()))) &&
            ((this.fieldValue==null && other.getFieldValue()==null) || 
             (this.fieldValue!=null &&
              this.fieldValue.equals(other.getFieldValue())));
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
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getFieldName() != null) {
            _hashCode += getFieldName().hashCode();
        }
        if (getFieldValue() != null) {
            _hashCode += getFieldValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TFormError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/FormTypes/2014/02", "TFormError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FieldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FieldValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
