package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * @author alexander on 08/12/2022
 */
@Configuration
public class GreetingServiceConfig {

    @Profile("ES")
    @Bean("i18nService")
    I18nSpaGreetingsService i18nSpaGreetingsService() {
        return new I18nSpaGreetingsService();
    }

    @Profile({"EN", "default"})
    @Bean()
    I18nEnGreetingsService i18nService() {
        return new I18nEnGreetingsService();
    }

    @Primary
    @Bean
    PrimaryGreetingsServiceImpl primaryGreetingsService() {
        return new PrimaryGreetingsServiceImpl();
    }

    @Bean
    PropertyGreetingsServiceImpl propertyGreetingsService() {
        return new PropertyGreetingsServiceImpl();
    }

    @Bean
    SetterGreetingsServiceImpl setterGreetingsService() {
        return new SetterGreetingsServiceImpl();
    }
}
