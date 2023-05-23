import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;

/** JUnit Test file that tests Methods in MonthlyCostComparatorClass. **/
public class MonthlyCostComparatorTest {

   /** Tests monthlyCostComparator method. **/
   @Test public void monthlyCostComparatorTest()
   {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 15.00, 25.00);
      DedicatedCloud c2 = new DedicatedCloud("Cloud Two", 9.00, 10.00);
      MonthlyCostComparator myMCC = new MonthlyCostComparator();
      
      Assert.assertEquals(-1, myMCC.compare(c1, c2));
      
      Assert.assertEquals(1, myMCC.compare(c2, c1));
      
      c2.setServerCost(25.00);
      c2.setBaseStorageCost(15.00);
      
      Assert.assertEquals(0, myMCC.compare(c1, c2));
   }
}
