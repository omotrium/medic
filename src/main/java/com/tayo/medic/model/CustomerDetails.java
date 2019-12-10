package com.tayo.medic.model;


import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDetails {

    private String firstName;

    private String lastName;

    private String middleName;

    private String mobileNo;

    private String email;

    private String countryOfResidence;

    private String dateOfBirth;

    private String homeAddress;

    private String postalAddress;

    private String streetAddress;

    private String stateProvince;

    private String city;

    private String postalCode;

    private String nationality;

    private String idNumber;

    private String idType;

    private String idExpiryDate;

    private String lang;


    public CustomerDetails() {
    }

    public CustomerDetails(CustomerDto customerDto) {
        this.email = customerDto.getEmail();
        this.mobileNo = customerDto.getMobileNo();
        this.countryOfResidence = customerDto.getCountryOfResidence();
        this.lang = customerDto.getLang();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdExpiryDate() {
        return idExpiryDate;
    }

    public void setIdExpiryDate(String idExpiryDate) {
        this.idExpiryDate = idExpiryDate;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }


    @Override
    public String toString() {
        return "CustomerDetails{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", email='" + email + '\'' +
                ", countryOfResidence='" + countryOfResidence + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                ", postalAddress='" + postalAddress + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", stateProvince='" + stateProvince + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", nationality='" + nationality + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", idType='" + idType + '\'' +
                ", idExpiryDate='" + idExpiryDate + '\'' +
                ", lang='" + lang + '\'' +
                '}';
    }
}
