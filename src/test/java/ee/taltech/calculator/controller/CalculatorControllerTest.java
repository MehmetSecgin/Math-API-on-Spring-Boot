package ee.taltech.calculator.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
public class CalculatorControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    @DisplayName("calculate1 must have string input")
    void calculate1MustHaveStringInput() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/calculator/calculate1"))
                .andExpect(status().is4xxClientError());
    }

    @Test
    @DisplayName("calculate1 does not fail on empty input")
    void calculate1DoesNotFailOnEmptyInput() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/calculator/calculate1?input="))
                .andExpect(status().is2xxSuccessful())
                .andExpect(content().string("{}"));
    }

    @Test
    @DisplayName("calculate1 returns a response")
    void calculate1DoesReturnAResponse() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/calculator/calculate1?input=1,-2,5"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.min").value(-2))
                .andExpect(jsonPath("$.sumOfOdds").value(6))
                .andExpect(jsonPath("$.powerOfFour[0]").value(1));
    }
    @Test

    @DisplayName("calculate2 must have string input")
    void calculate2MustHaveStringInput() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/calculator/calculate2"))
                .andExpect(status().is4xxClientError());
    }

    @Test
    @DisplayName("calculate2 does not fail on empty input")
    void calculate2DoesNotFailOnEmptyInput() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/calculator/calculate2?input="))
                .andExpect(status().is2xxSuccessful())
                .andExpect(content().string("{}"));
    }

    @Test
    @DisplayName("calculate2 returns a response")
    void calculate2DoesReturnAResponse() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/calculator/calculate2?input=1,-2,5"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.averageOfPositives").value(3))
                .andExpect(jsonPath("$.odds[0]").value(1))
                .andExpect(jsonPath("$.sumOfOdds").value(6));
    }
}
