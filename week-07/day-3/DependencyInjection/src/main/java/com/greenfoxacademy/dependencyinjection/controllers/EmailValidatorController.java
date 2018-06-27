package com.greenfoxacademy.dependencyinjection.controllers;

import com.greenfoxacademy.dependencyinjection.services.UtilityService;
import com.sun.deploy.uitoolkit.impl.awt.UIToolkitImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailValidatorController {

  @Autowired
  UtilityService service;

  @GetMapping(value="/useful/email")
  public String greeting(Model model, @RequestParam("email") String email) {
    model.addAttribute("email", email);
    model.addAttribute("isValid", service.isValid(email));
    return "email";
  }
}
