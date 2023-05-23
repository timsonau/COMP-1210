import java.text.DecimalFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
  *Application that adds Ellipsoids objects to an Ellipsoid Array. 
  *Project 8
  *Heeyoon Son LLB 3
  *03/06/2020
  */
public class EllipsoidList2
{  
//instance method
   private String listName;
   private Ellipsoid[] ellipsoidArray;
   private int numEllipsoids;

/**
  * the constructor method that makes EllipsoidList2 object.
  * @param listNameIn stores name of the list
  * @param ellipsoidArrayIn Array containg ellipsoid objects
  * @param numEllipsoidsIn number of Ellipsoid objects in the array.
  */
   
//constructor 
   public EllipsoidList2(String listNameIn, Ellipsoid[] ellipsoidArrayIn,
       int numEllipsoidsIn)
   {
      listName = listNameIn;
      ellipsoidArray = ellipsoidArrayIn;
      numEllipsoids = numEllipsoidsIn;
   }

/**
  * gets the name of the list.
  * @return listName 
  */
     
   public String getName()
   {
      return listName;
   }
 
/**
  * gets the number of Ellipsoids in the list.
  * @return numEllipsoid
  */
     
   public int numberOfEllipsoids()
   {
      return numEllipsoids;
   }

/**
  * calculates the total volume of all Ellipsoid inside the Array.
  * @return totalVolume;
  */
     
   public double totalVolume()
   {
      double totalVolume = 0; //intialization & decleration of the total Volume 
      
      if (numEllipsoids == 0)
      {
         return totalVolume;
      }
      else
      {
         int index = 0;
         while (index < numEllipsoids) 
         //while index value is less than the length of the Array
         {
            totalVolume += ellipsoidArray[index].volume();
            //gets Ellipsoid and invokes volume method of Ellipsoid class
            index++; //goes to the next value
         }
      }
      return totalVolume;
   }

/**
  * calculates the total Surface Area of all Ellipsoid inside the Array.
  * @return totalSurfaceArea
  */
  
   public double totalSurfaceArea()
   {
      double totalSurfaceArea = 0;
      
      if (numEllipsoids == 0)
      {
         return totalSurfaceArea;
      }
      else
      {
         int index = 0;
         while (index < numEllipsoids)
         {
            totalSurfaceArea += ellipsoidArray[index].surfaceArea();
            index++;
         }
         return totalSurfaceArea;
      }
   }

/**
  * calculates the average Volume of all Ellipsoids inside the Array.
  * @return averageVolume
  */
     
   public double averageVolume()
   {
      double averageVolume = 0;
      
      if (numEllipsoids == 0)
      {
         return averageVolume;
      }
      else
      {
         averageVolume = totalVolume() / numEllipsoids;
         return averageVolume;
      }
   }

/**
  * calculates the average surface area of all Ellipsoids inside the Array.
  * @return averageSurfaceArea
  */
     
   public double averageSurfaceArea()
   {
      double averageSurfaceArea = 0;
      
      if (numEllipsoids == 0)
      {
         return averageSurfaceArea;
      }
      else
      {
         averageSurfaceArea = totalSurfaceArea() / numEllipsoids;
         return averageSurfaceArea;
      }
   }

/**
  * converts the information of each ellipsoids inside the list into String.
  * @return ellipsoidListInString
  */
    
   public String toString()
   {
      String ellipsoidListInString = listName + "\n";
      
      if (ellipsoidArray == null)
      {
         return null;
      }
      else
      {
         int index = 0;
         while (index < numEllipsoids) 
         {
            ellipsoidListInString += "\n" + ellipsoidArray[index] + "\n";
            index++;
         }
      
         return ellipsoidListInString;
      } 
   
   }
 
/**
  * converts the information of all ellipsoids inside the list into String.
  * @return ellipsoidListInfo
  */
    
