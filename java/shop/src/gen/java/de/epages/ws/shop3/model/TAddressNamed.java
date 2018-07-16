/**
 * TAddressNamed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.shop3.model;


/**
 * an address object describing different addresses (customer, user,
 * order, etc.)
 *         inclusive an optional Alias of the address
 */
public class TAddressNamed  implements java.io.Serializable {
    private java.lang.String alias;

    /* name of the address to display (e.g 'Shipping Address', 'Home
     * Address') */
    private java.lang.String displayName;

    /* address extension (e.g PostBox etc.) */
    private java.lang.String addressExtension;

    /* street with number */
    private java.lang.String street;

    /* 2nd street line for UK addresses */
    private java.lang.String street2;

    /* door code to get access to postboxes or doorbells */
    private java.lang.String codePorte;

    /* zip code of the city */
    private java.lang.String zipcode;

    /* city name of the address */
    private java.lang.String city;

    /* state, county, region */
    private java.lang.String state;

    /* country identifier as ISO numberic code (see http://en.wikipedia.org/wiki/ISO_3166-1_numeric) */
    private java.math.BigInteger countryID;

    /* country name in english e.g.: Germany */
    private java.lang.String country;

    /* E-mail address */
    private java.lang.String EMail;

    /* primary phone number */
    private java.lang.String phone;

    /* primary fax number */
    private java.lang.String fax;

    /* tax identification number, country dependent (see https://en.wikipedia.org/wiki/VAT_identification_number)*/
    private java.lang.String fiscalCode;

    /* last verification of this contant by merchant */
    private java.util.Calendar verifiedOn;

    /* salutation (e.g 'Herr', 'Mrs.') */
    private java.lang.String salutation;

    /* title (e.g 'D.Prof', 'NPLQ', 'CEO') */
    private java.lang.String title;

    /* first name */
    private java.lang.String firstName;

    /* middle name */
    private java.lang.String middleName;

    /* last name */
    private java.lang.String lastName;

    /* private E-mail address */
    private java.lang.String EMailPrivate;

    /* business E-mail address */
    private java.lang.String EMailBusiness;

    /* home phone */
    private java.lang.String phonePrivate;

    /* business phone number */
    private java.lang.String phoneBusiness;

    /* mobile phone */
    private java.lang.String phoneCell;

    /* 1 = male;2 = female */
    private java.math.BigInteger gender;

    /* name of the company */
    private java.lang.String company;

    /* name of the company department */
    private java.lang.String department;

    /* job titel in the company */
    private java.lang.String jobTitle;

    /* date of birth in dateTime format e.g. 2001-10-26T12:00:00 (time
     * needs to specify) */
    private java.util.Calendar birthday;

    /* tax identification */
    private java.lang.String VATID;

    /* bank code of the bank account */
    private java.lang.String bankCode;

    /* bank name of the account */
    private java.lang.String bankName;

    /* bank account number */
    private java.lang.String bankAccountNo;

    /* full name of the bank account owner */
    private java.lang.String bankAccountHolder;

    /* URL of related Website e.g. http://www.epages.com */
    private java.lang.String URL;

    /* list of requested attributes (see epagestypes:ListOfAttributes) */
    private de.epages.ws.common.model.TAttribute[] attributes;

    public TAddressNamed() {
    }

    public TAddressNamed(
           java.lang.String alias,
           java.lang.String displayName,
           java.lang.String addressExtension,
           java.lang.String street,
           java.lang.String street2,
           java.lang.String codePorte,
           java.lang.String zipcode,
           java.lang.String city,
           java.lang.String state,
           java.math.BigInteger countryID,
           java.lang.String country,
           java.lang.String EMail,
           java.lang.String phone,
           java.lang.String fax,
           java.lang.String fiscalCode,
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
           java.lang.String URL,
           de.epages.ws.common.model.TAttribute[] attributes) {
           this.alias = alias;
           this.displayName = displayName;
           this.addressExtension = addressExtension;
           this.street = street;
           this.street2 = street2;
           this.codePorte = codePorte;
           this.zipcode = zipcode;
           this.city = city;
           this.state = state;
           this.countryID = countryID;
           this.country = country;
           this.EMail = EMail;
           this.phone = phone;
           this.fax = fax;
           this.fiscalCode = fiscalCode;
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
           this.attributes = attributes;
    }


