package com.michaelyogar.pokemonreviewsystem.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.annotation.CreatedDate;

import java.time.Instant;

@Entity
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pokemon_id;

    private String name;

    @CreatedDate
    private Instant created_date;

    public Long getPokemonId() {
        return pokemon_id;
    }

    public void setPokemonId(Long pokemon_id) {
        this.pokemon_id = pokemon_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
