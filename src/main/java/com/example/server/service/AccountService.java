package com.example.server.service;

import com.example.server.model.UserInfo;

import java.util.List;

public interface AccountService {

    UserInfo findUser(int id);

    List<UserInfo> findUserList();

    void updateUser(UserInfo userInfo);

    boolean isRightPassword(UserInfo userInfo);

    boolean isExitAccount(UserInfo userInfo);
}
