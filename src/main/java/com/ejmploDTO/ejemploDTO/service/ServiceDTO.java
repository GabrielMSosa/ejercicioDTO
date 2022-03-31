/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejmploDTO.ejemploDTO.service;

import com.ejmploDTO.ejemploDTO.Repository.DTOrepository;
import com.ejmploDTO.ejemploDTO.Repository.DTOrepository2;
import com.ejmploDTO.ejemploDTO.model.Alumno;
import com.ejmploDTO.ejemploDTO.model.Instrumento;
import com.ejmploDTO.ejemploDTO.model.PropiedadDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sosag
 */
@Service
public class ServiceDTO implements IserviDTO {
    @Autowired
    private DTOrepository repoALumno;
    @Autowired
    private DTOrepository2 repoInstru;
    
    @Override
    public void  cargarAlumno(Alumno dato){
    repoALumno.save(dato);}
    
    @Override
    public void  cargarInstrumento(Instrumento dato){
    repoInstru.save(dato);
    
    }
    
    @Override
    public List<Alumno> TraerTodoAlu(){
    List<Alumno> dato=repoALumno.findAll();
    return dato;
    
    }
    @Override
    public List<Instrumento> TraerTodoInst(){
    
    List<Instrumento> dato=repoInstru.findAll();
    return dato;
    
    
    }
    
    
    @Override
    public List<Instrumento> TraerporNombreInst( String dato){
    return repoInstru.findByNombre(dato);
    
    
    }
    @Override
    public List<Alumno> TraerporNombreAlumno( String dato){
    return repoALumno.findByNombre(dato);
    
    }
    @Override
    public Alumno TraerporIdAlumno(Long id){
    return repoALumno.findById(id).orElse(null);
    
    }
        
       
        
        
        
        
    
    }
    
   
    
    
    
    
    
    
    
    

