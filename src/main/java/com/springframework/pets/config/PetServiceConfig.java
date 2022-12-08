package com.springframework.pets.config;

import com.springframework.pets.services.PetService;
import com.springframework.pets.services.PetServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author alexander on 08/12/2022
 */
@Configuration
public class PetServiceConfig {

    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    /*PetService dogPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.get
    }*/
}
