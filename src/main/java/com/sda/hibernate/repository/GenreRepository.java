package com.sda.hibernate.repository;



import com.sda.hibernate.entities.Genre;

import javax.persistence.EntityManager;
import java.util.UUID;

public class GenreRepository extends BaseRepository<Genre, UUID> {
    public GenreRepository(EntityManager entityManager) {
        super(entityManager, Genre.class);
    }
}