   public String summaryInfo()
   {
      String ellipsoidListInfo = "";
      
      
      DecimalFormat inDouble = new DecimalFormat("#,##0.0##");
      
      ellipsoidListInfo += ("----- Summary for " + getName() + " -----" 
            + "\n");
      ellipsoidListInfo += ("Number of Ellipsoid Objects: " 
            + numberOfEllipsoids() + "\n");
      ellipsoidListInfo += ("Total Volume: " 
            + inDouble.format(totalVolume()) + " cubic units\n");
      ellipsoidListInfo += ("Total Surface Area: " 
            + inDouble.format(totalSurfaceArea()) + " square units\n");
      ellipsoidListInfo += ("Average Volume: " 
            + inDouble.format(averageVolume()) + " cubic units\n");
      ellipsoidListInfo += ("Average Surface Area: " 
            + inDouble.format(averageSurfaceArea()) + " square units");
            
      return ellipsoidListInfo;
   }

/**
  * Reads file and creates an list of Ellipsoid Objects.
  * @throws FileNotFoundException used to scan file
  * @param fileIn the file's name
  * @return myEllipsoidList2 Array containing Ellipsoid objects and list Name
  */ 
      
   public EllipsoidList2 readFile(String fileIn) throws FileNotFoundException
   {
      Scanner scanFile = new Scanner(new File(fileIn));
      double aIn = 0;
      double bIn = 0;
      double cIn = 0;
      String myListName = "";
      int index = 0;
      int myNumEllipsoid = 0;
      Ellipsoid[] myEllipsoidArray = new Ellipsoid[100];
      
      myListName = scanFile.nextLine();
      
      while (scanFile.hasNext())
      {  
         String labelIn = scanFile.nextLine();
         aIn = Double.parseDouble(scanFile.nextLine());
         bIn = Double.parseDouble(scanFile.nextLine());
         cIn = Double.parseDouble(scanFile.nextLine());
         
         Ellipsoid obj = new Ellipsoid(labelIn, aIn, bIn, cIn);
         
         myEllipsoidArray[index] = obj;
         index++;
         myNumEllipsoid++;
      }
      scanFile.close();
      
      EllipsoidList2 myEllipsoidList2 = new EllipsoidList2(myListName, 
         myEllipsoidArray, myNumEllipsoid);
         //creates EllipsoidList2 object with info given in file
      return myEllipsoidList2;   
   }

/**
  * @return ellipsoidList.
  */
  
   public Ellipsoid[] getList()
   {
      return ellipsoidArray;
   }
   
/**
  * Creates a new Ellipsoid object then adds it to the ellipsoidArray object.
  * @param labelIn user input String label
  * @param aIn user inut "a" double value
  * @param bIn user input "b" double value
  * @param cIn user input "c" double value
  */
     
   public void addEllipsoid(String labelIn, double aIn, double bIn, double cIn)
   {
      Ellipsoid ellipsoidObj = new Ellipsoid(labelIn, aIn, bIn, cIn);
      ellipsoidArray[numEllipsoids] = ellipsoidObj;
      numEllipsoids++;
   }

/**
  * finds the target Ellipsoid from the ellipsoidArray object.
  * @param labelIn user input String label
  * @return targetEllipsoid
  */
   
   public Ellipsoid findEllipsoid(String labelIn)
   {
      Ellipsoid targetEllipsoid = null;
      
      for (int i = 0; i < numEllipsoids; i++) {
         if (ellipsoidArray[i].getLabel().equalsIgnoreCase(labelIn)) {
            targetEllipsoid = ellipsoidArray[i];
         }
      } 
      return targetEllipsoid;
   }

/**
  * finds the target Ellipsoid from the ellipsoidArray object and removes it.
  * @param labelIn user input String label
  * @return targetEllipsoid
  */
     
