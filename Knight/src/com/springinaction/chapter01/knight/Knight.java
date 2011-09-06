package com.springinaction.chapter01.knight;


public interface Knight {
  public Object embarkOnQuest() throws QuestException;
  public String getName();
}
