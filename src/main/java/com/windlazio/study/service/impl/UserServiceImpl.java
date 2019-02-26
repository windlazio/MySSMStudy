package com.windlazio.study.service.impl;

import com.windlazio.study.dao.IUserDao;
import com.windlazio.study.model.User;
import com.windlazio.study.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Service("userService")
@Service
public class UserServiceImpl implements IUserService {
    //@Autowired
    @Resource
    private IUserDao userDao;

    @Override
    public User getUserById(Integer id) {
        return this.userDao.selectUserById(id);
    }

    @Override
    public void deleteUserById(Integer id) {
        this.userDao.deleteUserById(id);
    }

    @Override
    public void insertUser(User user) {
        this.userDao.insertUser(user);
    }

    @Override
    public void upodateUser(User user) {
        this.userDao.updateUser(user);
    }
}
