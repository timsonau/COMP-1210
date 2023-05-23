/**
* abstract class for Online Text Items.
* subclass of InventoryItem
*/
public abstract class OnlineTextItem extends InventoryItem
{

/**
  * constructor method for OnlineTextItem.
  * @param nameIn name of the product
  * @param priceIn price of the product
  */
   public OnlineTextItem(String nameIn, double priceIn)
   {
      super(nameIn, priceIn);
   }

/**
  * calculates cost of the online item without tax.
  * overrides InventoryItem calculateCost()
  * @return price cost
  */ 
   public double calculateCost()
   {
      return price;
   } 
   
}