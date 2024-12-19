package com.example.cook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CookController {

    @Autowired
    private CookService cookService;

    @RequestMapping("/")
    public ModelAndView index(ModelAndView mv) {
        mv.setViewName("start");
        return mv;
    }

    @RequestMapping("/menu")
    public ModelAndView menu(ModelAndView mv) {
        List<Cook> cook = cookService.getAllCooks();
        mv.addObject("cook", cook);
        mv.setViewName("cook");
        return mv;
    }

}
