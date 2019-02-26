package com.windlazio.study.service;

import com.windlazio.study.model.User;

public interface IUserService {
    public User getUserById(Integer id);
    public void deleteUserById(Integer id);
    public void insertUser(User user);
    public void upodateUser(User user);
}
