/**
 * TDelete_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.productbundle.model;


/**
 * input value of a delete() call.
 */
public class TDelete_Input  implements java.io.Serializable {
    /* bundle product object path, this object contains bundled products */
    private java.lang.String product;

    /* list of product paths,
     *             this products will unassign to the product bundle
     *             see tns:ListOfBundledProductPaths */
    private de.epages.ws.productbundle.model.TBundledProductPath[] bundledProductPaths;

    public TDelete_Input() {
    }

    public TDelete_Input(
           java.lang.String product,
           de.epages.ws.productbundle.model.TBundledProductPath[] bundledProductPaths) {
           this.product = product;
           this.bundledProductPaths = bundledProductPaths;
    }


    /**
     * Gets the product value for this TDelete_Input.
     * 
     * @return product   * bundle product object path, this object contains bundled products
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this TDelete_Input.
     * 
     * @param product   * bundle product object path, this object contains bundled products
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the bundledProductPaths value for this TDelete_Input.
     * 
     * @return bundledProductPaths   * list of product paths,
     *             this products will unassign to the product bundle
     *             see tns:ListOfBundledProductPaths
     */
    public de.epages.ws.productbundle.model.TBundledProductPath[] getBundledProductPaths() {
        return bundledProductPaths;
    }


    /**
     * Sets the bundledProductPaths value for this TDelete_Input.
     * 
     * @param bundledProductPaths   * list of product paths,
     *             this products will unassign to the product bundle
     *             see tns:ListOfBundledProductPaths
     */
    public void setBundledProductPaths(de.epages.ws.productbundle.model.TBundledProductPath[] bundledProductPaths) {
        this.bundledProductPaths = bundledProductPaths;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TDelete_Input)) return false;
        TDelete_Input other = (TDelete_Input) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.bundledProductPaths==null && other.getBundledProductPaths()==null) || 
             (this.bundledProductPaths!=null &&
              java.util.Arrays.equals(this.bundledProductPaths, other.getBundledProductPaths())));
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
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getBundledProductPaths() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBundledProductPaths());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBundledProductPaths(), i);
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
        new org.apache.axis.description.TypeDesc(TDelete_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleTypes/2007/07", "TDelete_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundledProductPaths");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BundledProductPaths"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleTypes/2007/07", "TBundledProductPath"));
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
