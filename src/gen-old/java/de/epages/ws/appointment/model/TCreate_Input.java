/**
 * TCreate_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.appointment.model;


/**
 * input arguments of a single create() appointment call.
 *         a set of appointment specific attributes that will be used
 * to create a appointment.
 *         alias, tax class are mandatory.
 *         variation attributes are mandatory for creation of sub appointments.
 * all others are optional.
 */
public class TCreate_Input  implements java.io.Serializable {
    /* appointment alias */
    private java.lang.String alias;

    /* appointment class (object path) */
    private java.lang.String _class;

    /* appointment's quantity */
    private float quantity;

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

    private java.lang.Boolean canCancel;

    /* appointment's the number of Mail sended for this apointment,
     * necessary for vCalendar.ics attachment */
    private java.math.BigInteger sequence;

    /* appointment's selected options */
    private java.lang.String selectedOptions;

    /* appointment's services as string */
    private java.lang.String servicesString;

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

    public TCreate_Input() {
    }

    public TCreate_Input(
           java.lang.String alias,
           java.lang.String _class,
           float quantity,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           java.util.Calendar acceptedOn,
           java.util.Calendar cancelledOn,
           java.lang.String customerComment,
           java.lang.String comment,
           java.lang.Boolean isStorefront,
           java.lang.Boolean canCancel,
           java.math.BigInteger sequence,
           java.lang.String selectedOptions,
           java.lang.String servicesString,
           java.lang.String user,
           java.lang.String calendar,
           java.lang.String basket,
           java.lang.String order,
           de.epages.ws.common.model.TAttribute[] attributes,
           de.epages.ws.common.model.TError error) {
           this.alias = alias;
           this._class = _class;
           this.quantity = quantity;
           this.startDate = startDate;
           this.endDate = endDate;
           this.acceptedOn = acceptedOn;
           this.cancelledOn = cancelledOn;
           this.customerComment = customerComment;
           this.comment = comment;
           this.isStorefront = isStorefront;
           this.canCancel = canCancel;
           this.sequence = sequence;
           this.selectedOptions = selectedOptions;
           this.servicesString = servicesString;
           this.user = user;
           this.calendar = calendar;
           this.basket = basket;
           this.order = order;
           this.attributes = attributes;
           this.error = error;
    }


    /**
     * Gets the alias value for this TCreate_Input.
     * 
     * @return alias   * appointment alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TCreate_Input.
     * 
     * @param alias   * appointment alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the _class value for this TCreate_Input.
     * 
     * @return _class   * appointment class (object path)
     */
    public java.lang.String get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this TCreate_Input.
     * 
     * @param _class   * appointment class (object path)
     */
    public void set_class(java.lang.String _class) {
        this._class = _class;
    }


    /**
     * Gets the quantity value for this TCreate_Input.
     * 
     * @return quantity   * appointment's quantity
     */
    public float getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this TCreate_Input.
     * 
     * @param quantity   * appointment's quantity
     */
    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the startDate value for this TCreate_Input.
     * 
     * @return startDate   * appointment's start date and time
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TCreate_Input.
     * 
     * @param startDate   * appointment's start date and time
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this TCreate_Input.
     * 
     * @return endDate   * appointment's end date and time
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TCreate_Input.
     * 
     * @param endDate   * appointment's end date and time
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the acceptedOn value for this TCreate_Input.
     * 
     * @return acceptedOn   * appointment's date and time of acception
     */
    public java.util.Calendar getAcceptedOn() {
        return acceptedOn;
    }


    /**
     * Sets the acceptedOn value for this TCreate_Input.
     * 
     * @param acceptedOn   * appointment's date and time of acception
     */
    public void setAcceptedOn(java.util.Calendar acceptedOn) {
        this.acceptedOn = acceptedOn;
    }


    /**
     * Gets the cancelledOn value for this TCreate_Input.
     * 
     * @return cancelledOn   * appointment's date and time of cancelation
     */
    public java.util.Calendar getCancelledOn() {
        return cancelledOn;
    }


    /**
     * Sets the cancelledOn value for this TCreate_Input.
     * 
     * @param cancelledOn   * appointment's date and time of cancelation
     */
    public void setCancelledOn(java.util.Calendar cancelledOn) {
        this.cancelledOn = cancelledOn;
    }


    /**
     * Gets the customerComment value for this TCreate_Input.
     * 
     * @return customerComment   * appointment's customer comment
     */
    public java.lang.String getCustomerComment() {
        return customerComment;
    }


    /**
     * Sets the customerComment value for this TCreate_Input.
     * 
     * @param customerComment   * appointment's customer comment
     */
    public void setCustomerComment(java.lang.String customerComment) {
        this.customerComment = customerComment;
    }


    /**
     * Gets the comment value for this TCreate_Input.
     * 
     * @return comment   * appointment's comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this TCreate_Input.
     * 
     * @param comment   * appointment's comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the isStorefront value for this TCreate_Input.
     * 
     * @return isStorefront
     */
    public java.lang.Boolean getIsStorefront() {
        return isStorefront;
    }


    /**
     * Sets the isStorefront value for this TCreate_Input.
     * 
     * @param isStorefront
     */
    public void setIsStorefront(java.lang.Boolean isStorefront) {
        this.isStorefront = isStorefront;
    }


