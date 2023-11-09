package com.michaelyogar.pokemonreviewsystem.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long review_id;

    public String title;

    public String text;

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
}
