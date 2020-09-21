package com.jcreid.greetingsvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collection;
import java.util.Collections;

@SpringBootApplication
public class GreetingsvcApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(GreetingsvcApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
        app.run(args);
    }

}
