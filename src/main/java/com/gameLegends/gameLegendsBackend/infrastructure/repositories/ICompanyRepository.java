package com.gameLegends.gameLegendsBackend.infrastructure.repositories;

import com.gameLegends.gameLegendsBackend.domain.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICompanyRepository extends JpaRepository<Company, Long> {
}
