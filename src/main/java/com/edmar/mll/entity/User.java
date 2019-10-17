package com.edmar.mll.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "userinfo")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String username;
    private String password;
    private String displayName;
}
