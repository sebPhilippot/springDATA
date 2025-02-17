package com.example.TP1_SpringDATA.controller;

import com.example.TP1_SpringDATA.model.Produit;
import com.example.TP1_SpringDATA.service.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produit")
public class ProduitController {

    @Autowired
    IProduitService service;

    @PostMapping("/create")
    Produit createProduit(@RequestBody  Produit p){
        return service.createProduit(p);
    }


    @GetMapping("/all")
    List<Produit> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    Produit findById(@PathVariable("id") Long id){
        return service.findById(id);
    }
    @GetMapping("/find/{couleur}")
    List<Produit> findByCouleur(@PathVariable("couleur") String couleur){
        return service.findByCouleur(couleur);
    }
}
