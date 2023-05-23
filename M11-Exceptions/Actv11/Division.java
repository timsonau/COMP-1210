/**
  * A class with a set of methods that allow for division.
  * Author: Tim of the southern water tribe
  */
public class Division
{
/**
  * divides two integers and returns the result in int.
  * @param numerator number
  * @param denominator number
  * @return result rounded to the nearest integer.
  */
   public static int intDivide(int numerator, int denominator)
   { 
      try
      {
         return numerator / denominator;
      }
      catch (ArithmeticException e)
      {
         return numerator * denominator;
      }
   }

/**
  * divides two integers and returns the result in double.
  * @param numerator number
  * @param denominator number
  * @return result in decimals with floating numbers
  */ 
   public static double decimalDivide(int numerator, int denominator)
   {
      if (denominator == 0)
      {
         throw new IllegalArgumentException("The denominator "
                       + "cannot be Zero");
      }
      else
      {
         return ((double) numerator / (double) denominator);
      }
   }
}