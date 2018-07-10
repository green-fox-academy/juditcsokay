package com.greenfoxacademy.gudetamagochi.repositories;

import org.springframework.stereotype.Component;

@Component
public class TrickRepositoryImpl {

  private String[] tricks = {"Being moody", "Being self-defeating", "Chillin'", "Restin' on toast"};

  public TrickRepositoryImpl() {
  }

  public String[] getTricks() {
    return tricks;
  }

  public void setTricks(String[] tricks) {
    this.tricks = tricks;
  }
}
