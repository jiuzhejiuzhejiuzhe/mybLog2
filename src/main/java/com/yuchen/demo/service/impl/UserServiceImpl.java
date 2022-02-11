package com.yuchen.demo.service.impl;

import com.yuchen.demo.mapper.UserMapper;
import com.yuchen.demo.pojo.User;
import com.yuchen.demo.service.UserService;
import com.yuchen.demo.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: 清峰
 * @date: 2020/9/22 13:40
 * @code: 愿世间永无Bug!
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User checkUsernameAndPassword(String username, String password) {
//        return userMapper.checkUsernameAndPassword(username, MD5Utils.code(password));
        return userMapper.checkUsernameAndPassword(username, password);
    }
}
