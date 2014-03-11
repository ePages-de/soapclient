/**
 * TUpdate_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.appointment.model;


/**
 * input arguments of a single update() appointment call.
 *         a set of optional appointment specific attributes that will
 * be updated.
 *         the path element is mandatory.
 *         all others are optional.
 */
public class TUpdate_Input  implements java.io.Serializable {
    /* appointment path */
    private java.lang.String path;

    /* appointment's quantity */
    private java.lang.Float quantity;

    /* appointment's start date and time */
    private java.util.Calendar startDate;

    /* appointment's end date and time */
    private java.util.Calendar endDate;

    /* appointment's date and time of acception */
    private java.util.Calendar acceptedOn;

    /* appointment's date and time of cancelation */
    private java.util.Calendar cancelledOn;

    /* appointment's customer comment */
    private java.lang.String customerComment;

    /* appointment's comment */
    private java.lang.String comment;

    private java.lang.Boolean isStorefront;

    /* appointment's the number of Mail sended for this apointment,
     * necessary for vCalendar.ics attachment */
    private java.math.BigInteger sequence;

    /* appointment's selected options */
    private java.lang.String selectedOptions;

    /* appointment's related user path */
    private java.lang.String user;

    /* appointment's related calendar path */
    private java.lang.String calendar;

    /* appointment's related basket path if exists */
    private java.lang.String basket;

    /* appointment's related customer order path if exists */
    private java.lang.String order;

    /* list of requested additional attributes (see epagestypes:ListOfAttributes) */
    private de.epages.ws.common.model.TAttribute[] attributes;

    /* error object (see epagestypes:TError) */
    private de.epages.ws.common.model.TError error;

    public TUpdate_Input() {
    }

    public TUpdate_Input(
           java.lang.String path,
           java.lang.Float quantity,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           java.util.Calendar acceptedOn,
           java.util.Calendar cancelledOn,
           java.lang.String customerComment,
           java.lang.String comment,
           java.lang.Boolean isStorefront,
           java.math.BigInteger sequence,
           java.lang.String selectedOptions,
           java.lang.String user,
           java.lang.String calendar,
           java.lang.String basket,
           java.lang.String order,
           de.epages.ws.common.model.TAttribute[] attributes,
           de.epages.ws.common.model.TError error) {
           this.path = path;
           this.quantity = quantity;
           this.startDate = startDate;
           this.endDate = endDate;
           this.acceptedOn = acceptedOn;
           this.cancelledOn = cancelledOn;
           this.customerComment = customerComment;
           this.comment = comment;
           this.isStorefront = isStorefront;
           this.sequence = sequence;
           this.selectedOptions = selectedOptions;
           this.user = user;
           this.calendar = calendar;
           this.basket = basket;
           this.order = order;
           this.attributes = attributes;
           this.error = error;
    }


