package com.example.TP1_SpringDATA.service;


import com.example.TP1_SpringDATA.model.Produit;

import java.util.List;

public interface IProduitService {

    Produit createProduit(Produit p);

    List<Produit> findAll();

    Produit findById(Long id);

    List<Produit> findByCouleur(String couleur);
}
