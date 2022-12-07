package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author alexander on 07/12/2022
 */
@Controller
public class MyController {

    public String sayHello() {
        return "Hello";
    }
}
