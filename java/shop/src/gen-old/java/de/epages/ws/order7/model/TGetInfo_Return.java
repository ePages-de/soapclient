/**
 * TGetInfo_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.order7.model;


/**
 * a single return value of a getInfo() order call.
 *         the path will be always returned.
 *         the error element will be returned in case of error.
 *         all other elements will be returned if no error has occured.
 */
public class TGetInfo_Return  implements java.io.Serializable {
    /* order object path */
    private java.lang.String path;

    /* order alias */
    private java.lang.String alias;

    /* path to order's class */
    private java.lang.String _class;

    /* order's customer (object path to customer) */
    private java.lang.String customer;

    /* order's user (object path to user) */
    private java.lang.String user;

    /* order's creation date */
    private java.util.Calendar creationDate;

    /* order's ViewedOn date */
    private java.util.Calendar viewedOn;

    /* order's CancelledOn date */
    private java.util.Calendar cancelledOn;

    /* order's InProcessOn date */
    private java.util.Calendar inProcessOn;

    /* order's PendingOn date */
    private java.util.Calendar pendingOn;

    /* order's ReadyForShippingOn date */
    private java.util.Calendar readyForShippingOn;

    /* order's PartlyDispatchedOn date */
    private java.util.Calendar partlyDispatchedOn;

    /* order's DispatchedOn date */
    private java.util.Calendar dispatchedOn;

    /* order's ShippedOn date */
    private java.util.Calendar shippedOn;

    /* order's PartlyPaidOn date */
    private java.util.Calendar partlyPaidOn;

    /* order's PaidOn date */
    private java.util.Calendar paidOn;

    /* order's ClosedOn date */
    private java.util.Calendar closedOn;

    /* order's ArchivedOn date */
    private java.util.Calendar archivedOn;

    /* order's PartlyInvoicedOn date */
    private java.util.Calendar partlyInvoicedOn;

    /* order's InvoicedOn date */
    private java.util.Calendar invoicedOn;

    /* the products, payments, shipping etc. of this order (see ordertypes:TLineItemContainerOut) */
    private de.epages.ws.order7.model.TLineItemContainerOut lineItemContainer;

    private de.epages.ws.shop2.model.TAddressNamed billingAddress;

    private de.epages.ws.shop2.model.TAddressNamed shippingAddress;

    /* list of requested attributes (see epagestypes:ListOfAttributes) */
    private de.epages.ws.common.model.TAttribute[] attributes;

    /* error object (see epagestypes:TError) */
    private de.epages.ws.common.model.TError error;

    public TGetInfo_Return() {
    }

    public TGetInfo_Return(
           java.lang.String path,
           java.lang.String alias,
           java.lang.String _class,
           java.lang.String customer,
           java.lang.String user,
           java.util.Calendar creationDate,
           java.util.Calendar viewedOn,
           java.util.Calendar cancelledOn,
           java.util.Calendar inProcessOn,
           java.util.Calendar pendingOn,
           java.util.Calendar readyForShippingOn,
           java.util.Calendar partlyDispatchedOn,
           java.util.Calendar dispatchedOn,
           java.util.Calendar shippedOn,
           java.util.Calendar partlyPaidOn,
           java.util.Calendar paidOn,
           java.util.Calendar closedOn,
           java.util.Calendar archivedOn,
           java.util.Calendar partlyInvoicedOn,
           java.util.Calendar invoicedOn,
           de.epages.ws.order7.model.TLineItemContainerOut lineItemContainer,
           de.epages.ws.shop2.model.TAddressNamed billingAddress,
           de.epages.ws.shop2.model.TAddressNamed shippingAddress,
           de.epages.ws.common.model.TAttribute[] attributes,
           de.epages.ws.common.model.TError error) {
           this.path = path;
           this.alias = alias;
           this._class = _class;
           this.customer = customer;
           this.user = user;
           this.creationDate = creationDate;
           this.viewedOn = viewedOn;
           this.cancelledOn = cancelledOn;
           this.inProcessOn = inProcessOn;
           this.pendingOn = pendingOn;
           this.readyForShippingOn = readyForShippingOn;
           this.partlyDispatchedOn = partlyDispatchedOn;
           this.dispatchedOn = dispatchedOn;
           this.shippedOn = shippedOn;
           this.partlyPaidOn = partlyPaidOn;
           this.paidOn = paidOn;
           this.closedOn = closedOn;
           this.archivedOn = archivedOn;
           this.partlyInvoicedOn = partlyInvoicedOn;
           this.invoicedOn = invoicedOn;
           this.lineItemContainer = lineItemContainer;
           this.billingAddress = billingAddress;
           this.shippingAddress = shippingAddress;
           this.attributes = attributes;
           this.error = error;
    }


