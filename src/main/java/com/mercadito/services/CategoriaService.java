/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mercadito.services;

import com.mercadito.models.Categoria;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author erick
 */

public interface CategoriaService {
        Categoria saveCategoria(Categoria categoria);
        
        List<Categoria> getCategorias();
        
        void deleteCategoria(Long id);
        
        Categoria getCategoria(Long id);
}
