/**
 * Class that helps organize Array of type InventoryItem.
 * Creator: Tim Son
 * LLB 003
 */
public class ItemsList
{
   private InventoryItem[] inventory;
   private int count;
    
  /**
    * constructor method for ItemsList.
    */
   public ItemsList()
   {
      inventory = new InventoryItem[20];
      count = 0;
   }
   
  /**
    * adds Items to the inventory.
    * @param itemIn input item
    */
   public void addItem(InventoryItem itemIn)
   {
      inventory[count] = itemIn;
      count++;
   }
   
  /**
    * calculates total cost off every item in the itemList.
    * @param electronicsSurcharge amount added to electronic items
    * @return total cost
    */ 
   public double calculateTotal(double electronicsSurcharge)
   {
      double total = 0;
      for (int i = 0; i < count; i++)
      {
         if (inventory[i] instanceof ElectronicsItem)
         {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else
         {
            total += inventory[i].calculateCost();
         }
      }
      
      return total;
   }
   
  /**
    * converts result in string.
    * @return output in String.
    */
   public String toString()
   {
      String output = "All inventory:\n\n";
      for (int i = 0; i < count; i++)
      {
         output += inventory[i] + "\n";
      }
      
      return output;
   }
}