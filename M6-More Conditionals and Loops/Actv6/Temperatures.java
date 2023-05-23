import java.util.ArrayList; 
 /**
  *ArrayList that hold a set of integer values representing daily temperatures.
  *Activity 6 
  *Heeyoon Son LLB 3
  *01/27/2020
  */
public class Temperatures
{  //instance variables
   private ArrayList<Integer> temperatures;
  
/**
  * Creates Integer ArrayList object.
  * @param temperaturesIn stores the list of temperatures 
  */
  
   public Temperatures(ArrayList<Integer> temperaturesIn)
   {
      temperatures = temperaturesIn;
   }
   
/**
  * returns the lowest temperature in the list.
  * @return low 
  */
  
   public int getLowTemp()
   {
      if (temperatures.isEmpty())
      {
         return 0;
      }
      else
      {
         int low = temperatures.get(0);
         for (int i = 0; i < temperatures.size(); i++)
         {
            if (temperatures.get(i) < low)
            {
               low = temperatures.get(i);
            }
         }
         return low;
      }
   }

/**
  * returns the highest temperature in the list.
  * @return high 
  */
  
   public int getHighTemp()
   {
      if (temperatures.isEmpty())
      {
         return 0;
      }
      else
      {
         int high = temperatures.get(0);
         for (Integer temp : temperatures)
         {
            if (temp > high)
            {
               high = temp;
            }
         }
         return high;
      
      }
   }
 
/**
  * returns the lowIn or the lowest temperature in the list.
  * @param lowIn user Input temperature
  * @return lowIn 
  */
    
   public int lowerMinimum(int lowIn)
   {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }

/**
  * returns the highIn or the lowest temperatures in the list.
  * @param highIn user Input temperature
  * @return highIn
  */
  
   public int higherMaximum(int highIn)
   {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }

/**
  * returns the results in String.
  * @return temperature
  */ 
   
   public String toString()
   {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
  
}