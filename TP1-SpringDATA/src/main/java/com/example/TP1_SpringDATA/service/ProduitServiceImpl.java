package com.example.TP1_SpringDATA.service;

import com.example.TP1_SpringDATA.dao.IProduitRepository;
import com.example.TP1_SpringDATA.model.Categorie;
import com.example.TP1_SpringDATA.model.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProduitServiceImpl implements IProduitService {

    @Autowired
    IProduitRepository dao;

    @Autowired
    ICategorieService categorieService;

    @Override
    public Produit createProduit(Produit p) {
         List<Categorie>  categories=p.getCategories();

         /*  Premier façon d'écrire la boucle
         for(int i=0; i<categories.size(); i++){
             Categorie c=categories.get(i);
             categorieService.createCategorie(c);
         }
          seconde façon d'écrire la boucle
         for(Categorie c : categories){
             categorieService.createCategorie(c);
         }
         */
         categories.forEach( (c)->categorieService.createCategorie(c));
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
