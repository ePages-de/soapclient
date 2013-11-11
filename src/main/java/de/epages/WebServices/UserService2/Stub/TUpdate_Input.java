/**
 * TUpdate_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.UserService2.Stub;


/**
 * input arguments of a single update() user call.
 *         a set of optional user specific attributes that will be updated.
 * the path element is mandatory.
 *         all others are optional.
 */
public class TUpdate_Input  implements java.io.Serializable {
    /* user object path */
    private java.lang.String path;

    /* user's locale id (e.g. 'en_US') */
    private java.lang.String localeID;

    /* user's shop language code (e.g. 'en') */
    private java.lang.String languageCode;

    /* user's currency (e.g. 'EUR') */
    private java.lang.String currencyID;

    /* user's password (crypted) */
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
    private de.epages.WebServices.UserService2.Stub.TAddressNamed billingAddress;

    /* user's shipping address */
    private de.epages.WebServices.UserService2.Stub.TAddressNamed shippingAddress;

    /* all user's shipping addresses identified by alias */
    private de.epages.WebServices.UserService2.Stub.TAddressNamed[] additionalAddresses;

    /* list of assigned customers (see usertypes:ListOfCustomerPaths) */
    private java.lang.String[] customers;

    /* list of requested attributes (see epagestypes:ListOfAttributes) */
    private de.epages.WebServices.UserService2.Stub.TAttribute[] attributes;

    public TUpdate_Input() {
    }

    public TUpdate_Input(
           java.lang.String path,
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
           de.epages.WebServices.UserService2.Stub.TAddressNamed billingAddress,
           de.epages.WebServices.UserService2.Stub.TAddressNamed shippingAddress,
           de.epages.WebServices.UserService2.Stub.TAddressNamed[] additionalAddresses,
           java.lang.String[] customers,
           de.epages.WebServices.UserService2.Stub.TAttribute[] attributes) {
           this.path = path;
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
    }


    /**
     * Gets the path value for this TUpdate_Input.
     * 
     * @return path   * user object path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TUpdate_Input.
     * 
     * @param path   * user object path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the localeID value for this TUpdate_Input.
     * 
     * @return localeID   * user's locale id (e.g. 'en_US')
     */
    public java.lang.String getLocaleID() {
        return localeID;
    }


    /**
     * Sets the localeID value for this TUpdate_Input.
     * 
     * @param localeID   * user's locale id (e.g. 'en_US')
     */
    public void setLocaleID(java.lang.String localeID) {
        this.localeID = localeID;
    }


    /**
     * Gets the languageCode value for this TUpdate_Input.
     * 
     * @return languageCode   * user's shop language code (e.g. 'en')
     */
    public java.lang.String getLanguageCode() {
        return languageCode;
    }


    /**
     * Sets the languageCode value for this TUpdate_Input.
     * 
     * @param languageCode   * user's shop language code (e.g. 'en')
     */
    public void setLanguageCode(java.lang.String languageCode) {
        this.languageCode = languageCode;
    }


    /**
     * Gets the currencyID value for this TUpdate_Input.
     * 
     * @return currencyID   * user's currency (e.g. 'EUR')
     */
    public java.lang.String getCurrencyID() {
        return currencyID;
    }


    /**
     * Sets the currencyID value for this TUpdate_Input.
     * 
     * @param currencyID   * user's currency (e.g. 'EUR')
     */
    public void setCurrencyID(java.lang.String currencyID) {
        this.currencyID = currencyID;
    }


    /**
     * Gets the password value for this TUpdate_Input.
     * 
     * @return password   * user's password (crypted)
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this TUpdate_Input.
     * 
     * @param password   * user's password (crypted)
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the isActivated value for this TUpdate_Input.
     * 
     * @return isActivated   * user's activ state
     */
    public java.lang.Boolean getIsActivated() {
        return isActivated;
    }


    /**
     * Sets the isActivated value for this TUpdate_Input.
     * 
     * @param isActivated   * user's activ state
     */
    public void setIsActivated(java.lang.Boolean isActivated) {
        this.isActivated = isActivated;
    }


    /**
     * Gets the deleteConfirmation value for this TUpdate_Input.
     * 
     * @return deleteConfirmation   * user's delete confirmation preference
     */
    public java.lang.Boolean getDeleteConfirmation() {
        return deleteConfirmation;
    }


    /**
     * Sets the deleteConfirmation value for this TUpdate_Input.
     * 
     * @param deleteConfirmation   * user's delete confirmation preference
     */
    public void setDeleteConfirmation(java.lang.Boolean deleteConfirmation) {
        this.deleteConfirmation = deleteConfirmation;
    }


    /**
     * Gets the isLoginCookieAllowed value for this TUpdate_Input.
     * 
     * @return isLoginCookieAllowed   * user's login cookie preference
     */
    public java.lang.Boolean getIsLoginCookieAllowed() {
        return isLoginCookieAllowed;
    }


    /**
     * Sets the isLoginCookieAllowed value for this TUpdate_Input.
     * 
     * @param isLoginCookieAllowed   * user's login cookie preference
     */
    public void setIsLoginCookieAllowed(java.lang.Boolean isLoginCookieAllowed) {
        this.isLoginCookieAllowed = isLoginCookieAllowed;
    }


