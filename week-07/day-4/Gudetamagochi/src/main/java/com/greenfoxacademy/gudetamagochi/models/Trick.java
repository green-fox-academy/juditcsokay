package com.greenfoxacademy.gudetamagochi.models;

public class Trick {

  private String name;
  public String[] TRICKS = {"Being moody", "Being self-defeating", "Chillin'", "Restin' on toast"};

  public Trick() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
