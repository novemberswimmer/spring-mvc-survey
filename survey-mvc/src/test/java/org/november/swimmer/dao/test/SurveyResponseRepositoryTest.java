package org.november.swimmer.dao.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.november.swimmer.dao.SurveyResponseRepository;
import org.november.swimmer.dao.SurveyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class SurveyResponseRepositoryTest {

    public static final String SID = "SID";
    public static final String QUESTION_ID = "question id";
    public static final String SELECTED_OPTION_ID = "selected option id";

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private SurveyResponseRepository surveyRepo;


    SurveyResponse response;

    @Before
    public void setUp(){
        response = new SurveyResponse(SID, QUESTION_ID, SELECTED_OPTION_ID);
    }

    @Test
    public void saveNewSurveyResponse(){
        surveyRepo.save(response);
        assertTrue(true);
    }

    @Test
    public void findBySid(){
        surveyRepo.save(response);
        response = surveyRepo.findBySid(SID);
        assertNotNull("Id must be generated after record being saved",response.getId());
    }
    
    @Test
    public void incrementRecordCountAfterInsert(){
        Long numberOfRecordsBeforeInsert = surveyRepo.findAll().spliterator().getExactSizeIfKnown();
        surveyRepo.save(response);
        Long numberOfRecordsAfterInsert = surveyRepo.findAll().spliterator().getExactSizeIfKnown();
        assertTrue("Number of Survey Response in table must increase after insert",numberOfRecordsAfterInsert>numberOfRecordsBeforeInsert);
    }
}
