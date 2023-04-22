/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mercadito.services;

import com.mercadito.models.Cliente;
import java.util.List;

/**
 *
 * @author erick
 */
public interface ClienteService {
    
    Cliente saveCliente(Cliente cliente);
    
    List<Cliente> getClientes();
    
    void deleteCliente(Long id);
    
    Cliente getCliente(Long id);
}
