/**
 * TGetPackingSlips_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.orderdocument3.model;


/**
 * a single return value of a getPackingSlips() call.
 *         The Order will be always returned.
 *         The error element will be returned in case of error.
 *         The PackingSlips element will be returned if no error occured.
 */
public class TGetPackingSlips_Return  implements java.io.Serializable {
    private java.lang.String order;

    /* paths of all packing slips of the order */
    private java.lang.String[] packingSlips;

    /* error object (see epagestypes:TError) */
    private de.epages.ws.common.model.TError error;

    public TGetPackingSlips_Return() {
    }

    public TGetPackingSlips_Return(
           java.lang.String order,
           java.lang.String[] packingSlips,
           de.epages.ws.common.model.TError error) {
           this.order = order;
           this.packingSlips = packingSlips;
           this.error = error;
    }


    /**
     * Gets the order value for this TGetPackingSlips_Return.
     * 
     * @return order
     */
    public java.lang.String getOrder() {
        return order;
    }


    /**
     * Sets the order value for this TGetPackingSlips_Return.
     * 
     * @param order
     */
    public void setOrder(java.lang.String order) {
        this.order = order;
    }


    /**
     * Gets the packingSlips value for this TGetPackingSlips_Return.
     * 
     * @return packingSlips   * paths of all packing slips of the order
     */
    public java.lang.String[] getPackingSlips() {
        return packingSlips;
    }


    /**
     * Sets the packingSlips value for this TGetPackingSlips_Return.
     * 
     * @param packingSlips   * paths of all packing slips of the order
     */
    public void setPackingSlips(java.lang.String[] packingSlips) {
        this.packingSlips = packingSlips;
    }


    /**
     * Gets the error value for this TGetPackingSlips_Return.
     * 
     * @return error   * error object (see epagestypes:TError)
     */
    public de.epages.ws.common.model.TError getError() {
        return error;
    }


    /**
     * Sets the error value for this TGetPackingSlips_Return.
     * 
     * @param error   * error object (see epagestypes:TError)
     */
    public void setError(de.epages.ws.common.model.TError error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TGetPackingSlips_Return)) return false;
        TGetPackingSlips_Return other = (TGetPackingSlips_Return) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.order==null && other.getOrder()==null) || 
             (this.order!=null &&
              this.order.equals(other.getOrder()))) &&
            ((this.packingSlips==null && other.getPackingSlips()==null) || 
             (this.packingSlips!=null &&
              java.util.Arrays.equals(this.packingSlips, other.getPackingSlips()))) &&
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
        if (getOrder() != null) {
            _hashCode += getOrder().hashCode();
        }
        if (getPackingSlips() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPackingSlips());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPackingSlips(), i);
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
        new org.apache.axis.description.TypeDesc(TGetPackingSlips_Return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/OrderDocumentTypes/2007/08", "TGetPackingSlips_Return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packingSlips");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PackingSlips"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
