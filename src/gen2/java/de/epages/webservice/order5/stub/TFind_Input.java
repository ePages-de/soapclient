/**
 * TFind_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.order5.stub;


/**
 * input structure of a find() order call.
 *             a set of optional search parameters.
 *             Note: to search for orders that don't have a specific
 * status flag, set the
 *             corresponding "Not(Status)" field to true. Setting "Is(Status)"
 * to false has
 *             no effect.
 */
public class TFind_Input  implements java.io.Serializable {
    /* search for part of order alias */
    private java.lang.String alias;

    /* search for a product alias that is part of the order */
    private java.lang.String product;

    /* search for order beginning with this date */
    private java.util.Calendar dateFrom;

    /* search for order ending at this date */
    private java.util.Calendar dateTo;

    /* search for enabled order flag: IsViewed */
    private java.lang.Boolean isViewed;

    /* search for enabled order flag: IsCancelled */
    private java.lang.Boolean isCancelled;

    /* search for enabled order flag: IsInProcess */
    private java.lang.Boolean isInProcess;

    /* search for enabled order flag: IsPending */
    private java.lang.Boolean isPending;

    /* search for enabled order flag: IsReadyForShipping */
    private java.lang.Boolean isReadyForShipping;

    /* search for enabled order flag: IsPartlyDispatched */
    private java.lang.Boolean isPartlyDispatched;

    /* search for enabled order flag: IsDispatched */
    private java.lang.Boolean isDispatched;

    /* search for enabled order flag: IsShipped */
    private java.lang.Boolean isShipped;

    /* search for enabled order flag: IsPartlyPaid */
    private java.lang.Boolean isPartlyPaid;

    /* search for enabled order flag: IsPaid */
    private java.lang.Boolean isPaid;

    /* search for enabled order flag: IsClosed */
    private java.lang.Boolean isClosed;

    /* search for enabled order flag: IsArchived */
    private java.lang.Boolean isArchived;

    /* search for enabled order flag: IsPartlyInvoiced */
    private java.lang.Boolean isPartlyInvoiced;

    /* search for enabled order flag: IsInvoiced */
    private java.lang.Boolean isInvoiced;

    /* search for disabled order flag: IsViewed */
    private java.lang.Boolean notViewed;

    /* search for disabled order flag: IsCancelled */
    private java.lang.Boolean notCancelled;

    /* search for disabled order flag: IsInProcess */
    private java.lang.Boolean notInProcess;

    /* search for disabled order flag: IsPending */
    private java.lang.Boolean notPending;

    /* search for disabled order flag: IsReadyForShipping */
    private java.lang.Boolean notReadyForShipping;

    /* search for disabled order flag: IsPartlyDispatched */
    private java.lang.Boolean notPartlyDispatched;

    /* search for disabled order flag: IsDispatched */
    private java.lang.Boolean notDispatched;

    /* search for disabled order flag: IsShipped */
    private java.lang.Boolean notShipped;

    /* search for disabled order flag: IsPartlyPaid */
    private java.lang.Boolean notPartlyPaid;

    /* search for disabled order flag: IsPaid */
    private java.lang.Boolean notPaid;

    /* search for disabled order flag: IsClosed */
    private java.lang.Boolean notClosed;

    /* search for disabled order flag: IsArchived */
    private java.lang.Boolean notArchived;

    /* search for disabled order flag: IsPartlyInvoiced */
    private java.lang.Boolean notPartlyInvoiced;

    /* search for disabled order flag: IsInvoiced */
    private java.lang.Boolean notInvoiced;

    public TFind_Input() {
    }

