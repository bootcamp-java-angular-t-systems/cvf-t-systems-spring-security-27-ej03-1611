package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.MaquinaRegistradora;

@Repository
public interface IMaquinaRegistradoraDAO extends JpaRepository<MaquinaRegistradora, Long>{

}
