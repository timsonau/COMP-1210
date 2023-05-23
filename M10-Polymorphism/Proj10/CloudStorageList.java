import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
/*****************************************************************************
 * Provides methods for reading in the data fileand generating reports.
 * Author: Tim Son
 * Created on 4/10/2020
 * LLB 003
 *****************************************************************************/
public class CloudStorageList
{
   private CloudStorage[] cloudStorageArray;
   private String[] invalidRecordsArray;
 
 /*****************************************************************************
  * Constructor method that sets cloudStorageArray and invalidRecordArray.
  *****************************************************************************/
   public CloudStorageList()
   {
      cloudStorageArray = new CloudStorage[0];
      invalidRecordsArray = new String[0];
   }
   
 /*****************************************************************************
  * Returns the Array with CloudStorage objects.
  * @return cloudStorageArray
  *****************************************************************************/
   public CloudStorage[] getCloudStorageArray()
   {
      return cloudStorageArray;
   }
  
 /*****************************************************************************
  * Returns the Array with invalid record from the data file in String.
  * @return invalidRecordArray
  *****************************************************************************/
   public String[] getInvalidRecordsArray()
   {
      return invalidRecordsArray;
   }
 
 /*****************************************************************************
  * adds an CloudStorage Object to the CloudStorageArray.
  * @param cloudStorageIn accepts any cloudStorage object and it's subclasses
  *****************************************************************************/
   public void addCloudStorage(CloudStorage cloudStorageIn)
   {
      cloudStorageArray = Arrays.copyOf(cloudStorageArray,
                                        cloudStorageArray.length + 1);
      cloudStorageArray[cloudStorageArray.length - 1] = cloudStorageIn;
   }
  
 /*****************************************************************************
  * adds an String object with Invalid Record in InvalidRecordArray.
  * @param invalidRecordIn invalid records. 
  *****************************************************************************/
   public void addInvalidRecord(String invalidRecordIn)
   {
      invalidRecordsArray = Arrays.copyOf(invalidRecordsArray,
                                         invalidRecordsArray.length + 1);
      invalidRecordsArray[invalidRecordsArray.length - 1] = invalidRecordIn;
   }
   
/**
  * Reads file and creates an list of Ellipsoid Objects.
  * @throws FileNotFoundException used to scan file
  * @param fileName the file's name
  */ 
   public void readFile(String fileName) 
            throws FileNotFoundException
   {
      Scanner readFile = new Scanner(new File(fileName));
      String cloudType;
      
      String nameIn;
      double baseStorageCostIn;
      double serverCostIn;
      double dataStoredIn;
      double dataLimitIn;
      
      while (readFile.hasNextLine())
      {
         String line = readFile.nextLine();
         Scanner nextDelimiter = new Scanner(line).useDelimiter(",");
         cloudType = nextDelimiter.next();
         char category = cloudType.charAt(0);
         
         switch (category)
         {
            case 'D':
               nameIn = nextDelimiter.next();
               baseStorageCostIn = Double.parseDouble(nextDelimiter.next());
               serverCostIn = Double.parseDouble(nextDelimiter.next());
               
               DedicatedCloud fileDedicatedCloud = new DedicatedCloud(nameIn,
                                             baseStorageCostIn, serverCostIn);
               addCloudStorage(fileDedicatedCloud);
               
               break;
         
            case 'S':
               nameIn = nextDelimiter.next();
               baseStorageCostIn = Double.parseDouble(nextDelimiter.next());
               dataStoredIn = Double.parseDouble(nextDelimiter.next());
               dataLimitIn = Double.parseDouble(nextDelimiter.next());
               
               SharedCloud fileSharedCloud = new SharedCloud(nameIn,
                            baseStorageCostIn, dataStoredIn, dataLimitIn);
               addCloudStorage(fileSharedCloud); 
               
               break;
         
            case 'C':
               nameIn = nextDelimiter.next();
               baseStorageCostIn = Double.parseDouble(nextDelimiter.next());
               dataStoredIn = Double.parseDouble(nextDelimiter.next());
               dataLimitIn = Double.parseDouble(nextDelimiter.next());
               
               PublicCloud filePublicCloud = new PublicCloud(nameIn,
                           baseStorageCostIn, dataStoredIn, dataLimitIn);
               addCloudStorage(filePublicCloud); 
               
               break;
         
            case 'P':
               nameIn = nextDelimiter.next();
               baseStorageCostIn = Double.parseDouble(nextDelimiter.next());
               dataStoredIn = Double.parseDouble(nextDelimiter.next());
               dataLimitIn = Double.parseDouble(nextDelimiter.next());
               
               SharedCloud filePersonalCloud = new PersonalCloud(nameIn,
                           baseStorageCostIn, dataStoredIn, dataLimitIn);
               addCloudStorage(filePersonalCloud); 
              
               break;     
               
            default:
              
         }
      }
      
   }
  
 /*****************************************************************************
  * generates a report of the cloudStorageArray in natural sorting order.
  * @return report in string
  *****************************************************************************/
   public String generateReport()
   {
      String report = "-------------------------------"
                    + "\nMonthly Cloud Storage Report"
                    + "\n-------------------------------";
      for (CloudStorage storage : cloudStorageArray)
      {
         report += "\n" + storage + "\n";
      } 
      
      return report;             
   }
   
 /*****************************************************************************
  * generates a report of the cloudStorageArray alphabetically by name.
  * @return report in string
  *****************************************************************************/
   public String generateReportByName()
   {
      String report = "-----------------------------------------"
                    + "\nMonthly Cloud Storage Report (by Name)"
                    + "\n-----------------------------------------";
      Arrays.sort(cloudStorageArray);              
      for (CloudStorage storage : cloudStorageArray)
      {
         report += "\n" + storage + "\n";
      } 
      
      return report;
   }
  
 /*****************************************************************************
  * generates a report of the cloudStorageArray by Monthly Cost high-low.
  * @return report in string
  *****************************************************************************/
   public String generateReportByMonthlyCost()
   {
      String report = "-------------------------------------------------"
                    + "\nMonthly Cloud Storage Report (by Monthly Cost)"
                    + "\n-------------------------------------------------";
      Arrays.sort(cloudStorageArray, new MonthlyCostComparator());              
      for (CloudStorage storage : cloudStorageArray)
      {
         report += "\n" + storage + "\n";
      } 
      
      return report;
   }
}
