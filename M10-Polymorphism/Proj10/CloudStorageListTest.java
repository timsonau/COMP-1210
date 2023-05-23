import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;

/** JUnit test file that tests mehotds in CloudStorageList. **/
public class CloudStorageListTest {


   /** Tests all the getter Methods. **/
   @Test public void gettersTest() {
      CloudStorageList myList = new CloudStorageList();
      
      CloudStorage[] expectedCloudArray = new CloudStorage[0];
      String[] expectedStringArray = new String[0];
      
      Assert.assertArrayEquals(expectedCloudArray,
          myList.getCloudStorageArray());
      Assert.assertArrayEquals(expectedStringArray,
          myList.getInvalidRecordsArray());
   }
    
   /** Tests addCloudStorage method. **/
   @Test public void addCloudStorageTest()
   {
      CloudStorageList myList = new CloudStorageList();
      myList.addCloudStorage(new DedicatedCloud("Cloud 1", 10.0, 15.0));
      
      CloudStorage[] expectedCloudArray = new CloudStorage[1];
      expectedCloudArray[0] = new DedicatedCloud("Cloud 1", 10.0, 15.0);
   
      CloudStorage[] actualCloudArray = myList.getCloudStorageArray();
      
      Assert.assertEquals(expectedCloudArray[0].getName(),
          actualCloudArray[0].getName());
      Assert.assertEquals(expectedCloudArray[0].getBaseStorageCost(),
          actualCloudArray[0].getBaseStorageCost(), 0.000001);
      Assert.assertEquals(expectedCloudArray[0].monthlyCost(),
          actualCloudArray[0].monthlyCost(), 0.000001);
   }
   
   /** Tests addInvalidRecord method. **/
   @Test public void addInvalidRecordTest()
   {
      CloudStorageList myList = new CloudStorageList();
      myList.addInvalidRecord("yoloyolo");
      
      String[] expectedStringArray = new String[1];
      expectedStringArray[0] = "yoloyolo";
      
      Assert.assertArrayEquals(expectedStringArray,
          myList.getInvalidRecordsArray());
   
   }
}
