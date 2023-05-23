import java.util.Scanner;
import java.util.ArrayList;

/**
 * Demonstrates the NumberOperations class.
 */
public class NumberOpsDriver {

   /**
    * Reads a set of positive numbers from the user until the user enters 0.
	 * Prints odds under and powers of 2 under for each number.
	 *
    * @param args - Standard commandline arguments
    */
   public static void main(String[] args) {
   	
      int input;
      Scanner in = new Scanner(System.in);
      
      ArrayList<NumberOperations> numOpsList 
            = new ArrayList<NumberOperations>();
      
   
      System.out.println("Enter a list of positive integers separated "
                        + "with a space followed by 0:");
      
     
      input = in.nextInt();
      
      while (input != 0)
      {
         NumberOperations numOps = new NumberOperations(input);
         numOpsList.add(numOps);
         input = in.nextInt();
      }
      
      int index = 0;
      while (index < numOpsList.size()) 
      {
         NumberOperations num = numOpsList.get(index);
         System.out.println("For: " + num);
      	
         System.out.println("\tOdds under:\t" + num.oddsUnder());
      	
         System.out.println("\tPowers of 2 under:\t" + num.powersTwoUnder());
         index++;
      }
      
   }
}