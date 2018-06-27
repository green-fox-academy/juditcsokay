package com.greenfoxacademy.dependencyinjection.controllers;

import com.greenfoxacademy.dependencyinjection.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BackgroundColorController {

  @Autowired
  UtilityService service;

  String[] colors = {"DodgerBlue", "Violet", "Yellow", "Orange", "Tomato", "MediumSeaGreen", "SlateBlue", "GreenYellow", "LightBlue", "Salmon", "Turquoise"};

  @RequestMapping("/useful")
  public String showIndexPage() {
    return "index";
  }

  @RequestMapping("/useful/colored")
  public String greeting(Model model) {
    model.addAttribute("color", service.randomColor());
    return "colored";
  }

}
