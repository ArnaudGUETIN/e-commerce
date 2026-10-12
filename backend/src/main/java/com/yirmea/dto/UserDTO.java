package com.yirmea.dto;

import lombok.Data;

@Data
public class UserDTO {
    Long id;
    String email;
    String name;
    String password;
    String dateCreation;
}
