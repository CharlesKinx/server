package com.example.server.service;

import com.example.server.model.UserInfo;

import java.util.List;

public interface AccountService {


    List<UserInfo> findUserList();

    void updateUser(UserInfo userInfo);

    boolean isRightPassword(UserInfo userInfo);

    boolean isExitUser(UserInfo userInfo);
}