    public TFind_Input(
           java.lang.String alias,
           java.lang.String product,
           java.util.Calendar dateFrom,
           java.util.Calendar dateTo,
           java.lang.Boolean isViewed,
           java.lang.Boolean isCancelled,
           java.lang.Boolean isInProcess,
           java.lang.Boolean isPending,
           java.lang.Boolean isReadyForShipping,
           java.lang.Boolean isPartlyDispatched,
           java.lang.Boolean isDispatched,
           java.lang.Boolean isShipped,
           java.lang.Boolean isPartlyPaid,
           java.lang.Boolean isPaid,
           java.lang.Boolean isClosed,
           java.lang.Boolean isArchived,
           java.lang.Boolean isPartlyInvoiced,
           java.lang.Boolean isInvoiced,
           java.lang.Boolean notViewed,
           java.lang.Boolean notCancelled,
           java.lang.Boolean notInProcess,
           java.lang.Boolean notPending,
           java.lang.Boolean notReadyForShipping,
           java.lang.Boolean notPartlyDispatched,
           java.lang.Boolean notDispatched,
           java.lang.Boolean notShipped,
           java.lang.Boolean notPartlyPaid,
           java.lang.Boolean notPaid,
           java.lang.Boolean notClosed,
           java.lang.Boolean notArchived,
           java.lang.Boolean notPartlyInvoiced,
           java.lang.Boolean notInvoiced) {
           this.alias = alias;
           this.product = product;
           this.dateFrom = dateFrom;
           this.dateTo = dateTo;
           this.isViewed = isViewed;
           this.isCancelled = isCancelled;
           this.isInProcess = isInProcess;
           this.isPending = isPending;
           this.isReadyForShipping = isReadyForShipping;
           this.isPartlyDispatched = isPartlyDispatched;
           this.isDispatched = isDispatched;
           this.isShipped = isShipped;
           this.isPartlyPaid = isPartlyPaid;
           this.isPaid = isPaid;
           this.isClosed = isClosed;
           this.isArchived = isArchived;
           this.isPartlyInvoiced = isPartlyInvoiced;
           this.isInvoiced = isInvoiced;
           this.notViewed = notViewed;
           this.notCancelled = notCancelled;
           this.notInProcess = notInProcess;
           this.notPending = notPending;
           this.notReadyForShipping = notReadyForShipping;
           this.notPartlyDispatched = notPartlyDispatched;
           this.notDispatched = notDispatched;
           this.notShipped = notShipped;
           this.notPartlyPaid = notPartlyPaid;
           this.notPaid = notPaid;
           this.notClosed = notClosed;
           this.notArchived = notArchived;
           this.notPartlyInvoiced = notPartlyInvoiced;
           this.notInvoiced = notInvoiced;
    }


    /**
     * Gets the alias value for this TFind_Input.
     * 
     * @return alias   * search for part of order alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TFind_Input.
     * 
     * @param alias   * search for part of order alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the product value for this TFind_Input.
     * 
     * @return product   * search for a product alias that is part of the order
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this TFind_Input.
     * 
     * @param product   * search for a product alias that is part of the order
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the dateFrom value for this TFind_Input.
     * 
     * @return dateFrom   * search for order beginning with this date
     */
    public java.util.Calendar getDateFrom() {
        return dateFrom;
    }


    /**
     * Sets the dateFrom value for this TFind_Input.
     * 
     * @param dateFrom   * search for order beginning with this date
     */
    public void setDateFrom(java.util.Calendar dateFrom) {
        this.dateFrom = dateFrom;
    }


    /**
     * Gets the dateTo value for this TFind_Input.
     * 
     * @return dateTo   * search for order ending at this date
     */
    public java.util.Calendar getDateTo() {
        return dateTo;
    }


    /**
     * Sets the dateTo value for this TFind_Input.
     * 
     * @param dateTo   * search for order ending at this date
     */
    public void setDateTo(java.util.Calendar dateTo) {
        this.dateTo = dateTo;
    }


    /**
     * Gets the isViewed value for this TFind_Input.
     * 
     * @return isViewed   * search for enabled order flag: IsViewed
     */
    public java.lang.Boolean getIsViewed() {
        return isViewed;
    }


    /**
     * Sets the isViewed value for this TFind_Input.
     * 
     * @param isViewed   * search for enabled order flag: IsViewed
     */
    public void setIsViewed(java.lang.Boolean isViewed) {
        this.isViewed = isViewed;
    }


