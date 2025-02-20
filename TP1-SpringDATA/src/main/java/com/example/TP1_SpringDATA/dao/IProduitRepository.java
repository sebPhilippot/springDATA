package com.example.TP1_SpringDATA.dao;


import com.example.TP1_SpringDATA.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProduitRepository extends JpaRepository<Produit,Long> {

    List<Produit> findByCouleur(String couleur);


}
