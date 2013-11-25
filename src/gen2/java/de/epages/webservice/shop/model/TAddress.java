/**
 * TAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.webservice.shop.model;


/**
 * an address object describing different addresses (customer, user,
 * order, etc.)
 */
public class TAddress  implements java.io.Serializable {
    private java.lang.String displayName;

    private java.lang.String addressExtension;

    private java.lang.String street;

    private java.lang.String zipcode;

    private java.lang.String city;

    private java.lang.String state;

    private java.math.BigInteger countryID;

    private java.lang.String EMail;

    private java.lang.String phone;

    private java.lang.String fax;

    private java.util.Calendar verifiedOn;

    private java.lang.String salutation;

    private java.lang.String title;

    private java.lang.String firstName;

    private java.lang.String middleName;

    private java.lang.String lastName;

    private java.lang.String EMailPrivate;

    private java.lang.String EMailBusiness;

    private java.lang.String phonePrivate;

    private java.lang.String phoneBusiness;

    private java.lang.String phoneCell;

    /* 1 = male;2 = female */
    private java.math.BigInteger gender;

    private java.lang.String company;

    private java.lang.String department;

    private java.lang.String jobTitle;

    private java.util.Calendar birthday;

    private java.lang.String VATID;

    private java.lang.String bankCode;

    private java.lang.String bankName;

    private java.lang.String bankAccountNo;

    private java.lang.String bankAccountHolder;

    private java.lang.String URL;

    public TAddress() {
    }

    public TAddress(
           java.lang.String displayName,
           java.lang.String addressExtension,
           java.lang.String street,
           java.lang.String zipcode,
           java.lang.String city,
           java.lang.String state,
           java.math.BigInteger countryID,
           java.lang.String EMail,
           java.lang.String phone,
           java.lang.String fax,
           java.util.Calendar verifiedOn,
           java.lang.String salutation,
           java.lang.String title,
           java.lang.String firstName,
           java.lang.String middleName,
           java.lang.String lastName,
           java.lang.String EMailPrivate,
           java.lang.String EMailBusiness,
           java.lang.String phonePrivate,
           java.lang.String phoneBusiness,
           java.lang.String phoneCell,
           java.math.BigInteger gender,
           java.lang.String company,
           java.lang.String department,
           java.lang.String jobTitle,
           java.util.Calendar birthday,
           java.lang.String VATID,
           java.lang.String bankCode,
           java.lang.String bankName,
           java.lang.String bankAccountNo,
           java.lang.String bankAccountHolder,
           java.lang.String URL) {
           this.displayName = displayName;
           this.addressExtension = addressExtension;
           this.street = street;
           this.zipcode = zipcode;
           this.city = city;
           this.state = state;
           this.countryID = countryID;
           this.EMail = EMail;
           this.phone = phone;
           this.fax = fax;
           this.verifiedOn = verifiedOn;
           this.salutation = salutation;
           this.title = title;
           this.firstName = firstName;
           this.middleName = middleName;
           this.lastName = lastName;
           this.EMailPrivate = EMailPrivate;
           this.EMailBusiness = EMailBusiness;
           this.phonePrivate = phonePrivate;
           this.phoneBusiness = phoneBusiness;
           this.phoneCell = phoneCell;
           this.gender = gender;
           this.company = company;
           this.department = department;
           this.jobTitle = jobTitle;
           this.birthday = birthday;
           this.VATID = VATID;
           this.bankCode = bankCode;
           this.bankName = bankName;
           this.bankAccountNo = bankAccountNo;
           this.bankAccountHolder = bankAccountHolder;
           this.URL = URL;
    }


    /**
     * Gets the displayName value for this TAddress.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this TAddress.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the addressExtension value for this TAddress.
     * 
     * @return addressExtension
     */
    public java.lang.String getAddressExtension() {
        return addressExtension;
    }


    /**
     * Sets the addressExtension value for this TAddress.
     * 
     * @param addressExtension
     */
    public void setAddressExtension(java.lang.String addressExtension) {
        this.addressExtension = addressExtension;
    }


    /**
     * Gets the street value for this TAddress.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this TAddress.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the zipcode value for this TAddress.
     * 
     * @return zipcode
     */
    public java.lang.String getZipcode() {
        return zipcode;
    }


    /**
     * Sets the zipcode value for this TAddress.
     * 
     * @param zipcode
     */
    public void setZipcode(java.lang.String zipcode) {
        this.zipcode = zipcode;
    }


