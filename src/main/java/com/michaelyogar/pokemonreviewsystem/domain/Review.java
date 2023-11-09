package com.michaelyogar.pokemonreviewsystem.domain;

import jakarta.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long review_id;

    public String title;

    public String text;

    @ManyToOne(fetch = FetchType.LAZY)
    public Reviewer reviewer;

    public long getReviewId() {
        return review_id;
    }

    public void setReviewId(long reviewer_id) {
        this.review_id = reviewer_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_pokemon_id")
    public Pokemon pokemon;
}
