/**
 * TGetInfo_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.user3.model;


/**
 * a single return value of a getInfo() user call.
 *         the path will be always returned.
 *         the error element will be returned in case of error.
 *         all other elements will be returned if no error has occured.
 */
public class TGetInfo_Return  implements java.io.Serializable {
    /* user object path */
    private java.lang.String path;

    /* user alias (=login) */
    private java.lang.String alias;

    /* path to user's class */
    private java.lang.String _class;

    /* user's locale id (e.g. 'en_US') */
    private java.lang.String localeID;

    /* user's shop language code (e.g. 'en') */
    private java.lang.String languageCode;

    /* user's currency (e.g. 'EUR') */
    private java.lang.String currencyID;

    /* user's password */
    private java.lang.String password;

    /* user's activ state */
    private java.lang.Boolean isActivated;

    /* user's delete confirmation preference */
    private java.lang.Boolean deleteConfirmation;

    /* user's login cookie preference */
    private java.lang.Boolean isLoginCookieAllowed;

    /* user's html email preference */
    private java.lang.Boolean isHtmlEMailAllowed;

    /* user's reminder question */
    private java.lang.String reminderQuestion;

    /* user's challenge phrase */
    private java.lang.String challengePhrase;

    /* user's email */
    private java.lang.String EMail;

    /* user's display name */
    private java.lang.String name;

    /* user's billing address */
    private de.epages.ws.shop3.model.TAddressNamed billingAddress;

    /* user's shipping address */
    private de.epages.ws.shop3.model.TAddressNamed shippingAddress;

    /* all user addresses including the refered ShippingAddress and
     * BilliungAddress (see below) */
    private de.epages.ws.shop3.model.TAddressNamed[] additionalAddresses;

