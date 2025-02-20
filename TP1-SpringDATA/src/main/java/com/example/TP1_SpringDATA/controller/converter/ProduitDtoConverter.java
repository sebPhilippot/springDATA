package com.example.TP1_SpringDATA.controller.converter;

import com.example.TP1_SpringDATA.controller.dto.ProduitDto;
import com.example.TP1_SpringDATA.controller.dto.ProduitDtoFull;
import com.example.TP1_SpringDATA.model.Categorie;
import com.example.TP1_SpringDATA.model.Produit;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProduitDtoConverter {

    public Produit convertProduitDtoToProduitEntity(ProduitDto dto){
       return new Produit(dto.getCouleur(), dto.getLibelle());
    }

    public ProduitDto convertProduitEntityToProduitDto(Produit p){
        return new ProduitDto(p.getId(), p.getLibelle(),  p.getCouleur());
    }

    public Produit convertProduitDtoFullToProduitEntityFull(ProduitDtoFull dto){

        Categorie c=new Categorie(dto.getCategorieLibelle());
        Produit p=new Produit(dto.getCouleur(), dto.getLibelle());

        List<Categorie> categories=new ArrayList<>();
        categories.add(c);
        p.setCategories(categories);
        return p;
    }

    public ProduitDtoFull convertProduitFullEntityToProduitFullDto(Produit p){
        return new ProduitDtoFull(p.getId(), p.getLibelle(),  p.getCouleur(), p.getCategories().get(0).getLibelle());
    }
}
