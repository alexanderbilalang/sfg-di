package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author alexander on 07/12/2022
 */
@Profile({"EN", "default"})
@Service("i18nService")
public class I18nEnGreetingsService implements GreetingsService {

    @Override
    public String getGreetings() {
        return "Say Hello";
    }
}
