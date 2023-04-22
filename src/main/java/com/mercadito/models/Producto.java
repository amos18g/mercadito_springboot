/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercadito.models;

import com.fasterxml.jackson.annotation.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import javax.persistence.*;
import lombok.*;

/**
 *
 * @author erick
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "producto")
@JsonIdentityInfo(scope = Producto.class ,generator = ObjectIdGenerators.PropertyGenerator.class, property = "codigoProducto")
public class Producto implements Serializable{
    //@JsonIdentityReference(alwaysAsId = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoproducto") //al indicar el nombre el nombre de la columna es necesario poner el nombre solo en letras
    //minusculas o solo letras mayusculas
    private Long codigoProducto ;
    
    @Column
    private String descripcion;
    
    @Column
    private String pais;
    
    @Column
    private double precio;
    
    //relacion uno a uno tabla padre
    @OneToOne() 
    @JoinColumn(name = "codigofabricante", referencedColumnName = "codigofabricante")
    private Fabricante fabricante;
    
    
    @ManyToMany
    @JoinTable(
            name = "producto_categoria",
            joinColumns = @JoinColumn(name = "codigoproducto"),
            inverseJoinColumns = @JoinColumn(name = "codigocategoria")
    )
    
    //@JsonIgnore
    private List<Categoria> categorias;
    
    
    @ManyToMany
    @JoinTable(
            name = "producto_cliente",
            joinColumns = @JoinColumn(name = "codigoproducto"),
            inverseJoinColumns = @JoinColumn(name = "codigocliente")
    )  
    //@JsonIgnore
    
    private List<Cliente> clientes ;
}
