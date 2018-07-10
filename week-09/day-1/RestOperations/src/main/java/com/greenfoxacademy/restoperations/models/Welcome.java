package com.greenfoxacademy.restoperations.models;

public class Welcome implements Parent{

  private String welcome_message;

  public Welcome(String name, String title) {
    welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}
