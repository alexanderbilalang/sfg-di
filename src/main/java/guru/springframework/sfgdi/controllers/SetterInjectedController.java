package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsService;
import guru.springframework.sfgdi.services.ConstructorGreetingsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author alexander on 07/12/2022
 */
@Controller
public class SetterInjectedController {

    GreetingsService greetingsService;

    @Autowired
    public void setGreetingsService(@Qualifier("setterGreetingsService") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getGreeting() {
        return greetingsService.getGreetings();
    }
}
