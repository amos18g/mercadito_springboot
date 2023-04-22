/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercadito.servicesImp;

import com.mercadito.models.Categoria;
import com.mercadito.models.Fabricante;
import com.mercadito.repositories.CategoriaRepository;
import com.mercadito.services.CategoriaService;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author erick
 */
@Service
public class CategoriaServiceImp implements CategoriaService, Serializable{
    
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public Categoria saveCategoria(Categoria categoria) {
        
        categoriaRepository.save(categoria);        
        return categoria;
    }

    @Override
    public List<Categoria> getCategorias() {
        
        return categoriaRepository.findAll();
    }

    @Override
    public void deleteCategoria(Long id) {
        categoriaRepository.deleteById(id);
    }

    @Override
    public Categoria getCategoria(Long id) {
       Optional<Categoria> optionalCategoria = categoriaRepository.findById(id);
       return optionalCategoria.orElse(null);
    }
    
    

    
}
