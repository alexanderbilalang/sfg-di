package guru.springframework.sfgdi.services;

/**
 * @author alexander on 07/12/2022
 */
public class PrimaryGreetingsServiceImpl implements GreetingsService {
    @Override
    public String getGreetings() {
        return "Hello Greetings from Primary Impl Class";
    }
}
