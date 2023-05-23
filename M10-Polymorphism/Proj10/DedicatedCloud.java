import java.text.DecimalFormat;
/*****************************************************************************
 * a subclass of cloud storage with added data Storage Feauture.
 * Data Limit and Storage Feature, new monthly cost feature
 *****************************************************************************/
public class DedicatedCloud extends CloudStorage
{
   private double serverCost;
 
 /*****************************************************************************
  *Constructor method for class DeicatedCloud.
  * @param nameIn name of the cloud file
  * @param baseStorageCostIn cost in dollars for base storage
  * @param serverCostIn cost of the server
  *****************************************************************************/
   public DedicatedCloud(String nameIn, double baseStorageCostIn,
                         double serverCostIn)
   {
      super(nameIn, baseStorageCostIn);
      serverCost = serverCostIn;
   }
  
 /*****************************************************************************
  * Returns the server cost.
  * @return serverCost amount
  *****************************************************************************/
   public double getServerCost()
   {
      return serverCost;
   }
  
 /*****************************************************************************
  * sets the serverCost with new amount given in the parameter.
  * @param serverCostIn new server cost
  *****************************************************************************/
   public void setServerCost(double serverCostIn)
   {
      serverCost = serverCostIn;
   }
 
 /*****************************************************************************
  * calculates and returns total monthly cost (base + serve) for the storage.
  * @return final monthly amount
  *****************************************************************************/
   public double monthlyCost()
   {
      return baseStorageCost + serverCost; 
   }
   
 /*****************************************************************************
  * returns all the information in String.
  * @return output DedicatedCloud Information
  *****************************************************************************/
   public String toString()
   {
      DecimalFormat inDollars = new DecimalFormat("$#,##0.00");
      String output = super.toString();
      return output + "\nServer Cost: " + inDollars.format(serverCost);
   } 
}