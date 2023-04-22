/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercadito.servicesImp;

import com.mercadito.models.Fabricante;
import com.mercadito.models.Producto;
import com.mercadito.repositories.FabricanteRepository;
import com.mercadito.repositories.ProductoRepository;
import com.mercadito.services.ProductoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author erick
 */
@Service
public class ProductoServiceImp implements ProductoService{

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto saveProducto(Producto producto) {
        productoRepository.save(producto);
        return producto;
    }

    @Override
    public List<Producto> getProductos() {
        return productoRepository.findAll();
    }

    @Override
    public void deleteProducto(Long id) {
        productoRepository.deleteById(id);
    }

    @Override
    public Producto getProducto(Long id) {
       Optional<Producto> optionalProducto = productoRepository.findById(id);
       return optionalProducto.orElse(null);
    }

    
}
