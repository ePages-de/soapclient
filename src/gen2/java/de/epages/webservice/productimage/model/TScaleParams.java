/**
 * TScaleParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.productimage.model;


/**
 * the params for scaling product images
 */
public class TScaleParams  implements java.io.Serializable {
    /* obsolete */
    private java.lang.Boolean SCALE_BORDER_IMAGE_h;

    /* obsolete */
    private java.lang.Boolean SCALE_BORDER_IMAGE_m;

    /* obsolete */
    private java.lang.String SCALE_BORDER_COLOR_h;

    /* obsolete */
    private java.lang.String SCALE_BORDER_COLOR_m;

    /* attribute name of the image with size 'h', for example: 'ImageHotDeal' */
    private java.lang.String SCALE_NAME_h;

    /* attribute name of the image with size 'm', for example: 'ImageMedium' */
    private java.lang.String SCALE_NAME_m;

    /* attribute name of the image with size 's', for example: 'ImageSmall' */
    private java.lang.String SCALE_NAME_s;

    /* size in pixel of the hot-deal image */
    private java.lang.String SCALE_SIZE_h;

    /* size in pixel of the medium image */
    private java.lang.String SCALE_SIZE_m;

    /* size in pixel of the small image */
    private java.lang.String SCALE_SIZE_s;

    public TScaleParams() {
    }

    public TScaleParams(
           java.lang.Boolean SCALE_BORDER_IMAGE_h,
           java.lang.Boolean SCALE_BORDER_IMAGE_m,
           java.lang.String SCALE_BORDER_COLOR_h,
           java.lang.String SCALE_BORDER_COLOR_m,
           java.lang.String SCALE_NAME_h,
           java.lang.String SCALE_NAME_m,
           java.lang.String SCALE_NAME_s,
           java.lang.String SCALE_SIZE_h,
           java.lang.String SCALE_SIZE_m,
           java.lang.String SCALE_SIZE_s) {
           this.SCALE_BORDER_IMAGE_h = SCALE_BORDER_IMAGE_h;
           this.SCALE_BORDER_IMAGE_m = SCALE_BORDER_IMAGE_m;
           this.SCALE_BORDER_COLOR_h = SCALE_BORDER_COLOR_h;
           this.SCALE_BORDER_COLOR_m = SCALE_BORDER_COLOR_m;
           this.SCALE_NAME_h = SCALE_NAME_h;
           this.SCALE_NAME_m = SCALE_NAME_m;
           this.SCALE_NAME_s = SCALE_NAME_s;
           this.SCALE_SIZE_h = SCALE_SIZE_h;
           this.SCALE_SIZE_m = SCALE_SIZE_m;
           this.SCALE_SIZE_s = SCALE_SIZE_s;
    }


    /**
     * Gets the SCALE_BORDER_IMAGE_h value for this TScaleParams.
     * 
     * @return SCALE_BORDER_IMAGE_h   * obsolete
     */
    public java.lang.Boolean getSCALE_BORDER_IMAGE_h() {
        return SCALE_BORDER_IMAGE_h;
    }


    /**
     * Sets the SCALE_BORDER_IMAGE_h value for this TScaleParams.
     * 
     * @param SCALE_BORDER_IMAGE_h   * obsolete
     */
    public void setSCALE_BORDER_IMAGE_h(java.lang.Boolean SCALE_BORDER_IMAGE_h) {
        this.SCALE_BORDER_IMAGE_h = SCALE_BORDER_IMAGE_h;
    }


    /**
     * Gets the SCALE_BORDER_IMAGE_m value for this TScaleParams.
     * 
     * @return SCALE_BORDER_IMAGE_m   * obsolete
     */
    public java.lang.Boolean getSCALE_BORDER_IMAGE_m() {
        return SCALE_BORDER_IMAGE_m;
    }


    /**
     * Sets the SCALE_BORDER_IMAGE_m value for this TScaleParams.
     * 
     * @param SCALE_BORDER_IMAGE_m   * obsolete
     */
    public void setSCALE_BORDER_IMAGE_m(java.lang.Boolean SCALE_BORDER_IMAGE_m) {
        this.SCALE_BORDER_IMAGE_m = SCALE_BORDER_IMAGE_m;
    }


    /**
     * Gets the SCALE_BORDER_COLOR_h value for this TScaleParams.
     * 
     * @return SCALE_BORDER_COLOR_h   * obsolete
     */
    public java.lang.String getSCALE_BORDER_COLOR_h() {
        return SCALE_BORDER_COLOR_h;
    }


    /**
     * Sets the SCALE_BORDER_COLOR_h value for this TScaleParams.
     * 
     * @param SCALE_BORDER_COLOR_h   * obsolete
     */
    public void setSCALE_BORDER_COLOR_h(java.lang.String SCALE_BORDER_COLOR_h) {
        this.SCALE_BORDER_COLOR_h = SCALE_BORDER_COLOR_h;
    }


