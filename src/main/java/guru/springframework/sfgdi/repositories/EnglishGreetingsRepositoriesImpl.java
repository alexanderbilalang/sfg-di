package guru.springframework.sfgdi.repositories;

/**
 * @author alexander on 08/12/2022
 */
public class EnglishGreetingsRepositoriesImpl implements EnglishGreetingsRepositories {
    @Override
    public String getGreeting() {
        return "Say Hello";
    }
}
