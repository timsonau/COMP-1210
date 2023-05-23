import java.util.ArrayList;
import java.text.DecimalFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
  *Application that adds Ellipsoids objects to the ArrayList. 
  *Project 6
  *Heeyoon Son LLB 3
  *02/22/2020
  */
public class EllipsoidList
{  
//instance Variables
   private String listName;
   private ArrayList<Ellipsoid> ellipsoidList;
 
/**
  * Creates Ellipsoid ArrayList object.
  * @param listNameIn stores the name of the list
  * @param ellipsoidListIn stores the list
  */
//constructor
   public EllipsoidList(String listNameIn, ArrayList<Ellipsoid> ellipsoidListIn)
   {
      listName = listNameIn;
      ellipsoidList = ellipsoidListIn;
   }

/**
  * gets the name of the list.
  * @return listName
  */
//methods  
   public String getName()
   {
      return listName;
   }

/**
  * gets the size of the list.
  * @return numEllipsoids
  */
    
   public int numberOfEllipsoids()
   {
      int numEllipsoids = ellipsoidList.size();
      return numEllipsoids;  
   }

/**
  * calculates the total volume of all Ellipsoid inside the list.
  * @return totalVolume
  */
  
   public double totalVolume()
   {
      double totalVolume = 0;
      int index = 0;
      if (numberOfEllipsoids() == 0)
      {
         return totalVolume;
      }
      else 
      {
         while (index < numberOfEllipsoids()) 
         {
            totalVolume += ellipsoidList.get(index).volume();
            index++;
         } 
         return totalVolume;
      }
   }
 
/**
  * calculates the total Surface Area of all Ellipsoid inside the list.
  * @return totalSA
  */
   
   public double totalSurfaceArea()
   {
      double totalSA = 0;
      int index = 0;
      if (numberOfEllipsoids() == 0)
      {
         return totalSA;
      }
      else 
      {
         while (index < numberOfEllipsoids())
         {
            totalSA += ellipsoidList.get(index).surfaceArea();
            index++;
            
         }
         return totalSA;
      }
   }

/**
  * calculates the average Volume of all Ellipsoids inside the list.
  * @return averageVolume
  */
  
   public double averageVolume()
   {
      double averageVolume = 0;
      if (numberOfEllipsoids() == 0)
      {
         return averageVolume;
      }
      else
      {
         averageVolume = totalVolume() / numberOfEllipsoids();
         return averageVolume;
      } 
   }

/**
  * calculates the average surface area of all Ellipsoids inside the list.
  * @return averageSA
  */
  
   public double averageSurfaceArea()
   {
      double averageSA = 0;
      if (numberOfEllipsoids() == 0)
      {
         return averageSA; 
      }
      else
      {
         averageSA = totalSurfaceArea() / numberOfEllipsoids();
         return averageSA;
      }
   }

/**
  * converts the information of each ellipsoids inside the list into String.
  * @return ellipsoidInformation
  */
     
   public String toString()
   {
      String ellipsoidInformation = listName + "\n";
      int index = 0;
      if (numberOfEllipsoids() == 0)
      {
         return ellipsoidInformation;
      }
      else
      {
         while (index < numberOfEllipsoids()) 
         {
            ellipsoidInformation += "\n" + ellipsoidList.get(index) + "\n";
            index++;
         }
      
         return ellipsoidInformation;
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
  * @return ellipsoidList.
  */
  
   public ArrayList<Ellipsoid> getList()
   {
      return ellipsoidList;
   }

/**
  * Reads file and creates an ArrayList of Ellipsoid Objects.
  * @throws FileNotFoundException used to scan file
  * @param fileIn the file's name
  * @return eList ArrayList containing Ellipsoid objects
  */  
   
   public EllipsoidList readFile(String fileIn) throws FileNotFoundException
   
   {
      ArrayList<Ellipsoid> myList = new ArrayList<Ellipsoid>();
      Scanner scanFile = new Scanner(new File(fileIn));
      double aIn = 0;
      double bIn = 0;
      double cIn = 0;
      String myListName = "";
     
      myListName = scanFile.nextLine();
      while (scanFile.hasNext())
      {  
         String labelIn = scanFile.nextLine();
         aIn = Double.parseDouble(scanFile.nextLine());
         bIn = Double.parseDouble(scanFile.nextLine());
         cIn = Double.parseDouble(scanFile.nextLine());
         Ellipsoid obj = new Ellipsoid(labelIn, aIn, bIn, cIn);
         myList.add(obj);
      }
      scanFile.close();
      
      EllipsoidList eList = new EllipsoidList(myListName, myList);
      return eList;
   }

/**
  * Creates a new Ellipsoid object then adds it to the eList object.
  * @param labelIn user input String label
  * @param aIn user inut "a" double value
  * @param bIn user input "b" double value
  * @param cIn user input "c" double value
  */
   
   public void addEllipsoid(String labelIn, 
       double aIn, double bIn, double cIn)
   {
      Ellipsoid obj = new Ellipsoid(labelIn, aIn, bIn, cIn); 
      ellipsoidList.add(obj);
   }

/**
  * finds the target Ellipsoid from the eList object.
  * @param labelIn user input String label
  * @return targetEllipsoid
  */
     
   public Ellipsoid findEllipsoid(String labelIn)
   {
      Ellipsoid targetEllipsoid = null;
      for (Ellipsoid obj : ellipsoidList)
      {
         if (labelIn.equalsIgnoreCase(obj.getLabel()))
         {
            targetEllipsoid = obj;
         }
      } 
      return targetEllipsoid;
   }

/**
  * finds the target Ellipsoid from the eList object and removes it.
  * @param labelIn user input String label
  * @return targetEllipsoid
  */
  
   public Ellipsoid deleteEllipsoid(String labelIn)
   {
      Ellipsoid targetEllipsoid = null;
      targetEllipsoid = findEllipsoid(labelIn);
      if (targetEllipsoid != null)
      {
         ellipsoidList.remove(targetEllipsoid);
         return targetEllipsoid;
      }
      else
      {
         return targetEllipsoid;
      }
   }

/**
  * Edits an existing Ellipsoid object then adds it back to the eList object.
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
      for (Ellipsoid obj : ellipsoidList)
      {
         if (labelIn.equalsIgnoreCase(obj.getLabel()))
         {
            obj.setA(aIn);
            obj.setB(bIn);
            obj.setC(cIn);
            targetEllipsoid = obj;
         }
      }
      return targetEllipsoid;
   }
}