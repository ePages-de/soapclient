/**
 * TGetProductsAssignedToCatalog_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.AssignmentService.Stub;


/**
 * return value of a getProductsAssignedToCatalog() call.
 *         Catalog will be always returned.
 *         the Error element will be returned in case of error.
 *         all other elements will be returned if no error has occured.
 */
public class TGetProductsAssignedToCatalog_Return  implements java.io.Serializable {
    /* catalog object path */
    private java.lang.String catalog;

    /* list of products assigned to the catalog (see epagestypes:ListOfAssignedProducts) */
    private de.epages.WebServices.AssignmentService.Stub.TAssignedProduct[] products;

    /* error object (see epagestypes:TError) */
    private de.epages.WebServices.AssignmentService.Stub.TError error;

    public TGetProductsAssignedToCatalog_Return() {
    }

    public TGetProductsAssignedToCatalog_Return(
           java.lang.String catalog,
           de.epages.WebServices.AssignmentService.Stub.TAssignedProduct[] products,
           de.epages.WebServices.AssignmentService.Stub.TError error) {
           this.catalog = catalog;
           this.products = products;
           this.error = error;
    }


    /**
     * Gets the catalog value for this TGetProductsAssignedToCatalog_Return.
     * 
     * @return catalog   * catalog object path
     */
    public java.lang.String getCatalog() {
        return catalog;
    }


    /**
     * Sets the catalog value for this TGetProductsAssignedToCatalog_Return.
     * 
     * @param catalog   * catalog object path
     */
    public void setCatalog(java.lang.String catalog) {
        this.catalog = catalog;
    }


    /**
     * Gets the products value for this TGetProductsAssignedToCatalog_Return.
     * 
     * @return products   * list of products assigned to the catalog (see epagestypes:ListOfAssignedProducts)
     */
    public de.epages.WebServices.AssignmentService.Stub.TAssignedProduct[] getProducts() {
        return products;
    }


    /**
     * Sets the products value for this TGetProductsAssignedToCatalog_Return.
     * 
     * @param products   * list of products assigned to the catalog (see epagestypes:ListOfAssignedProducts)
     */
    public void setProducts(de.epages.WebServices.AssignmentService.Stub.TAssignedProduct[] products) {
        this.products = products;
    }


    /**
     * Gets the error value for this TGetProductsAssignedToCatalog_Return.
     * 
     * @return error   * error object (see epagestypes:TError)
     */
    public de.epages.WebServices.AssignmentService.Stub.TError getError() {
        return error;
    }


    /**
     * Sets the error value for this TGetProductsAssignedToCatalog_Return.
     * 
     * @param error   * error object (see epagestypes:TError)
     */
    public void setError(de.epages.WebServices.AssignmentService.Stub.TError error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TGetProductsAssignedToCatalog_Return)) return false;
        TGetProductsAssignedToCatalog_Return other = (TGetProductsAssignedToCatalog_Return) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.catalog==null && other.getCatalog()==null) || 
             (this.catalog!=null &&
              this.catalog.equals(other.getCatalog()))) &&
            ((this.products==null && other.getProducts()==null) || 
             (this.products!=null &&
              java.util.Arrays.equals(this.products, other.getProducts()))) &&
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
        if (getCatalog() != null) {
            _hashCode += getCatalog().hashCode();
        }
        if (getProducts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProducts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProducts(), i);
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
        new org.apache.axis.description.TypeDesc(TGetProductsAssignedToCatalog_Return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "TGetProductsAssignedToCatalog_Return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catalog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Catalog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("products");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Products"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "TAssignedProduct"));
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
