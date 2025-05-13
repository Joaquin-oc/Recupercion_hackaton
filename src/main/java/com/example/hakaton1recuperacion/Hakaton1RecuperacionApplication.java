package com.example.hakaton1recuperacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Hakaton1RecuperacionApplication {

    public static void main(String[] args) {
        SpringApplication.run(Hakaton1RecuperacionApplication.class, args);
    }

}
