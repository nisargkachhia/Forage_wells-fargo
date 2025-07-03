package com.example.demo.repositories;

import com.example.demo.entities.Security;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecurityRepository extends JpaRepository<Security, Long> {
    // Add custom query methods here if needed
}
