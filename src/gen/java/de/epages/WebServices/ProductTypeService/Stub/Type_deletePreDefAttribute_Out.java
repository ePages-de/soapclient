/**
 * Type_deletePreDefAttribute_Out.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.ProductTypeService.Stub;


/**
 * output structure of a deletePreDefAttribute call.
 *             the Error element exists in case of error
 *             the PreDefAttributes element exists if no error occurs
 */
public class Type_deletePreDefAttribute_Out  implements java.io.Serializable {
    /* a list of predefined attribute delete statuses */
    private de.epages.WebServices.ProductTypeService.Stub.TDeletePreDefAttribute_Return[] preDefAttributes;

    /* error object (see epagestypes:TError) */
    private de.epages.WebServices.ProductTypeService.Stub.TError error;

    public Type_deletePreDefAttribute_Out() {
    }

    public Type_deletePreDefAttribute_Out(
           de.epages.WebServices.ProductTypeService.Stub.TDeletePreDefAttribute_Return[] preDefAttributes,
           de.epages.WebServices.ProductTypeService.Stub.TError error) {
           this.preDefAttributes = preDefAttributes;
           this.error = error;
    }


    /**
     * Gets the preDefAttributes value for this Type_deletePreDefAttribute_Out.
     * 
     * @return preDefAttributes   * a list of predefined attribute delete statuses
     */
    public de.epages.WebServices.ProductTypeService.Stub.TDeletePreDefAttribute_Return[] getPreDefAttributes() {
        return preDefAttributes;
    }


    /**
     * Sets the preDefAttributes value for this Type_deletePreDefAttribute_Out.
     * 
     * @param preDefAttributes   * a list of predefined attribute delete statuses
     */
    public void setPreDefAttributes(de.epages.WebServices.ProductTypeService.Stub.TDeletePreDefAttribute_Return[] preDefAttributes) {
        this.preDefAttributes = preDefAttributes;
    }


    /**
     * Gets the error value for this Type_deletePreDefAttribute_Out.
     * 
     * @return error   * error object (see epagestypes:TError)
     */
    public de.epages.WebServices.ProductTypeService.Stub.TError getError() {
        return error;
    }


    /**
     * Sets the error value for this Type_deletePreDefAttribute_Out.
     * 
     * @param error   * error object (see epagestypes:TError)
     */
    public void setError(de.epages.WebServices.ProductTypeService.Stub.TError error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Type_deletePreDefAttribute_Out)) return false;
        Type_deletePreDefAttribute_Out other = (Type_deletePreDefAttribute_Out) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.preDefAttributes==null && other.getPreDefAttributes()==null) || 
             (this.preDefAttributes!=null &&
              java.util.Arrays.equals(this.preDefAttributes, other.getPreDefAttributes()))) &&
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
        if (getPreDefAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreDefAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreDefAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Type_deletePreDefAttribute_Out.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeService/2007/10", "type_deletePreDefAttribute_Out"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preDefAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PreDefAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes/2007/10", "TDeletePreDefAttribute_Return"));
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
