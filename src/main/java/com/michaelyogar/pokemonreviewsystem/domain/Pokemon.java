package com.michaelyogar.pokemonreviewsystem.domain;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pokemon_id;

    private String name;

    @OneToMany(mappedBy = "pokemon", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Review> reviews = new ArrayList<>();

    public void addReview(Review review) {
        reviews.add(review);
        review.setPokemon(this);
    }

    public void removeReview(Review review) {
        reviews.remove(review);
        review.setPokemon(null);
    }

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

    public List<Review> getReviews() {
        return reviews;
    }
}
