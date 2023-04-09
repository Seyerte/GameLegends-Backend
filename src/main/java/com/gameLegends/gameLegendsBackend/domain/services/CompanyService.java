package com.gameLegends.gameLegendsBackend.domain.services;

import com.gameLegends.gameLegendsBackend.domain.models.Company;
import com.gameLegends.gameLegendsBackend.infrastructure.repositories.ICompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    @Autowired
    private ICompanyRepository companyRepository;
    Company getAuthUser () {
        return this.companyRepository.findById(1L).get();
    }
}
