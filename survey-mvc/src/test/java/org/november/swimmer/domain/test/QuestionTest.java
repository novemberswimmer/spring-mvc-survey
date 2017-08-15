package org.november.swimmer.domain.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.november.swimmer.dto.Question;

public class QuestionTest {

    private Question question;

    @Before
    public void setup(){
        question = new Question("Question","Choice A", "Choice B", "Choice C", "Choice D", "Choice E");
    }

    @Test
    public void questionNotNull(){
        assertNotNull("Question attribute must not be null", question.getQuestionText());
    }

    @Test
    public void optionANotNull() {
        assertNotNull("Option A must not be null", question.getOptionMap().get("A"));
    }

    @Test
    public void optionBNotNull() {
        assertNotNull("Option B must not be null", question.getOptionMap().get("B"));
    }

    @Test
    public void optionCNotNull(){
        assertNotNull("Option C must not be null", question.getOptionMap().get("C"));
    }

    @Test
    public void optionDNotNull() {
        assertNotNull("Option D must not be null", question.getOptionMap().get("D"));
    }

    @Test
    public void optionENotNull(){
        assertNotNull("Optin E must not be null", question.getOptionMap().get("E"));
    }

    @Test
    public void optionMapNotNull() {
        assertNotNull("List of options must not be null", question.getOptionMap());
    }

    @Test
    public void selectedOptionNull() {
        assertNull("Selected option must be null", question.getSelectedOption());
    }

}
