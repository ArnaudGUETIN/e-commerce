package com.yirmea.services;

import com.yirmea.dto.UserDTO;
import com.yirmea.entities.User;

import java.util.List;

public interface UserService {
    UserDTO addUser(User user);
    UserDTO addUser(String email, String name, String password);
    UserDTO updateUser(Long Id, String email, String name, String password);
    UserDTO getUserById(Long id);
    List<UserDTO> getAllUsers();
    User userDTOMapper(UserDTO userDTO);
}
