/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejmploDTO.ejemploDTO.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author sosag
 */
@Getter @Setter
public class PropiedadDTO implements Serializable {
    private Long id_alumno;
    private String nombre_alumno;
    private String apellido_alumno;
    private String curso_alumno;
    private Long id_instrumento;
    private String instrumento_nombre;
    private String tipo_instrumento;
    private String material_insrtumento;

    @Override
    public String toString() {
        return "PropiedadDTO{" + "id_alumno=" + id_alumno + ", nombre_alumno=" + nombre_alumno + ", apellido_alumno=" + apellido_alumno + ", curso_alumno=" + curso_alumno + ", id_instrumento=" + id_instrumento + ", instrumento_nombre=" + instrumento_nombre + ", tipo_instrumento=" + tipo_instrumento + ", material_insrtumento=" + material_insrtumento + '}';
    }

    
    
    
    public PropiedadDTO() {
    }

    public PropiedadDTO(Long id_alumno, String nombre_alumno, String apellido_alumno, String curso_alumno, Long id_instrumento, String instrumento_nombre, String tipo_instrumento, String material_insrtumento) {
        this.id_alumno = id_alumno;
        this.nombre_alumno = nombre_alumno;
        this.apellido_alumno = apellido_alumno;
        this.curso_alumno = curso_alumno;
        this.id_instrumento = id_instrumento;
        this.instrumento_nombre = instrumento_nombre;
        this.tipo_instrumento = tipo_instrumento;
        this.material_insrtumento = material_insrtumento;
    }

    
    
    
}
