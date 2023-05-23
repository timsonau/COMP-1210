import java.util.Scanner; 
 /**
  *Application that solve math equation with given values.
  *Project 2
  *Heeyoon Son LLB 3
  *01/212/2020
  */
public class Expression
{  /**
     *Prints the result of the solved equation.
     *@param args Command line arguments - not used.
     */
  
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      double x;
      double y;
      System.out.println("result = (10x + 32.6) (5y - 1.567) / xy");
      System.out.print("\tx = ");
      x = userInput.nextDouble();
      System.out.print("\ty = ");
      y = userInput.nextDouble();
      if ((x == 0.0) | (y == 0.0))
      {
         System.out.println("result is \"undefined\"");
      }
      else
      {
         System.out.println("result = "
            + ((10 * x + 32.6) * (5 * y - 1.567)) / (x * y));
      }
   }
   
}