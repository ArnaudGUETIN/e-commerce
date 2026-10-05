package com.yirmea.services;

import com.yirmea.dao.CartRepository;
import com.yirmea.dao.UserRepository;
import com.yirmea.dto.UserDTO;
import com.yirmea.entities.Cart;
import com.yirmea.entities.Client;
import com.yirmea.entities.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CartRepository cartRepository;

    @Override
    public UserDTO createUser(User user) {
        return userMapper(this.userRepository.save(user));
    }

    //On créer le panier et le client à l'inscription
    @Override
    @Transactional
    public UserDTO addUser(User user){
        user.setDateCreation(LocalDateTime.now());

        Client client = new Client();
        client.setUser(user);
        user.setClient(client);

        Cart cart = new Cart();
        cart.setCreationDate(LocalDateTime.now());
        cart.setClient(client);
        client.setCart(cart);

        return createUser(user);
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
