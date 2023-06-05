import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterbottleTest {
 Waterbottle waterbottle;

 @Before
 public void before() {
  waterbottle = new Waterbottle(100);
 }

 @Test
 public void hasVolume() {
  assertEquals(100, waterbottle.getVolume());
 }

 @Test
 public void newVolume() {
  waterbottle.takeDrink();
  assertEquals(90, waterbottle.getVolume());
 }

 @Test
 public void emptyDrink(){
 waterbottle.finishDrink();
 assertEquals(0, waterbottle.getVolume());}

 @Test
 public void refillDrink(){
  waterbottle.anotherDrink();
  assertEquals(100, waterbottle.getVolume() );}
}
