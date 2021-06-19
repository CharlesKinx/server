package com.example.server.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class UserInfo {
    private Integer id;
    private String account;
    private String password;
    private String telephone;


}
