import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;

/** JUnit File that tests all method of CloudStorage & DedicatedStorage.**/
public class DedicatedCloudTest 
{
   /**Tests the getter methods for DedicatedCloud class & its parent classes.**/
   @Test public void gettersTest()
   {
      DedicatedCloud.resetCount();
      DedicatedCloud c1 = new DedicatedCloud("Cloud one", 40.00, 10.00);
      Assert.assertEquals("Cloud one", c1.getName());
      Assert.assertEquals(40.00, c1.getBaseStorageCost(), 0.000001);
      Assert.assertEquals(1, CloudStorage.getCount());
      Assert.assertEquals(10.00, c1.getServerCost(), 0.000001);
   }
  
  /**Tests the setter methods for DedicatedCloud class & its parent classes.**/
   @Test public void settersTest()
   {
      DedicatedCloud c1 = new DedicatedCloud("Cloud fail", 0, 0);
      
      c1.setName("Cloud one");
      Assert.assertEquals("Cloud one", c1.getName());
      
      c1.setBaseStorageCost(40.00);
      Assert.assertEquals(40.00, c1.getBaseStorageCost(), 0.000001);
      
      c1.setServerCost(25.00);
      Assert.assertEquals(25.00, c1.getServerCost(), 0.000001);
      
      DedicatedCloud.resetCount();
      Assert.assertEquals(0, DedicatedCloud.getCount());
   
   }
  
  /**Tests monthlyCostTest method.**/ 
   @Test public void monthlyCostTest()
   {
      DedicatedCloud c1 = new DedicatedCloud("Cloud one", 40.00, 10.00);
      Assert.assertEquals(50.00, c1.monthlyCost(), 0.000001);
   }
   
  /**Tests the toString method.**/
   @Test public void toStringTest()
   {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      Assert.assertEquals("Cloud One "
                  + "(class DedicatedCloud) Monthly Cost: $50.00"
                  + "\nBase Storage Cost: $40.00"
                  + "\nServer Cost: $10.00", c1.toString());
   }
  
  /**Tests compareTo method. **/ 
   @Test public void compareToTest()
   {
      DedicatedCloud c1 = new DedicatedCloud("a cloud", 40.00, 10.00);
      DedicatedCloud c2 = new DedicatedCloud("B cloud", 50.00, 15.00);
      Assert.assertEquals(-1, c1.compareTo(c2));
      Assert.assertEquals(1, c2.compareTo(c1));
      c2.setName("A cloud");
      Assert.assertEquals(0, c2.compareTo(c1));
   }
   
  /**Tests hashCode method. **/
   @Test public void hashCodeTest()
   {
      DedicatedCloud c1 = new DedicatedCloud("a cloud", 40.00, 10.00);
      Assert.assertEquals(0, c1.hashCode());
   }
   
  /**Tests equalsTest method. **/
   @Test public void equalsTest()
   {
      String fail = "fail";
      DedicatedCloud c1 = new DedicatedCloud("a cloud", 40.00, 10.00);
      Assert.assertEquals(false, c1.equals(fail));
   
   }
}
