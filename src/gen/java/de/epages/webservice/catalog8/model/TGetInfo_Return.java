/**
 * TGetInfo_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.catalog8.model;


/**
 * a single return value of a getInfo() catalog call.
 *         the path will be always returned.
 *         the error element will be returned in case of error.
 *         all other elements will be returned if no error has occured.
 */
public class TGetInfo_Return  implements java.io.Serializable {
    /* catalog object path */
    private java.lang.String path;

    /* catalog alias */
    private java.lang.String alias;

    /* path to catalog's class */
    private java.lang.String _class;

    /* catalog's position under the pages of the parent catalog */
    private java.math.BigInteger position;

    /* parent catalog object path */
    private java.lang.String parentCatalog;

    /* web url to view the catalog in the shop storefront */
    private java.lang.String webUrl;

    private java.lang.Boolean isVisible;

    /* localized name of catalog (see epagestypes:TLocalizedValue) */
    private de.epages.webservice.common.model.TLocalizedValue[] name;

    /* localized text of catalog (see epagestypes:TLocalizedValue) */
    private de.epages.webservice.common.model.TLocalizedValue[] text;

    /* localized additional text1 of catalog (see epagestypes:TLocalizedValue) */
    private de.epages.webservice.common.model.TLocalizedValue[] text1;

    /* localized additional text2 of catalog (see epagestypes:TLocalizedValue) */
    private de.epages.webservice.common.model.TLocalizedValue[] text2;

    /* localized additional text3 of catalog (see epagestypes:TLocalizedValue) */
    private de.epages.webservice.common.model.TLocalizedValue[] text3;

    /* short uri (unique part of short URL, see CanonicalURL) */
    private de.epages.webservice.common.model.TLocalizedValue[] URI;

    /* complete url for canonical tag (based on domain name and URI,
     * i.e. http://my.do.main/myURI) */
    private de.epages.webservice.common.model.TLocalizedValue[] canonicalURL;

    /* list of sub catalog paths */
    private java.lang.String[] subCatalogs;

    /* list active template types (layout designs)
     *             i.e. name=Content-Base and type=4_img_img_txt_img
     *             means that the template type PageTypes/SF-Category/TemplateTypes/Content-Base
     * is active (selected) as PageTypes/SF-Category/TemplateTypes/Content-Base/4_img_img_txt_img
     * to show the category as image, image, text and image order */
    private de.epages.webservice.common.model.TAttribute[] templateTypes;

    /* list of requested attributes (see epagestypes:ListOfAttributes) */
    private de.epages.webservice.common.model.TAttribute[] attributes;

    /* error object (see epagestypes:TError) */
    private de.epages.webservice.common.model.TError error;

    public TGetInfo_Return() {
    }

    public TGetInfo_Return(
           java.lang.String path,
           java.lang.String alias,
           java.lang.String _class,
           java.math.BigInteger position,
           java.lang.String parentCatalog,
           java.lang.String webUrl,
           java.lang.Boolean isVisible,
           de.epages.webservice.common.model.TLocalizedValue[] name,
           de.epages.webservice.common.model.TLocalizedValue[] text,
           de.epages.webservice.common.model.TLocalizedValue[] text1,
           de.epages.webservice.common.model.TLocalizedValue[] text2,
           de.epages.webservice.common.model.TLocalizedValue[] text3,
           de.epages.webservice.common.model.TLocalizedValue[] URI,
           de.epages.webservice.common.model.TLocalizedValue[] canonicalURL,
           java.lang.String[] subCatalogs,
           de.epages.webservice.common.model.TAttribute[] templateTypes,
           de.epages.webservice.common.model.TAttribute[] attributes,
           de.epages.webservice.common.model.TError error) {
           this.path = path;
           this.alias = alias;
           this._class = _class;
           this.position = position;
           this.parentCatalog = parentCatalog;
           this.webUrl = webUrl;
           this.isVisible = isVisible;
           this.name = name;
           this.text = text;
           this.text1 = text1;
           this.text2 = text2;
           this.text3 = text3;
           this.URI = URI;
           this.canonicalURL = canonicalURL;
           this.subCatalogs = subCatalogs;
           this.templateTypes = templateTypes;
           this.attributes = attributes;
           this.error = error;
    }


    /**
     * Gets the path value for this TGetInfo_Return.
     * 
     * @return path   * catalog object path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TGetInfo_Return.
     * 
     * @param path   * catalog object path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the alias value for this TGetInfo_Return.
     * 
     * @return alias   * catalog alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TGetInfo_Return.
     * 
     * @param alias   * catalog alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the _class value for this TGetInfo_Return.
     * 
     * @return _class   * path to catalog's class
     */
    public java.lang.String get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this TGetInfo_Return.
     * 
     * @param _class   * path to catalog's class
     */
    public void set_class(java.lang.String _class) {
        this._class = _class;
    }


    /**
     * Gets the position value for this TGetInfo_Return.
     * 
     * @return position   * catalog's position under the pages of the parent catalog
     */
    public java.math.BigInteger getPosition() {
        return position;
    }


