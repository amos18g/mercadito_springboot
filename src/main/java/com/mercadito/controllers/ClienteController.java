/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercadito.controllers;

import com.mercadito.models.Cliente;
import com.mercadito.services.ClienteService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author erick
 */
@RestController
@RequestMapping("/cliente")
@Slf4j
public class ClienteController {
        
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping("/getClientes")
    public List<Cliente> getClientes(){
        return clienteService.getClientes();
    }
    
    @PostMapping("/save")
    public void save(@RequestBody Cliente cliente){
        this.clienteService.saveCliente(cliente);
        log.info(cliente.toString());
    }
    
    @PostMapping("/delete/{id}")
    public void delete(@PathVariable(name = "id") Long id){
         this.clienteService.deleteCliente(id);
    }
    
    @GetMapping("/getCliente/{id}")
    public ResponseEntity<Cliente> getCliente(@PathVariable Long id){
        Cliente cliente = clienteService.getCliente(id);

        return ResponseEntity.ok(cliente);

    }
}
