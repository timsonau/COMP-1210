import java.util.Scanner; 
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
 /**
  *Application that prints out EllipsoidList information. 
  *Project 5
  *Heeyoon Son LLB 3
  *02/14/2020
  */
public class EllipsoidListApp
{  /**
     *
     *@param args Command line arguments - not used.
     *@throws FileNotFoundException used to scan file
     */
  
   public static void main(String[] args) throws FileNotFoundException
   {
      
      ArrayList<Ellipsoid> ellipsoidList = new ArrayList<Ellipsoid>();
      Scanner in = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileNameInput = in.nextLine();
      Scanner scanFile = new Scanner(new File(fileNameInput));
      String myListName = scanFile.nextLine();
      if (scanFile.hasNext())
      {
         while (scanFile.hasNext())
         {  
            String labelIn = scanFile.nextLine();
            double aIn = Double.parseDouble(scanFile.nextLine());
            double bIn = Double.parseDouble(scanFile.nextLine());
            double cIn = Double.parseDouble(scanFile.nextLine());
            Ellipsoid obj = new Ellipsoid(labelIn, aIn, bIn, cIn);
            ellipsoidList.add(obj);
         }
      }
      scanFile.close();
      EllipsoidList myEllipsoidList = 
         new EllipsoidList(myListName, ellipsoidList);
      System.out.println("\n" + myEllipsoidList.getName());
      System.out.println(myEllipsoidList);
      System.out.println("\n" + myEllipsoidList.summaryInfo());
      
   }
   
}