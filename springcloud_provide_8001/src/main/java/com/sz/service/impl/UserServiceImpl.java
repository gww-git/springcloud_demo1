package com.sz.service.impl;

import com.sz.admin.User;
import com.sz.dao.IUserDao;
import com.sz.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private IUserDao iUserDao;

    @Override
    public List<User> ByUserAll() {
        return iUserDao.ByUserAll();
    }

    @Override
    public User ByUserId(int id) {
        return iUserDao.ByUserId(id);
    }
}
