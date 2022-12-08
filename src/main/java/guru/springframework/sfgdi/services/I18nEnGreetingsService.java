package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositories.EnglishGreetingsRepositoriesImpl;

/**
 * @author alexander on 07/12/2022
 */
public class I18nEnGreetingsService implements GreetingsService {

    private final EnglishGreetingsRepositoriesImpl englishGreetingsRepositories;

    public I18nEnGreetingsService(EnglishGreetingsRepositoriesImpl englishGreetingsRepositories) {
        this.englishGreetingsRepositories = englishGreetingsRepositories;
    }

    @Override
    public String getGreetings() {
        return "Say Hello";
    }
}
