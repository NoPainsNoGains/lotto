package com.edwardy.dao;

import com.edwardy.po.User;

/**
 * Created by yuminghua on 4/30/18.
 */
public interface UserDao {
    User login(User user);

    User getUserById(Integer id);
}
