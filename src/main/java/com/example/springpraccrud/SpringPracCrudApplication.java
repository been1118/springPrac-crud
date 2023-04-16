package com.example.springpraccrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringPracCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringPracCrudApplication.class, args);
    }

}
