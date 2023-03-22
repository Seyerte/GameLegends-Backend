package com.gameLegends.gameLegendsBackend.infrastructure.repositories;

import com.gameLegends.gameLegendsBackend.domain.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGameRepository extends JpaRepository<Game,Long> {
}
