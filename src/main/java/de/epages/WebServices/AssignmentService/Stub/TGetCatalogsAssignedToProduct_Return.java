/**
 * TGetCatalogsAssignedToProduct_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.AssignmentService.Stub;


/**
 * return value of a getCatalogsAssignedToProduct() call.
 *         Product will be always returned.
 *         the Error element will be returned in case of error.
 *         all other elements will be returned if no error has occured.
 */
public class TGetCatalogsAssignedToProduct_Return  implements java.io.Serializable {
    /* product object path */
    private java.lang.String product;

    /* list of catalogs the product is assigned to (see epagestypes:ListOfAssignedCatalogs) */
    private de.epages.WebServices.AssignmentService.Stub.TAssignedCatalog[] catalogs;

    /* error object (see epagestypes:TError) */
    private de.epages.WebServices.AssignmentService.Stub.TError error;

    public TGetCatalogsAssignedToProduct_Return() {
    }

    public TGetCatalogsAssignedToProduct_Return(
           java.lang.String product,
           de.epages.WebServices.AssignmentService.Stub.TAssignedCatalog[] catalogs,
           de.epages.WebServices.AssignmentService.Stub.TError error) {
           this.product = product;
           this.catalogs = catalogs;
           this.error = error;
    }


    /**
     * Gets the product value for this TGetCatalogsAssignedToProduct_Return.
     * 
     * @return product   * product object path
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this TGetCatalogsAssignedToProduct_Return.
     * 
     * @param product   * product object path
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the catalogs value for this TGetCatalogsAssignedToProduct_Return.
     * 
     * @return catalogs   * list of catalogs the product is assigned to (see epagestypes:ListOfAssignedCatalogs)
     */
    public de.epages.WebServices.AssignmentService.Stub.TAssignedCatalog[] getCatalogs() {
        return catalogs;
    }


    /**
     * Sets the catalogs value for this TGetCatalogsAssignedToProduct_Return.
     * 
     * @param catalogs   * list of catalogs the product is assigned to (see epagestypes:ListOfAssignedCatalogs)
     */
    public void setCatalogs(de.epages.WebServices.AssignmentService.Stub.TAssignedCatalog[] catalogs) {
        this.catalogs = catalogs;
    }


    /**
     * Gets the error value for this TGetCatalogsAssignedToProduct_Return.
     * 
     * @return error   * error object (see epagestypes:TError)
     */
    public de.epages.WebServices.AssignmentService.Stub.TError getError() {
        return error;
    }


    /**
     * Sets the error value for this TGetCatalogsAssignedToProduct_Return.
     * 
     * @param error   * error object (see epagestypes:TError)
     */
    public void setError(de.epages.WebServices.AssignmentService.Stub.TError error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TGetCatalogsAssignedToProduct_Return)) return false;
        TGetCatalogsAssignedToProduct_Return other = (TGetCatalogsAssignedToProduct_Return) obj;
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
            ((this.catalogs==null && other.getCatalogs()==null) || 
             (this.catalogs!=null &&
              java.util.Arrays.equals(this.catalogs, other.getCatalogs()))) &&
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
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getCatalogs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCatalogs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCatalogs(), i);
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
        new org.apache.axis.description.TypeDesc(TGetCatalogsAssignedToProduct_Return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "TGetCatalogsAssignedToProduct_Return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catalogs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Catalogs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "TAssignedCatalog"));
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
