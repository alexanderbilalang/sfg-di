package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsServiceImpl;

/**
 * @author alexander on 07/12/2022
 */
public class PropertyInjectedController {

    GreetingsServiceImpl greetingsService;

    String getGreeting() {
        return greetingsService.getGreetings();
    }
}