    /**
     * Gets the path value for this TGetInfo_Return.
     * 
     * @return path   * order object path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TGetInfo_Return.
     * 
     * @param path   * order object path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the alias value for this TGetInfo_Return.
     * 
     * @return alias   * order alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TGetInfo_Return.
     * 
     * @param alias   * order alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the _class value for this TGetInfo_Return.
     * 
     * @return _class   * path to order's class
     */
    public java.lang.String get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this TGetInfo_Return.
     * 
     * @param _class   * path to order's class
     */
    public void set_class(java.lang.String _class) {
        this._class = _class;
    }


    /**
     * Gets the customer value for this TGetInfo_Return.
     * 
     * @return customer   * order's customer (object path to customer)
     */
    public java.lang.String getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this TGetInfo_Return.
     * 
     * @param customer   * order's customer (object path to customer)
     */
    public void setCustomer(java.lang.String customer) {
        this.customer = customer;
    }


    /**
     * Gets the user value for this TGetInfo_Return.
     * 
     * @return user   * order's user (object path to user)
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this TGetInfo_Return.
     * 
     * @param user   * order's user (object path to user)
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the creationDate value for this TGetInfo_Return.
     * 
     * @return creationDate   * order's creation date
     */
    public java.util.Calendar getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this TGetInfo_Return.
     * 
     * @param creationDate   * order's creation date
     */
    public void setCreationDate(java.util.Calendar creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the viewedOn value for this TGetInfo_Return.
     * 
     * @return viewedOn   * order's ViewedOn date
     */
    public java.util.Calendar getViewedOn() {
        return viewedOn;
    }


    /**
     * Sets the viewedOn value for this TGetInfo_Return.
     * 
     * @param viewedOn   * order's ViewedOn date
     */
    public void setViewedOn(java.util.Calendar viewedOn) {
        this.viewedOn = viewedOn;
    }


    /**
     * Gets the cancelledOn value for this TGetInfo_Return.
     * 
     * @return cancelledOn   * order's CancelledOn date
     */
    public java.util.Calendar getCancelledOn() {
        return cancelledOn;
    }


    /**
     * Sets the cancelledOn value for this TGetInfo_Return.
     * 
     * @param cancelledOn   * order's CancelledOn date
     */
    public void setCancelledOn(java.util.Calendar cancelledOn) {
        this.cancelledOn = cancelledOn;
    }


    /**
     * Gets the inProcessOn value for this TGetInfo_Return.
     * 
     * @return inProcessOn   * order's InProcessOn date
     */
    public java.util.Calendar getInProcessOn() {
        return inProcessOn;
    }


    /**
     * Sets the inProcessOn value for this TGetInfo_Return.
     * 
     * @param inProcessOn   * order's InProcessOn date
     */
    public void setInProcessOn(java.util.Calendar inProcessOn) {
        this.inProcessOn = inProcessOn;
    }


    /**
     * Gets the pendingOn value for this TGetInfo_Return.
     * 
     * @return pendingOn   * order's PendingOn date
     */
    public java.util.Calendar getPendingOn() {
        return pendingOn;
    }


    /**
     * Sets the pendingOn value for this TGetInfo_Return.
     * 
     * @param pendingOn   * order's PendingOn date
     */
    public void setPendingOn(java.util.Calendar pendingOn) {
        this.pendingOn = pendingOn;
    }


    /**
     * Gets the readyForShippingOn value for this TGetInfo_Return.
     * 
     * @return readyForShippingOn   * order's ReadyForShippingOn date
     */
    public java.util.Calendar getReadyForShippingOn() {
        return readyForShippingOn;
    }


    /**
     * Sets the readyForShippingOn value for this TGetInfo_Return.
     * 
     * @param readyForShippingOn   * order's ReadyForShippingOn date
     */
    public void setReadyForShippingOn(java.util.Calendar readyForShippingOn) {
        this.readyForShippingOn = readyForShippingOn;
    }


    /**
     * Gets the partlyDispatchedOn value for this TGetInfo_Return.
     * 
     * @return partlyDispatchedOn   * order's PartlyDispatchedOn date
     */
    public java.util.Calendar getPartlyDispatchedOn() {
        return partlyDispatchedOn;
    }


    /**
     * Sets the partlyDispatchedOn value for this TGetInfo_Return.
     * 
     * @param partlyDispatchedOn   * order's PartlyDispatchedOn date
     */
    public void setPartlyDispatchedOn(java.util.Calendar partlyDispatchedOn) {
        this.partlyDispatchedOn = partlyDispatchedOn;
    }


    /**
     * Gets the dispatchedOn value for this TGetInfo_Return.
     * 
     * @return dispatchedOn   * order's DispatchedOn date
     */
    public java.util.Calendar getDispatchedOn() {
        return dispatchedOn;
    }


    /**
     * Sets the dispatchedOn value for this TGetInfo_Return.
     * 
     * @param dispatchedOn   * order's DispatchedOn date
     */
    public void setDispatchedOn(java.util.Calendar dispatchedOn) {
        this.dispatchedOn = dispatchedOn;
    }


    /**
     * Gets the shippedOn value for this TGetInfo_Return.
     * 
     * @return shippedOn   * order's ShippedOn date
     */
    public java.util.Calendar getShippedOn() {
        return shippedOn;
    }


    /**
     * Sets the shippedOn value for this TGetInfo_Return.
     * 
     * @param shippedOn   * order's ShippedOn date
     */
    public void setShippedOn(java.util.Calendar shippedOn) {
        this.shippedOn = shippedOn;
    }


    /**
     * Gets the partlyPaidOn value for this TGetInfo_Return.
     * 
     * @return partlyPaidOn   * order's PartlyPaidOn date
     */
    public java.util.Calendar getPartlyPaidOn() {
        return partlyPaidOn;
    }


    /**
     * Sets the partlyPaidOn value for this TGetInfo_Return.
     * 
     * @param partlyPaidOn   * order's PartlyPaidOn date
     */
    public void setPartlyPaidOn(java.util.Calendar partlyPaidOn) {
        this.partlyPaidOn = partlyPaidOn;
    }


    /**
     * Gets the paidOn value for this TGetInfo_Return.
     * 
     * @return paidOn   * order's PaidOn date
     */
    public java.util.Calendar getPaidOn() {
        return paidOn;
    }


    /**
     * Sets the paidOn value for this TGetInfo_Return.
     * 
     * @param paidOn   * order's PaidOn date
     */
    public void setPaidOn(java.util.Calendar paidOn) {
        this.paidOn = paidOn;
    }


    /**
     * Gets the closedOn value for this TGetInfo_Return.
     * 
     * @return closedOn   * order's ClosedOn date
     */
    public java.util.Calendar getClosedOn() {
        return closedOn;
    }


    /**
     * Sets the closedOn value for this TGetInfo_Return.
     * 
     * @param closedOn   * order's ClosedOn date
     */
    public void setClosedOn(java.util.Calendar closedOn) {
        this.closedOn = closedOn;
    }


    /**
     * Gets the archivedOn value for this TGetInfo_Return.
     * 
     * @return archivedOn   * order's ArchivedOn date
     */
    public java.util.Calendar getArchivedOn() {
        return archivedOn;
    }


    /**
     * Sets the archivedOn value for this TGetInfo_Return.
     * 
     * @param archivedOn   * order's ArchivedOn date
     */
    public void setArchivedOn(java.util.Calendar archivedOn) {
        this.archivedOn = archivedOn;
    }


    /**
     * Gets the partlyInvoicedOn value for this TGetInfo_Return.
     * 
     * @return partlyInvoicedOn   * order's PartlyInvoicedOn date
     */
    public java.util.Calendar getPartlyInvoicedOn() {
        return partlyInvoicedOn;
    }


    /**
     * Sets the partlyInvoicedOn value for this TGetInfo_Return.
     * 
     * @param partlyInvoicedOn   * order's PartlyInvoicedOn date
     */
    public void setPartlyInvoicedOn(java.util.Calendar partlyInvoicedOn) {
        this.partlyInvoicedOn = partlyInvoicedOn;
    }


    /**
     * Gets the invoicedOn value for this TGetInfo_Return.
     * 
     * @return invoicedOn   * order's InvoicedOn date
     */
    public java.util.Calendar getInvoicedOn() {
        return invoicedOn;
    }


    /**
     * Sets the invoicedOn value for this TGetInfo_Return.
     * 
     * @param invoicedOn   * order's InvoicedOn date
     */
    public void setInvoicedOn(java.util.Calendar invoicedOn) {
        this.invoicedOn = invoicedOn;
    }


    /**
     * Gets the lineItemContainer value for this TGetInfo_Return.
     * 
     * @return lineItemContainer   * the products, payments, shipping etc. of this order (see ordertypes:TLineItemContainerOut)
     */
    public de.epages.ws.order7.model.TLineItemContainerOut getLineItemContainer() {
        return lineItemContainer;
    }


    /**
     * Sets the lineItemContainer value for this TGetInfo_Return.
     * 
     * @param lineItemContainer   * the products, payments, shipping etc. of this order (see ordertypes:TLineItemContainerOut)
     */
    public void setLineItemContainer(de.epages.ws.order7.model.TLineItemContainerOut lineItemContainer) {
        this.lineItemContainer = lineItemContainer;
    }


    /**
     * Gets the billingAddress value for this TGetInfo_Return.
     * 
     * @return billingAddress
     */
    public de.epages.ws.shop2.model.TAddressNamed getBillingAddress() {
        return billingAddress;
    }


    /**
     * Sets the billingAddress value for this TGetInfo_Return.
     * 
     * @param billingAddress
     */
    public void setBillingAddress(de.epages.ws.shop2.model.TAddressNamed billingAddress) {
        this.billingAddress = billingAddress;
    }


    /**
     * Gets the shippingAddress value for this TGetInfo_Return.
     * 
     * @return shippingAddress
     */
    public de.epages.ws.shop2.model.TAddressNamed getShippingAddress() {
        return shippingAddress;
    }


    /**
     * Sets the shippingAddress value for this TGetInfo_Return.
     * 
     * @param shippingAddress
     */
    public void setShippingAddress(de.epages.ws.shop2.model.TAddressNamed shippingAddress) {
        this.shippingAddress = shippingAddress;
    }


    /**
     * Gets the attributes value for this TGetInfo_Return.
     * 
     * @return attributes   * list of requested attributes (see epagestypes:ListOfAttributes)
     */
    public de.epages.ws.common.model.TAttribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this TGetInfo_Return.
     * 
     * @param attributes   * list of requested attributes (see epagestypes:ListOfAttributes)
     */
    public void setAttributes(de.epages.ws.common.model.TAttribute[] attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the error value for this TGetInfo_Return.
     * 
     * @return error   * error object (see epagestypes:TError)
     */
    public de.epages.ws.common.model.TError getError() {
        return error;
    }


    /**
     * Sets the error value for this TGetInfo_Return.
     * 
     * @param error   * error object (see epagestypes:TError)
     */
    public void setError(de.epages.ws.common.model.TError error) {
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
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.viewedOn==null && other.getViewedOn()==null) || 
             (this.viewedOn!=null &&
              this.viewedOn.equals(other.getViewedOn()))) &&
            ((this.cancelledOn==null && other.getCancelledOn()==null) || 
             (this.cancelledOn!=null &&
              this.cancelledOn.equals(other.getCancelledOn()))) &&
            ((this.inProcessOn==null && other.getInProcessOn()==null) || 
             (this.inProcessOn!=null &&
              this.inProcessOn.equals(other.getInProcessOn()))) &&
            ((this.pendingOn==null && other.getPendingOn()==null) || 
             (this.pendingOn!=null &&
              this.pendingOn.equals(other.getPendingOn()))) &&
            ((this.readyForShippingOn==null && other.getReadyForShippingOn()==null) || 
             (this.readyForShippingOn!=null &&
              this.readyForShippingOn.equals(other.getReadyForShippingOn()))) &&
            ((this.partlyDispatchedOn==null && other.getPartlyDispatchedOn()==null) || 
             (this.partlyDispatchedOn!=null &&
              this.partlyDispatchedOn.equals(other.getPartlyDispatchedOn()))) &&
            ((this.dispatchedOn==null && other.getDispatchedOn()==null) || 
             (this.dispatchedOn!=null &&
              this.dispatchedOn.equals(other.getDispatchedOn()))) &&
            ((this.shippedOn==null && other.getShippedOn()==null) || 
             (this.shippedOn!=null &&
              this.shippedOn.equals(other.getShippedOn()))) &&
            ((this.partlyPaidOn==null && other.getPartlyPaidOn()==null) || 
             (this.partlyPaidOn!=null &&
              this.partlyPaidOn.equals(other.getPartlyPaidOn()))) &&
            ((this.paidOn==null && other.getPaidOn()==null) || 
             (this.paidOn!=null &&
              this.paidOn.equals(other.getPaidOn()))) &&
            ((this.closedOn==null && other.getClosedOn()==null) || 
             (this.closedOn!=null &&
              this.closedOn.equals(other.getClosedOn()))) &&
            ((this.archivedOn==null && other.getArchivedOn()==null) || 
             (this.archivedOn!=null &&
              this.archivedOn.equals(other.getArchivedOn()))) &&
            ((this.partlyInvoicedOn==null && other.getPartlyInvoicedOn()==null) || 
             (this.partlyInvoicedOn!=null &&
              this.partlyInvoicedOn.equals(other.getPartlyInvoicedOn()))) &&
            ((this.invoicedOn==null && other.getInvoicedOn()==null) || 
             (this.invoicedOn!=null &&
              this.invoicedOn.equals(other.getInvoicedOn()))) &&
            ((this.lineItemContainer==null && other.getLineItemContainer()==null) || 
             (this.lineItemContainer!=null &&
              this.lineItemContainer.equals(other.getLineItemContainer()))) &&
            ((this.billingAddress==null && other.getBillingAddress()==null) || 
             (this.billingAddress!=null &&
              this.billingAddress.equals(other.getBillingAddress()))) &&
            ((this.shippingAddress==null && other.getShippingAddress()==null) || 
             (this.shippingAddress!=null &&
              this.shippingAddress.equals(other.getShippingAddress()))) &&
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
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getViewedOn() != null) {
            _hashCode += getViewedOn().hashCode();
        }
        if (getCancelledOn() != null) {
            _hashCode += getCancelledOn().hashCode();
        }
        if (getInProcessOn() != null) {
            _hashCode += getInProcessOn().hashCode();
        }
        if (getPendingOn() != null) {
            _hashCode += getPendingOn().hashCode();
        }
        if (getReadyForShippingOn() != null) {
            _hashCode += getReadyForShippingOn().hashCode();
        }
        if (getPartlyDispatchedOn() != null) {
            _hashCode += getPartlyDispatchedOn().hashCode();
        }
        if (getDispatchedOn() != null) {
            _hashCode += getDispatchedOn().hashCode();
        }
        if (getShippedOn() != null) {
            _hashCode += getShippedOn().hashCode();
        }
        if (getPartlyPaidOn() != null) {
            _hashCode += getPartlyPaidOn().hashCode();
        }
        if (getPaidOn() != null) {
            _hashCode += getPaidOn().hashCode();
        }
        if (getClosedOn() != null) {
            _hashCode += getClosedOn().hashCode();
        }
        if (getArchivedOn() != null) {
            _hashCode += getArchivedOn().hashCode();
        }
        if (getPartlyInvoicedOn() != null) {
            _hashCode += getPartlyInvoicedOn().hashCode();
        }
        if (getInvoicedOn() != null) {
            _hashCode += getInvoicedOn().hashCode();
        }
        if (getLineItemContainer() != null) {
            _hashCode += getLineItemContainer().hashCode();
        }
        if (getBillingAddress() != null) {
            _hashCode += getBillingAddress().hashCode();
        }
        if (getShippingAddress() != null) {
            _hashCode += getShippingAddress().hashCode();
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/OrderTypes/2010/10", "TGetInfo_Return"));
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
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Customer"));
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
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewedOn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ViewedOn"));
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
        elemField.setFieldName("inProcessOn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InProcessOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingOn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PendingOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readyForShippingOn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReadyForShippingOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partlyDispatchedOn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PartlyDispatchedOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dispatchedOn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DispatchedOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippedOn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ShippedOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partlyPaidOn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PartlyPaidOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidOn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PaidOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedOn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClosedOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archivedOn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ArchivedOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partlyInvoicedOn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PartlyInvoicedOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoicedOn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InvoicedOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemContainer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LineItemContainer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/OrderTypes/2010/10", "TLineItemContainerOut"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BillingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ShopTypes/2006/07", "TAddressNamed"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ShippingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ShopTypes/2006/07", "TAddressNamed"));
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