    /**
     * Gets the isCancelled value for this TFind_Input.
     * 
     * @return isCancelled   * search for enabled order flag: IsCancelled
     */
    public java.lang.Boolean getIsCancelled() {
        return isCancelled;
    }


    /**
     * Sets the isCancelled value for this TFind_Input.
     * 
     * @param isCancelled   * search for enabled order flag: IsCancelled
     */
    public void setIsCancelled(java.lang.Boolean isCancelled) {
        this.isCancelled = isCancelled;
    }


    /**
     * Gets the isInProcess value for this TFind_Input.
     * 
     * @return isInProcess   * search for enabled order flag: IsInProcess
     */
    public java.lang.Boolean getIsInProcess() {
        return isInProcess;
    }


    /**
     * Sets the isInProcess value for this TFind_Input.
     * 
     * @param isInProcess   * search for enabled order flag: IsInProcess
     */
    public void setIsInProcess(java.lang.Boolean isInProcess) {
        this.isInProcess = isInProcess;
    }


    /**
     * Gets the isPending value for this TFind_Input.
     * 
     * @return isPending   * search for enabled order flag: IsPending
     */
    public java.lang.Boolean getIsPending() {
        return isPending;
    }


    /**
     * Sets the isPending value for this TFind_Input.
     * 
     * @param isPending   * search for enabled order flag: IsPending
     */
    public void setIsPending(java.lang.Boolean isPending) {
        this.isPending = isPending;
    }


    /**
     * Gets the isReadyForShipping value for this TFind_Input.
     * 
     * @return isReadyForShipping   * search for enabled order flag: IsReadyForShipping
     */
    public java.lang.Boolean getIsReadyForShipping() {
        return isReadyForShipping;
    }


    /**
     * Sets the isReadyForShipping value for this TFind_Input.
     * 
     * @param isReadyForShipping   * search for enabled order flag: IsReadyForShipping
     */
    public void setIsReadyForShipping(java.lang.Boolean isReadyForShipping) {
        this.isReadyForShipping = isReadyForShipping;
    }


    /**
     * Gets the isPartlyDispatched value for this TFind_Input.
     * 
     * @return isPartlyDispatched   * search for enabled order flag: IsPartlyDispatched
     */
    public java.lang.Boolean getIsPartlyDispatched() {
        return isPartlyDispatched;
    }


    /**
     * Sets the isPartlyDispatched value for this TFind_Input.
     * 
     * @param isPartlyDispatched   * search for enabled order flag: IsPartlyDispatched
     */
    public void setIsPartlyDispatched(java.lang.Boolean isPartlyDispatched) {
        this.isPartlyDispatched = isPartlyDispatched;
    }


    /**
     * Gets the isDispatched value for this TFind_Input.
     * 
     * @return isDispatched   * search for enabled order flag: IsDispatched
     */
    public java.lang.Boolean getIsDispatched() {
        return isDispatched;
    }


    /**
     * Sets the isDispatched value for this TFind_Input.
     * 
     * @param isDispatched   * search for enabled order flag: IsDispatched
     */
    public void setIsDispatched(java.lang.Boolean isDispatched) {
        this.isDispatched = isDispatched;
    }


    /**
     * Gets the isShipped value for this TFind_Input.
     * 
     * @return isShipped   * search for enabled order flag: IsShipped
     */
    public java.lang.Boolean getIsShipped() {
        return isShipped;
    }


    /**
     * Sets the isShipped value for this TFind_Input.
     * 
     * @param isShipped   * search for enabled order flag: IsShipped
     */
    public void setIsShipped(java.lang.Boolean isShipped) {
        this.isShipped = isShipped;
    }


    /**
     * Gets the isPartlyPaid value for this TFind_Input.
     * 
     * @return isPartlyPaid   * search for enabled order flag: IsPartlyPaid
     */
    public java.lang.Boolean getIsPartlyPaid() {
        return isPartlyPaid;
    }


