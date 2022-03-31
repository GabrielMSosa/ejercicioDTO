/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejmploDTO.ejemploDTO.Repository;

import com.ejmploDTO.ejemploDTO.model.Instrumento;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sosag
 */
@Repository
public interface DTOrepository2  extends JpaRepository<Instrumento,Long > {
    List<Instrumento> findByNombre(String nombre);
}
