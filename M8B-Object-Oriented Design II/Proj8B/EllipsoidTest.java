import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** J.Unit File testing Ellipsoid.class.
  * project 8a
  * Heeyoon Son LLB 3
  */

public class EllipsoidTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** Tests getter method in Ellipsoid class. **/
   @Test public void getTest()
   {
      Ellipsoid e = new Ellipsoid("Test", 1, 2, 3);
      Assert.assertEquals(1, e.getA(), .000001);
      Assert.assertEquals(2, e.getB(), .000001);
      Assert.assertEquals(3, e.getC(), .000001);
      Assert.assertEquals("Test", e.getLabel());
      
   }
  
   /** Tests getCount method in Ellipsoid class. **/
   @Test public void getCountTest()
   {
      Ellipsoid.resetCount();
      Ellipsoid e = new Ellipsoid("Test", 1, 2, 3);
      Assert.assertEquals(1, e.getCount());
   }
   
   /** Tests setter method in Ellipsoid class. **/
   @Test public void setTest()
   {
      Ellipsoid e = new Ellipsoid("Test", 1, 2, 3);
      Assert.assertEquals(true, e.setA(3));
      Assert.assertEquals(false, e.setA(0));
      Assert.assertEquals(true, e.setB(3));
      Assert.assertEquals(false, e.setB(0));
      Assert.assertEquals(true, e.setC(3));
      Assert.assertEquals(false, e.setC(0));
      Assert.assertEquals(true, e.setLabel("yoyo"));
      Assert.assertEquals(false, e.setLabel(null));
   }
   
   /** Tests resetCounter method in Ellipsoid class. **/
   @Test public void resetCountTest()
   {
      Ellipsoid e = new Ellipsoid("Test", 1, 2, 3);
      e.resetCount();
      Assert.assertEquals(0, Ellipsoid.getCount());
   }
  
  /** Tests volume method in Ellipsoid class. **/ 
   @Test public void volumeTest()
   {
      Ellipsoid e = new Ellipsoid("Test", 1, 2, 3);
      Assert.assertEquals(25.13274123, e.volume(), .000001);
   }
  
  /** Tests surfaceArea method in Ellipsoid class. **/ 
   @Test public void surfaceAreaTest()
   {
      Ellipsoid e = new Ellipsoid("Test", 1, 2, 3);
      Assert.assertEquals(48.9366254, e.surfaceArea(), .000001);
   }
  
  /** Tests toString method in Ellipsoid class. **/ 
   @Test public void toStringTest()
   {
      Ellipsoid e = new Ellipsoid("Test", 1, 2, 3);
      Assert.assertEquals("Ellipsoid \"Test\" with axes a = 1.0"
         + ", b = 2.0, c = 3.0 units has:\n\tvolume = " 
         + "25.1327 cubic units\n\tsurface area = 48.9366 square units", 
            e.toString());
   }
  
  /** Tests hashCode method in Ellipsoid class. **/ 
   @Test public void hashCodeTest()
   {
      Ellipsoid e = new Ellipsoid("Test", 1, 2, 3);
      Assert.assertEquals(0, e.hashCode());
   }
   
  /** Tests equals method in Ellipsoid class. **/
   @Test public void equalsTest()
   {
      Ellipsoid e1 = new Ellipsoid("Test1", 1, 2, 3);
      Ellipsoid e2 = new Ellipsoid("Test1", 1, 2, 3);
      Assert.assertEquals(true, e1.equals(e2));
      e2 = new Ellipsoid("TestFail", 9, 9, 9); 
      Assert.assertEquals(false, e1.equals(e2));
      e2 = new Ellipsoid("Test1", 9, 9, 9);
      Assert.assertEquals(false, e1.equals(e2));
      e2 = new Ellipsoid("Test1", 1, 9, 9);
      Assert.assertEquals(false, e1.equals(e2));
      e2 = new Ellipsoid("Test1", 1, 2, 9);
      Assert.assertEquals(false, e1.equals(e2));
      
      Assert.assertEquals(false, e1.equals("fail"));
   }
}
