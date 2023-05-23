/**
  *application.
  *
  */
public class OnlineBook extends OnlineTextItem
{
   protected String author;
 
/** 
  * constructor method.
  * @param nameIn name of the book
  * @param priceIn price of the book
  */  
   public OnlineBook(String nameIn, double priceIn)
   {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }

/**
  * sets the author name.
  * @param authorIn author name
  */   
   public void setAuthor(String authorIn)
   {
      author = authorIn;
   }

/**
  * converts result in string.
  * @return string for book
  */   
   public String toString()
   {
      return name + " - " + author + ": $" + price;
   
   }
}