    /**
     * Gets the isHtmlEMailAllowed value for this TUpdate_Input.
     * 
     * @return isHtmlEMailAllowed   * user's html email preference
     */
    public java.lang.Boolean getIsHtmlEMailAllowed() {
        return isHtmlEMailAllowed;
    }


    /**
     * Sets the isHtmlEMailAllowed value for this TUpdate_Input.
     * 
     * @param isHtmlEMailAllowed   * user's html email preference
     */
    public void setIsHtmlEMailAllowed(java.lang.Boolean isHtmlEMailAllowed) {
        this.isHtmlEMailAllowed = isHtmlEMailAllowed;
    }


    /**
     * Gets the reminderQuestion value for this TUpdate_Input.
     * 
     * @return reminderQuestion   * user's reminder question
     */
    public java.lang.String getReminderQuestion() {
        return reminderQuestion;
    }


    /**
     * Sets the reminderQuestion value for this TUpdate_Input.
     * 
     * @param reminderQuestion   * user's reminder question
     */
    public void setReminderQuestion(java.lang.String reminderQuestion) {
        this.reminderQuestion = reminderQuestion;
    }


    /**
     * Gets the challengePhrase value for this TUpdate_Input.
     * 
     * @return challengePhrase   * user's challenge phrase
     */
    public java.lang.String getChallengePhrase() {
        return challengePhrase;
    }


    /**
     * Sets the challengePhrase value for this TUpdate_Input.
     * 
     * @param challengePhrase   * user's challenge phrase
     */
    public void setChallengePhrase(java.lang.String challengePhrase) {
        this.challengePhrase = challengePhrase;
    }


    /**
     * Gets the EMail value for this TUpdate_Input.
     * 
     * @return EMail   * user's email
     */
    public java.lang.String getEMail() {
        return EMail;
    }


    /**
     * Sets the EMail value for this TUpdate_Input.
     * 
     * @param EMail   * user's email
     */
    public void setEMail(java.lang.String EMail) {
        this.EMail = EMail;
    }


    /**
     * Gets the name value for this TUpdate_Input.
     * 
     * @return name   * user's display name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TUpdate_Input.
     * 
     * @param name   * user's display name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the billingAddress value for this TUpdate_Input.
     * 
     * @return billingAddress   * user's billing address
     */
    public de.epages.WebServices.UserService2.Stub.TAddressNamed getBillingAddress() {
        return billingAddress;
    }


    /**
     * Sets the billingAddress value for this TUpdate_Input.
     * 
     * @param billingAddress   * user's billing address
     */
    public void setBillingAddress(de.epages.WebServices.UserService2.Stub.TAddressNamed billingAddress) {
        this.billingAddress = billingAddress;
    }


    /**
     * Gets the shippingAddress value for this TUpdate_Input.
     * 
     * @return shippingAddress   * user's shipping address
     */
    public de.epages.WebServices.UserService2.Stub.TAddressNamed getShippingAddress() {
        return shippingAddress;
    }


    /**
     * Sets the shippingAddress value for this TUpdate_Input.
     * 
     * @param shippingAddress   * user's shipping address
     */
    public void setShippingAddress(de.epages.WebServices.UserService2.Stub.TAddressNamed shippingAddress) {
        this.shippingAddress = shippingAddress;
    }


    /**
     * Gets the additionalAddresses value for this TUpdate_Input.
     * 
     * @return additionalAddresses   * all user's shipping addresses identified by alias
     */
    public de.epages.WebServices.UserService2.Stub.TAddressNamed[] getAdditionalAddresses() {
        return additionalAddresses;
    }


    /**
     * Sets the additionalAddresses value for this TUpdate_Input.
     * 
     * @param additionalAddresses   * all user's shipping addresses identified by alias
     */
    public void setAdditionalAddresses(de.epages.WebServices.UserService2.Stub.TAddressNamed[] additionalAddresses) {
        this.additionalAddresses = additionalAddresses;
    }


    /**
     * Gets the customers value for this TUpdate_Input.
     * 
     * @return customers   * list of assigned customers (see usertypes:ListOfCustomerPaths)
     */
    public java.lang.String[] getCustomers() {
        return customers;
    }


    /**
     * Sets the customers value for this TUpdate_Input.
     * 
     * @param customers   * list of assigned customers (see usertypes:ListOfCustomerPaths)
     */
    public void setCustomers(java.lang.String[] customers) {
        this.customers = customers;
    }


    /**
     * Gets the attributes value for this TUpdate_Input.
     * 
     * @return attributes   * list of requested attributes (see epagestypes:ListOfAttributes)
     */
    public de.epages.WebServices.UserService2.Stub.TAttribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this TUpdate_Input.
     * 
     * @param attributes   * list of requested attributes (see epagestypes:ListOfAttributes)
     */
    public void setAttributes(de.epages.WebServices.UserService2.Stub.TAttribute[] attributes) {
        this.attributes = attributes;
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
              java.util.Arrays.equals(this.attributes, other.getAttributes())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TUpdate_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/UserTypes/2006/07", "TUpdate_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("additionalAddresses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AdditionalAddresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ShopTypes/2006/07", "TAddressNamed"));
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
