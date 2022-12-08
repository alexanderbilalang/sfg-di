package guru.springframework.sfgdi.services;

/**
 * @author alexander on 07/12/2022
 */
public class I18nSpaGreetingsService implements GreetingsService {

    @Override
    public String getGreetings() {
        return "Di Hola";
    }
}
