package com.tayo.medic.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "MED_CUSTOMER")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "med_cust_generator")
    @SequenceGenerator(name = "artsa_cust_generator", sequenceName = "med_cust_seq", allocationSize = 50)
    @Column(name = "ID", updatable = false, nullable = false)
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "MIDDLE_NAME")
    private String middleName;

    @Column(name = "MOBILE_NO")
    private String mobileNo;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "CNTRY_OF_RESIDENCE")
    private String countryOfResidence;

    @Column(name = "DOB")
    private String dateOfBirth;

    @Column(name = "HOME_ADDRESS")
    private String homeAddress;

    @Column(name = "POSTAL_ADDRESS")
    private String postalAddress;

    @Column(name = "STREET_ADDRESS")
    private String streetAddress;

    @Column(name = "STATE_PROVINCE")
    private String stateProvince;

    @Column(name = "CITY")
    private String city;

    @Column(name = "POSTAL_CODE")
    private String postalCode;

    @Column(name = "NATIONALITY")
    private String nationality;

    @Column(name = "ID_NUMBER")
    private String idNumber;

    @Column(name = "ID_TYPE")
    private String idType;

    @Column(name = "ID_EXPIRY_DATE")
    private String idExpiryDate;

    @Column(name = "LANG")
    private String lang;

    @Column(name = "PROFILE_ID")
    private String profileId;


    @JsonIgnore
    @Column(name = "PASSWORD", length = 100)
    @NotNull
    @Size(min = 6, max = 100)
    private String password;



    @ManyToMany
    @JoinTable(
            name = "MED_CUST_AUTHORITY",
            joinColumns = {@JoinColumn(name = "USER_ID", referencedColumnName = "ID")},
            inverseJoinColumns = {@JoinColumn(name = "AUTHORITY_NAME", referencedColumnName = "NAME")})
    @BatchSize(size = 20)
    private Set<Authority> authorities = new HashSet<>();

    public Customer(String firstName, String lastName, String middleName, String mobileNo, String email, String countryOfResidence, String dateOfBirth, String homeAddress, String postalAddress, String streetAddress, String stateProvince, String city, String postalCode, String nationality, String idNumber, String idType, String idExpiryDate, String lang, String profileId,
                    @NotNull @Size(min = 6, max = 100) String password, Set<Authority> authorities) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.mobileNo = mobileNo;
        this.email = email;
        this.countryOfResidence = countryOfResidence;
        this.dateOfBirth = dateOfBirth;
        this.homeAddress = homeAddress;
        this.postalAddress = postalAddress;
        this.streetAddress = streetAddress;
        this.stateProvince = stateProvince;
        this.city = city;
        this.postalCode = postalCode;
        this.nationality = nationality;
        this.idNumber = idNumber;
        this.idType = idType;
        this.idExpiryDate = idExpiryDate;
        this.lang = lang;
        this.profileId = profileId;
        this.password = password;
        this.authorities = authorities;
    }



    public Customer() {
    }

    public Customer(CustomerDto customerDto, Set<Authority> authorities, String profileId) {
        this.firstName = customerDto.getFirstName();
        this.lastName = customerDto.getLastName();
        this.middleName = customerDto.getMiddleName();
        this.mobileNo = customerDto.getMobileNo();
        this.email = customerDto.getEmail();
        this.countryOfResidence = customerDto.getCountryOfResidence();
        this.dateOfBirth = customerDto.getDateOfBirth();
        this.homeAddress = customerDto.getHomeAddress();
        this.postalAddress = customerDto.getPostalAddress();
        this.streetAddress = customerDto.getStreetAddress();
        this.stateProvince = customerDto.getStateProvince();
        this.city = customerDto.getCity();
        this.postalCode = customerDto.getPostalCode();
        this.nationality = customerDto.getNationality();
        this.idNumber = customerDto.getIdNumber();
        this.idType = customerDto.getIdType();
        this.idExpiryDate = customerDto.getIdExpiryDate();
        this.lang = customerDto.getLang();
        this.profileId = profileId;
        this.password = customerDto.getPassword();
        this.authorities = authorities;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }


    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<Authority> authorities) {
        this.authorities = authorities;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
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
                ", profileId='" + profileId + '\'' +
//                ", timestamp='" + timestamp + '\'' +
//                ", userHash='" + userHash + '\'' +
                '}';
    }

}

