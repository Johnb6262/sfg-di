package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author John Bickerstaff
 * 20/07/2020
 */
@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
