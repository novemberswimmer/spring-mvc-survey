package org.november.swimmer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SurveyController {

    @RequestMapping("/home")
    public String getHome(){
        return "home";
    }
}
