package com.greenfoxacademy.dependencyinjection.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BackgroundColorController {

  String[] colors = {"DodgerBlue", "Violet", "Yellow", "Orange", "Tomato", "MediumSeaGreen", "SlateBlue", "GreenYellow", "LightBlue", "Salmon", "Turquoise"};

  @RequestMapping("/useful")
  public String showIndexPage() {
    return "index";
  }

  @RequestMapping("/useful/colored")
  public String greeting(Model model) {
    model.addAttribute("color", colors[(int)(Math.random() * colors.length)]);
    return "colored";
  }

}
