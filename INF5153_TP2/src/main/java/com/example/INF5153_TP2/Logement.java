package com.example.INF5153_TP2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "logements") // Nom de la table dans la base de données
public class Logement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrémentation
    private int id;

    @NotEmpty
    private String description;

    private int salles_bain;
    private int meubles_inclus;
    private long prix;
    private String taille;

    private boolean chauffage;
    private boolean electromenagers;
    private boolean wifi;
    private boolean air_clim;

    public Logement() {
    }

    public Logement(String description, int id) {
        this.description = description;
        this.id = id;
    }

    public Logement(String description, int id, int salles_bain,
                    int meubles_inclus, long prix, String taille,
                    boolean chauffage, boolean electromenagers,
                    boolean wifi, boolean air_clim) {
        this.description = description;
        this.id = id;
        this.salles_bain = salles_bain;
        this.meubles_inclus = meubles_inclus;
        this.prix = prix;
        this.taille = taille;
        this.chauffage = chauffage;
        this.electromenagers = electromenagers;
        this.wifi = wifi;
        this.air_clim = air_clim;
    }

    // Getters et Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSalles_bain() {
        return salles_bain;
    }

    public void setSalles_bain(int salles_bain) {
        this.salles_bain = salles_bain;
    }

    public int getMeubles_inclus() {
        return meubles_inclus;
    }

    public void setMeubles_inclus(int meubles_inclus) {
        this.meubles_inclus = meubles_inclus;
    }

    public long getPrix() {
        return prix;
    }

    public void setPrix(long prix) {
        this.prix = prix;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public boolean isChauffage() {
        return chauffage;
    }

    public void setChauffage(boolean chauffage) {
        this.chauffage = chauffage;
    }

    public boolean isElectromenagers() {
        return electromenagers;
    }

    public void setElectromenagers(boolean electromenagers) {
        this.electromenagers = electromenagers;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isAir_clim() {
        return air_clim;
    }

    public void setAir_clim(boolean air_clim) {
        this.air_clim = air_clim;
    }
}
