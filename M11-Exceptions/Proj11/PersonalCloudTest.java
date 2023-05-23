import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;

/** JUnit File that tests all method of PersonalCloud Storage.**/
public class PersonalCloudTest {


   /** Tests getCostFactor method of PersonalCloud Class. **/
   @Test public void getCostFactorTest()
   {
      PersonalCloud c5 = new PersonalCloud("cloud test", 9.00, 8.0, 30.0);
      Assert.assertEquals(3, c5.getCostFactor(), 0.00001);
   }
   
   /** Tests monthlyCost method of PersonalCloud class. **/
   @Test public void monthlyCostTest()
   {
      PersonalCloud c5 = new PersonalCloud("Cloud test", 9.00, 21.0, 20);
      Assert.assertEquals(12, c5.monthlyCost(), 0.000001);
   }
}
