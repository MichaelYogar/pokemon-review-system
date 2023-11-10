package com.michaelyogar.pokemonreviewsystem.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long country_id;

    private String name;

    @OneToMany(mappedBy = "country", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Owner> owners = new ArrayList<>();

    public List<Owner> getOwners() {
        return owners;
    }

    public void addOwner(Owner owner) {
        owners.add(owner);
        owner.setCountry(this);
    }

    public void removeOwner(Owner owner) {
        owners.remove(owner);
        owner.setCountry(null);
    }

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
