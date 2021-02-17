package no.hvl.dat109.javaee_start_prosjekt;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class GreetingServiceTest {

    private GreetingService greetingService;

    protected abstract GreetingService getInstance();

    @BeforeEach
    void setUp() {
        greetingService = getInstance();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void greet() {
        assertEquals("Hello Bob", greetingService.greet("Bob"));
    }

    @Test
    void testGreet() {
        assertEquals("Hello to you!", greetingService.greet());
    }
}