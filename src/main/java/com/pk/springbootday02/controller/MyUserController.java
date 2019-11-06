package com.pk.springbootday02.controller;

import com.pk.springbootday02.entity.MyUser;
import com.pk.springbootday02.mapper.MyUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/myuser")
public class MyUserController {
    @Autowired
    private MyUserMapper myUserMapper;

    @RequestMapping(value = "/getMyUserList",method = RequestMethod.GET)
    public String getMyUserList(Model model){
        List<MyUser> userList = myUserMapper.getMyUserList();
        model.addAttribute("userList",userList);
        return "myuser";
    }
}