    /**
     * Gets the alias value for this TAddressNamed.
     *
     * @return alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TAddressNamed.
     *
     * @param alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the displayName value for this TAddressNamed.
     *
     * @return displayName   * name of the address to display (e.g 'Shipping Address', 'Home
     * Address')
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this TAddressNamed.
     *
     * @param displayName   * name of the address to display (e.g 'Shipping Address', 'Home
     * Address')
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the addressExtension value for this TAddressNamed.
     *
     * @return addressExtension   * address extension (e.g PostBox etc.)
     */
    public java.lang.String getAddressExtension() {
        return addressExtension;
    }


    /**
     * Sets the addressExtension value for this TAddressNamed.
     *
     * @param addressExtension   * address extension (e.g PostBox etc.)
     */
    public void setAddressExtension(java.lang.String addressExtension) {
        this.addressExtension = addressExtension;
    }


    /**
     * Gets the street value for this TAddressNamed.
     *
     * @return street   * street with number
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this TAddressNamed.
     *
     * @param street   * street with number
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the street2 value for this TAddressNamed.
     *
     * @return street2   * 2nd street line for UK addresses
     */
    public java.lang.String getStreet2() {
        return street2;
    }


    /**
     * Sets the street2 value for this TAddressNamed.
     *
     * @param street2   * 2nd street line for UK addresses
     */
    public void setStreet2(java.lang.String street2) {
        this.street2 = street2;
    }


    /**
     * Gets the codePorte value for this TAddressNamed.
     *
     * @return codePorte   * door code to get access to postboxes or doorbells
     */
    public java.lang.String getCodePorte() {
        return codePorte;
    }


    /**
     * Sets the codePorte value for this TAddressNamed.
     *
     * @param codePorte   * door code to get access to postboxes or doorbells
     */
    public void setCodePorte(java.lang.String codePorte) {
        this.codePorte = codePorte;
    }


    /**
     * Gets the zipcode value for this TAddressNamed.
     *
     * @return zipcode   * zip code of the city
     */
    public java.lang.String getZipcode() {
        return zipcode;
    }


    /**
     * Sets the zipcode value for this TAddressNamed.
     *
     * @param zipcode   * zip code of the city
     */
    public void setZipcode(java.lang.String zipcode) {
        this.zipcode = zipcode;
    }


    /**
     * Gets the city value for this TAddressNamed.
     *
     * @return city   * city name of the address
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this TAddressNamed.
     *
     * @param city   * city name of the address
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this TAddressNamed.
     *
     * @return state   * state, county, region
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this TAddressNamed.
     *
     * @param state   * state, county, region
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the countryID value for this TAddressNamed.
     *
     * @return countryID   * country identifier as ISO numberic code (see http://en.wikipedia.org/wiki/ISO_3166-1_numeric)
     */
    public java.math.BigInteger getCountryID() {
        return countryID;
    }

    /**
     * Gets the country value for this TAddressNamed
     *
     * @return country * country name in english e.g.: Germany.
     */
    public String getCountry() {
        return country;
    }


    /**
     * Sets the countryID value for this TAddressNamed.
     *
     * @param countryID   * country identifier as ISO numberic code (see http://en.wikipedia.org/wiki/ISO_3166-1_numeric)
     */
    public void setCountryID(java.math.BigInteger countryID) {
        this.countryID = countryID;
    }


    /**
     * Gets the EMail value for this TAddressNamed.
     *
     * @return EMail   * E-mail address
     */
    public java.lang.String getEMail() {
        return EMail;
    }


