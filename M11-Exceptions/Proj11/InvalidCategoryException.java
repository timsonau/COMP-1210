/**
  * A class that extends Exceptions.
  * Intended to throw a exception when an Invalid Category is
  * found in a file containg CloudStorage informatiojn
  */
public class InvalidCategoryException extends Exception
{  
/**
  * Constructor method that passes on category to the Exception constructor.
  * Concaits the invalid category with an error message
  * @param categoryIn invalid category
  */
   public InvalidCategoryException(String categoryIn)
   {
      super("For category: " + categoryIn);
   }

}