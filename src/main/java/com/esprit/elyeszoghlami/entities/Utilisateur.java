package com.esprit.elyeszoghlami.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Utilisateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    @Temporal(TemporalType.DATE)
    private Date dateInscription;

    @Enumerated(EnumType.STRING)
    private typeUtilisateur typeUtilisateur;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Produit> produit;
}
