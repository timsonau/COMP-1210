
/*****************************************************************************
 * a subclass of shared storage with different COST FACTOR set to 2.
 *****************************************************************************/
public class PublicCloud extends SharedCloud
{
 
 /*****************************************************************************
  * COST FACTOR value constant set to 2.
  *****************************************************************************/
   public static final double COST_FACTOR = 2.0;
 
 /*****************************************************************************
  *Constructor method for class PublicCloud.
  * @param nameIn name of the cloud file
  * @param baseStorageCostIn cost in dollars for base storage
  * @param dataStoredIn amount of data stroed in each SharedCloud Object
  * @param dataLimitIn maximum amount of data avaliable before overage charge
  *****************************************************************************/
   public PublicCloud(String nameIn, double baseStorageCostIn,
                      double dataStoredIn, double dataLimitIn)
   {
      super(nameIn, baseStorageCostIn, dataStoredIn, dataLimitIn);
   
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
  * calculates and returns total monthly cost for the storage.
  * @return final monthly amount
  *****************************************************************************/
   public double monthlyCost()
   {
      return (baseStorageCost + (dataOverage() * PublicCloud.COST_FACTOR));
   }
              
}