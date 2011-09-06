package com.springinaction.chapter01.knight;


public class QuestException extends Exception {
  public QuestException() {}
  
  public QuestException(String message) {
    super(message);
  }
}