    /**
     * Sets the position value for this TGetInfo_Return.
     * 
     * @param position   * catalog's position under the pages of the parent catalog
     */
    public void setPosition(java.math.BigInteger position) {
        this.position = position;
    }


    /**
     * Gets the parentCatalog value for this TGetInfo_Return.
     * 
     * @return parentCatalog   * parent catalog object path
     */
    public java.lang.String getParentCatalog() {
        return parentCatalog;
    }


    /**
     * Sets the parentCatalog value for this TGetInfo_Return.
     * 
     * @param parentCatalog   * parent catalog object path
     */
    public void setParentCatalog(java.lang.String parentCatalog) {
        this.parentCatalog = parentCatalog;
    }


    /**
     * Gets the webUrl value for this TGetInfo_Return.
     * 
     * @return webUrl   * web url to view the catalog in the shop storefront
     */
    public java.lang.String getWebUrl() {
        return webUrl;
    }


    /**
     * Sets the webUrl value for this TGetInfo_Return.
     * 
     * @param webUrl   * web url to view the catalog in the shop storefront
     */
    public void setWebUrl(java.lang.String webUrl) {
        this.webUrl = webUrl;
    }


    /**
     * Gets the isVisible value for this TGetInfo_Return.
     * 
     * @return isVisible
     */
    public java.lang.Boolean getIsVisible() {
        return isVisible;
    }


    /**
     * Sets the isVisible value for this TGetInfo_Return.
     * 
     * @param isVisible
     */
    public void setIsVisible(java.lang.Boolean isVisible) {
        this.isVisible = isVisible;
    }


    /**
     * Gets the name value for this TGetInfo_Return.
     * 
     * @return name   * localized name of catalog (see epagestypes:TLocalizedValue)
     */
    public de.epages.webservice.common.model.TLocalizedValue[] getName() {
        return name;
    }


    /**
     * Sets the name value for this TGetInfo_Return.
     * 
     * @param name   * localized name of catalog (see epagestypes:TLocalizedValue)
     */
    public void setName(de.epages.webservice.common.model.TLocalizedValue[] name) {
        this.name = name;
    }


    /**
     * Gets the text value for this TGetInfo_Return.
     * 
     * @return text   * localized text of catalog (see epagestypes:TLocalizedValue)
     */
    public de.epages.webservice.common.model.TLocalizedValue[] getText() {
        return text;
    }


    /**
     * Sets the text value for this TGetInfo_Return.
     * 
     * @param text   * localized text of catalog (see epagestypes:TLocalizedValue)
     */
    public void setText(de.epages.webservice.common.model.TLocalizedValue[] text) {
        this.text = text;
    }


    /**
     * Gets the text1 value for this TGetInfo_Return.
     * 
     * @return text1   * localized additional text1 of catalog (see epagestypes:TLocalizedValue)
     */
    public de.epages.webservice.common.model.TLocalizedValue[] getText1() {
        return text1;
    }


    /**
     * Sets the text1 value for this TGetInfo_Return.
     * 
     * @param text1   * localized additional text1 of catalog (see epagestypes:TLocalizedValue)
     */
    public void setText1(de.epages.webservice.common.model.TLocalizedValue[] text1) {
        this.text1 = text1;
    }


    /**
     * Gets the text2 value for this TGetInfo_Return.
     * 
     * @return text2   * localized additional text2 of catalog (see epagestypes:TLocalizedValue)
     */
    public de.epages.webservice.common.model.TLocalizedValue[] getText2() {
        return text2;
    }


    /**
     * Sets the text2 value for this TGetInfo_Return.
     * 
     * @param text2   * localized additional text2 of catalog (see epagestypes:TLocalizedValue)
     */
    public void setText2(de.epages.webservice.common.model.TLocalizedValue[] text2) {
        this.text2 = text2;
    }


    /**
     * Gets the text3 value for this TGetInfo_Return.
     * 
     * @return text3   * localized additional text3 of catalog (see epagestypes:TLocalizedValue)
     */
    public de.epages.webservice.common.model.TLocalizedValue[] getText3() {
        return text3;
    }


    /**
     * Sets the text3 value for this TGetInfo_Return.
     * 
     * @param text3   * localized additional text3 of catalog (see epagestypes:TLocalizedValue)
     */
    public void setText3(de.epages.webservice.common.model.TLocalizedValue[] text3) {
        this.text3 = text3;
    }


    /**
     * Gets the URI value for this TGetInfo_Return.
     * 
     * @return URI   * short uri (unique part of short URL, see CanonicalURL)
     */
    public de.epages.webservice.common.model.TLocalizedValue[] getURI() {
        return URI;
    }


    /**
     * Sets the URI value for this TGetInfo_Return.
     * 
     * @param URI   * short uri (unique part of short URL, see CanonicalURL)
     */
    public void setURI(de.epages.webservice.common.model.TLocalizedValue[] URI) {
        this.URI = URI;
    }


    /**
     * Gets the canonicalURL value for this TGetInfo_Return.
     * 
     * @return canonicalURL   * complete url for canonical tag (based on domain name and URI,
     * i.e. http://my.do.main/myURI)
     */
    public de.epages.webservice.common.model.TLocalizedValue[] getCanonicalURL() {
        return canonicalURL;
    }


