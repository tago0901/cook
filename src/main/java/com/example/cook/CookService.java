package com.example.cook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class CookService {

    @Autowired
    private CookRepository cookRepository;

    public ModelAndView getCooks() {
        List<Cook> cook = cookRepository.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("cook", cook);
        mv.setViewName("cook");
        return mv;

    }
    // public List<Cook> getAllCooks() {
    // return cookRepository.findAll();
    // }
}
