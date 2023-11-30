package com.crossangle.cmc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.crossangle.*"})
public class CmcLibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmcLibraryApplication.class, args);
    }

}
