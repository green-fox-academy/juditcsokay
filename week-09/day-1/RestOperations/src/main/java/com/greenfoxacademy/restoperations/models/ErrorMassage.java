package com.greenfoxacademy.restoperations.models;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ErrorMessages;

public class ErrorMassage implements Parent{

  private String error;

  public ErrorMassage(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
