package no.hvl.dat109.javaee_start_prosjekt;

import javax.ejb.Stateless;

@Stateless
public class GreetingServiceImpl implements GreetingService {

    public String greet() {
        return "Hello to you!";
    }

    public String greet(String name) {
        return "Hello " + name;
    }
}
