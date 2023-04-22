/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercadito.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author erick
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name =  "categoria")
@JsonIdentityInfo(scope = Categoria.class ,generator = ObjectIdGenerators.PropertyGenerator.class, property = "codigoCategoria")
public class Categoria implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigocategoria")
    private Long codigoCategoria;
    
    @Column
    private String descripcion;
    
    @ManyToMany(mappedBy = "categorias")
    @JsonIdentityReference(alwaysAsId = true)//forma alternativa para evitar la recursion infinita
    //@JsonBackReference     
    @JsonIgnore
    private Set<Producto> productos;
    
    }
