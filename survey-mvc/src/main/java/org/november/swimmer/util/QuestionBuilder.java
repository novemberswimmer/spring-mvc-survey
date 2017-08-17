package org.november.swimmer.util;

import org.november.swimmer.dto.Question;

public class QuestionBuilder {

    private String question;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String optionE;

    public QuestionBuilder setQuestion(String question) {
        this.question = question;
        return this;
    }

    public Question build() {
        return new Question(this.question,this.optionA, this.optionB, this.optionC, this.optionD, this.optionE);
    }

    public QuestionBuilder setOptionA(String optionA) {
        this.optionA = optionA;
        return this;
    }

    public QuestionBuilder setOptionB(String optionB) {
        this.optionB = optionB;
        return this;
    }

    public QuestionBuilder setOptionC(String optionC) {
        this.optionC = optionC;
        return this;
    }

    public QuestionBuilder setOptionD(String optionD) {
        this.optionD = optionD;
        return this;
    }

    public QuestionBuilder setOptionE(String optionE) {
        this.optionE = optionE;
        return this;
    }
}
