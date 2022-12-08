package guru.springframework.sfgdi.services;

/**
 * @author alexander on 07/12/2022
 */
public class SetterGreetingsServiceImpl implements GreetingsService {

    @Override
    public String getGreetings() {
        return "Hello Greetings from Setter Impl Class";
    }
}
