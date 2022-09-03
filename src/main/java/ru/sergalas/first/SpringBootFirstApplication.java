package ru.sergalas.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Profile;


@SpringBootApplication
public class SpringBootFirstApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootFirstApplication.class, args);
    }
}
