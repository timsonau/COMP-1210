/**
*class that stores method and info about a Customer.
*Activity 8B
*Heeyoon Son LLB 3
*03/23/2020
*/
public class Customer implements Comparable<Customer>
{
   private String name;
   private String location;
   private double balance;
   
/**
  * Constructor method for Customer class.
  * @param nameIn user input name.
  */
   
   public Customer(String nameIn)
   {
      name = nameIn;
      location = "";
      balance = 0;
   } 

/**
  * sets location with user input location.
  * @param locationIn user location input
  */
  
   public void setLocation(String locationIn)
   {
      location = locationIn;
   }

/**
  * sets balance with user input amount in $.
  * @param balanceIn user input amount.
  */
  
   public void changeBalance(double balanceIn)
   {
      balance += balanceIn;
   }

/**
  * Accessor method for field variable location of the customer.
  * @return location
  */
     
   public String getLocation()
   {
      return location;
   }

/**
  * Accessor method for field variable balance of the customer.
  * @return balance
  */
     
   public double getBalance()
   {
      return balance;
   }

/**
  * sets the location if the user input the city and state seperately.
  * @param city userInput city name
  * @param state userInput state name
  */
    
   public void setLocation(String city, String state)
   {
      location = city + ", " + state;
   }

/**
  * converts customer info into String. 
  * @return result combined string of Customer info
  */
     
   public String toString()
   {
      String result = name + "\n" + location + "\n$" + balance;
      return result; 
   }

/**
  * compares the balance of 2 customers in respect to the instansiated object.
  * @param obj customer object the user wants to compare to
  * @return 0 if balance is equal
  */
    
   public int compareTo(Customer obj)
   {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001)
      {
         return 0;
      }
      else if (this.balance < obj.getBalance())
      {
         return -1;
      }
      else
      {
         return 1;
      }
   }
}