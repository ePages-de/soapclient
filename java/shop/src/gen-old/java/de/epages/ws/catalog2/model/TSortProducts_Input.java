/**
 * TSortProducts_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.catalog2.model;


/**
 * input arguments of a single sortProducts() catalog call.
 *         the path element is mandatory.
 *         all others are optional.
 */
public class TSortProducts_Input  implements java.io.Serializable {
    /* catalog path */
    private java.lang.String path;

    /* sort method could be one of
     *             alphabetize:    sort by name (shop language),
     *             byPriceASC:     sort by price ascending,
     *             byPriceDESC:    sort by price descending,
     *             byNew:          sort products wit the new attribute as
     * first,
     *             byStockLevel:   sort by ascending stock level,
     *             byProductAlias: sort by Alias of products
     *           it will set to 'alphabetize' if no sort method passed */
    private java.lang.String sort;

    /* flag indicating to sort ALL subcategories as well
     *             (please mind performance issues by big sub tree of sub
     * categories!) */
    private java.lang.Boolean allSub;

    public TSortProducts_Input() {
    }

    public TSortProducts_Input(
           java.lang.String path,
           java.lang.String sort,
           java.lang.Boolean allSub) {
           this.path = path;
           this.sort = sort;
           this.allSub = allSub;
    }


    /**
     * Gets the path value for this TSortProducts_Input.
     * 
     * @return path   * catalog path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TSortProducts_Input.
     * 
     * @param path   * catalog path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the sort value for this TSortProducts_Input.
     * 
     * @return sort   * sort method could be one of
     *             alphabetize:    sort by name (shop language),
     *             byPriceASC:     sort by price ascending,
     *             byPriceDESC:    sort by price descending,
     *             byNew:          sort products wit the new attribute as
     * first,
     *             byStockLevel:   sort by ascending stock level,
     *             byProductAlias: sort by Alias of products
     *           it will set to 'alphabetize' if no sort method passed
     */
    public java.lang.String getSort() {
        return sort;
    }


    /**
     * Sets the sort value for this TSortProducts_Input.
     * 
     * @param sort   * sort method could be one of
     *             alphabetize:    sort by name (shop language),
     *             byPriceASC:     sort by price ascending,
     *             byPriceDESC:    sort by price descending,
     *             byNew:          sort products wit the new attribute as
     * first,
     *             byStockLevel:   sort by ascending stock level,
     *             byProductAlias: sort by Alias of products
     *           it will set to 'alphabetize' if no sort method passed
     */
    public void setSort(java.lang.String sort) {
        this.sort = sort;
    }


    /**
     * Gets the allSub value for this TSortProducts_Input.
     * 
     * @return allSub   * flag indicating to sort ALL subcategories as well
     *             (please mind performance issues by big sub tree of sub
     * categories!)
     */
    public java.lang.Boolean getAllSub() {
        return allSub;
    }


    /**
     * Sets the allSub value for this TSortProducts_Input.
     * 
     * @param allSub   * flag indicating to sort ALL subcategories as well
     *             (please mind performance issues by big sub tree of sub
     * categories!)
     */
    public void setAllSub(java.lang.Boolean allSub) {
        this.allSub = allSub;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TSortProducts_Input)) return false;
        TSortProducts_Input other = (TSortProducts_Input) obj;
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
            ((this.sort==null && other.getSort()==null) || 
             (this.sort!=null &&
              this.sort.equals(other.getSort()))) &&
            ((this.allSub==null && other.getAllSub()==null) || 
             (this.allSub!=null &&
              this.allSub.equals(other.getAllSub())));
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
        if (getSort() != null) {
            _hashCode += getSort().hashCode();
        }
        if (getAllSub() != null) {
            _hashCode += getAllSub().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TSortProducts_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/CatalogTypes/2008/03", "TSortProducts_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allSub");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allSub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
