package com.example.server;

import com.example.server.mapper.UserMapper;
import com.example.server.model.ResultInfo;
import com.example.server.model.UserInfo;
import com.example.server.service.AccountService;
import com.example.server.service.impl.AccountServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ServerApplicationTests {

    @Autowired
    private AccountServiceImpl accountService;

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }


    @Test
    void  addData(){
        UserInfo userInfo = new UserInfo();
        userInfo.setAccount("55");
        userInfo.setPassword("1234");
        userInfo.setTelephone("1234");

        ResultInfo resultInfo =accountService.register(userInfo);
        System.out.println(resultInfo.getMsg());
    }
}
