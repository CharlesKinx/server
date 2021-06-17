package com.example.server.mapper;

import com.example.server.model.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper

public interface UserMapper {

    @Select("select * from user where id = #{account}")
    UserInfo findUser(@Param("account")String account);

    @Select("select * from user")
    List<UserInfo> getAllUser();

    @Insert("insert into user (account,password,telephone) values(#{account},#{password},#{telephone})")
    void register(UserInfo userInfo);


    @Update("update user set telephone=#{telephone},account=#{account},password =#{password} where id =#{id}")
    void updateUserInfo(UserInfo userInfo);

}
