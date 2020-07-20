package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author John Bickerstaff
 * 20/07/2020
 */
@Service
public class ConstructorGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World -- Constructor";
    }
}
