package com.example.INF5153_TP2;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import jakarta.validation.constraints.NotEmpty;

@Table("logement")
public class Logement {
    @NotEmpty
    private String description;

    @Id
    private int id;
    private int salles_bain;
    private int meubles_inclus;
    private long prix;
    private long taille;

    private boolean chauffage;

    private boolean electromenagers;
    private boolean wifi;
    private boolean air_clim;

    public Logement() {
    }

    //Constructeur pour tester des donnees
    public Logement(String description, int id) {
        this.description = description;
        this.id = id;
    }

    public Logement(String description, int id, int salles_bain,
                    int meubles_inclus, long prix, long taille,
                    boolean chauffage, boolean electrosmenagers,
                    boolean wifi, boolean air_clim) {
        this.description = description;
        this.id = id;
        this.salles_bain = salles_bain;
        this.meubles_inclus = meubles_inclus;
        this.prix = prix;
        this.taille = taille;
        this.chauffage = chauffage;
        this.electromenagers = electrosmenagers;
        this.wifi = wifi;
        this.air_clim = air_clim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPrix() {
        return prix;
    }

    public void setPrix(long prix) {
        this.prix = prix;
    }

    public long getTaille() {
        return taille;
    }

    public void setTaille(long taille) {
        this.taille = taille;
    }

    public int getSalles_bain() {
        return salles_bain;
    }

    public void setSalles_bain(int salles_bain) {
        this.salles_bain = salles_bain;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean hasChauffage() {
        return chauffage;
    }

    public void setChauffage(boolean chauffage) {
        this.chauffage = chauffage;
    }

    public int getMeubles_inclus() {
        return meubles_inclus;
    }

    public void setMeubles_inclus(int meubles_inclus) {
        this.meubles_inclus = meubles_inclus;
    }

    public boolean hasElectromenagers() {
        return electromenagers;
    }

    public void setElectromenagers(boolean electromenagers) {
        this.electromenagers = electromenagers;
    }

    public boolean hasWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean hasAir_clim() {
        return air_clim;
    }

    public void setAir_clim(boolean air_clim) {
        this.air_clim = air_clim;
    }
}
