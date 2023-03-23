package com.gameLegends.gameLegendsBackend.apiService.controllers;

import com.gameLegends.gameLegendsBackend.domain.models.Game;
import com.gameLegends.gameLegendsBackend.domain.services.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameController {

    private GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/games")
    public ResponseEntity<List<Game>> getAll() {
        return ResponseEntity.ok(this.gameService.findAll());
    }

    @GetMapping("/games/{id}")
    public ResponseEntity<Game> getById(@PathVariable Long id) {
        return ResponseEntity.ok(this.gameService.getbyId(id));
    }


}
