package com.edwardy.service.impl;

import com.edwardy.dao.UserDao;
import com.edwardy.po.User;
import com.edwardy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yuminghua on 4/30/18.
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public User login(User user) {
        return userDao.login(user);
    }

    @Override
    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }
}
