/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejmploDTO.ejemploDTO.service;

import com.ejmploDTO.ejemploDTO.model.Alumno;
import com.ejmploDTO.ejemploDTO.model.Instrumento;
import com.ejmploDTO.ejemploDTO.model.PropiedadDTO;
import java.util.List;

/**
 *
 * @author sosag
 */
public interface IserviDTO {
    
    public void  cargarAlumno(Alumno dato);
    public void  cargarInstrumento(Instrumento dato);
    
    public List<Alumno> TraerTodoAlu();
    public List<Instrumento> TraerTodoInst();
    public List<Instrumento> TraerporNombreInst( String dato);
    public List<Alumno> TraerporNombreAlumno( String dato);
    public Alumno TraerporIdAlumno(Long id);
    
    
    
    
}
