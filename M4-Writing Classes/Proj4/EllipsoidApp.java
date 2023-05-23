import java.util.Scanner; 
 /**
  *Application that calculates volume and Surface Area of an Ellipsoid.
  *Project 4
  *Heeyoon Son LLB 3
  *02/06/2020
  */
public class EllipsoidApp
{  /**
     *
     *@param args Command line arguments - not used.
     */
  
   public static void main(String[] args)
   {
      String error = "Error: axis value must be positive.";
      Scanner userInput = new Scanner(System.in);
      Ellipsoid myEllipsoid = new Ellipsoid("", 0, 0, 0);
      System.out.println("Enter label and axes a, b, c for an ellipsoid.");
      System.out.print("\tlabel: ");
      myEllipsoid.setLabel(userInput.nextLine());
      System.out.print("\ta: ");
      myEllipsoid.setA(userInput.nextDouble());
      if (myEllipsoid.getA() <= 0)
      {
         System.out.println(error);
      }
      else
      {
      
         System.out.print("\tb: ");
         myEllipsoid.setB(userInput.nextDouble());
         if (myEllipsoid.getB() <= 0)
         {
            System.out.println(error);
         }
         else
         {
            System.out.print("\tc: ");
            myEllipsoid.setC(userInput.nextDouble());
            if (myEllipsoid.getC() <= 0)
            {
               System.out.println(error);
            }
            else
            {
               System.out.println("\n" + myEllipsoid);
            }
         }
      }
   }
   
}