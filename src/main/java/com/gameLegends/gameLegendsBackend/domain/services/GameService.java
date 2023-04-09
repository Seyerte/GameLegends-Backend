package com.gameLegends.gameLegendsBackend.domain.services;

import com.gameLegends.gameLegendsBackend.domain.models.Game;
import com.gameLegends.gameLegendsBackend.infrastructure.repositories.IGameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    private final IGameRepository gameRepository;
    private final CompanyService companyService;
    public GameService(IGameRepository gameRepository, CompanyService companyService) {
        this.gameRepository = gameRepository;
        this.companyService = companyService;
    }

    public List<Game> findAll(){
        return this.gameRepository.findAll();
    }

    public Game getbyId(Long Id){
        var gameOptional = this.gameRepository.findById(Id);
        if (gameOptional.isEmpty()) throw new RuntimeException("No game found");
        return gameOptional.get();

    }

    public Game create(Game game) {
        var company = this.companyService.getAuthUser();
        game.setDeveloped(company);
        return this.gameRepository.save(game);
    }
}
