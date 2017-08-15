package org.november.swimmer.dto;

import java.util.HashMap;
import java.util.Map;

public class SurveyForm {

    private String sid;
    private Map<Integer,Question> questionMap;

    public SurveyForm(){
        questionMap = new HashMap<Integer, Question>();
        putFirstQuestion();
        putSecondQuestion();
    }

    private void putFirstQuestion() {
        Question question = new Question("Question 1","Choice A", "Choice B", "Choice C", "Choice D", "Choice E");
        question.setSelectedOption("A");
        questionMap.put(1,question);
    }

    private void putSecondQuestion() {
        Question question = new Question("Question 2","Choice A", "Choice B", "Choice C", "Choice D", "Choice E");
        question.setSelectedOption("A");
        questionMap.put(2,question);
    }


    public String getSid() {
        return sid;
    }

    public Map<Integer, Question> getQuestionMap() {
        return questionMap;
    }
}
