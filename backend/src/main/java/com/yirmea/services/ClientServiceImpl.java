package com.yirmea.services;

import com.yirmea.dao.ClientRepository;
import com.yirmea.dao.UserRepository;
import com.yirmea.dto.ClientDTO;
import com.yirmea.entities.Client;
import com.yirmea.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public ClientDTO addClient(Client client) {

        return clientMapper(this.clientRepository.save(client));
    }

    @Override
    public ClientDTO addClient(String address, String phone, String city, String country, Long userId) {
        Client client = new Client();
        User user = this.userRepository.getReferenceById(userId);
        client.setAddress(address);
        client.setPhone(phone);
        client.setCity(city);
        client.setCountry(country);
        client.setUser(user);
        return addClient(client);
    }

    @Override
    public ClientDTO updateClient(Long id, String address, String phone, String city, String country, Long userId) {
        Client client = this.clientRepository.getReferenceById(id);
        User user = this.userRepository.getReferenceById(userId);
        client.setAddress(address);
        client.setPhone(phone);
        client.setCity(city);
        client.setCountry(country);
        client.setUser(user);
        return clientMapper(client);
    }

    @Override
    public ClientDTO getClient(Long id) {
        return clientMapper(this.clientRepository.getReferenceById(id));
    }

    ClientDTO clientMapper(Client client){
        ClientDTO clientDTO = new ClientDTO();
        clientDTO.setAddress(client.getAddress());
        clientDTO.setPhone(client.getPhone());
        clientDTO.setCountry(client.getCountry());
        clientDTO.setCity(client.getCity());
        clientDTO.setUserId(client.getUser().getId());
        clientDTO.setCartId(client.getCart().getId());

        return clientDTO;
    }
}
