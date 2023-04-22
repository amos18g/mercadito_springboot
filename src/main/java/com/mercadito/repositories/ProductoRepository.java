/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercadito.repositories;

import com.mercadito.models.Fabricante;
import com.mercadito.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author erick
 */
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    
}
