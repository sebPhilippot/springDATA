package com.example.TP1_SpringDATA.controller;

import com.example.TP1_SpringDATA.controller.converter.ProduitDtoConverter;
import com.example.TP1_SpringDATA.controller.dto.ProduitDto;
import com.example.TP1_SpringDATA.controller.dto.ProduitDtoFull;
import com.example.TP1_SpringDATA.model.Produit;
import com.example.TP1_SpringDATA.service.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/produit")
public class ProduitController {

    @Autowired
    IProduitService service;

    @Autowired
    ProduitDtoConverter convert;

    @PostMapping("/create")
    ProduitDtoFull createProduit(@RequestBody  ProduitDtoFull p){
         Produit produit=convert.convertProduitDtoFullToProduitEntityFull(p);
         Produit pr= service.createProduit(produit);
         return convert.convertProduitFullEntityToProduitFullDto(pr);
    }


    @GetMapping("/all")
    List<ProduitDto> findAll(){

       List<ProduitDto> produitsDto=new ArrayList<>();
       for(Produit p: service.findAll()){
           produitsDto.add(convert.convertProduitEntityToProduitDto(p));
       }
            return produitsDto;
        }

    @GetMapping("/{id}")
    ProduitDtoFull findById(@PathVariable("id") Long id){

        return convert.convertProduitFullEntityToProduitFullDto(service.findById(id));
    }
    @GetMapping("/find/{couleur}")
    List<Produit> findByCouleur(@PathVariable("couleur") String couleur){
        return service.findByCouleur(couleur);
    }
}
