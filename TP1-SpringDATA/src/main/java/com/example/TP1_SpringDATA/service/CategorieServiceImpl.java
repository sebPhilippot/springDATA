package com.example.TP1_SpringDATA.service;

import com.example.TP1_SpringDATA.dao.ICategoryDao;
import com.example.TP1_SpringDATA.model.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategorieServiceImpl implements ICategorieService {

    @Autowired
    ICategoryDao dao;

    @Override
    public Categorie createCategorie(Categorie categorie) {
        return dao.save(categorie);
    }
}
