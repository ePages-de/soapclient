/**
 * TGetInfo_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.OrderDocumentService6.Stub;


/**
 * a single return value of a getInfo() call.
 *         the path will be always returned.
 *         the error element will be returned in case of error.
 *         all other elements will be returned if no error has occured.
 */
public class TGetInfo_Return  implements java.io.Serializable {
    /* order document object path */
    private java.lang.String path;

    /* order document alias */
    private java.lang.String alias;

    /* path to order document's class */
    private java.lang.String _class;

    /* order document's order (object path to order) */
    private java.lang.String order;

    /* document issued or not */
    private java.lang.Boolean issued;

    /* order document's issue date */
    private java.util.Calendar issueDate;

    private de.epages.WebServices.OrderDocumentService6.Stub.TAddressNamed address;

    private de.epages.WebServices.OrderDocumentService6.Stub.TAddressNamed shopAddress;

    /* the products, payments, shipping etc. of this order document
     * (see orderdocumenttypes:TLineItemContainerOut) */
    private de.epages.WebServices.OrderDocumentService6.Stub.TLineItemContainerOut lineItemContainer;

    /* list of requested attributes (see epagestypes:ListOfAttributes) */
    private de.epages.WebServices.OrderDocumentService6.Stub.TAttribute[] attributes;

    /* error object (see epagestypes:TError) */
    private de.epages.WebServices.OrderDocumentService6.Stub.TError error;

    public TGetInfo_Return() {
    }

    public TGetInfo_Return(
           java.lang.String path,
           java.lang.String alias,
           java.lang.String _class,
           java.lang.String order,
           java.lang.Boolean issued,
           java.util.Calendar issueDate,
           de.epages.WebServices.OrderDocumentService6.Stub.TAddressNamed address,
           de.epages.WebServices.OrderDocumentService6.Stub.TAddressNamed shopAddress,
           de.epages.WebServices.OrderDocumentService6.Stub.TLineItemContainerOut lineItemContainer,
           de.epages.WebServices.OrderDocumentService6.Stub.TAttribute[] attributes,
           de.epages.WebServices.OrderDocumentService6.Stub.TError error) {
           this.path = path;
           this.alias = alias;
           this._class = _class;
           this.order = order;
           this.issued = issued;
           this.issueDate = issueDate;
           this.address = address;
           this.shopAddress = shopAddress;
           this.lineItemContainer = lineItemContainer;
           this.attributes = attributes;
           this.error = error;
    }


    /**
     * Gets the path value for this TGetInfo_Return.
     * 
     * @return path   * order document object path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TGetInfo_Return.
     * 
     * @param path   * order document object path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the alias value for this TGetInfo_Return.
     * 
     * @return alias   * order document alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TGetInfo_Return.
     * 
     * @param alias   * order document alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the _class value for this TGetInfo_Return.
     * 
     * @return _class   * path to order document's class
     */
    public java.lang.String get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this TGetInfo_Return.
     * 
     * @param _class   * path to order document's class
     */
    public void set_class(java.lang.String _class) {
        this._class = _class;
    }


    /**
     * Gets the order value for this TGetInfo_Return.
     * 
     * @return order   * order document's order (object path to order)
     */
    public java.lang.String getOrder() {
        return order;
    }


    /**
     * Sets the order value for this TGetInfo_Return.
     * 
     * @param order   * order document's order (object path to order)
     */
    public void setOrder(java.lang.String order) {
        this.order = order;
    }


    /**
     * Gets the issued value for this TGetInfo_Return.
     * 
     * @return issued   * document issued or not
     */
    public java.lang.Boolean getIssued() {
        return issued;
    }


    /**
     * Sets the issued value for this TGetInfo_Return.
     * 
     * @param issued   * document issued or not
     */
    public void setIssued(java.lang.Boolean issued) {
        this.issued = issued;
    }


    /**
     * Gets the issueDate value for this TGetInfo_Return.
     * 
     * @return issueDate   * order document's issue date
     */
    public java.util.Calendar getIssueDate() {
        return issueDate;
    }


    /**
     * Sets the issueDate value for this TGetInfo_Return.
     * 
     * @param issueDate   * order document's issue date
     */
    public void setIssueDate(java.util.Calendar issueDate) {
        this.issueDate = issueDate;
    }


    /**
     * Gets the address value for this TGetInfo_Return.
     * 
     * @return address
     */
    public de.epages.WebServices.OrderDocumentService6.Stub.TAddressNamed getAddress() {
        return address;
    }


