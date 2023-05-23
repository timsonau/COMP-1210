/**
  * item superclass.
  * Activity 8
  * Heeyoon Son LLB 3
  * 03/30/2020
  */
public class InventoryItem
{ 
   protected String name;
   protected double price;
   private static double taxRate = 0;

/**
  * @param nameIn name of the item.
  * @param priceIn price of the item
  */
   public InventoryItem(String nameIn, double priceIn)
   {
      name = nameIn;
      price = priceIn;
   }
 
/**
  * gets item name.
  * @return name
  */ 
   public String getName()
   {
   //returns customer name
      return name;
   }

/**
  * calculates cost with tax.
  * @return cost
  */ 
   public double calculateCost()
   {
   //returns price including tax
      return price * (1 + taxRate);
   }

/**
  * sets tax rate.
  * @param taxRateIn input tax rate
  */  
   public static void setTaxRate(double taxRateIn)
   {
      taxRate = taxRateIn;
   //sets the tax Rate
   
   }

/**
  * converts result to string.
  * @return String result
  */
   public String toString()
   {
      return (name + ": $" + calculateCost());
   // return string with name price with tax
   }
}