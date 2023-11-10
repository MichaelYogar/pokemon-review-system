package com.michaelyogar.pokemonreviewsystem.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Reviewer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reviewer_id;

    private String firstName;

    private String lastName;

    @OneToMany(mappedBy = "reviewer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Review> reviews = new ArrayList<>();

    public void addReview(Review review) {
        reviews.add(review);
        review.setReviewer(this);
    }

    public void removeReview(Review review) {
        reviews.remove(review);
        review.setReviewer(null);
    }


    public long getReviewerId() {
        return reviewer_id;
    }

    public void setReviewerId(long reviewer_id) {
        this.reviewer_id = reviewer_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Review> getReviews() {
        return reviews;
    }
}