   public Ellipsoid deleteEllipsoid(String labelIn)
   {
      Ellipsoid targetEllipsoid = null;
      targetEllipsoid = findEllipsoid(labelIn);
      for (int i = 0; i < numEllipsoids; i++)
      {
         if (ellipsoidArray[i] == targetEllipsoid)
         {
            for (int j = i; j < numEllipsoids - 1; j++)
            {
               ellipsoidArray[j] = ellipsoidArray[j + 1];
            }
            
            ellipsoidArray[numEllipsoids - 1] = null;
            numEllipsoids--;
            break;
         }
      }
      
      return targetEllipsoid;
   }

/**
  * Edits an existing Ellipsoid object adds it back to ellipsoidArray object.
  * @param labelIn user input String label
  * @param aIn user inut "a" double value
  * @param bIn user input "b" double value
  * @param cIn user input "c" double value
  * @return targetEllipsoid
  */
     
   public Ellipsoid editEllipsoid(String labelIn, 
      double aIn, double bIn, double cIn)
   {
      Ellipsoid targetEllipsoid = null;
      targetEllipsoid = findEllipsoid(labelIn);
      if (targetEllipsoid != null)
      {
         targetEllipsoid.setA(aIn);
         targetEllipsoid.setB(bIn);
         targetEllipsoid.setC(cIn);
      }
      
      return targetEllipsoid;
   }

/**
  * Finds the Ellipsoid with the smallest volume in the Array.  
  * @return smallestVolume
  */
    
   public Ellipsoid findEllipsoidWithSmallestVolume()
   {
      Ellipsoid smallestVolume = null;
      
      //if there are no Ellipsoids return null
      if (numEllipsoids == 0)
      {
         return null;
      }
      
      //set the default ellipsoid with the smallest volume the first Ellipsoid
      smallestVolume = ellipsoidArray[0];
      
      //goes through the ellipsoid Array
      for (int i = 1; i < numEllipsoids; i++)
      {
         //ellipsoid volume in the Array compared to the current smallest.
         if (ellipsoidArray[i].volume() < smallestVolume.volume())
         {
            //set that Ellipsoid as the new smallest volume Ellipsoid
            smallestVolume = ellipsoidArray[i];
         }
      }
       
      return smallestVolume;
   }
   
/**
  * Finds the Ellipsoid with the largest volume in the Array.  
  * @return largestVolume
  */
  
   public Ellipsoid findEllipsoidWithLargestVolume()
   {
      Ellipsoid largestVolume = null;
      
      if (numEllipsoids == 0)
      {
         return null;
      }
      
      largestVolume = ellipsoidArray[0];
      for (int i = 1; i < numEllipsoids; i++)
      {
         if (ellipsoidArray[i].volume() > largestVolume.volume())
         {
            largestVolume = ellipsoidArray[i];
         }
      }
      
      return largestVolume;
   }

/**
  * Finds the Ellipsoid with the smallest SA in the Array.  
  * @return smallestSurfaceArea
  */
  
   public Ellipsoid findEllipsoidWithSmallestSurfaceArea()
   {
      Ellipsoid smallestSurfaceArea = null;
      
      if (numEllipsoids == 0)
      {
         return null;
      }
      
      smallestSurfaceArea = ellipsoidArray[0];
      
      for (int i = 0; i < numEllipsoids; i++)
      {
         if (ellipsoidArray[i].surfaceArea() 
                  < smallestSurfaceArea.surfaceArea())
         {
            smallestSurfaceArea = ellipsoidArray[i];
         }   
      }
      
      return smallestSurfaceArea;
   }

/**
  * Finds the Ellipsoid with the largest SA in the Array.  
  * @return largestSurfaceArea
  */
  
   public Ellipsoid findEllipsoidWithLargestSurfaceArea()
   {
      Ellipsoid largestSurfaceArea = null;
      
      if (numEllipsoids == 0)
      {
         return null;
      }
      
      largestSurfaceArea = ellipsoidArray[0];
      for (int i = 1; i < numEllipsoids; i++)
      {
         if (ellipsoidArray[i].surfaceArea() > largestSurfaceArea.surfaceArea())
         {
            largestSurfaceArea = ellipsoidArray[i];
         }
      }
      
      return largestSurfaceArea;
   }
}