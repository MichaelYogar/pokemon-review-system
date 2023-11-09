package com.michaelyogar.pokemonreviewsystem.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long country_id;

    public String name;

    @OneToMany(mappedBy = "country", orphanRemoval = true, cascade = CascadeType.ALL)
    public List<Owner> owners;

    public long getCountryId() {
        return country_id;
    }

    public void setCountryId(long country_id) {
        this.country_id = country_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
