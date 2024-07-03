package com.eventoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.eventoapp.controllers")

public class EventoappApplication {

    public static void main(String[] args) {
            SpringApplication.run(EventoappApplication.class, args);
    }

}