    /**
     * Gets the canCancel value for this TCreate_Input.
     * 
     * @return canCancel
     */
    public java.lang.Boolean getCanCancel() {
        return canCancel;
    }


    /**
     * Sets the canCancel value for this TCreate_Input.
     * 
     * @param canCancel
     */
    public void setCanCancel(java.lang.Boolean canCancel) {
        this.canCancel = canCancel;
    }


    /**
     * Gets the sequence value for this TCreate_Input.
     * 
     * @return sequence   * appointment's the number of Mail sended for this apointment,
     * necessary for vCalendar.ics attachment
     */
    public java.math.BigInteger getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this TCreate_Input.
     * 
     * @param sequence   * appointment's the number of Mail sended for this apointment,
     * necessary for vCalendar.ics attachment
     */
    public void setSequence(java.math.BigInteger sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the selectedOptions value for this TCreate_Input.
     * 
     * @return selectedOptions   * appointment's selected options
     */
    public java.lang.String getSelectedOptions() {
        return selectedOptions;
    }


    /**
     * Sets the selectedOptions value for this TCreate_Input.
     * 
     * @param selectedOptions   * appointment's selected options
     */
    public void setSelectedOptions(java.lang.String selectedOptions) {
        this.selectedOptions = selectedOptions;
    }


    /**
     * Gets the servicesString value for this TCreate_Input.
     * 
     * @return servicesString   * appointment's services as string
     */
    public java.lang.String getServicesString() {
        return servicesString;
    }


    /**
     * Sets the servicesString value for this TCreate_Input.
     * 
     * @param servicesString   * appointment's services as string
     */
    public void setServicesString(java.lang.String servicesString) {
        this.servicesString = servicesString;
    }


    /**
     * Gets the user value for this TCreate_Input.
     * 
     * @return user   * appointment's related user path
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this TCreate_Input.
     * 
     * @param user   * appointment's related user path
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the calendar value for this TCreate_Input.
     * 
     * @return calendar   * appointment's related calendar path
     */
    public java.lang.String getCalendar() {
        return calendar;
    }


    /**
     * Sets the calendar value for this TCreate_Input.
     * 
     * @param calendar   * appointment's related calendar path
     */
    public void setCalendar(java.lang.String calendar) {
        this.calendar = calendar;
    }


    /**
     * Gets the basket value for this TCreate_Input.
     * 
     * @return basket   * appointment's related basket path if exists
     */
    public java.lang.String getBasket() {
        return basket;
    }


    /**
     * Sets the basket value for this TCreate_Input.
     * 
     * @param basket   * appointment's related basket path if exists
     */
    public void setBasket(java.lang.String basket) {
        this.basket = basket;
    }


    /**
     * Gets the order value for this TCreate_Input.
     * 
     * @return order   * appointment's related customer order path if exists
     */
    public java.lang.String getOrder() {
        return order;
    }


    /**
     * Sets the order value for this TCreate_Input.
     * 
     * @param order   * appointment's related customer order path if exists
     */
    public void setOrder(java.lang.String order) {
        this.order = order;
    }


    /**
     * Gets the attributes value for this TCreate_Input.
     * 
     * @return attributes   * list of requested additional attributes (see epagestypes:ListOfAttributes)
     */
    public de.epages.ws.common.model.TAttribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this TCreate_Input.
     * 
     * @param attributes   * list of requested additional attributes (see epagestypes:ListOfAttributes)
     */
    public void setAttributes(de.epages.ws.common.model.TAttribute[] attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the error value for this TCreate_Input.
     * 
     * @return error   * error object (see epagestypes:TError)
     */
    public de.epages.ws.common.model.TError getError() {
        return error;
    }


    /**
     * Sets the error value for this TCreate_Input.
     * 
     * @param error   * error object (see epagestypes:TError)
     */
    public void setError(de.epages.ws.common.model.TError error) {
        this.error = error;
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
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            this.quantity == other.getQuantity() &&
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
            ((this.canCancel==null && other.getCanCancel()==null) || 
             (this.canCancel!=null &&
              this.canCancel.equals(other.getCanCancel()))) &&
            ((this.sequence==null && other.getSequence()==null) || 
             (this.sequence!=null &&
              this.sequence.equals(other.getSequence()))) &&
            ((this.selectedOptions==null && other.getSelectedOptions()==null) || 
             (this.selectedOptions!=null &&
              this.selectedOptions.equals(other.getSelectedOptions()))) &&
            ((this.servicesString==null && other.getServicesString()==null) || 
             (this.servicesString!=null &&
              this.servicesString.equals(other.getServicesString()))) &&
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
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        _hashCode += new Float(getQuantity()).hashCode();
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
        if (getCanCancel() != null) {
            _hashCode += getCanCancel().hashCode();
        }
        if (getSequence() != null) {
            _hashCode += getSequence().hashCode();
        }
        if (getSelectedOptions() != null) {
            _hashCode += getSelectedOptions().hashCode();
        }
        if (getServicesString() != null) {
            _hashCode += getServicesString().hashCode();
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
        new org.apache.axis.description.TypeDesc(TCreate_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/AppointmentTypes/2009/06", "TCreate_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("canCancel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CanCancel"));
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
        elemField.setFieldName("servicesString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ServicesString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "User"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calendar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Calendar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