    /**
     * Sets the isPartlyPaid value for this TFind_Input.
     * 
     * @param isPartlyPaid   * search for enabled order flag: IsPartlyPaid
     */
    public void setIsPartlyPaid(java.lang.Boolean isPartlyPaid) {
        this.isPartlyPaid = isPartlyPaid;
    }


    /**
     * Gets the isPaid value for this TFind_Input.
     * 
     * @return isPaid   * search for enabled order flag: IsPaid
     */
    public java.lang.Boolean getIsPaid() {
        return isPaid;
    }


    /**
     * Sets the isPaid value for this TFind_Input.
     * 
     * @param isPaid   * search for enabled order flag: IsPaid
     */
    public void setIsPaid(java.lang.Boolean isPaid) {
        this.isPaid = isPaid;
    }


    /**
     * Gets the isClosed value for this TFind_Input.
     * 
     * @return isClosed   * search for enabled order flag: IsClosed
     */
    public java.lang.Boolean getIsClosed() {
        return isClosed;
    }


    /**
     * Sets the isClosed value for this TFind_Input.
     * 
     * @param isClosed   * search for enabled order flag: IsClosed
     */
    public void setIsClosed(java.lang.Boolean isClosed) {
        this.isClosed = isClosed;
    }


    /**
     * Gets the isArchived value for this TFind_Input.
     * 
     * @return isArchived   * search for enabled order flag: IsArchived
     */
    public java.lang.Boolean getIsArchived() {
        return isArchived;
    }


    /**
     * Sets the isArchived value for this TFind_Input.
     * 
     * @param isArchived   * search for enabled order flag: IsArchived
     */
    public void setIsArchived(java.lang.Boolean isArchived) {
        this.isArchived = isArchived;
    }


    /**
     * Gets the isPartlyInvoiced value for this TFind_Input.
     * 
     * @return isPartlyInvoiced   * search for enabled order flag: IsPartlyInvoiced
     */
    public java.lang.Boolean getIsPartlyInvoiced() {
        return isPartlyInvoiced;
    }


    /**
     * Sets the isPartlyInvoiced value for this TFind_Input.
     * 
     * @param isPartlyInvoiced   * search for enabled order flag: IsPartlyInvoiced
     */
    public void setIsPartlyInvoiced(java.lang.Boolean isPartlyInvoiced) {
        this.isPartlyInvoiced = isPartlyInvoiced;
    }


    /**
     * Gets the isInvoiced value for this TFind_Input.
     * 
     * @return isInvoiced   * search for enabled order flag: IsInvoiced
     */
    public java.lang.Boolean getIsInvoiced() {
        return isInvoiced;
    }


    /**
     * Sets the isInvoiced value for this TFind_Input.
     * 
     * @param isInvoiced   * search for enabled order flag: IsInvoiced
     */
    public void setIsInvoiced(java.lang.Boolean isInvoiced) {
        this.isInvoiced = isInvoiced;
    }


    /**
     * Gets the notViewed value for this TFind_Input.
     * 
     * @return notViewed   * search for disabled order flag: IsViewed
     */
    public java.lang.Boolean getNotViewed() {
        return notViewed;
    }


    /**
     * Sets the notViewed value for this TFind_Input.
     * 
     * @param notViewed   * search for disabled order flag: IsViewed
     */
    public void setNotViewed(java.lang.Boolean notViewed) {
        this.notViewed = notViewed;
    }


    /**
     * Gets the notCancelled value for this TFind_Input.
     * 
     * @return notCancelled   * search for disabled order flag: IsCancelled
     */
    public java.lang.Boolean getNotCancelled() {
        return notCancelled;
    }


    /**
     * Sets the notCancelled value for this TFind_Input.
     * 
     * @param notCancelled   * search for disabled order flag: IsCancelled
     */
    public void setNotCancelled(java.lang.Boolean notCancelled) {
        this.notCancelled = notCancelled;
    }


