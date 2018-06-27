package com.greenfoxacademy.dependencyinjection.controllers;

import com.greenfoxacademy.dependencyinjection.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CeasarCodingController {

  @Autowired
  UtilityService service;

  @GetMapping(value="/useful")
  public String encodingText(Model model, @RequestParam("text") String text, @RequestParam("number") int number) {
    model.addAttribute("text", text);
    model.addAttribute("number", number);
    model.addAttribute("resultText", service.caesar(text, number));
    return "index";
  }
}
