/**
 * TUpdate_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.CatalogService3.Stub;


/**
 * input arguments of a single update() catalog call.
 *         a set of optional catalog specific attributes that will be
 * updated.
 *         the path element is mandatory.
 *         all others are optional.
 */
public class TUpdate_Input  implements java.io.Serializable {
    /* catalog path */
    private java.lang.String path;

    /* flag indicating whether or not the catalog is visible */
    private java.lang.Boolean isVisible;

    /* catalog's position under the pages of the parent catalog */
    private java.math.BigInteger position;

    /* localized name of catalog (see epagestypes:TLocalizedValue) */
    private de.epages.WebServices.CatalogService3.Stub.TLocalizedValue[] name;

    /* localized text of catalog (see epagestypes:TLocalizedValue) */
    private de.epages.WebServices.CatalogService3.Stub.TLocalizedValue[] text;

    /* localized additional text1 of catalog (see epagestypes:TLocalizedValue) */
    private de.epages.WebServices.CatalogService3.Stub.TLocalizedValue[] text1;

    /* localized additional text2 of catalog (see epagestypes:TLocalizedValue) */
    private de.epages.WebServices.CatalogService3.Stub.TLocalizedValue[] text2;

    /* localized additional text3 of catalog (see epagestypes:TLocalizedValue) */
    private de.epages.WebServices.CatalogService3.Stub.TLocalizedValue[] text3;

    /* list of template types (layout designs) to activate
     *             i.e. name=Content-Base and type=4_img_img_txt_img
     *             means that the template type PageTypes/SF-Category/TemplateTypes/Content-Base
     * activated (selected) as PageTypes/SF-Category/TemplateTypes/Content-Base/4_img_img_txt_img
     * to show the category as image, image, text and image order */
    private de.epages.WebServices.CatalogService3.Stub.TAttribute[] templateTypes;

    /* list of attributes to update (see epagestypes:ListOfAttributes) */
    private de.epages.WebServices.CatalogService3.Stub.TAttribute[] attributes;

    public TUpdate_Input() {
    }

    public TUpdate_Input(
           java.lang.String path,
           java.lang.Boolean isVisible,
           java.math.BigInteger position,
           de.epages.WebServices.CatalogService3.Stub.TLocalizedValue[] name,
           de.epages.WebServices.CatalogService3.Stub.TLocalizedValue[] text,
           de.epages.WebServices.CatalogService3.Stub.TLocalizedValue[] text1,
           de.epages.WebServices.CatalogService3.Stub.TLocalizedValue[] text2,
           de.epages.WebServices.CatalogService3.Stub.TLocalizedValue[] text3,
           de.epages.WebServices.CatalogService3.Stub.TAttribute[] templateTypes,
           de.epages.WebServices.CatalogService3.Stub.TAttribute[] attributes) {
           this.path = path;
           this.isVisible = isVisible;
           this.position = position;
           this.name = name;
           this.text = text;
           this.text1 = text1;
           this.text2 = text2;
           this.text3 = text3;
           this.templateTypes = templateTypes;
           this.attributes = attributes;
    }


    /**
     * Gets the path value for this TUpdate_Input.
     * 
     * @return path   * catalog path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TUpdate_Input.
     * 
     * @param path   * catalog path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the isVisible value for this TUpdate_Input.
     * 
     * @return isVisible   * flag indicating whether or not the catalog is visible
     */
    public java.lang.Boolean getIsVisible() {
        return isVisible;
    }


    /**
     * Sets the isVisible value for this TUpdate_Input.
     * 
     * @param isVisible   * flag indicating whether or not the catalog is visible
     */
    public void setIsVisible(java.lang.Boolean isVisible) {
        this.isVisible = isVisible;
    }


    /**
     * Gets the position value for this TUpdate_Input.
     * 
     * @return position   * catalog's position under the pages of the parent catalog
     */
    public java.math.BigInteger getPosition() {
        return position;
    }


    /**
     * Sets the position value for this TUpdate_Input.
     * 
     * @param position   * catalog's position under the pages of the parent catalog
     */
    public void setPosition(java.math.BigInteger position) {
        this.position = position;
    }


    /**
     * Gets the name value for this TUpdate_Input.
     * 
     * @return name   * localized name of catalog (see epagestypes:TLocalizedValue)
     */
    public de.epages.WebServices.CatalogService3.Stub.TLocalizedValue[] getName() {
        return name;
    }


    /**
     * Sets the name value for this TUpdate_Input.
     * 
     * @param name   * localized name of catalog (see epagestypes:TLocalizedValue)
     */
    public void setName(de.epages.WebServices.CatalogService3.Stub.TLocalizedValue[] name) {
        this.name = name;
    }


    /**
     * Gets the text value for this TUpdate_Input.
     * 
     * @return text   * localized text of catalog (see epagestypes:TLocalizedValue)
     */
    public de.epages.WebServices.CatalogService3.Stub.TLocalizedValue[] getText() {
        return text;
    }


