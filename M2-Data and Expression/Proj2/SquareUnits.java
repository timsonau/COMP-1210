import java.util.Scanner; 
 /**
  *Application that solve convert square inches into Acres,SqFt,SqYd, SqIn.
  *Project 2
  *Heeyoon Son LLB 3
  *01/212/2020
  */
public class SquareUnits
{  /**
     *Prints the result of SqIn converted into Acre with the remainders
     *being converted back into SqYd, Sqft, and SqIn. 
     *@param args Command line arguments - not used.
     */
  
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      int input;
      int acres;
      int squareYards;
      int squareFeet;
      int squareInches;
      int remainder;
      System.out.print("Enter the area in square inches: ");
      input = userInput.nextInt();
      if (input >= 1_000_000_000)
      {
         System.out.println("Limit of 1,000,000,000 square inches exceeded!");
      }
      else
      {  
         System.out.println("Number of Units: ");
         acres = input / 6272640;
         System.out.println("\tAcres: " + acres);
         remainder = (input % 6272640);
         squareYards = (remainder / 1296);
         System.out.println("\tSquare Yards: " + squareYards);
         remainder = (remainder % 1296);
         squareFeet = (remainder / 144);
         System.out.println("\tSquare Feet: " + squareFeet);
         remainder = (remainder % 144);
         squareInches = (remainder);
         System.out.println("\tSquare Inches: " + squareInches);   
      }
   }
   
}