package com.springframework.pets.controllers;

import com.springframework.pets.services.PetService;
import com.springframework.pets.services.PetServiceFactory;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 12/28/19.
 */
@Controller
public class PetController {

    private final PetServiceFactory petService;

    public PetController(PetServiceFactory petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetService("cat").getPetType();
    }
}
