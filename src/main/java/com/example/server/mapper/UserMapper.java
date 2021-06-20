package com.example.server.mapper;

import com.example.server.model.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper

public interface UserMapper {

    @Select("select * from user where account = #{account}")
    UserInfo findUser(@Param("account")String account);

    @Select("select * from user where id = #{id}")
    UserInfo findUserById(@Param("id")Integer id);

    @Select("select * from user")
    List<UserInfo> getAllUser();

    @Insert("insert into user (account,password,telephone) values(#{account},#{password},#{telephone})")
    void register(UserInfo userInfo);


    @Update("update user set telephone=#{telephone},account=#{account},password =#{password} where id =#{id}")
    void updateUserInfo(UserInfo userInfo);

}
