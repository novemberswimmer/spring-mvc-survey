package org.november.swimmer.dao.test;

import org.junit.Before;
import org.junit.Test;
import org.november.swimmer.dao.SurveyResponse;

import static org.junit.Assert.*;

public class SurveyResponseTest {

    public static final String SID = "SID";
    public static final String QUESTION_ID = "question id";
    public static final String SELECTED_OPTION_ID = "selected option id";

    SurveyResponse response;

    @Before
    public void setUp(){
        response = new SurveyResponse(SID, QUESTION_ID, SELECTED_OPTION_ID);
    }

    @Test
    public void testSurveyResponseConstructor(){
         assertNotNull("Response cannot be null", response);
    }

    @Test
    public void testGetterSid(){
        assertEquals("SID must not be null after being set with non-null", response.getSid(),SID);
    }

    @Test
    public void testGetterQuestionId() {
        assertEquals("Question id must not be null after being set with non-null", response.getQuestionId(), QUESTION_ID);
    }

    @Test
    public void testGetterSelectedOption(){
        assertEquals("Selected Option must be equal to parameter in constructor", response.getSelectedOptionId(), SELECTED_OPTION_ID);
    }

    @Test
    public void testGetterId(){
        assertNull("Primary key must be null until after entity is persisted", response.getId());
    }

}
