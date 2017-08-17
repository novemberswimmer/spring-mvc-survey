package org.november.swimmer.dto;

import org.november.swimmer.util.QuestionBuilder;

import java.util.HashMap;
import java.util.Map;

public class SurveyForm {

    private String sid;
    private Map<Integer,Question> questionMap;
    private QuestionBuilder questionBuilder = new QuestionBuilder();

    public SurveyForm(){
        questionMap = new HashMap<Integer, Question>();
        putFirstQuestion();
        putSecondQuestion();
    }

    private void putFirstQuestion() {
        questionBuilder.setQuestion("Question 1")
                .setOptionA("Choice A")
                .setOptionB("Choice B")
                .setOptionC("Choice C")
                .setOptionD("Choice D")
                .setOptionE("Choice E");

        Question question = questionBuilder.build();
        question.setSelectedOption("A");
        questionMap.put(1,question);
    }

    private void putSecondQuestion() {
        questionBuilder.setQuestion("Question 2")
                .setOptionA("Choice F")
                .setOptionB("Choice G")
                .setOptionC("Choice H")
                .setOptionD("Choice I")
                .setOptionE("Choice J");

        Question question = questionBuilder.build();
        questionMap.put(2,question);
    }


    public String getSid() {
        return sid;
    }

    public Map<Integer, Question> getQuestionMap() {
        return questionMap;
    }
}
