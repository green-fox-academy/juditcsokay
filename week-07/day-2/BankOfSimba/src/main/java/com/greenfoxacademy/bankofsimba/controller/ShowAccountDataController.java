package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowAccountDataController {

  @RequestMapping("/show")
  public String show(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", "2000", "lion");
    model.addAttribute("bankAccount", bankAccount);
    return "show";
  }

  @RequestMapping("/utext")
  public String showTestText(Model model) {
    String testtext = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("testtext", testtext);
    return "utext";
  }
}
