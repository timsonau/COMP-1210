/**
  *The Scores class containg methods for Arrays. 
  *Activity 7
  *Heeyoon Son LLB 3
  *03/02/2020
  */
  
public class Scores
{  
//instance variable
   private int[] numbers;

/**
  * Creates a Scores Arrays Object.
  * @param numbersIn input Array
  */
  
   public Scores(int[] numbersIn)
   {
      numbers = numbersIn;
   }

/**
  * method of Scores class that finds the even numbers of the Array.
  * @return evens
  */
    
   public int[] findEvens()
   {
      int numbersEven = 0;
      
      for (int i = 0; i < numbers.length; i++)
      {
         if ((numbers[i] % 2) == 0)
         {
            numbersEven++;
         }
      }
      
      int[] evens = new int[numbersEven];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++)
      {
         if ((numbers[i] % 2) == 0)
         {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
 
/**
  * method of Scores class that finds the odd numbers of the Array.
  * @return odds
  */
   
   public int[] findOdds()
   {
      int numbersOdd = 0;
      
      for (int i = 0; i < numbers.length; i++)
      {
         if ((numbers[i] % 2) != 0)
         {
            numbersOdd++;
         }
      }
      
      int[] odds = new int[numbersOdd];
      int count = 0;
      
      for (int i = 0; i < numbers.length; i++)
      {
         if ((numbers[i] % 2) != 0)
         {
            odds[count] = numbers[i];
            count++;
         }
      }
      
      return odds; 
   }

/**
  * method of Scores class that calculates the average numbers of the Array.
  * @return avg
  */
    
   public double calculateAverage()
   {
      int sum = 0;
      for (int i = 0; i < numbers.length; i++)
      {
         sum += numbers[i];
      } 
      return ((double) sum / numbers.length);
   }

/**
  * method of Scores class that converts resulting Array into String.
  * @return result
  */
    
   public String toString()
   {
      String result = "";
      
      for (int i = 0; i < numbers.length; i++)
      {
         result += numbers[i] + "\t";
      }
      
      return result;
   }

/**
  * method of Scores class that converts resulting Array into String in reverse.
  * @return result
  */
    
   public String toStringInReverse()
   {
      String result = "";
      //numbers.length - 1 = last index of the Array
      for (int i = numbers.length - 1; i >= 0; i--)
      {
         result += numbers[i] + "\t";
      }
      
      return result;
   }
}