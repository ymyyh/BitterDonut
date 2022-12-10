package com.bitterDount.frente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class FrenteApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrenteApplication.class, args);
    }

}
