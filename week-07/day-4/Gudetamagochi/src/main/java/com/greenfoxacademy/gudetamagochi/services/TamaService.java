package com.greenfoxacademy.gudetamagochi.services;

import com.greenfoxacademy.gudetamagochi.models.Gudetama;
import com.greenfoxacademy.gudetamagochi.models.Trick;

public interface TamaService {

  void login(String name);
  Gudetama getTama(String name);
  void addTrickToTama(Trick trick, String tamaName);
}