    /**
     * Gets the notInProcess value for this TFind_Input.
     * 
     * @return notInProcess   * search for disabled order flag: IsInProcess
     */
    public java.lang.Boolean getNotInProcess() {
        return notInProcess;
    }


    /**
     * Sets the notInProcess value for this TFind_Input.
     * 
     * @param notInProcess   * search for disabled order flag: IsInProcess
     */
    public void setNotInProcess(java.lang.Boolean notInProcess) {
        this.notInProcess = notInProcess;
    }


    /**
     * Gets the notPending value for this TFind_Input.
     * 
     * @return notPending   * search for disabled order flag: IsPending
     */
    public java.lang.Boolean getNotPending() {
        return notPending;
    }


    /**
     * Sets the notPending value for this TFind_Input.
     * 
     * @param notPending   * search for disabled order flag: IsPending
     */
    public void setNotPending(java.lang.Boolean notPending) {
        this.notPending = notPending;
    }


    /**
     * Gets the notReadyForShipping value for this TFind_Input.
     * 
     * @return notReadyForShipping   * search for disabled order flag: IsReadyForShipping
     */
    public java.lang.Boolean getNotReadyForShipping() {
        return notReadyForShipping;
    }


    /**
     * Sets the notReadyForShipping value for this TFind_Input.
     * 
     * @param notReadyForShipping   * search for disabled order flag: IsReadyForShipping
     */
    public void setNotReadyForShipping(java.lang.Boolean notReadyForShipping) {
        this.notReadyForShipping = notReadyForShipping;
    }


    /**
     * Gets the notPartlyDispatched value for this TFind_Input.
     * 
     * @return notPartlyDispatched   * search for disabled order flag: IsPartlyDispatched
     */
    public java.lang.Boolean getNotPartlyDispatched() {
        return notPartlyDispatched;
    }


    /**
     * Sets the notPartlyDispatched value for this TFind_Input.
     * 
     * @param notPartlyDispatched   * search for disabled order flag: IsPartlyDispatched
     */
    public void setNotPartlyDispatched(java.lang.Boolean notPartlyDispatched) {
        this.notPartlyDispatched = notPartlyDispatched;
    }


    /**
     * Gets the notDispatched value for this TFind_Input.
     * 
     * @return notDispatched   * search for disabled order flag: IsDispatched
     */
    public java.lang.Boolean getNotDispatched() {
        return notDispatched;
    }


    /**
     * Sets the notDispatched value for this TFind_Input.
     * 
     * @param notDispatched   * search for disabled order flag: IsDispatched
     */
    public void setNotDispatched(java.lang.Boolean notDispatched) {
        this.notDispatched = notDispatched;
    }


    /**
     * Gets the notShipped value for this TFind_Input.
     * 
     * @return notShipped   * search for disabled order flag: IsShipped
     */
    public java.lang.Boolean getNotShipped() {
        return notShipped;
    }


    /**
     * Sets the notShipped value for this TFind_Input.
     * 
     * @param notShipped   * search for disabled order flag: IsShipped
     */
    public void setNotShipped(java.lang.Boolean notShipped) {
        this.notShipped = notShipped;
    }


    /**
     * Gets the notPartlyPaid value for this TFind_Input.
     * 
     * @return notPartlyPaid   * search for disabled order flag: IsPartlyPaid
     */
    public java.lang.Boolean getNotPartlyPaid() {
        return notPartlyPaid;
    }


    /**
     * Sets the notPartlyPaid value for this TFind_Input.
     * 
     * @param notPartlyPaid   * search for disabled order flag: IsPartlyPaid
     */
    public void setNotPartlyPaid(java.lang.Boolean notPartlyPaid) {
        this.notPartlyPaid = notPartlyPaid;
    }


    /**
     * Gets the notPaid value for this TFind_Input.
     * 
     * @return notPaid   * search for disabled order flag: IsPaid
     */
    public java.lang.Boolean getNotPaid() {
        return notPaid;
    }


