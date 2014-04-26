/**
 * TApplyToAllShops_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.featurepack.model;


/**
 * input arguments of a single applyToAllShops() call.
 *         the path element is mandatory.
 *         all others are optional.
 */
public class TApplyToAllShops_Input  implements java.io.Serializable {
    /* feature pack path */
    private java.lang.String path;

    /* list of features with their maxvalues to update and apply to
     * all shops having the feature pack applied */
    private de.epages.ws.featurepack.model.TFeature[] features;

    public TApplyToAllShops_Input() {
    }

    public TApplyToAllShops_Input(
           java.lang.String path,
           de.epages.ws.featurepack.model.TFeature[] features) {
           this.path = path;
           this.features = features;
    }


    /**
     * Gets the path value for this TApplyToAllShops_Input.
     * 
     * @return path   * feature pack path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TApplyToAllShops_Input.
     * 
     * @param path   * feature pack path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the features value for this TApplyToAllShops_Input.
     * 
     * @return features   * list of features with their maxvalues to update and apply to
     * all shops having the feature pack applied
     */
    public de.epages.ws.featurepack.model.TFeature[] getFeatures() {
        return features;
    }


    /**
     * Sets the features value for this TApplyToAllShops_Input.
     * 
     * @param features   * list of features with their maxvalues to update and apply to
     * all shops having the feature pack applied
     */
    public void setFeatures(de.epages.ws.featurepack.model.TFeature[] features) {
        this.features = features;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TApplyToAllShops_Input)) return false;
        TApplyToAllShops_Input other = (TApplyToAllShops_Input) obj;
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
            ((this.features==null && other.getFeatures()==null) || 
             (this.features!=null &&
              java.util.Arrays.equals(this.features, other.getFeatures())));
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
        if (getFeatures() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeatures());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeatures(), i);
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
        new org.apache.axis.description.TypeDesc(TApplyToAllShops_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/FeaturePackTypes/2005/03", "TApplyToAllShops_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("features");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Features"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/FeaturePackTypes/2005/03", "TFeature"));
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
