package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.PropertyGreetingsServiceImpl;
import guru.springframework.sfgdi.services.SetterGreetingsServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author alexander on 08/12/2022
 */
@Configuration
public class GreetingServiceConfig {

    @Bean
    PropertyGreetingsServiceImpl propertyGreetingsService() {
        return new PropertyGreetingsServiceImpl();
    }

    @Bean
    SetterGreetingsServiceImpl setterGreetingsService() {
        return new SetterGreetingsServiceImpl();
    }
}