    /**
     * Gets the city value for this TAddress.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this TAddress.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this TAddress.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this TAddress.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the countryID value for this TAddress.
     * 
     * @return countryID
     */
    public java.math.BigInteger getCountryID() {
        return countryID;
    }


    /**
     * Sets the countryID value for this TAddress.
     * 
     * @param countryID
     */
    public void setCountryID(java.math.BigInteger countryID) {
        this.countryID = countryID;
    }


    /**
     * Gets the EMail value for this TAddress.
     * 
     * @return EMail
     */
    public java.lang.String getEMail() {
        return EMail;
    }


    /**
     * Sets the EMail value for this TAddress.
     * 
     * @param EMail
     */
    public void setEMail(java.lang.String EMail) {
        this.EMail = EMail;
    }


    /**
     * Gets the phone value for this TAddress.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this TAddress.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the fax value for this TAddress.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this TAddress.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the verifiedOn value for this TAddress.
     * 
     * @return verifiedOn
     */
    public java.util.Calendar getVerifiedOn() {
        return verifiedOn;
    }


    /**
     * Sets the verifiedOn value for this TAddress.
     * 
     * @param verifiedOn
     */
    public void setVerifiedOn(java.util.Calendar verifiedOn) {
        this.verifiedOn = verifiedOn;
    }


    /**
     * Gets the salutation value for this TAddress.
     * 
     * @return salutation
     */
    public java.lang.String getSalutation() {
        return salutation;
    }


    /**
     * Sets the salutation value for this TAddress.
     * 
     * @param salutation
     */
    public void setSalutation(java.lang.String salutation) {
        this.salutation = salutation;
    }


