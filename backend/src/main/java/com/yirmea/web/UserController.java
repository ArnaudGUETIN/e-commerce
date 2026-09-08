package com.yirmea.web;

import com.yirmea.entities.User;
import com.yirmea.services.UserService;
import com.yirmea.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService ;

    @GetMapping("/users")
    public List<User> getAll(){
       return this.userService.getAllUsers();
    }
}
