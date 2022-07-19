package com.example.backofficeversion1.entities;

import com.example.backofficeversion1.utils.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor
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



}
