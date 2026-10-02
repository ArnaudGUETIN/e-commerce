package com.yirmea.web;

import com.yirmea.dto.UserDTO;
import com.yirmea.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService ;

    @GetMapping("/users")
    public List<UserDTO> getAll(){
       return this.userService.getAllUsers();
    }

    @PostMapping("/api/auth/register")
    public UserDTO createUser(@RequestBody UserDTO userDTO){
        return this.userService.addUser(userService.userDTOMapper(userDTO));
    }

    @PutMapping("/update")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        return null;
    }
}
