import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;

/** JUnit File that tests all method of PublicCloud Storage.**/
public class PublicCloudTest {


   /** Tests getCostFactor method of PublicCloud Class. **/
   @Test public void getCostFactorTest() {
      PublicCloud c4 = new PublicCloud("Clouds Four", 9.00, 25.00, 30.00);
      Assert.assertEquals(2, c4.getCostFactor(), 0.000001);
   }
   
   /** Tests monthlyCost method of Public Cloud class. **/
   @Test public void monthlyCostTest()
   {
      PublicCloud c4 = new PublicCloud("Cloud test", 9.00, 30.00, 25);
      Assert.assertEquals(19, c4.monthlyCost(), 0.000001);
   }
   
}