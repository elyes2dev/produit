package com.esprit.elyeszoghlami.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {

    // loula * type de retour
    // thenya * package/ localisation
    // teltha * esm service
    // erabaaa esm l methode
    // khamsa (..) ay type arguemtn

    // @After("execution(* com.esprit.examenblanche.services.*(..))")

    @Before("execution(* com.esprit.elyeszoghlami.service.*.*(..))")
    public void logAfter(JoinPoint joinPoint) {

        System.out.println("Before method execution");
        String servicName = joinPoint.getSignature().getDeclaringType().getSimpleName();
        log.info("Bienvenue à l’un des services de\n" +
                "l’application Boycott : NOM_DU_SERVICE" + servicName + " : ");
    }

}
