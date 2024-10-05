package com.example.tp_pizza.service;

import com.example.tp_pizza.beans.Produit;
import com.example.tp_pizza.dao.IDao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProduitService implements IDao<Produit> {

    private List<Produit> produits ;

    public ProduitService(){
        produits = new ArrayList<>() ;
    }

    @Override
    public boolean create(Produit o) {
        return produits.add(o);
    }

    @Override
    public boolean update(Produit o) {
        for (int i=0 ; i< produits.size() ;i++){
            Produit prd = produits.get(i);
            if (prd.getId() == o.getId())
                produits.set(i,o);
        }
        return false;
    }

    @Override
    public boolean delete(Produit o) {
        return produits.remove(o);
    }

    @Override
    public List<Produit> findAll() {
        return produits;
    }

    @Override
    public Produit findById(int id) {
        for (Produit prd : produits ){
            if (prd.getId() == id )
                return prd ;
        }
        return null;
    }
}
