package com.michaelyogar.pokemonreviewsystem.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Reviewer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long reviewer_id;

    public String firstName;

    public String lastName;

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
}
