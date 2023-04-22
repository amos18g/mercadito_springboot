/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercadito.controllers;

import com.mercadito.models.Fabricante;
import com.mercadito.services.FabricanteService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author erick
 */
@RestController
@RequestMapping("/fabricante")
@Slf4j
public class FabricanteController {

    @Autowired
    private FabricanteService fabricanteService;
    
    @GetMapping("/getFabricantes")
    public List<Fabricante> getFabricantes(){
        return fabricanteService.getFabricantes();
    }
    
    @GetMapping("/getFabricante/{id}")
    public ResponseEntity<Fabricante> getFabricante(@PathVariable Long id){
        Fabricante fabricante = fabricanteService.getFabricante(id);

        return ResponseEntity.ok(fabricante);

    }
    
    @PostMapping("/save")
    public void save(@RequestBody Fabricante fabricante){
        this.fabricanteService.saveFabricante(fabricante);
        log.info(fabricante.toString());
    }
    
    @PostMapping("/delete/{id}")
    public void delete(@PathVariable(name = "id") Long id){
         this.fabricanteService.deleteFabricante(id);
    }
    
}
