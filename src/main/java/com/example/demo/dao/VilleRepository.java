package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Ville;

public interface VilleRepository extends JpaRepository<Ville, Long> {

}
