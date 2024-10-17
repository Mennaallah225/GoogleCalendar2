package com.example.ROPULVA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching public class ROPULVAApplication {

    public static void main(String[] args) {
        SpringApplication.run(ROPULVAApplication.class, args);
    }
}
