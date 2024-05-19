package com.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.code")
public class JavaGateSecureAccessHubApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaGateSecureAccessHubApplication.class, args);
        System.err.println("=============started============");
    }

}
