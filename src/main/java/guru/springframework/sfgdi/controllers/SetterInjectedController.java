package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsServiceImpl;

/**
 * @author alexander on 07/12/2022
 */
public class SetterInjectedController {

    GreetingsServiceImpl greetingsService;

    public void setGreetingsService(GreetingsServiceImpl greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getGreeting() {
        return greetingsService.getGreetings();
    }
}
