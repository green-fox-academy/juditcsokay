package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

  public List<BankAccount> bankaccounts;

  public MainController() {
    bankaccounts = new ArrayList<>();
    BankAccount nalaaccount = new BankAccount("Nala", "1800", "lion", false);
    BankAccount mufasaaccount = new BankAccount("Mufasa", "5000", "lion", true);
    BankAccount timonaccount = new BankAccount("Timon", "1500", "yellow mongoose", false);
    BankAccount pumbaaccount = new BankAccount("Pumba", "2300", "warthog", false);
    bankaccounts.add(nalaaccount);
    bankaccounts.add(mufasaaccount);
    bankaccounts.add(timonaccount);
    bankaccounts.add(pumbaaccount);
  }

  @RequestMapping("/show")
  public String show(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", "2000", "lion", false);
    model.addAttribute("bankAccount", bankAccount);
    return "show";
  }

  @RequestMapping("/utext")
  public String showTestText(Model model) {
    String testtext = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("testtext", testtext);
    return "utext";
  }

  @RequestMapping("/accountlist")
  public String showAccountList(Model model) {
    model.addAttribute("bankaccounts", bankaccounts);
    return "accountlist";
  }
}
