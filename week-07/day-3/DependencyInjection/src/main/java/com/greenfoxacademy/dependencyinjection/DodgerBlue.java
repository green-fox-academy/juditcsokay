package com.greenfoxacademy.dependencyinjection;

import com.greenfoxacademy.dependencyinjection.services.MyColor;
import com.greenfoxacademy.dependencyinjection.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DodgerBlue implements MyColor {

  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    printer.log("It is DodgerBlue in color...");
  }
}
