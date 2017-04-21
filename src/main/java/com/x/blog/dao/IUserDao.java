package com.x.blog.dao;

import org.apache.ibatis.annotations.Param;

import com.x.blog.pojo.User;

/**
 * Created by xsiry on 2017/4/21.
 */
public interface IUserDao {
    //接口方法，通过用户名得到User对象
    User checkLogin(@Param("userName") String name, @Param("passWord") String password);
}