    /**
     * Gets the SCALE_BORDER_COLOR_m value for this TScaleParams.
     * 
     * @return SCALE_BORDER_COLOR_m   * obsolete
     */
    public java.lang.String getSCALE_BORDER_COLOR_m() {
        return SCALE_BORDER_COLOR_m;
    }


    /**
     * Sets the SCALE_BORDER_COLOR_m value for this TScaleParams.
     * 
     * @param SCALE_BORDER_COLOR_m   * obsolete
     */
    public void setSCALE_BORDER_COLOR_m(java.lang.String SCALE_BORDER_COLOR_m) {
        this.SCALE_BORDER_COLOR_m = SCALE_BORDER_COLOR_m;
    }


    /**
     * Gets the SCALE_NAME_h value for this TScaleParams.
     * 
     * @return SCALE_NAME_h   * attribute name of the image with size 'h', for example: 'ImageHotDeal'
     */
    public java.lang.String getSCALE_NAME_h() {
        return SCALE_NAME_h;
    }


    /**
     * Sets the SCALE_NAME_h value for this TScaleParams.
     * 
     * @param SCALE_NAME_h   * attribute name of the image with size 'h', for example: 'ImageHotDeal'
     */
    public void setSCALE_NAME_h(java.lang.String SCALE_NAME_h) {
        this.SCALE_NAME_h = SCALE_NAME_h;
    }


    /**
     * Gets the SCALE_NAME_m value for this TScaleParams.
     * 
     * @return SCALE_NAME_m   * attribute name of the image with size 'm', for example: 'ImageMedium'
     */
    public java.lang.String getSCALE_NAME_m() {
        return SCALE_NAME_m;
    }


    /**
     * Sets the SCALE_NAME_m value for this TScaleParams.
     * 
     * @param SCALE_NAME_m   * attribute name of the image with size 'm', for example: 'ImageMedium'
     */
    public void setSCALE_NAME_m(java.lang.String SCALE_NAME_m) {
        this.SCALE_NAME_m = SCALE_NAME_m;
    }


    /**
     * Gets the SCALE_NAME_s value for this TScaleParams.
     * 
     * @return SCALE_NAME_s   * attribute name of the image with size 's', for example: 'ImageSmall'
     */
    public java.lang.String getSCALE_NAME_s() {
        return SCALE_NAME_s;
    }


    /**
     * Sets the SCALE_NAME_s value for this TScaleParams.
     * 
     * @param SCALE_NAME_s   * attribute name of the image with size 's', for example: 'ImageSmall'
     */
    public void setSCALE_NAME_s(java.lang.String SCALE_NAME_s) {
        this.SCALE_NAME_s = SCALE_NAME_s;
    }


    /**
     * Gets the SCALE_SIZE_h value for this TScaleParams.
     * 
     * @return SCALE_SIZE_h   * size in pixel of the hot-deal image
     */
    public java.lang.String getSCALE_SIZE_h() {
        return SCALE_SIZE_h;
    }


    /**
     * Sets the SCALE_SIZE_h value for this TScaleParams.
     * 
     * @param SCALE_SIZE_h   * size in pixel of the hot-deal image
     */
    public void setSCALE_SIZE_h(java.lang.String SCALE_SIZE_h) {
        this.SCALE_SIZE_h = SCALE_SIZE_h;
    }


    /**
     * Gets the SCALE_SIZE_m value for this TScaleParams.
     * 
     * @return SCALE_SIZE_m   * size in pixel of the medium image
     */
    public java.lang.String getSCALE_SIZE_m() {
        return SCALE_SIZE_m;
    }


    /**
     * Sets the SCALE_SIZE_m value for this TScaleParams.
     * 
     * @param SCALE_SIZE_m   * size in pixel of the medium image
     */
    public void setSCALE_SIZE_m(java.lang.String SCALE_SIZE_m) {
        this.SCALE_SIZE_m = SCALE_SIZE_m;
    }


    /**
     * Gets the SCALE_SIZE_s value for this TScaleParams.
     * 
     * @return SCALE_SIZE_s   * size in pixel of the small image
     */
    public java.lang.String getSCALE_SIZE_s() {
        return SCALE_SIZE_s;
    }


