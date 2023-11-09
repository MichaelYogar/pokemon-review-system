package com.michaelyogar.pokemonreviewsystem.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long owner_id;

    public String name;

    public String gym;

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
}
