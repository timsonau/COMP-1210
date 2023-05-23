/**
  * Application that prints items in the Array.
  *
  *
  */
public class InventoryListApp
{
   /**
     *@param args Command line arguments - not used.
     */
   public static void main(String[] args)
   {
      InventoryItem.setTaxRate(0.05);
      ItemsList myItems = new ItemsList();
     
      ElectronicsItem laptop = new ElectronicsItem("laptop", 1234.56, 10);
      InventoryItem motorOil = new InventoryItem("motor oil", 9.8);
      OnlineBook book = new OnlineBook("All Things Java", 12.3);
      OnlineArticle article = new OnlineArticle("Useful Acronyms", 3.4);
      
      myItems.addItem(laptop);
      myItems.addItem(motorOil);
      myItems.addItem(book);
      myItems.addItem(article);
      
      System.out.println(myItems);
      System.out.println("Total: " + myItems.calculateTotal(2.0));
   }

}