package com.example.demo.repositories;

import com.example.demo.entities.Advisor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdvisorRepository extends JpaRepository<Advisor, Long> {
}
