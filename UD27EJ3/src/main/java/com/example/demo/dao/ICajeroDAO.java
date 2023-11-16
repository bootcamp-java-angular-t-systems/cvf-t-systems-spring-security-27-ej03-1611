package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Cajero;

@Repository
public interface ICajeroDAO extends JpaRepository<Cajero, Long>{

}
