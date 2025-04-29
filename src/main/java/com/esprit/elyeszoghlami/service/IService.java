package com.esprit.elyeszoghlami.service;

import com.esprit.elyeszoghlami.entities.Produit;
import com.esprit.elyeszoghlami.entities.Utilisateur;

import java.util.List;

public interface IService {
    public Utilisateur ajouterUtilisateur (Utilisateur u);
    public Produit ajouterProduitEtCategories (Produit p);
    public void affecterProdAUser(List<String> nomProuit, String email);
}
