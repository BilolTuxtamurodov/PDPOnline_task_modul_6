package com.company.PDPOnline.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "users_table")
public class UserEntity extends BaseEntity {
    @Column
    private String firstName;
    @Column
    private String lasName;
    @Column
    private String phoneNumber;
    @Column
    private String code;
    @Column
    private String password;
    @Column
    private Boolean active;
}
