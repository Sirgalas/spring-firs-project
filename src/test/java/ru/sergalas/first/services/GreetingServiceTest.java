package ru.sergalas.first.services;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import ru.sergalas.first.IntegrationTestBase;

import static org.junit.jupiter.api.Assertions.*;


class GreetingServiceTest extends IntegrationTestBase {

    @Autowired
    private GreetingService greetingService;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testGreeting() {
        String expectedMessage = "Hello 2";
        assertEquals(expectedMessage, greetingService.greeting());
    }
}