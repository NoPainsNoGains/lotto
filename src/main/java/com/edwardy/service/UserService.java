package com.edwardy.service;

import com.edwardy.po.User;

/**
 * Created by yuminghua on 4/30/18.
 */
public interface UserService {
    User login(User user);

    User getUserById(Integer id);
}
