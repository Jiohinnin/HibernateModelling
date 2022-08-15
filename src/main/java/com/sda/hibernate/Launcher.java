package com.sda.hibernate;

import com.sda.hibernate.entities.Genre;
import com.sda.hibernate.entities.Movie;
import com.sda.hibernate.repository.GenreRepository;
import com.sda.hibernate.repository.MovieRepository;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Launcher {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;

        try {
            entityManagerFactory = Persistence
                    .createEntityManagerFactory("MY-PERSISTENCE-UNIT");
            entityManager = entityManagerFactory.createEntityManager();
            GenreRepository genreRepository = new GenreRepository(entityManager);
            Genre drama = genreRepository.insert(new Genre("Drama"));
            System.out.println(drama);
            System.out.println("Find by ID:");
            System.out.println(genreRepository.findById(drama.getId()));
            MovieRepository movieRepository = new MovieRepository(entityManager);
            System.out.println(movieRepository.insert(new Movie("Star is Born", 2018)));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
            if (entityManagerFactory != null) {
                entityManagerFactory.close();
            }
        }
    }
}