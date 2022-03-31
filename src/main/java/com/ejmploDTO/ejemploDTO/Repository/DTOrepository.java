/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejmploDTO.ejemploDTO.Repository;

import com.ejmploDTO.ejemploDTO.model.Alumno;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sosag
 */
@Repository
public interface DTOrepository extends JpaRepository<Alumno, Long> {
    List<Alumno> findByNombre(String nombre);
}
