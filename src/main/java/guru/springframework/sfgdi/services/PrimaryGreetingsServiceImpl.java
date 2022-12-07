package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author alexander on 07/12/2022
 */
@Primary
@Service
public class PrimaryGreetingsServiceImpl implements GreetingsService {
    @Override
    public String getGreetings() {
        return "Hello Greetings from Primary Impl Class";
    }
}
