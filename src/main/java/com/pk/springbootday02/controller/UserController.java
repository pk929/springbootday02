package com.pk.springbootday02.controller;

import com.pk.springbootday02.dao.UserDao;
import com.pk.springbootday02.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//相当于@ResponseBody跟@Controller
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/user")
    public List<User> getUser(){
        return userDao.findAll();
    }
}
