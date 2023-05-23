import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;


/** JUnit File that tests all method of SharedCloud Class.**/
public class SharedCloudTest
{

   /** Tests all Getter methods for SharedCloud class. **/
   @Test public void getterTest()
   {
      SharedCloud c2 = new SharedCloud("Cloud 2", 9.00, 12.0, 20.0);
      Assert.assertEquals(12.0, c2.getDataStored(), 0.000001);
      Assert.assertEquals(20.0, c2.getDataLimit(), 0.000001);
      Assert.assertEquals(1.0, c2.getCostFactor(), 0.000001);
   }
  
  /** Tests all Setter methods for SharedCloud class. **/ 
   @Test public void setterTest()
   {
      SharedCloud c2 = new SharedCloud("setter test", 0.00, 0.00, 0.00);
      c2.setDataLimit(50.0);
      c2.setDataStored(25.0);
      Assert.assertEquals(50.0, c2.getDataLimit(), 0.000001);
      Assert.assertEquals(25.0, c2.getDataStored(), 0.000001);
   }
  
  /** Tests dataOverage method. **/ 
   @Test public void dataOverageTest()
   {
      SharedCloud c2 = new SharedCloud("Data Overuse", 9.00, 35.0, 20.0);
      Assert.assertEquals(15.0, c2.dataOverage(), 0.000001);
      SharedCloud c3 = new SharedCloud("Data underuse", 9.00, 10.00, 30.00);
      Assert.assertEquals(0, c3.dataOverage(), 0.000001);
   }
   
   /** Tests monthlyCost method. **/
   @Test public void monthlyCostTest()
   {
      SharedCloud c2 = new SharedCloud("monthly cost", 9.00, 25.0, 20.0);
      Assert.assertEquals(14.00, c2.monthlyCost(), 0.000001);
   
   }
   
   /** Tests toString method. **/
   @Test public void toStringTest()
   {
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 25.0, 20.0);
      Assert.assertEquals("Cloud Two (class SharedCloud) Monthly Cost: $14.00"
                        + "\nBase Storage Cost: $9.00"
                        + "\nData Stored: 25.000 GB"
                        + "\nData Limit: 20.000 GB"
                        + "\nOverage: 5.000 GB"
                        + "\nCost Factor: 1.0", c2.toString());
   
   }
}
