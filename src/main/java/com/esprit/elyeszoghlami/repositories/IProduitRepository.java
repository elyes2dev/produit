package com.esprit.elyeszoghlami.repositories;

import com.esprit.elyeszoghlami.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProduitRepository extends JpaRepository<Produit, Long> {
    Produit findByNomProduit(String nomProduit);
}
