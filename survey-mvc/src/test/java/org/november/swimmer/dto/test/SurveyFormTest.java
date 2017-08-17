package org.november.swimmer.dto.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.november.swimmer.dto.SurveyForm;


public class SurveyFormTest {

    private SurveyForm surveyForm;

    @Before
    public void setUp(){
        surveyForm = new SurveyForm();
    }

    @Test
    public void sidNull(){
        assertNull("SID is not null", surveyForm.getSid());
    }

    @Test
    public void questionListNotNull(){
        assertNotNull("List of question must not be null", surveyForm.getQuestionMap());
    }

}
