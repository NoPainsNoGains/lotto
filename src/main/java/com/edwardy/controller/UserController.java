package com.edwardy.controller;

import com.edwardy.po.User;
import com.edwardy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yuminghua on 4/30/18.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUser")
    @ResponseBody
    public User getUserById(){
        Integer a = new Integer(1);
        User user =userService.getUserById(a);
        System.out.println(user.getName()+user.getAddress());
        return user;
    }
}
