package com.example.server.service.impl;

import com.example.server.mapper.UserMapper;
import com.example.server.model.UserInfo;
import com.example.server.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserInfo findUser(int id) {
        return null;
    }

    @Override
    public List<UserInfo> findUserList() {
        List<UserInfo>  userInfoList = new ArrayList<>();
        userInfoList = userMapper.getAllUser();

        return userInfoList;
    }

    @Override
    public void updateUser(UserInfo userInfo) {
        if(userInfo.getId() == null){
            userMapper.register(userInfo);
        }else{
            userMapper.updateUserInfo(userInfo);
        }
    }

    @Override
    public boolean isRightPassword(UserInfo userInfo) {
        UserInfo user = userMapper.findUser(userInfo.getAccount());
        if(isExitAccount(userInfo)&&user.getPassword().equals(userInfo.getPassword())){
            return true;
        }
        return false;
    }


    @Override
    public boolean isExitAccount(UserInfo userInfo) {
        UserInfo user = userMapper.findUser(userInfo.getAccount());
        if(user == null){
            return  false;
        }
        return true;
    }


}
