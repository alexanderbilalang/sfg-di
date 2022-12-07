package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author alexander on 07/12/2022
 */
@Controller
public class PropertyInjectedController {

    @Qualifier("propertyGreetingsServiceImpl")
    @Autowired
    public GreetingsService greetingsService;

    public String getGreeting() {
        return greetingsService.getGreetings();
    }
}
