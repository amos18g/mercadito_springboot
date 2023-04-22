/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercadito.servicesImp;

import com.mercadito.models.Fabricante;
import com.mercadito.repositories.FabricanteRepository;
import com.mercadito.services.FabricanteService;
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
public class FabricanteServiceImp implements FabricanteService, Serializable{
    
    @Autowired
    private FabricanteRepository fabricanteRepository;

    @Override
    public Fabricante saveFabricante(Fabricante fabricante) {
        fabricanteRepository.save(fabricante);
        return fabricante;
    }

    @Override
    public List<Fabricante> getFabricantes() {
        return fabricanteRepository.findAll();
    }

    @Override
    public void deleteFabricante(Long id) {
        fabricanteRepository.deleteById(id);     
    }

    @Override
    public Fabricante getFabricante(Long id) {
       Optional<Fabricante> optionalFabricante = fabricanteRepository.findById(id);
       return optionalFabricante.orElse(null);
    }
    
}
