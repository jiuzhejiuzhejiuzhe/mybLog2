package com.yuchen.demo.service;

import com.yuchen.demo.pojo.User;

/**
 * @author: 清峰
 * @date: 2020/9/22 13:40
 * @code: 愿世间永无Bug!
 * @description:
 */
public interface UserService {
    User checkUsernameAndPassword(String username, String password);
}
