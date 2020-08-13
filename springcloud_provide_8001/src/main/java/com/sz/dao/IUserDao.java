package com.sz.dao;

import com.sz.admin.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository(value = "iUserDao")    //防止报红
public interface IUserDao{

    public List<User> ByUserAll();

    public User ByUserId(int id);
}
