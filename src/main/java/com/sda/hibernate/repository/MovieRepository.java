package com.sda.hibernate.repository;

import com.sda.hibernate.entities.Movie;

import javax.persistence.EntityManager;
import java.util.UUID;

public class MovieRepository extends BaseRepository<Movie, UUID> {

    public MovieRepository(EntityManager entityManager) {
        super(entityManager, Movie.class);
    }
}