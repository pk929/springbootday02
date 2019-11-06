package com.pk.springbootday02.dao;

import com.pk.springbootday02.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> { }
