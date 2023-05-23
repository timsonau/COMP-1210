import java.text.DecimalFormat;

 /*****************************************************************************
  * Abstract class basic temeplate that describe cloud storage data.
  * Author: Tim Son
  * Created on 4/1/2020
  * LLB 003
  *****************************************************************************/
public abstract class CloudStorage
{
   protected String name;
   protected double baseStorageCost;
   //class variable of amount of storages created
   protected static int storagesCreated = 0;

 /*************************************************************************
  * Constructor method for abstract class CloudStorage.
  * @param nameIn name of the cloud file
  * @param baseStorageCostIn cost in dollars for base storage
  * number of storagesCreated incremented everytime a storage object is created
  *************************************************************************/   
   public CloudStorage(String nameIn, double baseStorageCostIn)
   {
      name = nameIn; 
      baseStorageCost = baseStorageCostIn;
      storagesCreated++;
   }

 /*************************************************************************
  * returns name of the file.
  * @return name in strings
  *************************************************************************/
   public String getName()
   {
      return name;
   }

 /************************************************************************
  * sets the name with new name given in the parameter.
  * @param nameIn new file name
  ************************************************************************/  
   public void setName(String nameIn)
   {
      name = nameIn;
   }

 /*************************************************************************
  * returns cost of the basic storage cost.
  * @return baseStorageCost in double
  ************************************************************************/     
   public double getBaseStorageCost()
   {
      return baseStorageCost;
   }

 /************************************************************************
  * sets the baseStorageCost with new basic StorageCost given in the parameter.
  * @param baseStorageCostIn new base Storage Cost
  ************************************************************************/     
   public void setBaseStorageCost(double baseStorageCostIn)
   {
      baseStorageCost = baseStorageCostIn;
   }
 
 /************************************************************************
  * returns the number of any type of CloudStorage created.
  * @return storagesCreated number of Cloud Storage Created
  ************************************************************************/    
   public static int getCount()
   {
      return storagesCreated;
   }
  
 /************************************************************************
  * sets the storages created count to 0.
  ***********************************************************************/      
   public static void resetCount()
   {
      storagesCreated = 0;
   }
 
 /************************************************************************
  * returns all the information in String.
  * @return output CloudStorage Information
  **********************************************************************/       
   public String toString()
   {
      DecimalFormat inDollars = new DecimalFormat("$#,##0.00");
      String output = name + " (" + this.getClass() + ")"
           + " Monthly Cost: " + inDollars.format(monthlyCost())
           + "\nBase Storage Cost: " + inDollars.format(baseStorageCost);
      return output;
   }
   
   abstract double monthlyCost();
}  
