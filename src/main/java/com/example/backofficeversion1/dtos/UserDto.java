package com.example.backofficeversion1.dtos;


import com.example.backofficeversion1.entities.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@AllArgsConstructor
@Data
@NoArgsConstructor
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
}
