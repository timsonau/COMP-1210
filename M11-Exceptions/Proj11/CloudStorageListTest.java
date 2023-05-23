import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;
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
      
      Assert.assertArrayEquals(expectedCloudArray, actualCloudArray);
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
  
  /** TestsREadfile method and all the generate report methods. **/
  /** @throws FileNotFoundException when file isnt found. **/ 
   @Test public void readFileTest()throws FileNotFoundException
   {
      CloudStorageList myList = new CloudStorageList();
      myList.readFile("cloud_storage_data_2_exceptions.csv");
      String resultExpectedI = myList.generateReport();
      String resultExpectedII = myList.generateReportByName();
      String resultExpectedIII = myList.generateReportByMonthlyCost();
      String resultExpectedIIII = myList.generateInvalidRecordsReport();
      Assert.assertTrue(resultExpectedI.contains("Monthly Cloud Storage"));
      Assert.assertTrue(resultExpectedII.contains("Monthly Cloud Storage"));
      Assert.assertTrue(resultExpectedIII.contains("Monthly Cloud Storage"));
      Assert.assertTrue(resultExpectedIIII.contains("S,Cloud Two"));
   }
}
