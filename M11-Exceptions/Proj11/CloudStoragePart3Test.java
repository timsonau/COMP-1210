import org.junit.Assert;
import org.junit.Test;

/** JUnit Test file that tests main method CloudStoragePart3. **/
public class CloudStoragePart3Test {

  /** Tests when no file has been inputed in the args.
    */
   @Test public void noFileTest()
   {
      String[] args1 = {};
      CloudStoragePart3.main(args1);
      Assert.assertEquals(SharedCloud.COST_FACTOR, 1, 0.000001);
   }
  
  
 /** Tests when a valid file has been inputed in the args.
   */ 
   @Test public void fileTest()
   {
      CloudStoragePart3 myApp = new CloudStoragePart3();
      String[] args2 = {"cloud_storage_data_2.csv"};
      CloudStoragePart3.main(args2);
      Assert.assertEquals(SharedCloud.COST_FACTOR, 1, 0.000001);
   }
  
/** Test when a invalid file has been inputed in the args.
  */ 
   @Test public void invalidFileName()
   {
      CloudStoragePart3 invalidName = new CloudStoragePart3();
      String[] args3 = {"cloud_storage_data_2.csv"};
      CloudStoragePart3.main(args3);
      Assert.assertEquals(SharedCloud.COST_FACTOR, 1, 0.000001);
   }
}