    /**
     * Sets the notPaid value for this TFind_Input.
     * 
     * @param notPaid   * search for disabled order flag: IsPaid
     */
    public void setNotPaid(java.lang.Boolean notPaid) {
        this.notPaid = notPaid;
    }


    /**
     * Gets the notClosed value for this TFind_Input.
     * 
     * @return notClosed   * search for disabled order flag: IsClosed
     */
    public java.lang.Boolean getNotClosed() {
        return notClosed;
    }


    /**
     * Sets the notClosed value for this TFind_Input.
     * 
     * @param notClosed   * search for disabled order flag: IsClosed
     */
    public void setNotClosed(java.lang.Boolean notClosed) {
        this.notClosed = notClosed;
    }


    /**
     * Gets the notArchived value for this TFind_Input.
     * 
     * @return notArchived   * search for disabled order flag: IsArchived
     */
    public java.lang.Boolean getNotArchived() {
        return notArchived;
    }


    /**
     * Sets the notArchived value for this TFind_Input.
     * 
     * @param notArchived   * search for disabled order flag: IsArchived
     */
    public void setNotArchived(java.lang.Boolean notArchived) {
        this.notArchived = notArchived;
    }


    /**
     * Gets the notPartlyInvoiced value for this TFind_Input.
     * 
     * @return notPartlyInvoiced   * search for disabled order flag: IsPartlyInvoiced
     */
    public java.lang.Boolean getNotPartlyInvoiced() {
        return notPartlyInvoiced;
    }


    /**
     * Sets the notPartlyInvoiced value for this TFind_Input.
     * 
     * @param notPartlyInvoiced   * search for disabled order flag: IsPartlyInvoiced
     */
    public void setNotPartlyInvoiced(java.lang.Boolean notPartlyInvoiced) {
        this.notPartlyInvoiced = notPartlyInvoiced;
    }


    /**
     * Gets the notInvoiced value for this TFind_Input.
     * 
     * @return notInvoiced   * search for disabled order flag: IsInvoiced
     */
    public java.lang.Boolean getNotInvoiced() {
        return notInvoiced;
    }


