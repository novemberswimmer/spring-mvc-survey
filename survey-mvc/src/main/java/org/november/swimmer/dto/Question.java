package org.november.swimmer.dto;

import java.util.HashMap;
import java.util.Map;

public class Question {

    private String questionText;
    private Map<String, String> optionMap = new HashMap<>();

    public Question(String questionText, String choice_a, String choice_b, String choice_c, String choice_d, String choice_e) {
        this.questionText = questionText;
        optionMap.put("A", choice_a);
        optionMap.put("B", choice_b);
        optionMap.put("C", choice_c);
        optionMap.put("D", choice_d);
        optionMap.put("E", choice_e);
    }

    public String getQuestionText() {
        return questionText;
    }

    public Map<String, String> getOptionMap() {
        return optionMap;
    }
}
