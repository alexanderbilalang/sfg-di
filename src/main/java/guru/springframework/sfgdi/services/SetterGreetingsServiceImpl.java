package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author alexander on 07/12/2022
 */
@Service
public class SetterGreetingsServiceImpl implements GreetingsService {

    @Override
    public String getGreetings() {
        return "Hello Greetings from Setter Impl Class";
    }
}
