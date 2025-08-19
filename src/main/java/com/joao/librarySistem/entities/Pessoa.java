package com.joao.librarySistem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Pessoa {
    @Id
    @GeneratedValue
    private UUID id;

    private String nome;

}
