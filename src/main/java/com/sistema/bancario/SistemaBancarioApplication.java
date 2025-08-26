package com.sistema.bancario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.sistema.bancario.repository")
public class SistemaBancarioApplication {

    public static void main(String[] args) {
        SpringApplication.run(SistemaBancarioApplication.class, args);
    }

}
