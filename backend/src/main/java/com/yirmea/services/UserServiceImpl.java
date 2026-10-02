package com.yirmea.services;

import com.yirmea.dao.UserRepository;
import com.yirmea.dto.UserDTO;
import com.yirmea.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO addUser(User user) {
        return userMapper(this.userRepository.save(user));
    }

    @Override
    public UserDTO addUser(String email, String name, String password) {
        User user = new User();
        user.setEmail(email);
        user.setName(name);
        user.setPassword(password);
        return addUser(user);
    }

    @Override
    public UserDTO updateUser(Long id, String email, String name, String password) {
        User user = this.userRepository.getReferenceById(id);
        user.setEmail(email);
        user.setName(name);
        user.setPassword(password);
        return userMapper(user);
    }

    @Override
    public UserDTO getUserById(Long id) {
        return userMapper(userRepository.getReferenceById(id));
    }


    @Override
    public List<UserDTO> getAllUsers() {
        List<User> users = this.userRepository.findAll();
        List<UserDTO> userDTOS = new ArrayList<>();
        for (User u : users){
            userDTOS.add(userMapper(u));
        }
        return userDTOS;
    }

    public UserDTO userMapper(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setName(user.getName());
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword(user.getPassword());
        return userDTO;
    }

    public User userDTOMapper(UserDTO userDTO){
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        return user;
    }
}
