/**
 * Type_Find_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.UserService5.Stub;


/**
 * input structure of an find() user call.
 *             a set of optional search parameters.
 */
public class Type_Find_Input  implements java.io.Serializable {
    /* search for part of user name or login name */
    private java.lang.String name;

    /* search for part of user alias (login name) */
    private java.lang.String alias;

    /* search for part of user email */
    private java.lang.String EMail;

    /* search for a specific group the user have to assigned to */
    private java.lang.String group;

    /* search only users that musst not assigned to this group (i.e.
     * Merchants) */
    private java.lang.String excludeGroup;

    public Type_Find_Input() {
    }

    public Type_Find_Input(
           java.lang.String name,
           java.lang.String alias,
           java.lang.String EMail,
           java.lang.String group,
           java.lang.String excludeGroup) {
           this.name = name;
           this.alias = alias;
           this.EMail = EMail;
           this.group = group;
           this.excludeGroup = excludeGroup;
    }


    /**
     * Gets the name value for this Type_Find_Input.
     * 
     * @return name   * search for part of user name or login name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Type_Find_Input.
     * 
     * @param name   * search for part of user name or login name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the alias value for this Type_Find_Input.
     * 
     * @return alias   * search for part of user alias (login name)
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this Type_Find_Input.
     * 
     * @param alias   * search for part of user alias (login name)
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the EMail value for this Type_Find_Input.
     * 
     * @return EMail   * search for part of user email
     */
    public java.lang.String getEMail() {
        return EMail;
    }


    /**
     * Sets the EMail value for this Type_Find_Input.
     * 
     * @param EMail   * search for part of user email
     */
    public void setEMail(java.lang.String EMail) {
        this.EMail = EMail;
    }


    /**
     * Gets the group value for this Type_Find_Input.
     * 
     * @return group   * search for a specific group the user have to assigned to
     */
    public java.lang.String getGroup() {
        return group;
    }


    /**
     * Sets the group value for this Type_Find_Input.
     * 
     * @param group   * search for a specific group the user have to assigned to
     */
    public void setGroup(java.lang.String group) {
        this.group = group;
    }


    /**
     * Gets the excludeGroup value for this Type_Find_Input.
     * 
     * @return excludeGroup   * search only users that musst not assigned to this group (i.e.
     * Merchants)
     */
    public java.lang.String getExcludeGroup() {
        return excludeGroup;
    }


    /**
     * Sets the excludeGroup value for this Type_Find_Input.
     * 
     * @param excludeGroup   * search only users that musst not assigned to this group (i.e.
     * Merchants)
     */
    public void setExcludeGroup(java.lang.String excludeGroup) {
        this.excludeGroup = excludeGroup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Type_Find_Input)) return false;
        Type_Find_Input other = (Type_Find_Input) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.alias==null && other.getAlias()==null) || 
             (this.alias!=null &&
              this.alias.equals(other.getAlias()))) &&
            ((this.EMail==null && other.getEMail()==null) || 
             (this.EMail!=null &&
              this.EMail.equals(other.getEMail()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.excludeGroup==null && other.getExcludeGroup()==null) || 
             (this.excludeGroup!=null &&
              this.excludeGroup.equals(other.getExcludeGroup())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        if (getEMail() != null) {
            _hashCode += getEMail().hashCode();
        }
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getExcludeGroup() != null) {
            _hashCode += getExcludeGroup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Type_Find_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/UserService/2011/03", "type_Find_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("EMail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EMail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExcludeGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
