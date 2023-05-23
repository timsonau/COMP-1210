import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/** JUnit Test file that tests main method CloudStoragePart2. **/
public class CloudStoragePart2Test {

   /** Tests when no file has been inputed in the args.**/ 
   /** @throws FileNotFoundException used to scan file **/
   @Test public void noFileTest()throws FileNotFoundException
   {
      String[] args1 = {};
      CloudStoragePart2.main(args1);
      Assert.assertEquals(SharedCloud.COST_FACTOR, 1, 0.000001);
   }
  
  /** Test when a file has been inputed in the args.**/
  /** @throws FileNotFoundException used to scan file **/ 
   @Test public void fileTest()throws FileNotFoundException
   {
      CloudStoragePart2 myApp = new CloudStoragePart2();
      String[] args2 = {"cloud_storage_data_1.csv"};
      CloudStoragePart2.main(args2);
      Assert.assertEquals(SharedCloud.COST_FACTOR, 1, 0.000001);
   }
}
