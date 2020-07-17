package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author John Bickerstaff
 * 17/07/2020
 */

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello World");

        return "Hi Folks!";
    }
}