    /**
     * Gets the title value for this TAddress.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this TAddress.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the firstName value for this TAddress.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this TAddress.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the middleName value for this TAddress.
     * 
     * @return middleName
     */
    public java.lang.String getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this TAddress.
     * 
     * @param middleName
     */
    public void setMiddleName(java.lang.String middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the lastName value for this TAddress.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this TAddress.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the EMailPrivate value for this TAddress.
     * 
     * @return EMailPrivate
     */
    public java.lang.String getEMailPrivate() {
        return EMailPrivate;
    }


    /**
     * Sets the EMailPrivate value for this TAddress.
     * 
     * @param EMailPrivate
     */
    public void setEMailPrivate(java.lang.String EMailPrivate) {
        this.EMailPrivate = EMailPrivate;
    }


    /**
     * Gets the EMailBusiness value for this TAddress.
     * 
     * @return EMailBusiness
     */
    public java.lang.String getEMailBusiness() {
        return EMailBusiness;
    }


    /**
     * Sets the EMailBusiness value for this TAddress.
     * 
     * @param EMailBusiness
     */
    public void setEMailBusiness(java.lang.String EMailBusiness) {
        this.EMailBusiness = EMailBusiness;
    }


    /**
     * Gets the phonePrivate value for this TAddress.
     * 
     * @return phonePrivate
     */
    public java.lang.String getPhonePrivate() {
        return phonePrivate;
    }


    /**
     * Sets the phonePrivate value for this TAddress.
     * 
     * @param phonePrivate
     */
    public void setPhonePrivate(java.lang.String phonePrivate) {
        this.phonePrivate = phonePrivate;
    }


    /**
     * Gets the phoneBusiness value for this TAddress.
     * 
     * @return phoneBusiness
     */
    public java.lang.String getPhoneBusiness() {
        return phoneBusiness;
    }


    /**
     * Sets the phoneBusiness value for this TAddress.
     * 
     * @param phoneBusiness
     */
    public void setPhoneBusiness(java.lang.String phoneBusiness) {
        this.phoneBusiness = phoneBusiness;
    }


    /**
     * Gets the phoneCell value for this TAddress.
     * 
     * @return phoneCell
     */
    public java.lang.String getPhoneCell() {
        return phoneCell;
    }


    /**
     * Sets the phoneCell value for this TAddress.
     * 
     * @param phoneCell
     */
    public void setPhoneCell(java.lang.String phoneCell) {
        this.phoneCell = phoneCell;
    }


    /**
     * Gets the gender value for this TAddress.
     * 
     * @return gender   * 1 = male;2 = female
     */
    public java.math.BigInteger getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this TAddress.
     * 
     * @param gender   * 1 = male;2 = female
     */
    public void setGender(java.math.BigInteger gender) {
        this.gender = gender;
    }


    /**
     * Gets the company value for this TAddress.
     * 
     * @return company
     */
    public java.lang.String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this TAddress.
     * 
     * @param company
     */
    public void setCompany(java.lang.String company) {
        this.company = company;
    }


    /**
     * Gets the department value for this TAddress.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this TAddress.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the jobTitle value for this TAddress.
     * 
     * @return jobTitle
     */
    public java.lang.String getJobTitle() {
        return jobTitle;
    }


    /**
     * Sets the jobTitle value for this TAddress.
     * 
     * @param jobTitle
     */
    public void setJobTitle(java.lang.String jobTitle) {
        this.jobTitle = jobTitle;
    }


    /**
     * Gets the birthday value for this TAddress.
     * 
     * @return birthday
     */
    public java.util.Calendar getBirthday() {
        return birthday;
    }


    /**
     * Sets the birthday value for this TAddress.
     * 
     * @param birthday
     */
    public void setBirthday(java.util.Calendar birthday) {
        this.birthday = birthday;
    }


    /**
     * Gets the VATID value for this TAddress.
     * 
     * @return VATID
     */
    public java.lang.String getVATID() {
        return VATID;
    }


    /**
     * Sets the VATID value for this TAddress.
     * 
     * @param VATID
     */
    public void setVATID(java.lang.String VATID) {
        this.VATID = VATID;
    }


    /**
     * Gets the bankCode value for this TAddress.
     * 
     * @return bankCode
     */
    public java.lang.String getBankCode() {
        return bankCode;
    }


    /**
     * Sets the bankCode value for this TAddress.
     * 
     * @param bankCode
     */
    public void setBankCode(java.lang.String bankCode) {
        this.bankCode = bankCode;
    }


    /**
     * Gets the bankName value for this TAddress.
     * 
     * @return bankName
     */
    public java.lang.String getBankName() {
        return bankName;
    }


    /**
     * Sets the bankName value for this TAddress.
     * 
     * @param bankName
     */
    public void setBankName(java.lang.String bankName) {
        this.bankName = bankName;
    }


    /**
     * Gets the bankAccountNo value for this TAddress.
     * 
     * @return bankAccountNo
     */
    public java.lang.String getBankAccountNo() {
        return bankAccountNo;
    }


    /**
     * Sets the bankAccountNo value for this TAddress.
     * 
     * @param bankAccountNo
     */
    public void setBankAccountNo(java.lang.String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }


    /**
     * Gets the bankAccountHolder value for this TAddress.
     * 
     * @return bankAccountHolder
     */
    public java.lang.String getBankAccountHolder() {
        return bankAccountHolder;
    }


    /**
     * Sets the bankAccountHolder value for this TAddress.
     * 
     * @param bankAccountHolder
     */
    public void setBankAccountHolder(java.lang.String bankAccountHolder) {
        this.bankAccountHolder = bankAccountHolder;
    }


    /**
     * Gets the URL value for this TAddress.
     * 
     * @return URL
     */
    public java.lang.String getURL() {
        return URL;
    }


    /**
     * Sets the URL value for this TAddress.
     * 
     * @param URL
     */
    public void setURL(java.lang.String URL) {
        this.URL = URL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TAddress)) return false;
        TAddress other = (TAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.addressExtension==null && other.getAddressExtension()==null) || 
             (this.addressExtension!=null &&
              this.addressExtension.equals(other.getAddressExtension()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.zipcode==null && other.getZipcode()==null) || 
             (this.zipcode!=null &&
              this.zipcode.equals(other.getZipcode()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.countryID==null && other.getCountryID()==null) || 
             (this.countryID!=null &&
              this.countryID.equals(other.getCountryID()))) &&
            ((this.EMail==null && other.getEMail()==null) || 
             (this.EMail!=null &&
              this.EMail.equals(other.getEMail()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.verifiedOn==null && other.getVerifiedOn()==null) || 
             (this.verifiedOn!=null &&
              this.verifiedOn.equals(other.getVerifiedOn()))) &&
            ((this.salutation==null && other.getSalutation()==null) || 
             (this.salutation!=null &&
              this.salutation.equals(other.getSalutation()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              this.middleName.equals(other.getMiddleName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.EMailPrivate==null && other.getEMailPrivate()==null) || 
             (this.EMailPrivate!=null &&
              this.EMailPrivate.equals(other.getEMailPrivate()))) &&
            ((this.EMailBusiness==null && other.getEMailBusiness()==null) || 
             (this.EMailBusiness!=null &&
              this.EMailBusiness.equals(other.getEMailBusiness()))) &&
            ((this.phonePrivate==null && other.getPhonePrivate()==null) || 
             (this.phonePrivate!=null &&
              this.phonePrivate.equals(other.getPhonePrivate()))) &&
            ((this.phoneBusiness==null && other.getPhoneBusiness()==null) || 
             (this.phoneBusiness!=null &&
              this.phoneBusiness.equals(other.getPhoneBusiness()))) &&
            ((this.phoneCell==null && other.getPhoneCell()==null) || 
             (this.phoneCell!=null &&
              this.phoneCell.equals(other.getPhoneCell()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.jobTitle==null && other.getJobTitle()==null) || 
             (this.jobTitle!=null &&
              this.jobTitle.equals(other.getJobTitle()))) &&
            ((this.birthday==null && other.getBirthday()==null) || 
             (this.birthday!=null &&
              this.birthday.equals(other.getBirthday()))) &&
            ((this.VATID==null && other.getVATID()==null) || 
             (this.VATID!=null &&
              this.VATID.equals(other.getVATID()))) &&
            ((this.bankCode==null && other.getBankCode()==null) || 
             (this.bankCode!=null &&
              this.bankCode.equals(other.getBankCode()))) &&
            ((this.bankName==null && other.getBankName()==null) || 
             (this.bankName!=null &&
              this.bankName.equals(other.getBankName()))) &&
            ((this.bankAccountNo==null && other.getBankAccountNo()==null) || 
             (this.bankAccountNo!=null &&
              this.bankAccountNo.equals(other.getBankAccountNo()))) &&
            ((this.bankAccountHolder==null && other.getBankAccountHolder()==null) || 
             (this.bankAccountHolder!=null &&
              this.bankAccountHolder.equals(other.getBankAccountHolder()))) &&
            ((this.URL==null && other.getURL()==null) || 
             (this.URL!=null &&
              this.URL.equals(other.getURL())));
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
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getAddressExtension() != null) {
            _hashCode += getAddressExtension().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getZipcode() != null) {
            _hashCode += getZipcode().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getCountryID() != null) {
            _hashCode += getCountryID().hashCode();
        }
        if (getEMail() != null) {
            _hashCode += getEMail().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getVerifiedOn() != null) {
            _hashCode += getVerifiedOn().hashCode();
        }
        if (getSalutation() != null) {
            _hashCode += getSalutation().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getMiddleName() != null) {
            _hashCode += getMiddleName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getEMailPrivate() != null) {
            _hashCode += getEMailPrivate().hashCode();
        }
        if (getEMailBusiness() != null) {
            _hashCode += getEMailBusiness().hashCode();
        }
        if (getPhonePrivate() != null) {
            _hashCode += getPhonePrivate().hashCode();
        }
        if (getPhoneBusiness() != null) {
            _hashCode += getPhoneBusiness().hashCode();
        }
        if (getPhoneCell() != null) {
            _hashCode += getPhoneCell().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getJobTitle() != null) {
            _hashCode += getJobTitle().hashCode();
        }
        if (getBirthday() != null) {
            _hashCode += getBirthday().hashCode();
        }
        if (getVATID() != null) {
            _hashCode += getVATID().hashCode();
        }
        if (getBankCode() != null) {
            _hashCode += getBankCode().hashCode();
        }
        if (getBankName() != null) {
            _hashCode += getBankName().hashCode();
        }
        if (getBankAccountNo() != null) {
            _hashCode += getBankAccountNo().hashCode();
        }
        if (getBankAccountHolder() != null) {
            _hashCode += getBankAccountHolder().hashCode();
        }
        if (getURL() != null) {
            _hashCode += getURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ShopTypes/2005/01", "TAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AddressExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Zipcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CountryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verifiedOn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VerifiedOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salutation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Salutation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MiddleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMailPrivate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EMailPrivate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMailBusiness");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EMailBusiness"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phonePrivate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PhonePrivate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneBusiness");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PhoneBusiness"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneCell");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PhoneCell"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JobTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthday");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Birthday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VATID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VATID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BankCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BankName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccountNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BankAccountNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccountHolder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BankAccountHolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URL"));
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