    /**
     * Sets the notInvoiced value for this TFind_Input.
     * 
     * @param notInvoiced   * search for disabled order flag: IsInvoiced
     */
    public void setNotInvoiced(java.lang.Boolean notInvoiced) {
        this.notInvoiced = notInvoiced;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TFind_Input)) return false;
        TFind_Input other = (TFind_Input) obj;
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
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.dateFrom==null && other.getDateFrom()==null) || 
             (this.dateFrom!=null &&
              this.dateFrom.equals(other.getDateFrom()))) &&
            ((this.dateTo==null && other.getDateTo()==null) || 
             (this.dateTo!=null &&
              this.dateTo.equals(other.getDateTo()))) &&
            ((this.isViewed==null && other.getIsViewed()==null) || 
             (this.isViewed!=null &&
              this.isViewed.equals(other.getIsViewed()))) &&
            ((this.isCancelled==null && other.getIsCancelled()==null) || 
             (this.isCancelled!=null &&
              this.isCancelled.equals(other.getIsCancelled()))) &&
            ((this.isInProcess==null && other.getIsInProcess()==null) || 
             (this.isInProcess!=null &&
              this.isInProcess.equals(other.getIsInProcess()))) &&
            ((this.isPending==null && other.getIsPending()==null) || 
             (this.isPending!=null &&
              this.isPending.equals(other.getIsPending()))) &&
            ((this.isReadyForShipping==null && other.getIsReadyForShipping()==null) || 
             (this.isReadyForShipping!=null &&
              this.isReadyForShipping.equals(other.getIsReadyForShipping()))) &&
            ((this.isPartlyDispatched==null && other.getIsPartlyDispatched()==null) || 
             (this.isPartlyDispatched!=null &&
              this.isPartlyDispatched.equals(other.getIsPartlyDispatched()))) &&
            ((this.isDispatched==null && other.getIsDispatched()==null) || 
             (this.isDispatched!=null &&
              this.isDispatched.equals(other.getIsDispatched()))) &&
            ((this.isShipped==null && other.getIsShipped()==null) || 
             (this.isShipped!=null &&
              this.isShipped.equals(other.getIsShipped()))) &&
            ((this.isPartlyPaid==null && other.getIsPartlyPaid()==null) || 
             (this.isPartlyPaid!=null &&
              this.isPartlyPaid.equals(other.getIsPartlyPaid()))) &&
            ((this.isPaid==null && other.getIsPaid()==null) || 
             (this.isPaid!=null &&
              this.isPaid.equals(other.getIsPaid()))) &&
            ((this.isClosed==null && other.getIsClosed()==null) || 
             (this.isClosed!=null &&
              this.isClosed.equals(other.getIsClosed()))) &&
            ((this.isArchived==null && other.getIsArchived()==null) || 
             (this.isArchived!=null &&
              this.isArchived.equals(other.getIsArchived()))) &&
            ((this.isPartlyInvoiced==null && other.getIsPartlyInvoiced()==null) || 
             (this.isPartlyInvoiced!=null &&
              this.isPartlyInvoiced.equals(other.getIsPartlyInvoiced()))) &&
            ((this.isInvoiced==null && other.getIsInvoiced()==null) || 
             (this.isInvoiced!=null &&
              this.isInvoiced.equals(other.getIsInvoiced()))) &&
            ((this.notViewed==null && other.getNotViewed()==null) || 
             (this.notViewed!=null &&
              this.notViewed.equals(other.getNotViewed()))) &&
            ((this.notCancelled==null && other.getNotCancelled()==null) || 
             (this.notCancelled!=null &&
              this.notCancelled.equals(other.getNotCancelled()))) &&
            ((this.notInProcess==null && other.getNotInProcess()==null) || 
             (this.notInProcess!=null &&
              this.notInProcess.equals(other.getNotInProcess()))) &&
            ((this.notPending==null && other.getNotPending()==null) || 
             (this.notPending!=null &&
              this.notPending.equals(other.getNotPending()))) &&
            ((this.notReadyForShipping==null && other.getNotReadyForShipping()==null) || 
             (this.notReadyForShipping!=null &&
              this.notReadyForShipping.equals(other.getNotReadyForShipping()))) &&
            ((this.notPartlyDispatched==null && other.getNotPartlyDispatched()==null) || 
             (this.notPartlyDispatched!=null &&
              this.notPartlyDispatched.equals(other.getNotPartlyDispatched()))) &&
            ((this.notDispatched==null && other.getNotDispatched()==null) || 
             (this.notDispatched!=null &&
              this.notDispatched.equals(other.getNotDispatched()))) &&
            ((this.notShipped==null && other.getNotShipped()==null) || 
             (this.notShipped!=null &&
              this.notShipped.equals(other.getNotShipped()))) &&
            ((this.notPartlyPaid==null && other.getNotPartlyPaid()==null) || 
             (this.notPartlyPaid!=null &&
              this.notPartlyPaid.equals(other.getNotPartlyPaid()))) &&
            ((this.notPaid==null && other.getNotPaid()==null) || 
             (this.notPaid!=null &&
              this.notPaid.equals(other.getNotPaid()))) &&
            ((this.notClosed==null && other.getNotClosed()==null) || 
             (this.notClosed!=null &&
              this.notClosed.equals(other.getNotClosed()))) &&
            ((this.notArchived==null && other.getNotArchived()==null) || 
             (this.notArchived!=null &&
              this.notArchived.equals(other.getNotArchived()))) &&
            ((this.notPartlyInvoiced==null && other.getNotPartlyInvoiced()==null) || 
             (this.notPartlyInvoiced!=null &&
              this.notPartlyInvoiced.equals(other.getNotPartlyInvoiced()))) &&
            ((this.notInvoiced==null && other.getNotInvoiced()==null) || 
             (this.notInvoiced!=null &&
              this.notInvoiced.equals(other.getNotInvoiced())));
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
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getDateFrom() != null) {
            _hashCode += getDateFrom().hashCode();
        }
        if (getDateTo() != null) {
            _hashCode += getDateTo().hashCode();
        }
        if (getIsViewed() != null) {
            _hashCode += getIsViewed().hashCode();
        }
        if (getIsCancelled() != null) {
            _hashCode += getIsCancelled().hashCode();
        }
        if (getIsInProcess() != null) {
            _hashCode += getIsInProcess().hashCode();
        }
        if (getIsPending() != null) {
            _hashCode += getIsPending().hashCode();
        }
        if (getIsReadyForShipping() != null) {
            _hashCode += getIsReadyForShipping().hashCode();
        }
        if (getIsPartlyDispatched() != null) {
            _hashCode += getIsPartlyDispatched().hashCode();
        }
        if (getIsDispatched() != null) {
            _hashCode += getIsDispatched().hashCode();
        }
        if (getIsShipped() != null) {
            _hashCode += getIsShipped().hashCode();
        }
        if (getIsPartlyPaid() != null) {
            _hashCode += getIsPartlyPaid().hashCode();
        }
        if (getIsPaid() != null) {
            _hashCode += getIsPaid().hashCode();
        }
        if (getIsClosed() != null) {
            _hashCode += getIsClosed().hashCode();
        }
        if (getIsArchived() != null) {
            _hashCode += getIsArchived().hashCode();
        }
        if (getIsPartlyInvoiced() != null) {
            _hashCode += getIsPartlyInvoiced().hashCode();
        }
        if (getIsInvoiced() != null) {
            _hashCode += getIsInvoiced().hashCode();
        }
        if (getNotViewed() != null) {
            _hashCode += getNotViewed().hashCode();
        }
        if (getNotCancelled() != null) {
            _hashCode += getNotCancelled().hashCode();
        }
        if (getNotInProcess() != null) {
            _hashCode += getNotInProcess().hashCode();
        }
        if (getNotPending() != null) {
            _hashCode += getNotPending().hashCode();
        }
        if (getNotReadyForShipping() != null) {
            _hashCode += getNotReadyForShipping().hashCode();
        }
        if (getNotPartlyDispatched() != null) {
            _hashCode += getNotPartlyDispatched().hashCode();
        }
        if (getNotDispatched() != null) {
            _hashCode += getNotDispatched().hashCode();
        }
        if (getNotShipped() != null) {
            _hashCode += getNotShipped().hashCode();
        }
        if (getNotPartlyPaid() != null) {
            _hashCode += getNotPartlyPaid().hashCode();
        }
        if (getNotPaid() != null) {
            _hashCode += getNotPaid().hashCode();
        }
        if (getNotClosed() != null) {
            _hashCode += getNotClosed().hashCode();
        }
        if (getNotArchived() != null) {
            _hashCode += getNotArchived().hashCode();
        }
        if (getNotPartlyInvoiced() != null) {
            _hashCode += getNotPartlyInvoiced().hashCode();
        }
        if (getNotInvoiced() != null) {
            _hashCode += getNotInvoiced().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TFind_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/OrderService/2009/01", "TFind_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isViewed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsViewed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCancelled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsCancelled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInProcess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsInProcess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPending");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsPending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReadyForShipping");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsReadyForShipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPartlyDispatched");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsPartlyDispatched"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDispatched");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsDispatched"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isShipped");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsShipped"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPartlyPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsPartlyPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsClosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isArchived");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsArchived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPartlyInvoiced");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsPartlyInvoiced"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInvoiced");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsInvoiced"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notViewed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NotViewed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notCancelled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NotCancelled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notInProcess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NotInProcess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notPending");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NotPending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notReadyForShipping");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NotReadyForShipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notPartlyDispatched");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NotPartlyDispatched"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notDispatched");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NotDispatched"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notShipped");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NotShipped"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notPartlyPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NotPartlyPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NotPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NotClosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notArchived");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NotArchived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notPartlyInvoiced");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NotPartlyInvoiced"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notInvoiced");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NotInvoiced"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
