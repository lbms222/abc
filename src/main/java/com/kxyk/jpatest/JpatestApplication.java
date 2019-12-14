package com.kxyk.jpatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class JpatestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpatestApplication.class, args);
    }

}
