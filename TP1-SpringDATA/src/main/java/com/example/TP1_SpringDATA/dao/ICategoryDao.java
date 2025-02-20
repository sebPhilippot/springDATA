package com.example.TP1_SpringDATA.dao;

import com.example.TP1_SpringDATA.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryDao extends JpaRepository<Categorie,Long> { }
