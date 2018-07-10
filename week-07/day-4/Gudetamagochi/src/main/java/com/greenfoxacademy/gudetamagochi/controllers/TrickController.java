package com.greenfoxacademy.gudetamagochi.controllers;

import com.greenfoxacademy.gudetamagochi.models.Gudetama;
import com.greenfoxacademy.gudetamagochi.models.Trick;
import com.greenfoxacademy.gudetamagochi.repositories.TrickRepositoryImpl;
import com.greenfoxacademy.gudetamagochi.services.TamaService;
import com.greenfoxacademy.gudetamagochi.services.TamaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TrickController {

  private TamaService tamaService;

  @Autowired
  public TrickController(TamaServiceImpl tamaService) {
    this.tamaService = tamaService;
  }

  @Autowired
  private TrickRepositoryImpl trickRepository;

  @GetMapping("/{name}/trickcenter")
  public String renderTrickCenterPage(@PathVariable("name") String name, Model model) {
    Trick trick = new Trick();
    model.addAttribute("trickList", trickRepository.getTricks());
    model.addAttribute("gudetama", tamaService.getTama(name));
    return "trickcenter";
  }

  @PostMapping("/{name}/learn")
  public String learnTricks(@PathVariable("name") String name, @ModelAttribute String trickName) {
    Gudetama gudetama = tamaService.getTama(name);
    Trick trick = new Trick();
    trick.setName(trickName);
    gudetama.addTrick(trick);
    return "redirect:/" + name;
  }
}
