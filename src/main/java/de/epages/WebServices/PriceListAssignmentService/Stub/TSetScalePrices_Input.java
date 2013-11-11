/**
 * TSetScalePrices_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.PriceListAssignmentService.Stub;


/**
 * input arguments of a single setScalePrices() call.
 *         all elements are mandatory.
 */
public class TSetScalePrices_Input  implements java.io.Serializable {
    /* product (object path) */
    private java.lang.String product;

    /* price list (object path) */
    private java.lang.String priceList;

    /* list of scale prices to set (see pricelistassignmenttypes:TScalePrice) */
    private de.epages.WebServices.PriceListAssignmentService.Stub.TScalePrice[] scalePrices;

    public TSetScalePrices_Input() {
    }

    public TSetScalePrices_Input(
           java.lang.String product,
           java.lang.String priceList,
           de.epages.WebServices.PriceListAssignmentService.Stub.TScalePrice[] scalePrices) {
           this.product = product;
           this.priceList = priceList;
           this.scalePrices = scalePrices;
    }


    /**
     * Gets the product value for this TSetScalePrices_Input.
     * 
     * @return product   * product (object path)
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this TSetScalePrices_Input.
     * 
     * @param product   * product (object path)
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the priceList value for this TSetScalePrices_Input.
     * 
     * @return priceList   * price list (object path)
     */
    public java.lang.String getPriceList() {
        return priceList;
    }


    /**
     * Sets the priceList value for this TSetScalePrices_Input.
     * 
     * @param priceList   * price list (object path)
     */
    public void setPriceList(java.lang.String priceList) {
        this.priceList = priceList;
    }


    /**
     * Gets the scalePrices value for this TSetScalePrices_Input.
     * 
     * @return scalePrices   * list of scale prices to set (see pricelistassignmenttypes:TScalePrice)
     */
    public de.epages.WebServices.PriceListAssignmentService.Stub.TScalePrice[] getScalePrices() {
        return scalePrices;
    }


    /**
     * Sets the scalePrices value for this TSetScalePrices_Input.
     * 
     * @param scalePrices   * list of scale prices to set (see pricelistassignmenttypes:TScalePrice)
     */
    public void setScalePrices(de.epages.WebServices.PriceListAssignmentService.Stub.TScalePrice[] scalePrices) {
        this.scalePrices = scalePrices;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TSetScalePrices_Input)) return false;
        TSetScalePrices_Input other = (TSetScalePrices_Input) obj;
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
            ((this.priceList==null && other.getPriceList()==null) || 
             (this.priceList!=null &&
              this.priceList.equals(other.getPriceList()))) &&
            ((this.scalePrices==null && other.getScalePrices()==null) || 
             (this.scalePrices!=null &&
              java.util.Arrays.equals(this.scalePrices, other.getScalePrices())));
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
        if (getPriceList() != null) {
            _hashCode += getPriceList().hashCode();
        }
        if (getScalePrices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScalePrices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScalePrices(), i);
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
        new org.apache.axis.description.TypeDesc(TSetScalePrices_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TSetScalePrices_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PriceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scalePrices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ScalePrices"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/PriceListAssignmentTypes/2005/01", "TScalePrice"));
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
