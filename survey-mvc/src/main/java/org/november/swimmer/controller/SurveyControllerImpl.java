package org.november.swimmer.controller;

import org.november.swimmer.dto.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SurveyControllerImpl implements SurveyController {


    @ModelAttribute("questionList")
    public List<Question>  addQuestionsToModel() {
        List<Question> questionList = new ArrayList();
        Question question1 = new Question("What is the Question", "Answer is A", "Answer is B", "Answer is C", "Answer is D", "Answer is E");
        questionList.add(question1);
       return questionList;
    }

    @RequestMapping("/home")
    public String getHome(Model model){
        model.addAttribute("answerGiven", null);
        return "home";
    }
}
