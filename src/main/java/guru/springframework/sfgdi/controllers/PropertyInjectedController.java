package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsService;
import guru.springframework.sfgdi.services.GreetingsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author alexander on 07/12/2022
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    GreetingsService greetingsService;

    public String getGreeting() {
        return greetingsService.getGreetings();
    }
}
