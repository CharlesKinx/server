package com.example.server.controller;


import com.example.server.model.ResultInfo;
import com.example.server.model.UserInfo;
import com.example.server.service.AccountService;
import com.example.server.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")


public class UserController {

    @Autowired
    private AccountServiceImpl accountService;

    @PostMapping("/register")
    public ResultInfo register(@RequestBody UserInfo user){

        return accountService.register(user);
    }

    @PostMapping("/login")

    public ResultInfo login(@RequestBody UserInfo user){
        return accountService.login(user);
    }

}