    /**
     * Sets the EMail value for this TAddressNamed.
     *
     * @param EMail   * E-mail address
     */
    public void setEMail(java.lang.String EMail) {
        this.EMail = EMail;
    }


    /**
     * Gets the phone value for this TAddressNamed.
     *
     * @return phone   * primary phone number
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this TAddressNamed.
     *
     * @param phone   * primary phone number
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the fax value for this TAddressNamed.
     *
     * @return fax   * primary fax number
     */
    public java.lang.String getFax() {
        return fax;
    }

    /**
     * Gets the tax identification number (see https://en.wikipedia.org/wiki/VAT_identification_number).
     *
     * @return fiscalCode * tax identification number
     */
    public String getFiscalCode() {
        return fiscalCode;
    }

    /**
     * Sets the fax value for this TAddressNamed.
     *
     * @param fax   * primary fax number
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the verifiedOn value for this TAddressNamed.
     *
     * @return verifiedOn   * last verification of this contant by merchant
     */
    public java.util.Calendar getVerifiedOn() {
        return verifiedOn;
    }


    /**
     * Sets the verifiedOn value for this TAddressNamed.
     *
     * @param verifiedOn   * last verification of this contant by merchant
     */
    public void setVerifiedOn(java.util.Calendar verifiedOn) {
        this.verifiedOn = verifiedOn;
    }


    /**
     * Gets the salutation value for this TAddressNamed.
     *
     * @return salutation   * salutation (e.g 'Herr', 'Mrs.')
     */
    public java.lang.String getSalutation() {
        return salutation;
    }


    /**
     * Sets the salutation value for this TAddressNamed.
     *
     * @param salutation   * salutation (e.g 'Herr', 'Mrs.')
     */
    public void setSalutation(java.lang.String salutation) {
        this.salutation = salutation;
    }


