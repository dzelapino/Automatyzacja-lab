package pl.dzelapino.automatyzacja.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckControllerTest {

    @Test
    void checkApi() {
        GameController controller = new GameController();
        String response = controller.greeting();
        assertEquals("Hello", response);
    }

}
