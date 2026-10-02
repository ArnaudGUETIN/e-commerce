package com.yirmea.services;

import com.yirmea.dto.ClientDTO;
import com.yirmea.entities.Client;

public interface ClientService {
    ClientDTO addClient(Client client);
    ClientDTO addClient(String address, String phone, String city, String country, Long userId);
    ClientDTO updateClient(Long id, String address, String phone, String city, String country, Long userId);
    ClientDTO getClient(Long id);
}
