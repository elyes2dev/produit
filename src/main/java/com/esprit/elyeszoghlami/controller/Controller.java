package com.esprit.elyeszoghlami.controller;


import com.esprit.elyeszoghlami.entities.Produit;
import com.esprit.elyeszoghlami.entities.Utilisateur;
import com.esprit.elyeszoghlami.service.IService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/controller")
public class Controller {
    @Autowired
    private IService service;

    @PostMapping("/add-user")
    public Utilisateur ajouterUtilisateur (@RequestBody Utilisateur u){
    return service.ajouterUtilisateur(u);
    }

    @PostMapping("/add-prod")
    public Produit ajouterProduit(@RequestBody Produit p){
        return service.ajouterProduitEtCategories(p);
    }

    @PostMapping("/affect")
    public void affecterProdAUser(@RequestBody List<String> nomProduit, @RequestParam String email){
        service.affecterProdAUser(nomProduit, email);
    }
}
