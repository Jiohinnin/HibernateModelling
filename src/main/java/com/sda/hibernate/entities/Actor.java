package com.sda.hibernate.entities;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Getter
public class Actor extends BaseEntity {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String lastName;

    private LocalDateTime dateOfBirth;

    @ManyToMany(mappedBy = "actors")
    private List<Movie> movies;

    public Actor(String name, int lastname) {
        super();
    }
}
