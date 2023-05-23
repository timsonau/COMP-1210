import java.io.FileNotFoundException;

/**
  * Application that prints CloudStorageArray Reports Sorted.
  * Author: Tim Son
  */
public class CloudStoragePart2
{
   
/**
  * Main method of the class prints the array.
  * @throws FileNotFoundException used to scan file
  * @param args used for file name
  */ 
   public static void main(String[] args)throws FileNotFoundException
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
      }
   }

}