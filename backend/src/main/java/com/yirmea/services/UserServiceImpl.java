package com.yirmea.services;

import com.yirmea.dao.UserRepository;
import com.yirmea.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User addUser(String nom, String mail) {
        User user =  new User();
        user.setName(nom);
        user.setEmail(mail);
        return this.addUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }
}
