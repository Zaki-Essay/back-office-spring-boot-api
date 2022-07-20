package com.example.backofficeversion1.dtos;


import com.example.backofficeversion1.entities.Role;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class UserDto {

    private Long userId;
    private String firstName;
    private String lastName;
    private String userName;
    private String phoneNumber;
    private Date dateNaissance;
    private boolean isLocked;
    private boolean isExpired;

    private List<Role> roleList = new ArrayList<>();


    public UserDto(Long userId, String firstName, String lastName, String userName, String phoneNumber, Date dateNaissance, boolean isLocked, boolean isExpired, List<Role> roleList) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.dateNaissance = dateNaissance;
        this.isLocked = isLocked;
        this.isExpired = isExpired;
        this.roleList = roleList;
    }

    public UserDto() {

    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public void setExpired(boolean expired) {
        isExpired = expired;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
}
