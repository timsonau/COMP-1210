import java.util.Comparator;
/*****************************************************************************
 * Comparator Class that compares Monthly Cost of Cloud Storage Objects.
 * Author: Tim Son
 * Created on 4/10/2020
 * LLB 003
 *****************************************************************************/ 
public class MonthlyCostComparator implements Comparator <CloudStorage>
{
 /*****************************************************************************
  * Method that defines the order from highest to lowest based on monthly cost.
  * @param c1 1st Cloud Storage
  * @param c2 2nd Cloud Storage
  * @return int value
  *****************************************************************************/
   public int compare(CloudStorage c1, CloudStorage c2)
   {
      if (c1.monthlyCost() < c2.monthlyCost())
      {
         return 1;
      }
      else if (c1.monthlyCost() > c2.monthlyCost())
      {
         return -1;
      }
      else
      {
         return 0;
      }
   }

}