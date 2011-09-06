package com.springinaction.chapter01.knight;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;


public class KnightApp {
  private static final org.apache.log4j.Logger LOGGER = org.apache.log4j.Logger
      .getLogger(KnightApp.class);
  
  public static void main(String[] args) throws Exception {
    LOGGER.debug("Running KnightApp");
    
    BeanFactory factory =
        new XmlBeanFactory(new FileSystemResource("knight.xml"));

    Knight knight =
        (Knight) factory.getBean("knight");

    knight.embarkOnQuest();
    
    LOGGER.debug("KnightApp Finished");
  }
}