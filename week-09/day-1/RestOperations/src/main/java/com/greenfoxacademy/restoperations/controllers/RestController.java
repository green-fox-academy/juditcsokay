package com.greenfoxacademy.restoperations.controllers;


import com.greenfoxacademy.restoperations.models.Appended;
import com.greenfoxacademy.restoperations.models.Doubled;
import com.greenfoxacademy.restoperations.models.ErrorMassage;
import com.greenfoxacademy.restoperations.models.Welcome;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @GetMapping("/doubling")
  public Doubled getDouble(@RequestParam(value = "input") int value) {
    Doubled doubled = new Doubled(value);
    return doubled;
  }

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMassage vmi(MissingServletRequestParameterException ex) {
    return new ErrorMassage("Please provide an input!");
  }

  @GetMapping("/greeter")
  public Object getWelcome(@RequestParam(value = "title", required = false) String title, @RequestParam(value = "name", required = false) String name) {
    if (name == null) {
      return new ErrorMassage("Please provide a name!");
    } else if (title == null) {
      return new ErrorMassage("Please provide a title!");
    }
    Welcome welcome = new Welcome(name, title);
    return welcome;
  }

  @GetMapping("/appenda/{appendable}")
  public Appended getAppended(@PathVariable("appendable") String appendable) {
    if (appendable != null) {
      appendable = appendable + "a";
    }
    Appended appended = new Appended(appendable);
    return appended;
  }

}
