package com.sz.service;

import com.sz.admin.User;
import com.sz.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface IUserService{

    public List<User> ByUserAll();

    public  User ByUserId(int id);

}
