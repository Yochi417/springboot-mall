package com.yochi.springbootmall.service;

import com.yochi.springbootmall.dto.UserRegisterRequest;
import com.yochi.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);
}
