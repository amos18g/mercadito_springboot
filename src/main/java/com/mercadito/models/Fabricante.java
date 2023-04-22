    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mercadito.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.io.Serializable;
import java.util.Date;
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
@Table(name =  "fabricante")
@JsonIdentityInfo(scope = Fabricante.class,  generator = ObjectIdGenerators.PropertyGenerator.class, property = "codigoFabricante")
public class Fabricante implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigofabricante")
    private Long codigoFabricante;
    
    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "fechainiciooperacion")
    @JsonFormat(pattern="yyyy-MM-dd")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicioOperacion;
    
    //relacion uno a uno tabla subordinada
    @OneToOne(mappedBy = "fabricante")
    @JsonIgnore
    private Producto producto;
    
}
