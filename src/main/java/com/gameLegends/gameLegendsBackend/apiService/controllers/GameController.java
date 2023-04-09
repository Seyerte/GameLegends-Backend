package com.gameLegends.gameLegendsBackend.apiService.controllers;

import com.gameLegends.gameLegendsBackend.domain.models.Game;
import com.gameLegends.gameLegendsBackend.domain.services.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
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

    @PostMapping("/games")
    public ResponseEntity <Game> create (@RequestBody Game game) {
        return ResponseEntity.ok(this.gameService.create(game));

    }

}
