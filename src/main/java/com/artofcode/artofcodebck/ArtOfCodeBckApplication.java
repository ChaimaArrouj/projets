package com.artofcode.artofcodebck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ArtOfCodeBckApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArtOfCodeBckApplication.class, args);
    }

}
