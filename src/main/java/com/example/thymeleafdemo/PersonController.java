package com.example.thymeleafdemo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class PersonController {

    @GetMapping
    String getPeople(Model model){
        model.addAttribute("something", "this is coming from the controller");
        return "people";
    }
}
