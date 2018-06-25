package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

  AtomicLong atomicLong = new AtomicLong(1);

  @RequestMapping("/web/greeting")
  public String greeting(Model model1, @RequestParam("name") String name, Model model2) {
    model1.addAttribute("name", name);
    model2.addAttribute("id", atomicLong.getAndIncrement());
    return "greeting";
  }
}
