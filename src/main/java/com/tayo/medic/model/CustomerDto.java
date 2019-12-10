package com.tayo.medic.model;

import com.tayo.medic.model.CustomerDetails;

import javax.validation.constraints.Size;

/**
 * Created by Talabi on 2019-10-16.
 */
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDto extends CustomerDetails {
    public static final int PASSWORD_MIN_LENGTH = 6;

    public static final int PASSWORD_MAX_LENGTH = 100;

    private Long id;

    private String profileId;

    @Size(min = PASSWORD_MIN_LENGTH, max = PASSWORD_MAX_LENGTH)
    private String password;

    public CustomerDto() {
        // Empty constructor needed for Jackson.
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "id=" + id +
                ", profileId='" + profileId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
