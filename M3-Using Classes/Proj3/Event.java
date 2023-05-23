import java.util.Scanner; 
import java.text.DecimalFormat;
import java.util.Random;
 /**Prints ticket information based on ticket code.
  *Application 
  *Project 3
  *Heey9on Son LLB 3
  *01/27/2020
  */
public class Event
{  /**
     *
     *@param args Command line arguments - not used.
     */
  
   public static void main(String[] args)
   {  
      Scanner userInput = new Scanner(System.in);
      String eventCode = "";
      String eventName = "";
      String eventTime = "";
      String eventDate = "";
      String eventMonth = "";
      String eventDay = "";
      String eventYear = "";
      String eventHour = "";
      String eventMinutes = "";
      String eventSeat = "";
      String eventRow = "";
      String eventSection = "";
      String eventPrice = "";
      String eventDiscount = "";
      double discount;
      double price;
      double cost;
      int prizeNumber;
      Random generator = new Random();
      DecimalFormat inDollars = new DecimalFormat("$#,##0.00");
      DecimalFormat inPercentage = new DecimalFormat("0%");
      DecimalFormat inDigits = new DecimalFormat("0000");
      System.out.print("Enter your event code: ");
      eventCode = userInput.nextLine();
      eventCode = eventCode.trim();
      if (eventCode.length() < 25)
      {
         System.out.println("\nInvalid Event Code.");
         System.out.println("Event code must " 
            + "have at least 26 characters.");     
      }
      else
      {
         eventName = eventCode.substring(25);
         eventDate = eventCode.substring(0, 8);
         eventMonth = eventDate.substring(0, 2);
         eventDay = eventDate.substring(2, 4);
         eventYear = eventDate.substring(4, 8);
         eventTime = eventCode.substring(8, 12);
         eventHour = eventTime.substring(0, 2);
         eventMinutes = eventTime.substring(2, 4);
         eventPrice = eventCode.substring(12, 17);
         price = Double.parseDouble(eventPrice) / 100;
         eventDiscount = eventCode.substring(17, 19);
         discount = Double.parseDouble(eventDiscount) / 100;
         cost = price - (price * discount);
         eventRow = eventCode.substring(21, 23);
         eventSection = eventCode.substring(19, 21);
         eventSeat = eventCode.substring(23, 25);
         prizeNumber = generator.nextInt(9999) + 1;
         System.out.println("");
         System.out.print("Event: " + eventName);
         System.out.print("   Date: " + eventMonth + "/"
             + eventDay + "/" + eventYear);
         System.out.println("   Time: " + eventHour + ":" + eventMinutes);
         System.out.print("Section: " + eventSection);
         System.out.print("   Row: " + eventRow);
         System.out.println("   Seat: " + eventSeat);
         System.out.print("Price: " + inDollars.format(price));
         System.out.print("   Discount: " + inPercentage.format(discount));
         System.out.println("   Cost: " + inDollars.format(cost));
         System.out.println("Prize Number: " + inDigits.format(prizeNumber));
      }
   }
   
}