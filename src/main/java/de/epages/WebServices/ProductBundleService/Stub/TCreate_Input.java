/**
 * TCreate_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.ProductBundleService.Stub;


/**
 * input value of a create() call.
 */
public class TCreate_Input  implements java.io.Serializable {
    /* bundle product object path, this object contains bundled products */
    private java.lang.String product;

    /* list of product paths (incl. quantity and list position),
     *             this products will bundled to the product bundle
     *             see tns:ListOfBundledProducts */
    private de.epages.WebServices.ProductBundleService.Stub.TBundledProduct[] bundledProducts;

    public TCreate_Input() {
    }

    public TCreate_Input(
           java.lang.String product,
           de.epages.WebServices.ProductBundleService.Stub.TBundledProduct[] bundledProducts) {
           this.product = product;
           this.bundledProducts = bundledProducts;
    }


    /**
     * Gets the product value for this TCreate_Input.
     * 
     * @return product   * bundle product object path, this object contains bundled products
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this TCreate_Input.
     * 
     * @param product   * bundle product object path, this object contains bundled products
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the bundledProducts value for this TCreate_Input.
     * 
     * @return bundledProducts   * list of product paths (incl. quantity and list position),
     *             this products will bundled to the product bundle
     *             see tns:ListOfBundledProducts
     */
    public de.epages.WebServices.ProductBundleService.Stub.TBundledProduct[] getBundledProducts() {
        return bundledProducts;
    }


    /**
     * Sets the bundledProducts value for this TCreate_Input.
     * 
     * @param bundledProducts   * list of product paths (incl. quantity and list position),
     *             this products will bundled to the product bundle
     *             see tns:ListOfBundledProducts
     */
    public void setBundledProducts(de.epages.WebServices.ProductBundleService.Stub.TBundledProduct[] bundledProducts) {
        this.bundledProducts = bundledProducts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCreate_Input)) return false;
        TCreate_Input other = (TCreate_Input) obj;
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
            ((this.bundledProducts==null && other.getBundledProducts()==null) || 
             (this.bundledProducts!=null &&
              java.util.Arrays.equals(this.bundledProducts, other.getBundledProducts())));
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
        if (getBundledProducts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBundledProducts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBundledProducts(), i);
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
        new org.apache.axis.description.TypeDesc(TCreate_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleTypes/2007/07", "TCreate_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundledProducts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BundledProducts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductBundleTypes/2007/07", "TBundledProduct"));
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