    /**
     * Sets the canonicalURL value for this TGetInfo_Return.
     * 
     * @param canonicalURL   * complete url for canonical tag (based on domain name and URI,
     * i.e. http://my.do.main/myURI)
     */
    public void setCanonicalURL(de.epages.webservice.common.model.TLocalizedValue[] canonicalURL) {
        this.canonicalURL = canonicalURL;
    }


    /**
     * Gets the subCatalogs value for this TGetInfo_Return.
     * 
     * @return subCatalogs   * list of sub catalog paths
     */
    public java.lang.String[] getSubCatalogs() {
        return subCatalogs;
    }


    /**
     * Sets the subCatalogs value for this TGetInfo_Return.
     * 
     * @param subCatalogs   * list of sub catalog paths
     */
    public void setSubCatalogs(java.lang.String[] subCatalogs) {
        this.subCatalogs = subCatalogs;
    }


    /**
     * Gets the templateTypes value for this TGetInfo_Return.
     * 
     * @return templateTypes   * list active template types (layout designs)
     *             i.e. name=Content-Base and type=4_img_img_txt_img
     *             means that the template type PageTypes/SF-Category/TemplateTypes/Content-Base
     * is active (selected) as PageTypes/SF-Category/TemplateTypes/Content-Base/4_img_img_txt_img
     * to show the category as image, image, text and image order
     */
    public de.epages.webservice.common.model.TAttribute[] getTemplateTypes() {
        return templateTypes;
    }


    /**
     * Sets the templateTypes value for this TGetInfo_Return.
     * 
     * @param templateTypes   * list active template types (layout designs)
     *             i.e. name=Content-Base and type=4_img_img_txt_img
     *             means that the template type PageTypes/SF-Category/TemplateTypes/Content-Base
     * is active (selected) as PageTypes/SF-Category/TemplateTypes/Content-Base/4_img_img_txt_img
     * to show the category as image, image, text and image order
     */
    public void setTemplateTypes(de.epages.webservice.common.model.TAttribute[] templateTypes) {
        this.templateTypes = templateTypes;
    }


    /**
     * Gets the attributes value for this TGetInfo_Return.
     * 
     * @return attributes   * list of requested attributes (see epagestypes:ListOfAttributes)
     */
    public de.epages.webservice.common.model.TAttribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this TGetInfo_Return.
     * 
     * @param attributes   * list of requested attributes (see epagestypes:ListOfAttributes)
     */
    public void setAttributes(de.epages.webservice.common.model.TAttribute[] attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the error value for this TGetInfo_Return.
     * 
     * @return error   * error object (see epagestypes:TError)
     */
    public de.epages.webservice.common.model.TError getError() {
        return error;
    }


    /**
     * Sets the error value for this TGetInfo_Return.
     * 
     * @param error   * error object (see epagestypes:TError)
     */
    public void setError(de.epages.webservice.common.model.TError error) {
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
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition()))) &&
            ((this.parentCatalog==null && other.getParentCatalog()==null) || 
             (this.parentCatalog!=null &&
              this.parentCatalog.equals(other.getParentCatalog()))) &&
            ((this.webUrl==null && other.getWebUrl()==null) || 
             (this.webUrl!=null &&
              this.webUrl.equals(other.getWebUrl()))) &&
            ((this.isVisible==null && other.getIsVisible()==null) || 
             (this.isVisible!=null &&
              this.isVisible.equals(other.getIsVisible()))) &&
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
            ((this.URI==null && other.getURI()==null) || 
             (this.URI!=null &&
              java.util.Arrays.equals(this.URI, other.getURI()))) &&
            ((this.canonicalURL==null && other.getCanonicalURL()==null) || 
             (this.canonicalURL!=null &&
              java.util.Arrays.equals(this.canonicalURL, other.getCanonicalURL()))) &&
            ((this.subCatalogs==null && other.getSubCatalogs()==null) || 
             (this.subCatalogs!=null &&
              java.util.Arrays.equals(this.subCatalogs, other.getSubCatalogs()))) &&
            ((this.templateTypes==null && other.getTemplateTypes()==null) || 
             (this.templateTypes!=null &&
              java.util.Arrays.equals(this.templateTypes, other.getTemplateTypes()))) &&
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
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        if (getParentCatalog() != null) {
            _hashCode += getParentCatalog().hashCode();
        }
        if (getWebUrl() != null) {
            _hashCode += getWebUrl().hashCode();
        }
        if (getIsVisible() != null) {
            _hashCode += getIsVisible().hashCode();
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
        if (getURI() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getURI());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getURI(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCanonicalURL() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCanonicalURL());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCanonicalURL(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubCatalogs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubCatalogs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubCatalogs(), i);
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/CatalogTypes/2011/11", "TGetInfo_Return"));
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
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Class"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("parentCatalog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ParentCatalog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WebUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("URI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URI"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TLocalizedValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canonicalURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CanonicalURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TLocalizedValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subCatalogs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubCatalogs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
