/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mercadito.services;

import com.mercadito.models.Producto;
import java.util.List;

/**
 *
 * @author erick
 */
public interface ProductoService {
    Producto saveProducto(Producto producto);
    
    List<Producto> getProductos();
    
    void deleteProducto(Long id);
    
    Producto getProducto(Long id);
}
