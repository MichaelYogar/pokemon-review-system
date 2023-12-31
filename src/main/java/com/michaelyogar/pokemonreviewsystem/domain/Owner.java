package com.michaelyogar.pokemonreviewsystem.domain;

import jakarta.persistence.*;

@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long owner_id;

    private String name;

    private String gym;

    @ManyToOne(fetch = FetchType.LAZY)
    private Country country;

    public long getOwnerId() {
        return owner_id;
    }

    public void setOwnerId(long owner_id) {
        this.owner_id = owner_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGym() {
        return gym;
    }

    public void setGym(String gym) {
        this.gym = gym;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
