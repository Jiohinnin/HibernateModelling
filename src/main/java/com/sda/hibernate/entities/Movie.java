package com.sda.hibernate.entities;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
@Getter

public class Movie extends BaseEntity{

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private int yearOfRelease;

    @OneToOne
    private Genre genre;

    @ManyToMany
    private List<Actor> actors;

    public Movie(String title, int yearOfRelease) {
        super();
    }
}