    /**
     * Gets the title value for this TAddressNamed.
     *
     * @return title   * title (e.g 'D.Prof', 'NPLQ', 'CEO')
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this TAddressNamed.
     *
     * @param title   * title (e.g 'D.Prof', 'NPLQ', 'CEO')
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the firstName value for this TAddressNamed.
     *
     * @return firstName   * first name
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this TAddressNamed.
     *
     * @param firstName   * first name
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the middleName value for this TAddressNamed.
     *
     * @return middleName   * middle name
     */
    public java.lang.String getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this TAddressNamed.
     *
     * @param middleName   * middle name
     */
    public void setMiddleName(java.lang.String middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the lastName value for this TAddressNamed.
     *
     * @return lastName   * last name
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this TAddressNamed.
     *
     * @param lastName   * last name
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the EMailPrivate value for this TAddressNamed.
     *
     * @return EMailPrivate   * private E-mail address
     */
    public java.lang.String getEMailPrivate() {
        return EMailPrivate;
    }


    /**
     * Sets the EMailPrivate value for this TAddressNamed.
     *
     * @param EMailPrivate   * private E-mail address
     */
    public void setEMailPrivate(java.lang.String EMailPrivate) {
        this.EMailPrivate = EMailPrivate;
    }


    /**
     * Gets the EMailBusiness value for this TAddressNamed.
     *
     * @return EMailBusiness   * business E-mail address
     */
    public java.lang.String getEMailBusiness() {
        return EMailBusiness;
    }


    /**
     * Sets the EMailBusiness value for this TAddressNamed.
     *
     * @param EMailBusiness   * business E-mail address
     */
    public void setEMailBusiness(java.lang.String EMailBusiness) {
        this.EMailBusiness = EMailBusiness;
    }


    /**
     * Gets the phonePrivate value for this TAddressNamed.
     *
     * @return phonePrivate   * home phone
     */
    public java.lang.String getPhonePrivate() {
        return phonePrivate;
    }


    /**
     * Sets the phonePrivate value for this TAddressNamed.
     *
     * @param phonePrivate   * home phone
     */
    public void setPhonePrivate(java.lang.String phonePrivate) {
        this.phonePrivate = phonePrivate;
    }


    /**
     * Gets the phoneBusiness value for this TAddressNamed.
     *
     * @return phoneBusiness   * business phone number
     */
    public java.lang.String getPhoneBusiness() {
        return phoneBusiness;
    }


    /**
     * Sets the phoneBusiness value for this TAddressNamed.
     *
     * @param phoneBusiness   * business phone number
     */
    public void setPhoneBusiness(java.lang.String phoneBusiness) {
        this.phoneBusiness = phoneBusiness;
    }


    /**
     * Gets the phoneCell value for this TAddressNamed.
     *
     * @return phoneCell   * mobile phone
     */
    public java.lang.String getPhoneCell() {
        return phoneCell;
    }


    /**
     * Sets the phoneCell value for this TAddressNamed.
     *
     * @param phoneCell   * mobile phone
     */
    public void setPhoneCell(java.lang.String phoneCell) {
        this.phoneCell = phoneCell;
    }


    /**
     * Gets the gender value for this TAddressNamed.
     *
     * @return gender   * 1 = male;2 = female
     */
    public java.math.BigInteger getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this TAddressNamed.
     *
     * @param gender   * 1 = male;2 = female
     */
    public void setGender(java.math.BigInteger gender) {
        this.gender = gender;
    }


    /**
     * Gets the company value for this TAddressNamed.
     *
     * @return company   * name of the company
     */
    public java.lang.String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this TAddressNamed.
     *
     * @param company   * name of the company
     */
    public void setCompany(java.lang.String company) {
        this.company = company;
    }


    /**
     * Gets the department value for this TAddressNamed.
     *
     * @return department   * name of the company department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this TAddressNamed.
     *
     * @param department   * name of the company department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the jobTitle value for this TAddressNamed.
     *
     * @return jobTitle   * job titel in the company
     */
    public java.lang.String getJobTitle() {
        return jobTitle;
    }


    /**
     * Sets the jobTitle value for this TAddressNamed.
     *
     * @param jobTitle   * job titel in the company
     */
    public void setJobTitle(java.lang.String jobTitle) {
        this.jobTitle = jobTitle;
    }


    /**
     * Gets the birthday value for this TAddressNamed.
     *
     * @return birthday   * date of birth in dateTime format e.g. 2001-10-26T12:00:00 (time
     * needs to specify)
     */
    public java.util.Calendar getBirthday() {
        return birthday;
    }


    /**
     * Sets the birthday value for this TAddressNamed.
     *
     * @param birthday   * date of birth in dateTime format e.g. 2001-10-26T12:00:00 (time
     * needs to specify)
     */
    public void setBirthday(java.util.Calendar birthday) {
        this.birthday = birthday;
    }


    /**
     * Gets the VATID value for this TAddressNamed.
     *
     * @return VATID   * tax identification
     */
    public java.lang.String getVATID() {
        return VATID;
    }


    /**
     * Sets the VATID value for this TAddressNamed.
     *
     * @param VATID   * tax identification
     */
    public void setVATID(java.lang.String VATID) {
        this.VATID = VATID;
    }


    /**
     * Gets the bankCode value for this TAddressNamed.
     *
     * @return bankCode   * bank code of the bank account
     */
    public java.lang.String getBankCode() {
        return bankCode;
    }


    /**
     * Sets the bankCode value for this TAddressNamed.
     *
     * @param bankCode   * bank code of the bank account
     */
    public void setBankCode(java.lang.String bankCode) {
        this.bankCode = bankCode;
    }


    /**
     * Gets the bankName value for this TAddressNamed.
     *
     * @return bankName   * bank name of the account
     */
    public java.lang.String getBankName() {
        return bankName;
    }


    /**
     * Sets the bankName value for this TAddressNamed.
     *
     * @param bankName   * bank name of the account
     */
    public void setBankName(java.lang.String bankName) {
        this.bankName = bankName;
    }


    /**
     * Gets the bankAccountNo value for this TAddressNamed.
     *
     * @return bankAccountNo   * bank account number
     */
    public java.lang.String getBankAccountNo() {
        return bankAccountNo;
    }


    /**
     * Sets the bankAccountNo value for this TAddressNamed.
     *
     * @param bankAccountNo   * bank account number
     */
    public void setBankAccountNo(java.lang.String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }


    /**
     * Gets the bankAccountHolder value for this TAddressNamed.
     *
     * @return bankAccountHolder   * full name of the bank account owner
     */
    public java.lang.String getBankAccountHolder() {
        return bankAccountHolder;
    }


    /**
     * Sets the bankAccountHolder value for this TAddressNamed.
     *
     * @param bankAccountHolder   * full name of the bank account owner
     */
    public void setBankAccountHolder(java.lang.String bankAccountHolder) {
        this.bankAccountHolder = bankAccountHolder;
    }


    /**
     * Gets the URL value for this TAddressNamed.
     *
     * @return URL   * URL of related Website e.g. http://www.epages.com
     */
    public java.lang.String getURL() {
        return URL;
    }


    /**
     * Sets the URL value for this TAddressNamed.
     *
     * @param URL   * URL of related Website e.g. http://www.epages.com
     */
    public void setURL(java.lang.String URL) {
        this.URL = URL;
    }


    /**
     * Gets the attributes value for this TAddressNamed.
     *
     * @return attributes   * list of requested attributes (see epagestypes:ListOfAttributes)
     */
    public de.epages.ws.common.model.TAttribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this TAddressNamed.
     *
     * @param attributes   * list of requested attributes (see epagestypes:ListOfAttributes)
     */
    public void setAttributes(de.epages.ws.common.model.TAttribute[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TAddressNamed)) return false;
        TAddressNamed other = (TAddressNamed) obj;
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
            ((this.displayName==null && other.getDisplayName()==null) ||
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.addressExtension==null && other.getAddressExtension()==null) ||
             (this.addressExtension!=null &&
              this.addressExtension.equals(other.getAddressExtension()))) &&
            ((this.street==null && other.getStreet()==null) ||
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.street2==null && other.getStreet2()==null) ||
             (this.street2!=null &&
              this.street2.equals(other.getStreet2()))) &&
            ((this.codePorte==null && other.getCodePorte()==null) ||
             (this.codePorte!=null &&
              this.codePorte.equals(other.getCodePorte()))) &&
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
            ((this.country == null && other.getCountry() == null) ||
             (this.country != null &&
              this.country.equals(other.getCountry()))) &&
            ((this.EMail==null && other.getEMail()==null) ||
             (this.EMail!=null &&
              this.EMail.equals(other.getEMail()))) &&
            ((this.phone==null && other.getPhone()==null) ||
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.fax==null && other.getFax()==null) ||
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.fiscalCode==null && other.getFiscalCode()==null) ||
             (this.fiscalCode!=null &&
              this.fiscalCode.equals(other.getFiscalCode()))) &&
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
              this.URL.equals(other.getURL()))) &&
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
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getAddressExtension() != null) {
            _hashCode += getAddressExtension().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getStreet2() != null) {
            _hashCode += getStreet2().hashCode();
        }
        if (getCodePorte() != null) {
            _hashCode += getCodePorte().hashCode();
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
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
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
        if (getFiscalCode() != null) {
            _hashCode += getFiscalCode().hashCode();
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
        new org.apache.axis.description.TypeDesc(TAddressNamed.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ShopTypes/2011/01", "TAddressNamed"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("street2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Street2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codePorte");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CodePorte"));
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
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fiscalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FiscalCode"));
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
