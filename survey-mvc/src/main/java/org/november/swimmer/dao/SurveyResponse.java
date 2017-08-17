package org.november.swimmer.dao;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Survey_Response")
public class SurveyResponse implements Serializable {


    private static final long serialVersionUID = -4256700755763429156L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="sid")
    private String sid;

    @Column(name="questionId")
    private String questionId;

    @Column(name="selectedOptionId")
    private String selectedOptionId;

    public SurveyResponse(String sid, String question_id, String selected_option_id) {
        this.sid = sid;
        this.questionId = question_id;
        this.selectedOptionId = selected_option_id;
    }

    public String getSid() {
        return sid;
    }

    public String getQuestionId() {
        return questionId;
    }

    public String getSelectedOptionId() {
        return selectedOptionId;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "SurveyResponse{" +
                "id=" + id +
                ", sid='" + sid + '\'' +
                ", questionId='" + questionId + '\'' +
                ", selectedOptionId='" + selectedOptionId + '\'' +
                '}';
    }
}
