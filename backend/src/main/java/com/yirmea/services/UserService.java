package com.yirmea.services;

import com.yirmea.entities.User;

import java.util.List;

public interface UserService {
    User addUser(User user);
    User addUser(String nom, String mail);
    List<User> getAllUsers();
}
