package com.springinaction.chapter01.knight;


public class GrailNotFoundException extends QuestException {
  public GrailNotFoundException() {}
  
  public GrailNotFoundException(String message) {
    super(message);
  }
}
