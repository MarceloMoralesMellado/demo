package com.seccion5.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seccion5.demo.model.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer>{

    List<Paciente> findAll();

}
