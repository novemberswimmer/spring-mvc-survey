package org.november.swimmer.controller.test;

import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.november.swimmer.controller.SurveyControllerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(SurveyControllerImpl.class)
public class SurveyControllerImplTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void displaySurveyHome() throws Exception {
        MvcResult result = mockMvc.perform(get("/home")).andExpect(status().isOk()).andReturn();

        assertNotNull("Question model attribute must not be null", result.getModelAndView().getModel().get("questionList"));
    }
}
