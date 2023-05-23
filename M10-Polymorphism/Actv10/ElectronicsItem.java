/**
  * subclass of InventoryItem for Electronic Items.
  *
  */
public class ElectronicsItem extends InventoryItem
{
  
   protected double weight;
/** 
  * first lol yes tho.
  * private static final
  */
   public static final double SHIPPING_COST = 1.5;

/**
  * constructor method.
  * @param nameIn name of hte product
  * @param priceIn price of the product
  * @param weightIn weight of the product
  */  
   public ElectronicsItem(String nameIn, double priceIn, double weightIn)
   {
      super(nameIn, priceIn);
      weight = weightIn;
   }

/**
  * sets the weight with input weight.
  * @param weightIn weight
  */   
   public void setWeight(double weightIn)
   {
      weight = weightIn;
   }

/**
  * calculates cost with shipping cost.
  * @return final cost
  */   
   public double calculateCost()
   {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}