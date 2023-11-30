package com.nano.AI.Introduction;

import ch.qos.logback.core.model.Model;
import com.nano.AI.nanoAI.AI;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IntroductionController {

    @GetMapping("/")
    public ModelAndView introduction(Model model){
        AI nano = new AI();
        ModelAndView modelAndView = new ModelAndView("introduction/introduction.html");
        modelAndView.addObject("nano", nano);
        return modelAndView;
    }
}
