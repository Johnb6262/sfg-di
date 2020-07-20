package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author John Bickerstaff
 * 20/07/2020
 */
@Profile({"ES", "default"})
@Service("i18nService")
public class I18NSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
