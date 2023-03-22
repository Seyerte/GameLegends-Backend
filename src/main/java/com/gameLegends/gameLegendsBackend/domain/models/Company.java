package com.gameLegends.gameLegendsBackend.domain.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name = "companies")
@Data
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String website;

}
