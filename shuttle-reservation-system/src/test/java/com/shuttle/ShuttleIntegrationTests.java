// src/test/java/com/example/shuttlereservation/ShuttleIntegrationTests.java

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.example.shuttlereservation.model.Shuttle;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ShuttleIntegrationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetShuttles() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/shuttles"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(result -> {
                    String content = result.getResponse().getContentAsString();
                    assertNotNull(content);
                    assertTrue(content.contains("shuttleName"));
                });
    }
}
