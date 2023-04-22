/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercadito.controllers;

import com.mercadito.models.Producto;
import com.mercadito.services.ProductoService;
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
@RequestMapping("/producto")
@Slf4j
public class ProductoController {

    @Autowired
    private ProductoService productoService;
    
    @GetMapping("/getProductos")
    public List<Producto> getProductos(){
        return productoService.getProductos();
    }
    
    @GetMapping("/getProducto/{id}")
    public ResponseEntity<Producto> getProducto(@PathVariable Long id){
        Producto producto = productoService.getProducto(id);
        //log.info(producto.toString());
        return ResponseEntity.ok(producto);

    }
    
    @PostMapping(value="/save", consumes = {"application/json"})
    public void save(@RequestBody Producto producto){
        this.productoService.saveProducto(producto);
        //log.info(producto.toString());
    }
    
    @PostMapping("/delete/{id}")
    public void delete(@PathVariable(name = "id") Long id){
         this.productoService.deleteProducto(id);
    }
    
}
