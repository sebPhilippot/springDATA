package com.example.TP1_SpringDATA.controller.dto;

public class ProduitDtoFull {

    private Long id;

    private String libelle;

    private String couleur;

    private String categorieLibelle;


    public ProduitDtoFull(Long id, String libelle, String couleur, String categorieLibelle) {
        this.id = id;
        this.libelle = libelle;
        this.couleur = couleur;
        this.categorieLibelle = categorieLibelle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getCategorieLibelle() {
        return categorieLibelle;
    }

    public void setCategorieLibelle(String categorieLibelle) {
        this.categorieLibelle = categorieLibelle;
    }
}