    /**
     * Sets the text value for this TUpdate_Input.
     * 
     * @param text   * localized text of catalog (see epagestypes:TLocalizedValue)
     */
    public void setText(de.epages.WebServices.CatalogService3.Stub.TLocalizedValue[] text) {
        this.text = text;
    }


    /**
     * Gets the text1 value for this TUpdate_Input.
     * 
     * @return text1   * localized additional text1 of catalog (see epagestypes:TLocalizedValue)
     */
    public de.epages.WebServices.CatalogService3.Stub.TLocalizedValue[] getText1() {
        return text1;
    }


    /**
     * Sets the text1 value for this TUpdate_Input.
     * 
     * @param text1   * localized additional text1 of catalog (see epagestypes:TLocalizedValue)
     */
    public void setText1(de.epages.WebServices.CatalogService3.Stub.TLocalizedValue[] text1) {
        this.text1 = text1;
    }


    /**
     * Gets the text2 value for this TUpdate_Input.
     * 
     * @return text2   * localized additional text2 of catalog (see epagestypes:TLocalizedValue)
     */
    public de.epages.WebServices.CatalogService3.Stub.TLocalizedValue[] getText2() {
        return text2;
    }


    /**
     * Sets the text2 value for this TUpdate_Input.
     * 
     * @param text2   * localized additional text2 of catalog (see epagestypes:TLocalizedValue)
     */
    public void setText2(de.epages.WebServices.CatalogService3.Stub.TLocalizedValue[] text2) {
        this.text2 = text2;
    }


    /**
     * Gets the text3 value for this TUpdate_Input.
     * 
     * @return text3   * localized additional text3 of catalog (see epagestypes:TLocalizedValue)
     */
    public de.epages.WebServices.CatalogService3.Stub.TLocalizedValue[] getText3() {
        return text3;
    }


    /**
     * Sets the text3 value for this TUpdate_Input.
     * 
     * @param text3   * localized additional text3 of catalog (see epagestypes:TLocalizedValue)
     */
    public void setText3(de.epages.WebServices.CatalogService3.Stub.TLocalizedValue[] text3) {
        this.text3 = text3;
    }


    /**
     * Gets the templateTypes value for this TUpdate_Input.
     * 
     * @return templateTypes   * list of template types (layout designs) to activate
     *             i.e. name=Content-Base and type=4_img_img_txt_img
     *             means that the template type PageTypes/SF-Category/TemplateTypes/Content-Base
     * activated (selected) as PageTypes/SF-Category/TemplateTypes/Content-Base/4_img_img_txt_img
     * to show the category as image, image, text and image order
     */
    public de.epages.WebServices.CatalogService3.Stub.TAttribute[] getTemplateTypes() {
        return templateTypes;
    }


    /**
     * Sets the templateTypes value for this TUpdate_Input.
     * 
     * @param templateTypes   * list of template types (layout designs) to activate
     *             i.e. name=Content-Base and type=4_img_img_txt_img
     *             means that the template type PageTypes/SF-Category/TemplateTypes/Content-Base
     * activated (selected) as PageTypes/SF-Category/TemplateTypes/Content-Base/4_img_img_txt_img
     * to show the category as image, image, text and image order
     */
    public void setTemplateTypes(de.epages.WebServices.CatalogService3.Stub.TAttribute[] templateTypes) {
        this.templateTypes = templateTypes;
    }


    /**
     * Gets the attributes value for this TUpdate_Input.
     * 
     * @return attributes   * list of attributes to update (see epagestypes:ListOfAttributes)
     */
    public de.epages.WebServices.CatalogService3.Stub.TAttribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this TUpdate_Input.
     * 
     * @param attributes   * list of attributes to update (see epagestypes:ListOfAttributes)
     */
    public void setAttributes(de.epages.WebServices.CatalogService3.Stub.TAttribute[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TUpdate_Input)) return false;
        TUpdate_Input other = (TUpdate_Input) obj;
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
            ((this.text1==null && other.getText1()==null) || 
             (this.text1!=null &&
              java.util.Arrays.equals(this.text1, other.getText1()))) &&
            ((this.text2==null && other.getText2()==null) || 
             (this.text2!=null &&
              java.util.Arrays.equals(this.text2, other.getText2()))) &&
            ((this.text3==null && other.getText3()==null) || 
             (this.text3!=null &&
              java.util.Arrays.equals(this.text3, other.getText3()))) &&
            ((this.templateTypes==null && other.getTemplateTypes()==null) || 
             (this.templateTypes!=null &&
              java.util.Arrays.equals(this.templateTypes, other.getTemplateTypes()))) &&
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
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
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
        if (getText1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getText1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getText1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getText2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getText2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getText2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getText3() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getText3());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getText3(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTemplateTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTemplateTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTemplateTypes(), i);
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
        new org.apache.axis.description.TypeDesc(TUpdate_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/CatalogTypes/2008/11", "TUpdate_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Path"));
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
        elemField.setFieldName("text1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Text1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TLocalizedValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Text2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TLocalizedValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Text3"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TLocalizedValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TemplateTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TAttribute"));
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
