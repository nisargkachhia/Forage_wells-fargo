package com.example.demo;

import com.example.demo.entities.Advisor;
import com.example.demo.entities.Client;
import com.example.demo.entities.Portfolio;
import com.example.demo.entities.Security;
import com.example.demo.repositories.AdvisorRepository;
import com.example.demo.repositories.ClientRepository;
import com.example.demo.repositories.PortfolioRepository;
import com.example.demo.repositories.SecurityRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(
            AdvisorRepository advisorRepository,
            ClientRepository clientRepository,
            PortfolioRepository portfolioRepository,
            SecurityRepository securityRepository
    ) {
        return args -> {
            // Create Advisor
            Advisor advisor = new Advisor("John", "Doe", "123 Main St", "555-1234", "john.doe@wellsfargo.com");
            advisorRepository.save(advisor);

            // Create Client
            Client client = new Client("Jane", "Smith", "456 Oak St", "555-5678", "jane.smith@email.com", advisor);
            clientRepository.save(client);

            // Create Portfolio
            Portfolio portfolio = new Portfolio(new java.util.Date(), client);
            portfolioRepository.save(portfolio);

            // Create Security
            Security security = new Security("Apple Inc.", "Stock", 175.50, new java.util.Date(), 50, portfolio);
            securityRepository.save(security);

            System.out.println("Sample data inserted successfully!");
        };
    }
}
