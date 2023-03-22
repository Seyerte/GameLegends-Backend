package com.gameLegends.gameLegendsBackend.domain.models;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name ="games")
@Data
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String title;
    private String genre;
    private String platform;
    private String img;
    @ManyToOne
    @JoinColumn(name = "developed_id")
    private Company developed;


}
