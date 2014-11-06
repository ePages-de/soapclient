/**
 * TRename_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */


/**
 * shop data required to rename an existing shop
 */
public class TRename_Input  implements java.io.Serializable {
    /* unique shop identifier */
    private java.lang.String alias;

    /* new shop alias */
    private java.lang.String newAlias;

    public TRename_Input() {
    }

    public TRename_Input(
           java.lang.String alias,
           java.lang.String newAlias) {
           this.alias = alias;
           this.newAlias = newAlias;
    }


    /**
     * Gets the alias value for this TRename_Input.
     * 
     * @return alias   * unique shop identifier
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TRename_Input.
     * 
     * @param alias   * unique shop identifier
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the newAlias value for this TRename_Input.
     * 
     * @return newAlias   * new shop alias
     */
    public java.lang.String getNewAlias() {
        return newAlias;
    }


    /**
     * Sets the newAlias value for this TRename_Input.
     * 
     * @param newAlias   * new shop alias
     */
    public void setNewAlias(java.lang.String newAlias) {
        this.newAlias = newAlias;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TRename_Input)) return false;
        TRename_Input other = (TRename_Input) obj;
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
            ((this.newAlias==null && other.getNewAlias()==null) || 
             (this.newAlias!=null &&
              this.newAlias.equals(other.getNewAlias())));
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
        if (getNewAlias() != null) {
            _hashCode += getNewAlias().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TRename_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/SimpleProvisioningService/2014/11", "TRename_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NewAlias"));
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
