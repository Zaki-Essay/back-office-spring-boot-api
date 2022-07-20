package com.example.backofficeversion1.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Role {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long RoleId;
    private String roleName;


    public Long getRoleId() {
        return RoleId;
    }

    public void setRoleId(Long roleId) {
        RoleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Role() {
    }

    public Role(Long roleId, String roleName) {
        RoleId = roleId;
        this.roleName = roleName;
    }
}
