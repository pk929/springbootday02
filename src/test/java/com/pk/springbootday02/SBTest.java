package com.pk.springbootday02;

import com.pk.springbootday02.controller.MyUserController;
import com.pk.springbootday02.entity.MyUser;
import com.pk.springbootday02.mapper.MyUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SBTest {
    @Autowired
    private MyUserMapper myUserMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private MyUserController myUserController;

    @Test
    public void getUserList(){
        System.out.println("哈哈哈");
        System.out.println(myUserController);
        System.out.println(myUserMapper);
        List<MyUser> userList = myUserMapper.getMyUserList();
        for (MyUser user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void redisTest(){
        System.out.println(redisTemplate);
        redisTemplate.opsForValue().set("hello","hello");
        String s = (String)redisTemplate.opsForValue().get("hello");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@"+s);
        MyUser myUser = new MyUser(123,"日天","123");
        redisTemplate.opsForValue().set("user",myUser);
        MyUser user = (MyUser)redisTemplate.opsForValue().get("user");
        System.out.println(user);



    }



}