    /**
     * Gets the path value for this TUpdate_Input.
     * 
     * @return path   * appointment path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TUpdate_Input.
     * 
     * @param path   * appointment path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the quantity value for this TUpdate_Input.
     * 
     * @return quantity   * appointment's quantity
     */
    public java.lang.Float getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this TUpdate_Input.
     * 
     * @param quantity   * appointment's quantity
     */
    public void setQuantity(java.lang.Float quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the startDate value for this TUpdate_Input.
     * 
     * @return startDate   * appointment's start date and time
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TUpdate_Input.
     * 
     * @param startDate   * appointment's start date and time
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this TUpdate_Input.
     * 
     * @return endDate   * appointment's end date and time
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TUpdate_Input.
     * 
     * @param endDate   * appointment's end date and time
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the acceptedOn value for this TUpdate_Input.
     * 
     * @return acceptedOn   * appointment's date and time of acception
     */
    public java.util.Calendar getAcceptedOn() {
        return acceptedOn;
    }


    /**
     * Sets the acceptedOn value for this TUpdate_Input.
     * 
     * @param acceptedOn   * appointment's date and time of acception
     */
    public void setAcceptedOn(java.util.Calendar acceptedOn) {
        this.acceptedOn = acceptedOn;
    }


    /**
     * Gets the cancelledOn value for this TUpdate_Input.
     * 
     * @return cancelledOn   * appointment's date and time of cancelation
     */
    public java.util.Calendar getCancelledOn() {
        return cancelledOn;
    }


    /**
     * Sets the cancelledOn value for this TUpdate_Input.
     * 
     * @param cancelledOn   * appointment's date and time of cancelation
     */
    public void setCancelledOn(java.util.Calendar cancelledOn) {
        this.cancelledOn = cancelledOn;
    }


    /**
     * Gets the customerComment value for this TUpdate_Input.
     * 
     * @return customerComment   * appointment's customer comment
     */
    public java.lang.String getCustomerComment() {
        return customerComment;
    }


    /**
     * Sets the customerComment value for this TUpdate_Input.
     * 
     * @param customerComment   * appointment's customer comment
     */
    public void setCustomerComment(java.lang.String customerComment) {
        this.customerComment = customerComment;
    }


    /**
     * Gets the comment value for this TUpdate_Input.
     * 
     * @return comment   * appointment's comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this TUpdate_Input.
     * 
     * @param comment   * appointment's comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the isStorefront value for this TUpdate_Input.
     * 
     * @return isStorefront
     */
    public java.lang.Boolean getIsStorefront() {
        return isStorefront;
    }


    /**
     * Sets the isStorefront value for this TUpdate_Input.
     * 
     * @param isStorefront
     */
    public void setIsStorefront(java.lang.Boolean isStorefront) {
        this.isStorefront = isStorefront;
    }


    /**
     * Gets the sequence value for this TUpdate_Input.
     * 
     * @return sequence   * appointment's the number of Mail sended for this apointment,
     * necessary for vCalendar.ics attachment
     */
    public java.math.BigInteger getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this TUpdate_Input.
     * 
     * @param sequence   * appointment's the number of Mail sended for this apointment,
     * necessary for vCalendar.ics attachment
     */
    public void setSequence(java.math.BigInteger sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the selectedOptions value for this TUpdate_Input.
     * 
     * @return selectedOptions   * appointment's selected options
     */
    public java.lang.String getSelectedOptions() {
        return selectedOptions;
    }


    /**
     * Sets the selectedOptions value for this TUpdate_Input.
     * 
     * @param selectedOptions   * appointment's selected options
     */
    public void setSelectedOptions(java.lang.String selectedOptions) {
        this.selectedOptions = selectedOptions;
    }


    /**
     * Gets the user value for this TUpdate_Input.
     * 
     * @return user   * appointment's related user path
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this TUpdate_Input.
     * 
     * @param user   * appointment's related user path
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the calendar value for this TUpdate_Input.
     * 
     * @return calendar   * appointment's related calendar path
     */
    public java.lang.String getCalendar() {
        return calendar;
    }


    /**
     * Sets the calendar value for this TUpdate_Input.
     * 
     * @param calendar   * appointment's related calendar path
     */
    public void setCalendar(java.lang.String calendar) {
        this.calendar = calendar;
    }


    /**
     * Gets the basket value for this TUpdate_Input.
     * 
     * @return basket   * appointment's related basket path if exists
     */
    public java.lang.String getBasket() {
        return basket;
    }


    /**
     * Sets the basket value for this TUpdate_Input.
     * 
     * @param basket   * appointment's related basket path if exists
     */
    public void setBasket(java.lang.String basket) {
        this.basket = basket;
    }


    /**
     * Gets the order value for this TUpdate_Input.
     * 
     * @return order   * appointment's related customer order path if exists
     */
    public java.lang.String getOrder() {
        return order;
    }


    /**
     * Sets the order value for this TUpdate_Input.
     * 
     * @param order   * appointment's related customer order path if exists
     */
    public void setOrder(java.lang.String order) {
        this.order = order;
    }


    /**
     * Gets the attributes value for this TUpdate_Input.
     * 
     * @return attributes   * list of requested additional attributes (see epagestypes:ListOfAttributes)
     */
    public de.epages.ws.common.model.TAttribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this TUpdate_Input.
     * 
     * @param attributes   * list of requested additional attributes (see epagestypes:ListOfAttributes)
     */
    public void setAttributes(de.epages.ws.common.model.TAttribute[] attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the error value for this TUpdate_Input.
     * 
     * @return error   * error object (see epagestypes:TError)
     */
    public de.epages.ws.common.model.TError getError() {
        return error;
    }


    /**
     * Sets the error value for this TUpdate_Input.
     * 
     * @param error   * error object (see epagestypes:TError)
     */
    public void setError(de.epages.ws.common.model.TError error) {
        this.error = error;
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
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.acceptedOn==null && other.getAcceptedOn()==null) || 
             (this.acceptedOn!=null &&
              this.acceptedOn.equals(other.getAcceptedOn()))) &&
            ((this.cancelledOn==null && other.getCancelledOn()==null) || 
             (this.cancelledOn!=null &&
              this.cancelledOn.equals(other.getCancelledOn()))) &&
            ((this.customerComment==null && other.getCustomerComment()==null) || 
             (this.customerComment!=null &&
              this.customerComment.equals(other.getCustomerComment()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.isStorefront==null && other.getIsStorefront()==null) || 
             (this.isStorefront!=null &&
              this.isStorefront.equals(other.getIsStorefront()))) &&
            ((this.sequence==null && other.getSequence()==null) || 
             (this.sequence!=null &&
              this.sequence.equals(other.getSequence()))) &&
            ((this.selectedOptions==null && other.getSelectedOptions()==null) || 
             (this.selectedOptions!=null &&
              this.selectedOptions.equals(other.getSelectedOptions()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.calendar==null && other.getCalendar()==null) || 
             (this.calendar!=null &&
              this.calendar.equals(other.getCalendar()))) &&
            ((this.basket==null && other.getBasket()==null) || 
             (this.basket!=null &&
              this.basket.equals(other.getBasket()))) &&
            ((this.order==null && other.getOrder()==null) || 
             (this.order!=null &&
              this.order.equals(other.getOrder()))) &&
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
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getAcceptedOn() != null) {
            _hashCode += getAcceptedOn().hashCode();
        }
        if (getCancelledOn() != null) {
            _hashCode += getCancelledOn().hashCode();
        }
        if (getCustomerComment() != null) {
            _hashCode += getCustomerComment().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getIsStorefront() != null) {
            _hashCode += getIsStorefront().hashCode();
        }
        if (getSequence() != null) {
            _hashCode += getSequence().hashCode();
        }
        if (getSelectedOptions() != null) {
            _hashCode += getSelectedOptions().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getCalendar() != null) {
            _hashCode += getCalendar().hashCode();
        }
        if (getBasket() != null) {
            _hashCode += getBasket().hashCode();
        }
        if (getOrder() != null) {
            _hashCode += getOrder().hashCode();
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
        new org.apache.axis.description.TypeDesc(TUpdate_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/AppointmentTypes/2009/06", "TUpdate_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptedOn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AcceptedOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelledOn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CancelledOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerComment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CustomerComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isStorefront");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsStorefront"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectedOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SelectedOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "User"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calendar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Calendar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basket");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Basket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
