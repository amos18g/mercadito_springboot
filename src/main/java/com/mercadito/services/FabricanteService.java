/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mercadito.services;

import com.mercadito.models.Fabricante;
import java.util.List;

/**
 *
 * @author erick
 */
public interface FabricanteService {
    Fabricante saveFabricante(Fabricante fabricante);
    
    List<Fabricante> getFabricantes();
    
    void deleteFabricante(Long id);
    
    Fabricante getFabricante(Long id);
}
