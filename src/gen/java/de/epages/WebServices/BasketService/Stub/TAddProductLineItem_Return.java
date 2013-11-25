/**
 * TAddProductLineItem_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.BasketService.Stub;


/**
 * a single return value of a addProductLineItem() call.
 *         the path will be always returned.
 *         the error element will be returned in case of error.
 *         the added flag will be returned if no error has occured.
 */
public class TAddProductLineItem_Return  implements java.io.Serializable {
    private java.lang.String path;

    /* a boolean flag indicating that this product line item was added */
    private java.lang.Boolean added;

    /* error object (see epagestypes:TError) */
    private de.epages.WebServices.BasketService.Stub.TError error;

    public TAddProductLineItem_Return() {
    }

    public TAddProductLineItem_Return(
           java.lang.String path,
           java.lang.Boolean added,
           de.epages.WebServices.BasketService.Stub.TError error) {
           this.path = path;
           this.added = added;
           this.error = error;
    }


    /**
     * Gets the path value for this TAddProductLineItem_Return.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TAddProductLineItem_Return.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the added value for this TAddProductLineItem_Return.
     * 
     * @return added   * a boolean flag indicating that this product line item was added
     */
    public java.lang.Boolean getAdded() {
        return added;
    }


    /**
     * Sets the added value for this TAddProductLineItem_Return.
     * 
     * @param added   * a boolean flag indicating that this product line item was added
     */
    public void setAdded(java.lang.Boolean added) {
        this.added = added;
    }


    /**
     * Gets the error value for this TAddProductLineItem_Return.
     * 
     * @return error   * error object (see epagestypes:TError)
     */
    public de.epages.WebServices.BasketService.Stub.TError getError() {
        return error;
    }


    /**
     * Sets the error value for this TAddProductLineItem_Return.
     * 
     * @param error   * error object (see epagestypes:TError)
     */
    public void setError(de.epages.WebServices.BasketService.Stub.TError error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TAddProductLineItem_Return)) return false;
        TAddProductLineItem_Return other = (TAddProductLineItem_Return) obj;
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
            ((this.added==null && other.getAdded()==null) || 
             (this.added!=null &&
              this.added.equals(other.getAdded()))) &&
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
        if (getAdded() != null) {
            _hashCode += getAdded().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TAddProductLineItem_Return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/BasketTypes/2013/11", "TAddProductLineItem_Return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("added");
        elemField.setXmlName(new javax.xml.namespace.QName("", "added"));
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
