/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercadito.controllers;

import com.mercadito.models.Categoria;
import com.mercadito.models.Fabricante;
import com.mercadito.services.CategoriaService;
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
@RequestMapping("/categoria")
@Slf4j
public class CategoriaController {
        
    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping("/getCategorias")
    public List<Categoria> getCategorias(){
        return categoriaService.getCategorias();
    }
    
    @PostMapping("/save")
    public void save(@RequestBody Categoria categoria){
        this.categoriaService.saveCategoria(categoria);
        log.info(categoria.toString());
    }
    
    @PostMapping("/delete/{id}")
    public void delete(@PathVariable(name = "id") Long id){
         this.categoriaService.deleteCategoria(id);
    }
    
    @GetMapping("/getCategoria/{id}")
    public ResponseEntity<Categoria> getCategoria(@PathVariable Long id){
        Categoria categoria = categoriaService.getCategoria(id);

        return ResponseEntity.ok(categoria);

    }
}
