package com.yirmea.web;

import com.yirmea.dto.ClientDTO;
import com.yirmea.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public ClientDTO getProfile(@PathVariable("id") Long id){
        return this.clientService.getClient(id);
    }

    @PutMapping
    public ClientDTO updateProfile(@PathVariable("id") Long id, @RequestParam ClientDTO clientDTO){
        return this.clientService.updateClient(id, clientDTO.getAddress(), clientDTO.getPhone(), clientDTO.getCity(), clientDTO.getCountry(), clientDTO.getUserId());
    }
}
