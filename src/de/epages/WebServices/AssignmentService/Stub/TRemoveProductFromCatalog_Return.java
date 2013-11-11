/**
 * TRemoveProductFromCatalog_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.AssignmentService.Stub;


/**
 * return value of a removeProductFromCatalog() call.
 *         Catalog and Product will be always returned.
 *         the Error element will be returned in case of error.
 *         all other elements will be returned if no error has occured.
 */
public class TRemoveProductFromCatalog_Return  implements java.io.Serializable {
    /* catalog object path */
    private java.lang.String catalog;

    /* product object path */
    private java.lang.String product;

    /* is product removed to catalog */
    private java.lang.Boolean removed;

    /* is product or its superproduct assigned to catalog */
    private java.lang.Boolean assignedWithParent;

    /* error object (see epagestypes:TError) */
    private de.epages.WebServices.AssignmentService.Stub.TError error;

    public TRemoveProductFromCatalog_Return() {
    }

    public TRemoveProductFromCatalog_Return(
           java.lang.String catalog,
           java.lang.String product,
           java.lang.Boolean removed,
           java.lang.Boolean assignedWithParent,
           de.epages.WebServices.AssignmentService.Stub.TError error) {
           this.catalog = catalog;
           this.product = product;
           this.removed = removed;
           this.assignedWithParent = assignedWithParent;
           this.error = error;
    }


    /**
     * Gets the catalog value for this TRemoveProductFromCatalog_Return.
     * 
     * @return catalog   * catalog object path
     */
    public java.lang.String getCatalog() {
        return catalog;
    }


    /**
     * Sets the catalog value for this TRemoveProductFromCatalog_Return.
     * 
     * @param catalog   * catalog object path
     */
    public void setCatalog(java.lang.String catalog) {
        this.catalog = catalog;
    }


    /**
     * Gets the product value for this TRemoveProductFromCatalog_Return.
     * 
     * @return product   * product object path
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this TRemoveProductFromCatalog_Return.
     * 
     * @param product   * product object path
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the removed value for this TRemoveProductFromCatalog_Return.
     * 
     * @return removed   * is product removed to catalog
     */
    public java.lang.Boolean getRemoved() {
        return removed;
    }


    /**
     * Sets the removed value for this TRemoveProductFromCatalog_Return.
     * 
     * @param removed   * is product removed to catalog
     */
    public void setRemoved(java.lang.Boolean removed) {
        this.removed = removed;
    }


    /**
     * Gets the assignedWithParent value for this TRemoveProductFromCatalog_Return.
     * 
     * @return assignedWithParent   * is product or its superproduct assigned to catalog
     */
    public java.lang.Boolean getAssignedWithParent() {
        return assignedWithParent;
    }


    /**
     * Sets the assignedWithParent value for this TRemoveProductFromCatalog_Return.
     * 
     * @param assignedWithParent   * is product or its superproduct assigned to catalog
     */
    public void setAssignedWithParent(java.lang.Boolean assignedWithParent) {
        this.assignedWithParent = assignedWithParent;
    }


    /**
     * Gets the error value for this TRemoveProductFromCatalog_Return.
     * 
     * @return error   * error object (see epagestypes:TError)
     */
    public de.epages.WebServices.AssignmentService.Stub.TError getError() {
        return error;
    }


    /**
     * Sets the error value for this TRemoveProductFromCatalog_Return.
     * 
     * @param error   * error object (see epagestypes:TError)
     */
    public void setError(de.epages.WebServices.AssignmentService.Stub.TError error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TRemoveProductFromCatalog_Return)) return false;
        TRemoveProductFromCatalog_Return other = (TRemoveProductFromCatalog_Return) obj;
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
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.removed==null && other.getRemoved()==null) || 
             (this.removed!=null &&
              this.removed.equals(other.getRemoved()))) &&
            ((this.assignedWithParent==null && other.getAssignedWithParent()==null) || 
             (this.assignedWithParent!=null &&
              this.assignedWithParent.equals(other.getAssignedWithParent()))) &&
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
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getRemoved() != null) {
            _hashCode += getRemoved().hashCode();
        }
        if (getAssignedWithParent() != null) {
            _hashCode += getAssignedWithParent().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TRemoveProductFromCatalog_Return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/AssignmentTypes/2005/01", "TRemoveProductFromCatalog_Return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catalog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Catalog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "removed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedWithParent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assignedWithParent"));
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
