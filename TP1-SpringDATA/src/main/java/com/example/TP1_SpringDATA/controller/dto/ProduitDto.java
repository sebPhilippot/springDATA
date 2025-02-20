package com.example.TP1_SpringDATA.controller.dto;

public class ProduitDto {

    private Long id;
    private String libelle;
    private String couleur;

    public ProduitDto(Long id, String libelle, String couleur) {
        this.id = id;
        this.libelle = libelle;
        this.couleur = couleur;
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
}
