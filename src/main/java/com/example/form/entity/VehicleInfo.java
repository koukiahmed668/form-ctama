package com.example.form.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "form")
public class VehicleInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "matricule")
    private String matricule;

    @Column(name = "vehicle_usage") // Renamed to "vehicle_usage"
    private String vehicleUsage;

    @Column(name = "price_neuf")
    private Integer priceNeuf;

    @Column(name = "price_venale")
    private Integer priceVenale;

    @Column(name = "cin")
    private String cin;


    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "date_naissance")
    private String dateNaissance;

    @Column(name = "tel")
    private String tel;

    @Column(name = "adresse")
    private String adresse;
}