package com.sda.hibernate.entities;


import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Getter
public class Genre extends BaseEntity{
    @Column(nullable = false)
    private String name;

    @OneToOne(mappedBy = "genre")
    private Movie movie;

    public Genre(String genre) {
        super();
    }
}
