/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercadito.servicesImp;

import com.mercadito.models.Cliente;
import com.mercadito.models.Fabricante;
import com.mercadito.repositories.ClienteRepository;
import com.mercadito.services.ClienteService;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author erick
 */
@Service
public class ClienteServiceImp implements ClienteService, Serializable{
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    @Override
    public Cliente saveCliente(Cliente cliente) {
        clienteRepository.save(cliente);
        return cliente;
    }

    @Override
    public Cliente getCliente(Long id) {
       Optional<Cliente> optionalCliente = clienteRepository.findById(id);
       return optionalCliente.orElse(null); 
   }

    @Override
    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public  List<Cliente> getClientes() {
        return clienteRepository.findAll();
    }
    
}
