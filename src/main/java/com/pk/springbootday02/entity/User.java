package com.pk.springbootday02.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity//指定实体类，必须指定@id
@Table(name = "user")//指定表名
@Data//编译后自动生成所有属性的get\set方法、toString方法、hashCode方法、equals方法
@AllArgsConstructor//编译后自动生成全参构造
@NoArgsConstructor//编译后自动生成无参构造
public class User {
    @Id//主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增
    private int uid;
    private String username;
    private String password;
}
