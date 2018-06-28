package com.greenfoxacademy.gudetamagochi.services;

import com.greenfoxacademy.gudetamagochi.models.Gudetama;

public interface TamaService {

  void login(String name);
  Gudetama getTama(String name);
}
