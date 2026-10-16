package com.yirmea.web;

import com.yirmea.dto.ClientDTO;
import com.yirmea.mapper.clientMapper;
import com.yirmea.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class ClientController {

    @Autowired
    private ClientService clientService;



    @PostMapping
    public ClientDTO addProfile(@RequestBody ClientDTO clientDTO){
        return this.clientService.addClient(clientMapper.mapClientDTOToClient(clientDTO) );
    }

    @GetMapping
    public ClientDTO getProfile(@PathVariable("id") Long id){
        return this.clientService.getClient(id);
    }

    @PutMapping
    public ClientDTO updateProfile(@PathVariable("id") Long id, @RequestParam ClientDTO clientDTO){
        return this.clientService.updateClient(id, clientDTO.getAddress(), clientDTO.getPhone(), clientDTO.getCity(), clientDTO.getCountry(), clientDTO.getUserId());
    }
}
