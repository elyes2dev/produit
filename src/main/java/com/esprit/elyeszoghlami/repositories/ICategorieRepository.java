package com.esprit.elyeszoghlami.repositories;

import com.esprit.elyeszoghlami.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategorieRepository extends JpaRepository<Categorie, Long> {
}
