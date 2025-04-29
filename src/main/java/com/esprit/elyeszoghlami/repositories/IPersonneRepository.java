package com.esprit.elyeszoghlami.repositories;

import com.esprit.elyeszoghlami.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonneRepository extends JpaRepository<Personne, Long> {
}
