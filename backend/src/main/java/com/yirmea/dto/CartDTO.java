package com.yirmea.dto;

import com.yirmea.entities.Client;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class CartDTO {
    LocalDateTime creationDate;
    Long clientId;
    List<ClientDTO> cartlines;
}
