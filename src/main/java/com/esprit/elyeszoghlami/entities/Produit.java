package com.esprit.elyeszoghlami.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomProduit;

    @Enumerated(EnumType.STRING)
    private Etat etat;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Categorie> categories;
}
