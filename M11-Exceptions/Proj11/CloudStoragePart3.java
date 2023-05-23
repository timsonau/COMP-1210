import java.io.FileNotFoundException;

/**
  * Application that prints CloudStorageArray Reports Sorted.
  * Author: Tim Son
  */
public class CloudStoragePart3
{
   
/**
  * Main method of the class prints the array.
  * @throws FileNotFoundException used to scan file
  * @throws InvalidCategoryException for invalid category character
  * @param args used for file name
  */ 
   public static void main(String[] args)
   {
      try
      {
         if (args.length == 0)
         {
            System.out.println("File name expected as command line argument."
               + "\nProgram ending.");
         }
         else
         {
            CloudStorageList myList = new CloudStorageList();
            myList.readFile(args[0]);
            System.out.println(myList.generateReport());
            System.out.println(myList.generateReportByName());
            System.out.println(myList.generateReportByMonthlyCost());
            System.out.println(myList.generateInvalidRecordsReport());
         }
      }
      catch (FileNotFoundException errorTypeFour)
      {
         System.out.println("*** Attempted to read file: " + args[0] 
                          + "  (No such file or directory)");
      }
   }

}