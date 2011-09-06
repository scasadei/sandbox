package com.springinaction.chapter01.knight;
import com.springinaction.chapter01.knight.HolyGrail;
import com.springinaction.chapter01.knight.HolyGrailQuest;
import com.springinaction.chapter01.knight.KnightOfTheRoundTable;
import com.springinaction.chapter01.knight.QuestException;

import junit.framework.TestCase;


public class KnightOfTheRoundTableTest extends TestCase {
  public void testEmbarkOnQuest() {
    KnightOfTheRoundTable knight = new KnightOfTheRoundTable("Bedivere");
    
    knight.setQuest(new HolyGrailQuest());
    
    try {
      HolyGrail grail = (HolyGrail) knight.embarkOnQuest();
      
      assertNotNull(grail);
      
      assertTrue(grail.isHoly());
    } catch (QuestException e) {
      fail();
    }
  }
}
