package pl.dzelapino.automatyzacja.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import pl.dzelapino.automatyzacja.service.GameService;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(GameController.class)
class GameControllerIntegrationTest {

    @MockBean
    private GameService gameService;
    @Autowired
    private MockMvc mvc;

    @Test
    void shouldCreateMockMvc() {
        assertNotNull(mvc);
    }

    @Test
    void apiTest() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("Hello", result.getResponse().getContentAsString());
    }

}
