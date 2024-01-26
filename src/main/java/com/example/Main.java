package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.example.controllers","com.example.repositories","com.example.service"})
public class Main {

  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }

}
