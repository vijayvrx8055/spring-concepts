package com.vrx.spring.orm.service;

import com.vrx.spring.orm.entity.User;

import java.util.List;

public interface UserService {

    public User getUser(int id);

    public List<User> getAllUsers();

    public User saveUser(User user);

    public User updateUser(User user, int id);

    public void deleteUser(int id);
}
