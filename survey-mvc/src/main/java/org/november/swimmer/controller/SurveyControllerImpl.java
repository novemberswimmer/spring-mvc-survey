package org.november.swimmer.controller;

import org.november.swimmer.dto.Question;
import org.november.swimmer.dto.SurveyForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SurveyControllerImpl implements SurveyController {



    @RequestMapping("/home")
    public String getHome(Model model){
        SurveyForm surveyForm = new SurveyForm();
        model.addAttribute("surveyForm", surveyForm);
        return "home";
    }

    @RequestMapping(value="/submitSurvey", method= RequestMethod.POST)
    public String postHome(@ModelAttribute("surveyForm") SurveyForm surveyForm, Model model) {
        model.addAttribute("surveyForm", surveyForm);
        return "surveyConfirm";
    }
}
