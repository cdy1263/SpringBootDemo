package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication springBootApplication = new SpringApplication(Application.class);
        springBootApplication.addListeners(new MyApplicationEnvironmentPreparedEvent());
        springBootApplication.addListeners(new MyApplicationFailedEvent());
        springBootApplication.addListeners(new MyApplicationPreparedEvent());
        springBootApplication.addListeners(new MyApplicationReadyEvent());
        springBootApplication.addListeners(new MyApplicationStartedEvent());
        springBootApplication.addListeners(new MyApplicationStartingEvent());
        springBootApplication.run(args);
    }
}
