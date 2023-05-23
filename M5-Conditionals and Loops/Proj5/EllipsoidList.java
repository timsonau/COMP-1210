import java.util.ArrayList;
import java.text.DecimalFormat;
/**
  *Application that adds Ellipsoids objects to the ArrayList. 
  *Project 5
  *Heeyoon Son LLB 3
  *12/14/2020
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
  *gets the name of the list.
  *@return listName
  */
//methods  
   public String getName()
   {
      return listName;
   }

/**
  *gets the size of the list.
  *@return numEllipsoids
  */
    
   public int numberOfEllipsoids()
   {
      int numEllipsoids = ellipsoidList.size();
      return numEllipsoids;  
   }

/**
  *calculates the total volume of all Ellipsoid inside the list.
  *@return totalVolume
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
  *calculates the total Surface Area of all Ellipsoid inside the list.
  *@return totalSA
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
  *calculates the average Volume of all Ellipsoids inside the list.
  *@return averageVolume
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
  *calculates the average surface area of all Ellipsoids inside the list.
  *@return averageSA
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
  *converts the information of each ellipsoids inside the list into String.
  *@return ellipsoidInformation
  */
     
   public String toString()
   {
      String ellipsoidInformation = "";
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
  *converts the information of all ellipsoids inside the list into String.
  *@return ellipsoidListInfo
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
}