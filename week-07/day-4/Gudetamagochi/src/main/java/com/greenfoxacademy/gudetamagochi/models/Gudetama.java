package com.greenfoxacademy.gudetamagochi.models;

import java.util.ArrayList;
import java.util.List;

public class Gudetama {

  private String name;
  private String food;
  private String drink;
  private List<Trick> tricks;

  public Gudetama() {}

  public Gudetama(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public List<Trick> getTricks() {
    return tricks;
  }

  public void setTricks(List<Trick> tricks) {
    this.tricks = tricks;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
