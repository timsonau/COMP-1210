import java.util.Scanner; 
import java.text.DecimalFormat;
 /**Calculator for an equation.
  *Application 
  *Project 3
  *Heeyoon Son LLB 3
  *01/27/2020
  */
public class Solver
{  /**
     *
     *@param args Command line arguments - not used.
     */
  
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      double x;
      double result;
      DecimalFormat formattedResult = new DecimalFormat("#,##0.0####");
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      result = (11 * Math.pow(x, 4)) + (9 * Math.pow(x, 3))
          + (7 * Math.pow(x, 2)) + (5 * x) + (4);
      result = Math.abs(result);
      result = Math.sqrt(result);
      result = (result / (2 * x + 4));
      String myString = Double.toString(result);
      int dot = myString.indexOf(".");
      String firstHalf = myString.substring(0, dot);
      String lastHalf = myString.substring(dot);
      int lengthfirstHalf = firstHalf.length();
      int lengthlastHalf = lastHalf.length() - 1;
      System.out.println("Result: " + result);
      System.out.println("# of characters to left of decimal point: "
          + lengthfirstHalf);
      System.out.println("# of characters to right of decimal point: "
          + lengthlastHalf);
      System.out.print("Formatted Result: " + formattedResult.format(result));
   }
}