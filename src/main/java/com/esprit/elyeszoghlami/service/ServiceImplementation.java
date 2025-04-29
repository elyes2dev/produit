package com.esprit.elyeszoghlami.service;


import com.esprit.elyeszoghlami.entities.Categorie;
import com.esprit.elyeszoghlami.entities.Produit;
import com.esprit.elyeszoghlami.entities.Utilisateur;
import com.esprit.elyeszoghlami.repositories.ICategorieRepository;
import com.esprit.elyeszoghlami.repositories.IProduitRepository;
import com.esprit.elyeszoghlami.repositories.IUtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceImplementation implements IService {

    @Autowired
    IUtilisateurRepository utilisateurRepository;
    @Autowired
    ICategorieRepository CategorieRepository;
    @Autowired
    IProduitRepository ProduitRepository;

    @Override
    public Utilisateur ajouterUtilisateur(Utilisateur u) {
        return utilisateurRepository.save(u);
    }

    @Override
    public Produit ajouterProduitEtCategories(Produit p) {
        List<Categorie> categorieList = p.getCategories();
        for (Categorie c : categorieList) {
            CategorieRepository.save(c);
        }
        p.setCategories(categorieList);
        return ProduitRepository.save(p);
    }

    @Override
    public void affecterProdAUser(List<String> nomProuit, String email) {
        Utilisateur user = utilisateurRepository.findByEmail(email);
        List<Produit> produits = new ArrayList<>();
        for(String n : nomProuit) {
            Produit p = ProduitRepository.findByNomProduit(n);
            produits.add(p);
        }
        user.setProduit(produits);
        utilisateurRepository.save(user);
    }


}
