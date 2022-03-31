/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejmploDTO.ejemploDTO.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author sosag
 */
@Entity
@Setter @Getter
public class Instrumento {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long  id;
    private String nombre;
    private String tipo;
    private String material;

    @Override
    public String toString() {
        return "Instrumento{" + "id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", material=" + material + '}';
    }

    public Instrumento() {
    }

    public Instrumento(Long id, String nombre, String tipo, String material) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.material = material;
    }
 
    
    
    
}
