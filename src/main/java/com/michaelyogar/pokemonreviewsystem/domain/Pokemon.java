package com.michaelyogar.pokemonreviewsystem.domain;


import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.Instant;
import java.util.List;

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

    @OneToMany(mappedBy = "pokemon", orphanRemoval = true, cascade = CascadeType.ALL)
    public List<Review> reviews;
}
