package org.november.swimmer.controller.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.november.swimmer.controller.SurveyController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(SurveyController.class)
public class SurveyControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void displaySurveyHome() throws Exception {
        MvcResult ressult = mockMvc.perform(get("/home")).andExpect(status().isOk()).andReturn();

    }
}
