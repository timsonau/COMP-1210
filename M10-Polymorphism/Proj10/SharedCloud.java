import java.text.DecimalFormat;
 /*****************************************************************************
  * a subclass of cloud storage with added data Storage Feauture.
  * Data Limit and Storage Feature, new monthly cost feature
  *****************************************************************************/
public class SharedCloud extends CloudStorage
{
   protected double dataStored;
   protected double dataLimit;
  
  /*****************
   * Cost factor multiplier constant.
   *****************/
   public static final double COST_FACTOR = 1.0;
   
 /*****************************************************************************
  *Constructor method for class SharedCloud.
  * @param nameIn name of the cloud file
  * @param baseStorageCostIn cost in dollars for base storage
  * @param dataStoredIn amount of data stroed in each SharedCloud Object
  * @param dataLimitIn maximum amount of data avaliable before overage charge
  *****************************************************************************/
   public SharedCloud(String nameIn, double baseStorageCostIn,
                      double dataStoredIn, double dataLimitIn)
   {
      //parameters passed onto CloudStorage constructor
      super(nameIn, baseStorageCostIn);
      dataLimit = dataLimitIn;
      dataStored = dataStoredIn; 
   }
 
 /*****************************************************************************
  * Returns the amount of gigabytes of Data Stored in the cloud.
  * @return dataStored amount
  *****************************************************************************/
   public double getDataStored()
   {
      return dataStored;
   }
  
 /*****************************************************************************
  * sets the dataStored with new amount of GB given in the parameter.
  * @param dataStoredIn new dataStored amount
  *****************************************************************************/
   public void setDataStored(double dataStoredIn)
   {
      dataStored = dataStoredIn;
   }
   
 /*****************************************************************************
  * Returns the amount of gigabytes of Data limit in the cloud.
  * @return dataLimit amount
  *****************************************************************************/
   public double getDataLimit()
   {
      return dataLimit;
   }
  
 /*****************************************************************************
  * sets the dataLimit with new amount of GB given in the parameter.
  * @param dataLimitIn new data max data limit
  *****************************************************************************/
   public void setDataLimit(double dataLimitIn)
   {
      dataLimit = dataLimitIn;
   }
   
 /*****************************************************************************
  * Returns the CostFactor multiplier used in calculating monthly cost.
  * @return COST_FACTOR static final variable
  *****************************************************************************/
   public double getCostFactor()
   {
      return COST_FACTOR;
   }
  
 /*****************************************************************************
  * calculates the amount of data exceeded over the data limit.
  * if not over used returns 0
  * @return amount of data overused
  *****************************************************************************/
   public double dataOverage()
   {
      if ((dataLimit - dataStored) >= 0)
      {
         return 0;
      }
      else
      {
         return dataStored - dataLimit;
      }
   }
  
 /*****************************************************************************
  * calculates and returns total monthly cost for the storage.
  * @return final monthly amount
  *****************************************************************************/
   public double monthlyCost()
   {
      return (baseStorageCost + (dataOverage() * SharedCloud.COST_FACTOR));
   }
  
 /*****************************************************************************
  * returns all the information in String.
  * @return output SharedCloud Information
  *****************************************************************************/
   public String toString()
   {
      DecimalFormat gigaByte = new DecimalFormat("0.000");
      String output = super.toString();
      output += "\nData Stored: " + gigaByte.format(dataStored) + " GB"
              + "\nData Limit: " + gigaByte.format(dataLimit) + " GB"
              + "\nOverage: " + gigaByte.format(this.dataOverage()) + " GB"
              + "\nCost Factor: " + getCostFactor();
      return output;
   }
 
}