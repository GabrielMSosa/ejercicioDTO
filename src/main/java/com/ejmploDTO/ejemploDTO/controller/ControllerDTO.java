/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejmploDTO.ejemploDTO.controller;

import com.ejmploDTO.ejemploDTO.model.Alumno;
import com.ejmploDTO.ejemploDTO.model.Instrumento;
import com.ejmploDTO.ejemploDTO.model.PropiedadDTO;
import com.ejmploDTO.ejemploDTO.service.IserviDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sosag
 */
@RestController
public class ControllerDTO {
    
    @Autowired
    private IserviDTO servi;
    
    
   //ejercicio1
    
    @PostMapping("/cargar")
    public String Cargar(@RequestBody PropiedadDTO dato){
        Alumno alu=new Alumno();
        Instrumento ins=new Instrumento();
        
        alu.setNombre(dato.getNombre_alumno());
        alu.setApellido(dato.getApellido_alumno());
        alu.setId(null);
        alu.setCurso(dato.getCurso_alumno());
        //-----------------------------------------
        ins.setMaterial(dato.getMaterial_insrtumento());
        ins.setNombre(dato.getInstrumento_nombre());
        ins.setTipo(dato.getTipo_instrumento());
        ins.setId(null);
        servi.cargarInstrumento(ins);
        servi.cargarAlumno(alu);
        return "EL dato fue cargado exitosamente.";
   
   }
    
    @GetMapping("/instrumentos/traer")
    public List<Instrumento> TraerInstrumento(){
        return servi.TraerTodoInst();
  
    }
    @GetMapping("/alumnos/traer")
    public List<Alumno>TraerAlumno(){
    return servi.TraerTodoAlu();
    } 
    
    @GetMapping("/instrumentos/traer/{nombre}")
    public List<Instrumento> TraerPorNombre( @PathVariable String nombre){
    return servi.TraerporNombreInst(nombre);}
    
    
    
    @GetMapping("/alumnos/traer/{nombre_instrumento}")
    public List<PropiedadDTO> traerPorinstrumento( @PathVariable String nombre_instrumento ){
    List<Instrumento> milista=servi.TraerporNombreInst(nombre_instrumento);
    List<Alumno> alu=new ArrayList<>();
    
    List <PropiedadDTO> paraenviar = new ArrayList<>();
        
    for (Instrumento instrumento : milista) {
        PropiedadDTO x= new PropiedadDTO();
        alu.add( servi.TraerporIdAlumno(instrumento.getId()+1) );
        x.setApellido_alumno((servi.TraerporIdAlumno(instrumento.getId()+1)).getApellido());
        x.setNombre_alumno((servi.TraerporIdAlumno(instrumento.getId()+1)).getNombre()); 
         x.setCurso_alumno((servi.TraerporIdAlumno(instrumento.getId()+1)).getCurso()); 
         x.setId_alumno((servi.TraerporIdAlumno(instrumento.getId()+1)).getId()); 
         
         
         x.setId_instrumento(instrumento.getId()); 
         x.setInstrumento_nombre(instrumento.getNombre());
         x.setTipo_instrumento(instrumento.getTipo());
         x.setMaterial_insrtumento(instrumento.getMaterial());
        paraenviar.add(x);
         
            System.out.println(paraenviar.toString());
    
        }
        
        
    return paraenviar;    
    }
}