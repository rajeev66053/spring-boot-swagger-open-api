package com.java.UserManagementApp.service;

import com.java.UserManagementApp.dto.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUser(String id);

    void addUser(User user);

    User updateUser(User user);

    User deleteUser(String id);
}