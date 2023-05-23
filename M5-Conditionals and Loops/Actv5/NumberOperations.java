 /**Public class NumberOperations.
  *Project 3
  *Heeyoon Son LLB 3
  *01/27/2020
  */
public class NumberOperations
{  
   //field variables
   private int number;
  /**
    *constructor.
    *@param numberIn user input number integer
    */
   public NumberOperations(int numberIn)
   {
      number = numberIn;
   }
   /**public method of that gets the number value.
     *@return number value
     */
   public int getValue()
   {
      return number;
   }
   /**
     *public method that calculates odd values under user number input.
     *@return output in String
     */
   public String oddsUnder()
   {
      String output = "";
      int i = 0;
      while (i < number)
      {
         if (i % 2 != 0)
         {
            output += i + "\t";
         
         }
         i++;
      }
      return output;
   }
   /**
     *public method that calculates powers of two under the user number.
     *@return output in String
     */
   public String powersTwoUnder()
   {
      String output = "";
      int powers = 1;
      while (powers < number)
      {
         output += powers + "\t"; //concatenate to output
         powers = powers * 2; //get next power of 2
      }
      return output;
      
     
   }
   
   /**
     *public method that compares the number to user input compare number.
     *@param compareNumber user input integer value
     *@return 1,-1,or 0
     */
   public int isGreater(int compareNumber)
   {  
      if (number > compareNumber)
      {
         return 1;
      }
      else if (number < compareNumber)
      {
         return -1;
      }
      else 
      {
         return 0;
      }
   }
   /**
     *convert the integer number value into String.
     *@return number in String
     */
   public String toString()
   {
      return number + "";
   }  
}