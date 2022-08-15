package com.sda.hibernate.repository;

import com.sda.hibernate.entities.BaseEntity;
import com.sun.xml.bind.v2.model.core.ID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.UUID;


public class BaseRepository <T extends BaseEntity, ID>{
    private final EntityManager entityManager;
    private final Class<T> entityType;

    public BaseRepository(EntityManager entityManager, Class<T> entityType) {
        this.entityManager = entityManager;
        this.entityType = entityType;
    }

    public T findById(ID id) {
        return entityManager.find(entityType, id);
    }

    public T insert(T entity) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(entity);
        transaction.commit();
        return entity;
    }
}
