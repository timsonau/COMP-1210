 /**
  *UserInfo class used for UserInfoDriver.
  *Activity 4
  *Heeyoon Son LLB 3
  *02/03/2020
  */
public class UserInfo
{  
   // instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private static final int OFFLINE = 0, ONLINE = 1;
   private int status;
   
   //constructor
    /**
      * UserInfo is stored here.
      * intializes the field variables
      * @param firstNameIn stores first name
      * @param lastNameIn stores last name
      */ 
   public UserInfo(String firstNameIn, String lastNameIn)
    
   {  
     
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   
   // methods
    
    /**
      * public methods that can be used.
      * converts input into strings 
      * @return output in string
      */
   public String toString()
   {  
      
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE)
      {
         output += "Offline";
         
      }
      else
      {
         output += "Online";
      
      }
      return output;
   } 
   /**
     * method that mutates the locationIn.
     * @param locationIn sets locations
     */ 
   public void setLocation(String locationIn)
   {
      location = locationIn;
   }
   
   /**
     *setAge
     *method that mutates ageIn variable.
     *@return ageIn in integer
     *@param ageIn ages
     */
     
   public boolean setAge(int ageIn)
   {
      boolean isSet = false;
      if (ageIn > 0)
      {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   /**
     *getAge
     *method that gets age.
     *@return age
     */
   public int getAge()
   {
      return age;
   }
   /**
     *getLocation
     *method that gets location.
     *@return location
     */
   public String getLocation()
   {
      return location;
   }
  /**
    *logOff
    *method that mutates players status to OFFLINE.
    *
    */
   public void logOff()
   {
      status = OFFLINE;
   }
   /**
    *logOn
    *method that mutates players status to ONLINE.
    *
    */
   public void logOn()
   {
      status = ONLINE;
   }
   
   
      
}