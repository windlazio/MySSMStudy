package com.windlazio.study.dao;

import com.windlazio.study.model.User;

public interface IUserDao {
    public User selectUserById(Integer id);
    public void insertUser(User user);
    public void deleteUserById(Integer id);
    public void updateUser(User user);
}
