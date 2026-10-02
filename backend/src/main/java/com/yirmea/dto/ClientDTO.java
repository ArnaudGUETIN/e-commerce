package com.yirmea.dto;

import lombok.Data;

import java.util.List;

@Data
public class ClientDTO {
    String address;
    String phone;
    String city;
    String country;
    List<ClientDTO> orders;
    Long UserId;
    Long CartId;

}
