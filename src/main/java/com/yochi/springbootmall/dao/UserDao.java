package com.yochi.springbootmall.dao;

import com.yochi.springbootmall.dto.UserRegisterRequest;
import com.yochi.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
