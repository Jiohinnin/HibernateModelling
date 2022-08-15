package com.sda.hibernate.entities;

import lombok.Getter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
@Getter
public abstract class BaseEntity {
    @Id
    @GeneratedValue
    private UUID id;
}
