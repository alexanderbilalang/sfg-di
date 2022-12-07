package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author alexander on 07/12/2022
 */

@Controller
public class I18nController {

    private final GreetingsService greetingsService;

    public I18nController(@Qualifier("i18nService") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getGreeting() {
        return greetingsService.getGreetings();
    }
}
