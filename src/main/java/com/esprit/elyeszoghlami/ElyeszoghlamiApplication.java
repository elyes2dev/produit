package com.esprit.elyeszoghlami;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAspectJAutoProxy
@EnableScheduling
public class ElyeszoghlamiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElyeszoghlamiApplication.class, args);
    }

}
