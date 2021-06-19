package com.example.server.controller;


import com.example.server.model.ResultInfo;
import com.example.server.model.UserInfo;
import com.example.server.service.AccountService;
import com.example.server.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")


public class UserController {

    @Autowired
    private AccountServiceImpl accountService;

    @PostMapping("/")
    public String stringGet(){
        return "已收到！";
    }

    @GetMapping("/get")

    public String getMethod(){
        return "hello";
    }

    @PostMapping("/register")
    public ResultInfo register(@RequestBody UserInfo user){
        System.out.println(user);
        return accountService.register(user);
    }

    @PostMapping("/login")

    public ResultInfo login(@RequestBody UserInfo user){
        return accountService.login(user);
    }

}
