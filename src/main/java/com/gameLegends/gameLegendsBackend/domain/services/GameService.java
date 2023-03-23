package com.gameLegends.gameLegendsBackend.domain.services;

import com.gameLegends.gameLegendsBackend.domain.models.Game;
import com.gameLegends.gameLegendsBackend.infrastructure.repositories.IGameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    private final IGameRepository gameRepository;

    public GameService(IGameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<Game> findAll(){
        return this.gameRepository.findAll();
    }

    public Game getbyId(Long Id){
        var gameOptional = this.gameRepository.findById(Id);
        if (gameOptional.isEmpty()) throw new RuntimeException("No game found");
        return gameOptional.get();

    }

}
