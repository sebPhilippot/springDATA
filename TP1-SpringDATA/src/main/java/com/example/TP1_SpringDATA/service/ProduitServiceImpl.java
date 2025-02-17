package com.example.TP1_SpringDATA.service;

import com.example.TP1_SpringDATA.dao.IProduitRepository;
import com.example.TP1_SpringDATA.model.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProduitServiceImpl implements IProduitService {

    @Autowired
    IProduitRepository dao;

    @Override
    public Produit createProduit(Produit p) {
        return dao.save(p);
    }

    @Override
    public List<Produit> findAll() {

        return dao.findAll();
    }

    @Override
    public Produit findById(Long id) {

        return dao.findById(id).get();
    }

    @Override
    public List<Produit> findByCouleur(String couleur) {
        return dao.findByCouleur(couleur);
    }
}
