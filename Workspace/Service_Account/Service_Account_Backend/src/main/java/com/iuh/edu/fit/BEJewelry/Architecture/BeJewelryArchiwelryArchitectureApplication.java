package com.iuh.edu.fit.BEJewelry.Architecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

//disable security
@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
        org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class
})
// @SpringBootApplication
@EnableScheduling
public class BeJewelryArchiwelryArchitectureApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeJewelryArchiwelryArchitectureApplication.class, args);
    }

}
