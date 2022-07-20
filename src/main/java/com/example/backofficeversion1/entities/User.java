package com.example.backofficeversion1.entities;

import com.example.backofficeversion1.utils.Gender;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity

public class User {



    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String firstName;
    private String lastName;
    private String userName;
    private String phoneNumber;
    private String photo;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String siteWeb;
    private Date dateNaissance;
    private String password;
    private boolean isLocked;
    private boolean isExpired;

   @ManyToMany(fetch = FetchType.EAGER)
   @JoinTable(name = "users_roles",joinColumns = @JoinColumn(name="userId"),inverseJoinColumns = @JoinColumn(name = "roleId"))
   private List<Role> roleList = new ArrayList<>();


    public User(Long userId, String firstName, String lastName, String userName, String phoneNumber, String photo, Gender gender, String siteWeb, Date dateNaissance, String password, boolean isLocked, boolean isExpired, List<Role> roleList) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.photo = photo;
        this.gender = gender;
        this.siteWeb = siteWeb;
        this.dateNaissance = dateNaissance;
        this.password = password;
        this.isLocked = isLocked;
        this.isExpired = isExpired;
        this.roleList = roleList;
    }

    public User() {
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getSiteWeb() {
        return siteWeb;
    }

    public void setSiteWeb(String siteWeb) {
        this.siteWeb = siteWeb;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
