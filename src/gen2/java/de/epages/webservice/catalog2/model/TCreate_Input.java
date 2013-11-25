/**
 * TCreate_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.catalog2.model;


/**
 * input arguments of a single create() catalog call.
 *         a set of catalog specific attributes that will be used to
 * create a catalog.
 */
public class TCreate_Input  implements java.io.Serializable {
    /* catalog alias */
    private java.lang.String alias;

    /* path of parent catalog; this catalog must exist */
    private java.lang.String parentCatalog;

    /* flag indicating whether or not the catalog is visible */
    private java.lang.Boolean isVisible;

    /* catalog's position under the pages of the parent catalog */
    private java.math.BigInteger position;

    /* localized name of catalog (see epagestypes:TLocalizedValue) */
    private de.epages.webservice.common.model.TLocalizedValue[] name;

    /* localized text of catalog (see epagestypes:TLocalizedValue) */
    private de.epages.webservice.common.model.TLocalizedValue[] text;

    /* list of attributes to set (see epagestypes:ListOfAttributes) */
    private de.epages.webservice.common.model.TAttribute[] attributes;

    public TCreate_Input() {
    }

    public TCreate_Input(
           java.lang.String alias,
           java.lang.String parentCatalog,
           java.lang.Boolean isVisible,
           java.math.BigInteger position,
           de.epages.webservice.common.model.TLocalizedValue[] name,
           de.epages.webservice.common.model.TLocalizedValue[] text,
           de.epages.webservice.common.model.TAttribute[] attributes) {
           this.alias = alias;
           this.parentCatalog = parentCatalog;
           this.isVisible = isVisible;
           this.position = position;
           this.name = name;
           this.text = text;
           this.attributes = attributes;
    }


    /**
     * Gets the alias value for this TCreate_Input.
     * 
     * @return alias   * catalog alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TCreate_Input.
     * 
     * @param alias   * catalog alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the parentCatalog value for this TCreate_Input.
     * 
     * @return parentCatalog   * path of parent catalog; this catalog must exist
     */
    public java.lang.String getParentCatalog() {
        return parentCatalog;
    }


    /**
     * Sets the parentCatalog value for this TCreate_Input.
     * 
     * @param parentCatalog   * path of parent catalog; this catalog must exist
     */
    public void setParentCatalog(java.lang.String parentCatalog) {
        this.parentCatalog = parentCatalog;
    }


    /**
     * Gets the isVisible value for this TCreate_Input.
     * 
     * @return isVisible   * flag indicating whether or not the catalog is visible
     */
    public java.lang.Boolean getIsVisible() {
        return isVisible;
    }


    /**
     * Sets the isVisible value for this TCreate_Input.
     * 
     * @param isVisible   * flag indicating whether or not the catalog is visible
     */
    public void setIsVisible(java.lang.Boolean isVisible) {
        this.isVisible = isVisible;
    }


    /**
     * Gets the position value for this TCreate_Input.
     * 
     * @return position   * catalog's position under the pages of the parent catalog
     */
    public java.math.BigInteger getPosition() {
        return position;
    }


    /**
     * Sets the position value for this TCreate_Input.
     * 
     * @param position   * catalog's position under the pages of the parent catalog
     */
    public void setPosition(java.math.BigInteger position) {
        this.position = position;
    }


    /**
     * Gets the name value for this TCreate_Input.
     * 
     * @return name   * localized name of catalog (see epagestypes:TLocalizedValue)
     */
    public de.epages.webservice.common.model.TLocalizedValue[] getName() {
        return name;
    }


    /**
     * Sets the name value for this TCreate_Input.
     * 
     * @param name   * localized name of catalog (see epagestypes:TLocalizedValue)
     */
    public void setName(de.epages.webservice.common.model.TLocalizedValue[] name) {
        this.name = name;
    }


    /**
     * Gets the text value for this TCreate_Input.
     * 
     * @return text   * localized text of catalog (see epagestypes:TLocalizedValue)
     */
    public de.epages.webservice.common.model.TLocalizedValue[] getText() {
        return text;
    }


    /**
     * Sets the text value for this TCreate_Input.
     * 
     * @param text   * localized text of catalog (see epagestypes:TLocalizedValue)
     */
    public void setText(de.epages.webservice.common.model.TLocalizedValue[] text) {
        this.text = text;
    }


    /**
     * Gets the attributes value for this TCreate_Input.
     * 
     * @return attributes   * list of attributes to set (see epagestypes:ListOfAttributes)
     */
    public de.epages.webservice.common.model.TAttribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this TCreate_Input.
     * 
     * @param attributes   * list of attributes to set (see epagestypes:ListOfAttributes)
     */
    public void setAttributes(de.epages.webservice.common.model.TAttribute[] attributes) {
        this.attributes = attributes;
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
            ((this.alias==null && other.getAlias()==null) || 
             (this.alias!=null &&
              this.alias.equals(other.getAlias()))) &&
            ((this.parentCatalog==null && other.getParentCatalog()==null) || 
             (this.parentCatalog!=null &&
              this.parentCatalog.equals(other.getParentCatalog()))) &&
            ((this.isVisible==null && other.getIsVisible()==null) || 
             (this.isVisible!=null &&
              this.isVisible.equals(other.getIsVisible()))) &&
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              java.util.Arrays.equals(this.text, other.getText()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes())));
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
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        if (getParentCatalog() != null) {
            _hashCode += getParentCatalog().hashCode();
        }
        if (getIsVisible() != null) {
            _hashCode += getIsVisible().hashCode();
        }
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        if (getName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getText() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getText());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getText(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCreate_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/CatalogTypes/2008/03", "TCreate_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentCatalog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ParentCatalog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVisible");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsVisible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TLocalizedValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Text"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TLocalizedValue"));
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
