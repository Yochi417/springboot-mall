package com.yochi.springbootmall.service.impl;

import com.yochi.springbootmall.dao.UserDao;
import com.yochi.springbootmall.dto.UserRegisterRequest;
import com.yochi.springbootmall.model.User;
import com.yochi.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
