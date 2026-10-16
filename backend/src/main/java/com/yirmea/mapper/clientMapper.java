package com.yirmea.mapper;

import com.yirmea.dao.ClientRepository;
import com.yirmea.dto.ClientDTO;
import com.yirmea.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;

public class clientMapper {

    @Autowired
    private ClientRepository clientRepository;

    public static Client mapClientDTOToClient(ClientDTO clientDTO){
        Client client = new Client();
        client.setAddress(clientDTO.getAddress());
        client.setPhone(clientDTO.getPhone());
        client.setCountry(clientDTO.getCountry());
        client.setCity(clientDTO.getCity());

        return client;
    }
}
