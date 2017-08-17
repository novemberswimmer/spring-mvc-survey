package org.november.swimmer.util.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.november.swimmer.dto.Question;
import org.november.swimmer.util.QuestionBuilder;

public class QuestionBuilderTest {

    public static final String QUESTION_TEST = "Question Test";
    public static final String OPTION_A = "Option A";
    public static final String OPTION_B = "Option B";
    public static final String OPTION_C = "Option C";
    public static final String OPTION_D = "Option D";
    public static final String OPTION_E = "Option E";
    private QuestionBuilder questionBuilder;

    @Before
    public void testDefaultConstructor(){
        questionBuilder = new QuestionBuilder();
    }

    @Test(expected = NullPointerException.class)
    public void testNullQuestionBuilder(){
        questionBuilder  = null;
        questionBuilder.setQuestion(QUESTION_TEST);
    }

    @Test
    public void testBuildWithQuestion(){
        questionBuilder.setQuestion(QUESTION_TEST);
        Question question  = questionBuilder.build();
        assertEquals("Question must be equal with builder and concreate Question class", QUESTION_TEST, question.getQuestionText());
    }

    @Test
    public void testBuildWithQuestionChoices_NotSet(){
        questionBuilder.setQuestion(QUESTION_TEST);
        Question question = questionBuilder.build();
        assertEquals("Question must be equal with builder and concreate Question class", QUESTION_TEST, question.getQuestionText());
        assertNull("Choice A not set it must be null", question.getOptionMap().get("A"));
        assertNull("Choice B not set it must be null", question.getOptionMap().get("B"));
        assertNull("Choice C not set it must be null", question.getOptionMap().get("C"));
        assertNull("Choice D not set it must be null", question.getOptionMap().get("D"));
        assertNull("Choice E not set it must be null", question.getOptionMap().get("E"));
    }

    @Test
    public void testBuildWithQuestionChoices_A(){
        questionBuilder.setQuestion(QUESTION_TEST).setOptionA(OPTION_A);
        Question question = questionBuilder.build();
        assertEquals("Question must be equal with builder and concreate Question class", QUESTION_TEST, question.getQuestionText());
        assertEquals("Choice A must be equal with builder and concreate Question class", OPTION_A, question.getOptionMap().get("A"));
    }

    @Test
    public void testBuildWithQuestionChoices_A_B(){
        questionBuilder.setQuestion(QUESTION_TEST).setOptionA(OPTION_A).setOptionB(OPTION_B);
        Question question = questionBuilder.build();
        assertEquals("Question must be equal with builder and concreate Question class", QUESTION_TEST, question.getQuestionText());
        assertEquals("Choice A must be equal with builder and concreate Question class", OPTION_A, question.getOptionMap().get("A"));
        assertEquals("Choice B must be equal with builder and concreate Question class", OPTION_B, question.getOptionMap().get("B"));

    }

    @Test
    public void testBuildWithQuestionChoices_A_B_C(){
        questionBuilder.setQuestion(QUESTION_TEST).setOptionA(OPTION_A).setOptionB(OPTION_B).setOptionC(OPTION_C);
        Question question = questionBuilder.build();
        assertEquals("Question must be equal with builder and concreate Question class", QUESTION_TEST, question.getQuestionText());
        assertEquals("Choice A must be equal with builder and concreate Question class", OPTION_A, question.getOptionMap().get("A"));
        assertEquals("Choice B must be equal with builder and concreate Question class", OPTION_B, question.getOptionMap().get("B"));
        assertEquals("Choice B must be equal with builder and concreate Question class", OPTION_C, question.getOptionMap().get("C"));

    }

    @Test
    public void testBuildWithQuestionChoices_A_B_C_D(){
        questionBuilder.setQuestion(QUESTION_TEST).setOptionA(OPTION_A).setOptionB(OPTION_B).setOptionC(OPTION_C)
        .setOptionD(OPTION_D);
        Question question = questionBuilder.build();
        assertEquals("Question must be equal with builder and concreate Question class", QUESTION_TEST, question.getQuestionText());
        assertEquals("Choice A must be equal with builder and concreate Question class", OPTION_A, question.getOptionMap().get("A"));
        assertEquals("Choice B must be equal with builder and concreate Question class", OPTION_B, question.getOptionMap().get("B"));
        assertEquals("Choice C must be equal with builder and concreate Question class", OPTION_C, question.getOptionMap().get("C"));
        assertEquals("Choice D must be equal with builder and concreate Question class", OPTION_D, question.getOptionMap().get("D"));
    }

    @Test
    public void testBuildWithQuestionChoices_A_B_C_D_E(){
        questionBuilder.setQuestion(QUESTION_TEST).setOptionA(OPTION_A).setOptionB(OPTION_B).setOptionC(OPTION_C)
                .setOptionD(OPTION_D).setOptionE(OPTION_E);
        Question question = questionBuilder.build();
        assertEquals("Question must be equal with builder and concreate Question class", QUESTION_TEST, question.getQuestionText());
        assertEquals("Choice A must be equal with builder and concreate Question class", OPTION_A, question.getOptionMap().get("A"));
        assertEquals("Choice B must be equal with builder and concreate Question class", OPTION_B, question.getOptionMap().get("B"));
        assertEquals("Choice C must be equal with builder and concreate Question class", OPTION_C, question.getOptionMap().get("C"));
        assertEquals("Choice D must be equal with builder and concreate Question class", OPTION_D, question.getOptionMap().get("D"));
        assertEquals("Choice D must be equal with builder and concreate Question class", OPTION_E, question.getOptionMap().get("E"));
    }
}