    /**
     * Sets the SCALE_SIZE_s value for this TScaleParams.
     * 
     * @param SCALE_SIZE_s   * size in pixel of the small image
     */
    public void setSCALE_SIZE_s(java.lang.String SCALE_SIZE_s) {
        this.SCALE_SIZE_s = SCALE_SIZE_s;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TScaleParams)) return false;
        TScaleParams other = (TScaleParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SCALE_BORDER_IMAGE_h==null && other.getSCALE_BORDER_IMAGE_h()==null) || 
             (this.SCALE_BORDER_IMAGE_h!=null &&
              this.SCALE_BORDER_IMAGE_h.equals(other.getSCALE_BORDER_IMAGE_h()))) &&
            ((this.SCALE_BORDER_IMAGE_m==null && other.getSCALE_BORDER_IMAGE_m()==null) || 
             (this.SCALE_BORDER_IMAGE_m!=null &&
              this.SCALE_BORDER_IMAGE_m.equals(other.getSCALE_BORDER_IMAGE_m()))) &&
            ((this.SCALE_BORDER_COLOR_h==null && other.getSCALE_BORDER_COLOR_h()==null) || 
             (this.SCALE_BORDER_COLOR_h!=null &&
              this.SCALE_BORDER_COLOR_h.equals(other.getSCALE_BORDER_COLOR_h()))) &&
            ((this.SCALE_BORDER_COLOR_m==null && other.getSCALE_BORDER_COLOR_m()==null) || 
             (this.SCALE_BORDER_COLOR_m!=null &&
              this.SCALE_BORDER_COLOR_m.equals(other.getSCALE_BORDER_COLOR_m()))) &&
            ((this.SCALE_NAME_h==null && other.getSCALE_NAME_h()==null) || 
             (this.SCALE_NAME_h!=null &&
              this.SCALE_NAME_h.equals(other.getSCALE_NAME_h()))) &&
            ((this.SCALE_NAME_m==null && other.getSCALE_NAME_m()==null) || 
             (this.SCALE_NAME_m!=null &&
              this.SCALE_NAME_m.equals(other.getSCALE_NAME_m()))) &&
            ((this.SCALE_NAME_s==null && other.getSCALE_NAME_s()==null) || 
             (this.SCALE_NAME_s!=null &&
              this.SCALE_NAME_s.equals(other.getSCALE_NAME_s()))) &&
            ((this.SCALE_SIZE_h==null && other.getSCALE_SIZE_h()==null) || 
             (this.SCALE_SIZE_h!=null &&
              this.SCALE_SIZE_h.equals(other.getSCALE_SIZE_h()))) &&
            ((this.SCALE_SIZE_m==null && other.getSCALE_SIZE_m()==null) || 
             (this.SCALE_SIZE_m!=null &&
              this.SCALE_SIZE_m.equals(other.getSCALE_SIZE_m()))) &&
            ((this.SCALE_SIZE_s==null && other.getSCALE_SIZE_s()==null) || 
             (this.SCALE_SIZE_s!=null &&
              this.SCALE_SIZE_s.equals(other.getSCALE_SIZE_s())));
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
        if (getSCALE_BORDER_IMAGE_h() != null) {
            _hashCode += getSCALE_BORDER_IMAGE_h().hashCode();
        }
        if (getSCALE_BORDER_IMAGE_m() != null) {
            _hashCode += getSCALE_BORDER_IMAGE_m().hashCode();
        }
        if (getSCALE_BORDER_COLOR_h() != null) {
            _hashCode += getSCALE_BORDER_COLOR_h().hashCode();
        }
        if (getSCALE_BORDER_COLOR_m() != null) {
            _hashCode += getSCALE_BORDER_COLOR_m().hashCode();
        }
        if (getSCALE_NAME_h() != null) {
            _hashCode += getSCALE_NAME_h().hashCode();
        }
        if (getSCALE_NAME_m() != null) {
            _hashCode += getSCALE_NAME_m().hashCode();
        }
        if (getSCALE_NAME_s() != null) {
            _hashCode += getSCALE_NAME_s().hashCode();
        }
        if (getSCALE_SIZE_h() != null) {
            _hashCode += getSCALE_SIZE_h().hashCode();
        }
        if (getSCALE_SIZE_m() != null) {
            _hashCode += getSCALE_SIZE_m().hashCode();
        }
        if (getSCALE_SIZE_s() != null) {
            _hashCode += getSCALE_SIZE_s().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TScaleParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductImageTypes/2006/03", "TScaleParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCALE_BORDER_IMAGE_h");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SCALE_BORDER_IMAGE_h"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCALE_BORDER_IMAGE_m");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SCALE_BORDER_IMAGE_m"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCALE_BORDER_COLOR_h");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SCALE_BORDER_COLOR_h"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCALE_BORDER_COLOR_m");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SCALE_BORDER_COLOR_m"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCALE_NAME_h");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SCALE_NAME_h"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCALE_NAME_m");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SCALE_NAME_m"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCALE_NAME_s");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SCALE_NAME_s"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCALE_SIZE_h");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SCALE_SIZE_h"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCALE_SIZE_m");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SCALE_SIZE_m"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCALE_SIZE_s");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SCALE_SIZE_s"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
