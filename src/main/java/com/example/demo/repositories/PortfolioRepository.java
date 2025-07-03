package com.example.demo.repositories;

import com.example.demo.entities.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
    // Add custom query methods here if needed
}
