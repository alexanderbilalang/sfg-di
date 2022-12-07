package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsService;
import org.springframework.stereotype.Controller;

/**
 * @author alexander on 07/12/2022
 */
@Controller
public class MyController {

    private final GreetingsService greetingsService;

    public MyController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }


    public String getGreeting() {
        return greetingsService.getGreetings();
    }
}
