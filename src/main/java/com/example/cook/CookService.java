package com.example.cook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CookService {

    @Autowired
    private CookRepository cookRepository;

    public List<Cook> getAllCooks() {
        return cookRepository.findAll();
    }
}
