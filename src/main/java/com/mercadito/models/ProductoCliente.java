/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercadito.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author erick
 */
@Entity
@Data
@Table(name = "producto_cliente")
public class ProductoCliente  implements Serializable{
    
    @Id
    @ManyToOne(cascade = {CascadeType.PERSIST,  CascadeType.MERGE})  //se le esta indicando que el cambio en las relaciones
    //persista en  la BD, y que si se cambia un valor en la tabla padre tambien cambie en la tabla subordinada   
    @JoinColumn(name = "codigoproducto")  //la culumna con la que relaciono esta tabla con la otra entidad. Mapeado a nivel
    //de tabla
    @JsonIgnore
    private Producto producto;
    
    @Id
    @ManyToOne(cascade = {CascadeType.PERSIST,  CascadeType.MERGE})
    @JoinColumn(name = "codigocliente")    
    @JsonIgnore
    private Cliente cliente;
}
