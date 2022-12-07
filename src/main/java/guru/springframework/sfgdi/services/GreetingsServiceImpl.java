package guru.springframework.sfgdi.services;

/**
 * @author alexander on 07/12/2022
 */
public class GreetingsServiceImpl implements GreetingsService {

    @Override
    public String getGreetings() {
        return "Hello Greetings from Impl Class";
    }
}