    /**
     * Sets the address value for this TGetInfo_Return.
     * 
     * @param address
     */
    public void setAddress(de.epages.WebServices.OrderDocumentService6.Stub.TAddressNamed address) {
        this.address = address;
    }


    /**
     * Gets the shopAddress value for this TGetInfo_Return.
     * 
     * @return shopAddress
     */
    public de.epages.WebServices.OrderDocumentService6.Stub.TAddressNamed getShopAddress() {
        return shopAddress;
    }


    /**
     * Sets the shopAddress value for this TGetInfo_Return.
     * 
     * @param shopAddress
     */
    public void setShopAddress(de.epages.WebServices.OrderDocumentService6.Stub.TAddressNamed shopAddress) {
        this.shopAddress = shopAddress;
    }


    /**
     * Gets the lineItemContainer value for this TGetInfo_Return.
     * 
     * @return lineItemContainer   * the products, payments, shipping etc. of this order document
     * (see orderdocumenttypes:TLineItemContainerOut)
     */
    public de.epages.WebServices.OrderDocumentService6.Stub.TLineItemContainerOut getLineItemContainer() {
        return lineItemContainer;
    }


    /**
     * Sets the lineItemContainer value for this TGetInfo_Return.
     * 
     * @param lineItemContainer   * the products, payments, shipping etc. of this order document
     * (see orderdocumenttypes:TLineItemContainerOut)
     */
    public void setLineItemContainer(de.epages.WebServices.OrderDocumentService6.Stub.TLineItemContainerOut lineItemContainer) {
        this.lineItemContainer = lineItemContainer;
    }


    /**
     * Gets the attributes value for this TGetInfo_Return.
     * 
     * @return attributes   * list of requested attributes (see epagestypes:ListOfAttributes)
     */
    public de.epages.WebServices.OrderDocumentService6.Stub.TAttribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this TGetInfo_Return.
     * 
     * @param attributes   * list of requested attributes (see epagestypes:ListOfAttributes)
     */
    public void setAttributes(de.epages.WebServices.OrderDocumentService6.Stub.TAttribute[] attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the error value for this TGetInfo_Return.
     * 
     * @return error   * error object (see epagestypes:TError)
     */
    public de.epages.WebServices.OrderDocumentService6.Stub.TError getError() {
        return error;
    }


    /**
     * Sets the error value for this TGetInfo_Return.
     * 
     * @param error   * error object (see epagestypes:TError)
     */
    public void setError(de.epages.WebServices.OrderDocumentService6.Stub.TError error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TGetInfo_Return)) return false;
        TGetInfo_Return other = (TGetInfo_Return) obj;
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
            ((this.alias==null && other.getAlias()==null) || 
             (this.alias!=null &&
              this.alias.equals(other.getAlias()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.order==null && other.getOrder()==null) || 
             (this.order!=null &&
              this.order.equals(other.getOrder()))) &&
            ((this.issued==null && other.getIssued()==null) || 
             (this.issued!=null &&
              this.issued.equals(other.getIssued()))) &&
            ((this.issueDate==null && other.getIssueDate()==null) || 
             (this.issueDate!=null &&
              this.issueDate.equals(other.getIssueDate()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.shopAddress==null && other.getShopAddress()==null) || 
             (this.shopAddress!=null &&
              this.shopAddress.equals(other.getShopAddress()))) &&
            ((this.lineItemContainer==null && other.getLineItemContainer()==null) || 
             (this.lineItemContainer!=null &&
              this.lineItemContainer.equals(other.getLineItemContainer()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes()))) &&
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
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getOrder() != null) {
            _hashCode += getOrder().hashCode();
        }
        if (getIssued() != null) {
            _hashCode += getIssued().hashCode();
        }
        if (getIssueDate() != null) {
            _hashCode += getIssueDate().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getShopAddress() != null) {
            _hashCode += getShopAddress().hashCode();
        }
        if (getLineItemContainer() != null) {
            _hashCode += getLineItemContainer().hashCode();
        }
        if (getAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributes(), i);
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
        new org.apache.axis.description.TypeDesc(TGetInfo_Return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/OrderDocumentTypes/2011/01", "TGetInfo_Return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Class"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issued");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Issued"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IssueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ShopTypes/2011/01", "TAddressNamed"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ShopAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ShopTypes/2011/01", "TAddressNamed"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemContainer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LineItemContainer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/OrderDocumentTypes/2011/01", "TLineItemContainerOut"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TAttribute"));
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
