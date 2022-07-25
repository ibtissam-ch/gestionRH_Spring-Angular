package com.YadouSoft.gestionRH.models;


import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
public class Salarie{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    @Id
    private String CINE;
    private String adresse;
    private String tele;
    @Column(unique = true)
    private String email;
    private String role;
    private String matriculeCNSS;
    private String nomBanque;
    private String RIB;
    private int nombreEnfants;
    private Date dateDepart;
    private String motifDepart;
    @OneToOne()
    private DocAdminstratifJoindre docAdminstratifJoindre;
    @OneToOne()
    private Contrat contrat;

    public Salarie(String nom, String prenom, Date dateNaissance, String CINE, String adresse, String tele, String email, String role, String matriculeCNSS, String nomBanque, String RIB, int nombreEnfants, Date dateDepart, String motifDepart) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.CINE = CINE;
        this.adresse = adresse;
        this.tele = tele;
        this.email = email;
        this.role = role;
        this.matriculeCNSS = matriculeCNSS;
        this.nomBanque = nomBanque;
        this.RIB = RIB;
        this.nombreEnfants = nombreEnfants;
        this.dateDepart = dateDepart;
        this.motifDepart = motifDepart;
    }

}