    /* list of assigned customers (see usertypes:ListOfCustomerPaths) */
    private java.lang.String[] customers;

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
           java.lang.String localeID,
           java.lang.String languageCode,
           java.lang.String currencyID,
           java.lang.String password,
           java.lang.Boolean isActivated,
           java.lang.Boolean deleteConfirmation,
           java.lang.Boolean isLoginCookieAllowed,
           java.lang.Boolean isHtmlEMailAllowed,
           java.lang.String reminderQuestion,
           java.lang.String challengePhrase,
           java.lang.String EMail,
           java.lang.String name,
           de.epages.ws.shop3.model.TAddressNamed billingAddress,
           de.epages.ws.shop3.model.TAddressNamed shippingAddress,
           de.epages.ws.shop3.model.TAddressNamed[] additionalAddresses,
           java.lang.String[] customers,
           de.epages.ws.common.model.TAttribute[] attributes,
           de.epages.ws.common.model.TError error) {
           this.path = path;
           this.alias = alias;
           this._class = _class;
           this.localeID = localeID;
           this.languageCode = languageCode;
           this.currencyID = currencyID;
           this.password = password;
           this.isActivated = isActivated;
           this.deleteConfirmation = deleteConfirmation;
           this.isLoginCookieAllowed = isLoginCookieAllowed;
           this.isHtmlEMailAllowed = isHtmlEMailAllowed;
           this.reminderQuestion = reminderQuestion;
           this.challengePhrase = challengePhrase;
           this.EMail = EMail;
           this.name = name;
           this.billingAddress = billingAddress;
           this.shippingAddress = shippingAddress;
           this.additionalAddresses = additionalAddresses;
           this.customers = customers;
           this.attributes = attributes;
           this.error = error;
    }


    /**
     * Gets the path value for this TGetInfo_Return.
     * 
     * @return path   * user object path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TGetInfo_Return.
     * 
     * @param path   * user object path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the alias value for this TGetInfo_Return.
     * 
     * @return alias   * user alias (=login)
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TGetInfo_Return.
     * 
     * @param alias   * user alias (=login)
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the _class value for this TGetInfo_Return.
     * 
     * @return _class   * path to user's class
     */
    public java.lang.String get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this TGetInfo_Return.
     * 
     * @param _class   * path to user's class
     */
    public void set_class(java.lang.String _class) {
        this._class = _class;
    }


    /**
     * Gets the localeID value for this TGetInfo_Return.
     * 
     * @return localeID   * user's locale id (e.g. 'en_US')
     */
    public java.lang.String getLocaleID() {
        return localeID;
    }


    /**
     * Sets the localeID value for this TGetInfo_Return.
     * 
     * @param localeID   * user's locale id (e.g. 'en_US')
     */
    public void setLocaleID(java.lang.String localeID) {
        this.localeID = localeID;
    }


    /**
     * Gets the languageCode value for this TGetInfo_Return.
     * 
     * @return languageCode   * user's shop language code (e.g. 'en')
     */
    public java.lang.String getLanguageCode() {
        return languageCode;
    }


    /**
     * Sets the languageCode value for this TGetInfo_Return.
     * 
     * @param languageCode   * user's shop language code (e.g. 'en')
     */
    public void setLanguageCode(java.lang.String languageCode) {
        this.languageCode = languageCode;
    }


    /**
     * Gets the currencyID value for this TGetInfo_Return.
     * 
     * @return currencyID   * user's currency (e.g. 'EUR')
     */
    public java.lang.String getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this TGetInfo_Return.
     * 
     * @param currencyID   * user's currency (e.g. 'EUR')
     */
    public void setCurrencyID(java.lang.String currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the password value for this TGetInfo_Return.
     * 
     * @return password   * user's password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this TGetInfo_Return.
     * 
     * @param password   * user's password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the isActivated value for this TGetInfo_Return.
     * 
     * @return isActivated   * user's activ state
     */
    public java.lang.Boolean getIsActivated() {
        return isActivated;
    }


    /**
     * Sets the isActivated value for this TGetInfo_Return.
     * 
     * @param isActivated   * user's activ state
     */
    public void setIsActivated(java.lang.Boolean isActivated) {
        this.isActivated = isActivated;
    }


    /**
     * Gets the deleteConfirmation value for this TGetInfo_Return.
     * 
     * @return deleteConfirmation   * user's delete confirmation preference
     */
    public java.lang.Boolean getDeleteConfirmation() {
        return deleteConfirmation;
    }


    /**
     * Sets the deleteConfirmation value for this TGetInfo_Return.
     * 
     * @param deleteConfirmation   * user's delete confirmation preference
     */
    public void setDeleteConfirmation(java.lang.Boolean deleteConfirmation) {
        this.deleteConfirmation = deleteConfirmation;
    }


    /**
     * Gets the isLoginCookieAllowed value for this TGetInfo_Return.
     * 
     * @return isLoginCookieAllowed   * user's login cookie preference
     */
    public java.lang.Boolean getIsLoginCookieAllowed() {
        return isLoginCookieAllowed;
    }


    /**
     * Sets the isLoginCookieAllowed value for this TGetInfo_Return.
     * 
     * @param isLoginCookieAllowed   * user's login cookie preference
     */
    public void setIsLoginCookieAllowed(java.lang.Boolean isLoginCookieAllowed) {
        this.isLoginCookieAllowed = isLoginCookieAllowed;
    }


    /**
     * Gets the isHtmlEMailAllowed value for this TGetInfo_Return.
     * 
     * @return isHtmlEMailAllowed   * user's html email preference
     */
    public java.lang.Boolean getIsHtmlEMailAllowed() {
        return isHtmlEMailAllowed;
    }


    /**
     * Sets the isHtmlEMailAllowed value for this TGetInfo_Return.
     * 
     * @param isHtmlEMailAllowed   * user's html email preference
     */
    public void setIsHtmlEMailAllowed(java.lang.Boolean isHtmlEMailAllowed) {
        this.isHtmlEMailAllowed = isHtmlEMailAllowed;
    }


    /**
     * Gets the reminderQuestion value for this TGetInfo_Return.
     * 
     * @return reminderQuestion   * user's reminder question
     */
    public java.lang.String getReminderQuestion() {
        return reminderQuestion;
    }


    /**
     * Sets the reminderQuestion value for this TGetInfo_Return.
     * 
     * @param reminderQuestion   * user's reminder question
     */
    public void setReminderQuestion(java.lang.String reminderQuestion) {
        this.reminderQuestion = reminderQuestion;
    }


    /**
     * Gets the challengePhrase value for this TGetInfo_Return.
     * 
     * @return challengePhrase   * user's challenge phrase
     */
    public java.lang.String getChallengePhrase() {
        return challengePhrase;
    }


    /**
     * Sets the challengePhrase value for this TGetInfo_Return.
     * 
     * @param challengePhrase   * user's challenge phrase
     */
    public void setChallengePhrase(java.lang.String challengePhrase) {
        this.challengePhrase = challengePhrase;
    }


    /**
     * Gets the EMail value for this TGetInfo_Return.
     * 
     * @return EMail   * user's email
     */
    public java.lang.String getEMail() {
        return EMail;
    }


    /**
     * Sets the EMail value for this TGetInfo_Return.
     * 
     * @param EMail   * user's email
     */
    public void setEMail(java.lang.String EMail) {
        this.EMail = EMail;
    }


    /**
     * Gets the name value for this TGetInfo_Return.
     * 
     * @return name   * user's display name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TGetInfo_Return.
     * 
     * @param name   * user's display name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the billingAddress value for this TGetInfo_Return.
     * 
     * @return billingAddress   * user's billing address
     */
    public de.epages.ws.shop3.model.TAddressNamed getBillingAddress() {
        return billingAddress;
    }


    /**
     * Sets the billingAddress value for this TGetInfo_Return.
     * 
     * @param billingAddress   * user's billing address
     */
    public void setBillingAddress(de.epages.ws.shop3.model.TAddressNamed billingAddress) {
        this.billingAddress = billingAddress;
    }


    /**
     * Gets the shippingAddress value for this TGetInfo_Return.
     * 
     * @return shippingAddress   * user's shipping address
     */
    public de.epages.ws.shop3.model.TAddressNamed getShippingAddress() {
        return shippingAddress;
    }


    /**
     * Sets the shippingAddress value for this TGetInfo_Return.
     * 
     * @param shippingAddress   * user's shipping address
     */
    public void setShippingAddress(de.epages.ws.shop3.model.TAddressNamed shippingAddress) {
        this.shippingAddress = shippingAddress;
    }


    /**
     * Gets the additionalAddresses value for this TGetInfo_Return.
     * 
     * @return additionalAddresses   * all user addresses including the refered ShippingAddress and
     * BilliungAddress (see below)
     */
    public de.epages.ws.shop3.model.TAddressNamed[] getAdditionalAddresses() {
        return additionalAddresses;
    }


    /**
     * Sets the additionalAddresses value for this TGetInfo_Return.
     * 
     * @param additionalAddresses   * all user addresses including the refered ShippingAddress and
     * BilliungAddress (see below)
     */
    public void setAdditionalAddresses(de.epages.ws.shop3.model.TAddressNamed[] additionalAddresses) {
        this.additionalAddresses = additionalAddresses;
    }


    /**
     * Gets the customers value for this TGetInfo_Return.
     * 
     * @return customers   * list of assigned customers (see usertypes:ListOfCustomerPaths)
     */
    public java.lang.String[] getCustomers() {
        return customers;
    }


    /**
     * Sets the customers value for this TGetInfo_Return.
     * 
     * @param customers   * list of assigned customers (see usertypes:ListOfCustomerPaths)
     */
    public void setCustomers(java.lang.String[] customers) {
        this.customers = customers;
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
            ((this.localeID==null && other.getLocaleID()==null) || 
             (this.localeID!=null &&
              this.localeID.equals(other.getLocaleID()))) &&
            ((this.languageCode==null && other.getLanguageCode()==null) || 
             (this.languageCode!=null &&
              this.languageCode.equals(other.getLanguageCode()))) &&
            ((this.currencyID==null && other.getCurrencyID()==null) || 
             (this.currencyID!=null &&
              this.currencyID.equals(other.getCurrencyID()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.isActivated==null && other.getIsActivated()==null) || 
             (this.isActivated!=null &&
              this.isActivated.equals(other.getIsActivated()))) &&
            ((this.deleteConfirmation==null && other.getDeleteConfirmation()==null) || 
             (this.deleteConfirmation!=null &&
              this.deleteConfirmation.equals(other.getDeleteConfirmation()))) &&
            ((this.isLoginCookieAllowed==null && other.getIsLoginCookieAllowed()==null) || 
             (this.isLoginCookieAllowed!=null &&
              this.isLoginCookieAllowed.equals(other.getIsLoginCookieAllowed()))) &&
            ((this.isHtmlEMailAllowed==null && other.getIsHtmlEMailAllowed()==null) || 
             (this.isHtmlEMailAllowed!=null &&
              this.isHtmlEMailAllowed.equals(other.getIsHtmlEMailAllowed()))) &&
            ((this.reminderQuestion==null && other.getReminderQuestion()==null) || 
             (this.reminderQuestion!=null &&
              this.reminderQuestion.equals(other.getReminderQuestion()))) &&
            ((this.challengePhrase==null && other.getChallengePhrase()==null) || 
             (this.challengePhrase!=null &&
              this.challengePhrase.equals(other.getChallengePhrase()))) &&
            ((this.EMail==null && other.getEMail()==null) || 
             (this.EMail!=null &&
              this.EMail.equals(other.getEMail()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.billingAddress==null && other.getBillingAddress()==null) || 
             (this.billingAddress!=null &&
              this.billingAddress.equals(other.getBillingAddress()))) &&
            ((this.shippingAddress==null && other.getShippingAddress()==null) || 
             (this.shippingAddress!=null &&
              this.shippingAddress.equals(other.getShippingAddress()))) &&
            ((this.additionalAddresses==null && other.getAdditionalAddresses()==null) || 
             (this.additionalAddresses!=null &&
              java.util.Arrays.equals(this.additionalAddresses, other.getAdditionalAddresses()))) &&
            ((this.customers==null && other.getCustomers()==null) || 
             (this.customers!=null &&
              java.util.Arrays.equals(this.customers, other.getCustomers()))) &&
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
        if (getLocaleID() != null) {
            _hashCode += getLocaleID().hashCode();
        }
        if (getLanguageCode() != null) {
            _hashCode += getLanguageCode().hashCode();
        }
        if (getCurrencyID() != null) {
            _hashCode += getCurrencyID().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getIsActivated() != null) {
            _hashCode += getIsActivated().hashCode();
        }
        if (getDeleteConfirmation() != null) {
            _hashCode += getDeleteConfirmation().hashCode();
        }
        if (getIsLoginCookieAllowed() != null) {
            _hashCode += getIsLoginCookieAllowed().hashCode();
        }
        if (getIsHtmlEMailAllowed() != null) {
            _hashCode += getIsHtmlEMailAllowed().hashCode();
        }
        if (getReminderQuestion() != null) {
            _hashCode += getReminderQuestion().hashCode();
        }
        if (getChallengePhrase() != null) {
            _hashCode += getChallengePhrase().hashCode();
        }
        if (getEMail() != null) {
            _hashCode += getEMail().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getBillingAddress() != null) {
            _hashCode += getBillingAddress().hashCode();
        }
        if (getShippingAddress() != null) {
            _hashCode += getShippingAddress().hashCode();
        }
        if (getAdditionalAddresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalAddresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalAddresses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomers(), i);
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/UserTypes/2011/01", "TGetInfo_Return"));
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
        elemField.setFieldName("localeID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LocaleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LanguageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CurrencyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActivated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsActivated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteConfirmation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DeleteConfirmation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isLoginCookieAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsLoginCookieAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isHtmlEMailAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsHtmlEMailAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminderQuestion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReminderQuestion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("challengePhrase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChallengePhrase"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BillingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ShopTypes/2011/01", "TAddressNamed"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ShippingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ShopTypes/2011/01", "TAddressNamed"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalAddresses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AdditionalAddresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ShopTypes/2011/01", "TAddressNamed"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Customers"));
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
