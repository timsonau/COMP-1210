import java.util.Scanner; 
import java.io.FileNotFoundException;
 /**
  *Application that presents operations on Ellipsoid and Ellipsoid List. 
  *Project 6
  *Heeyoon Son LLB 3
  *02/22/2020
  */
public class EllipsoidList2MenuApp
{  /**
     *
     *@param args Command line arguments - not used.
     *@throws FileNotFoundException used to scan file
     */
  
   public static void main(String[] args) throws FileNotFoundException
   {
      String myListName = "*** no listname assigned ***";
      Scanner userInput = new Scanner(System.in);
      Ellipsoid[] ellipsoidList = new Ellipsoid[100];
      EllipsoidList2 myEllipsoidList = 
         new EllipsoidList2(myListName, ellipsoidList, 0);
      String choice = "";
      String labelIn = "";
      double aIn = 0.0;
      double bIn = 0.0;
      double cIn = 0.0;
      Ellipsoid targetEllipsoid = null;
      
      String enterMessage = "Enter Code [R, P, S, A, D, F, E, or Q]: ";
      System.out.println("Ellipsoid List System Menu");
      System.out.println("R - Read File and Create Ellipsoid List");
      System.out.println("P - Print Ellipsoid List");
      System.out.println("S - Print Summary");
      System.out.println("A - Add Ellipsoid");
      System.out.println("D - Delete Ellipsoid");
      System.out.println("F - Find Ellipsoid");
      System.out.println("E - Edit Ellipsoid");
      System.out.println("Q - Quit Ellipsoid");
      
      do
      {
         System.out.print(enterMessage);
         choice = userInput.nextLine().trim();
         if (choice.length() == 0)
         {
            continue;
         }
         choice = choice.toUpperCase();
         char category = choice.charAt(0);
         switch (category)
         {
            case 'R':
               System.out.print("\tFile Name: ");
               String fileName = userInput.nextLine();
               myEllipsoidList = myEllipsoidList.readFile(fileName);
               System.out.println("\tFile read in and Ellipsoid " 
                  + "List created\n");
               break;
         
            case 'P':
               System.out.print(myEllipsoidList + "\n");
               break;
         
            case 'S':
               String summaryInfo = myEllipsoidList.summaryInfo();
               System.out.println("\n" + summaryInfo + "\n");
               break;
         
            case 'A':
               System.out.print("\tlabel: ");
               labelIn = userInput.nextLine();
            
               System.out.print("\ta: ");
               aIn = Double.parseDouble(userInput.nextLine());
            
               System.out.print("\tb: ");
               bIn = Double.parseDouble(userInput.nextLine());
            
               System.out.print("\tc: ");
               cIn = Double.parseDouble(userInput.nextLine());
               
               myEllipsoidList.addEllipsoid(labelIn, aIn, bIn, cIn);
               System.out.println("\t*** Ellipsoid added ***\n");
               break;
         
            case 'D':
               System.out.print("\tlabel: ");
               labelIn = userInput.nextLine();
               targetEllipsoid = myEllipsoidList.deleteEllipsoid(labelIn);
               
               if (targetEllipsoid != null)
               {
                  String newLabel = targetEllipsoid.getLabel();
                  System.out.println("\t\"" + newLabel + "\" deleted\n");
               }
               else
               {
                  System.out.println("\t\"" +  labelIn + "\" not found\n");
               }
               break;
            
            case 'F':
               System.out.print("\tlabel: ");
               labelIn = userInput.nextLine();
               targetEllipsoid = myEllipsoidList.findEllipsoid(labelIn);
               if (targetEllipsoid != null)
               {
                  System.out.println(targetEllipsoid + "\n");
               }
               else
               {
                  System.out.println("\t\"" + labelIn + "\" not found\n");
               }
               break;
            
            case 'E':
               System.out.print("\tlabel: ");
               labelIn = userInput.nextLine();
            
               System.out.print("\ta: ");
               aIn = Double.parseDouble(userInput.nextLine());
            
               System.out.print("\tb: ");
               bIn = Double.parseDouble(userInput.nextLine());
            
               System.out.print("\tc: ");
               cIn = Double.parseDouble(userInput.nextLine());
               
               targetEllipsoid = myEllipsoidList.editEllipsoid(labelIn, 
                  aIn, bIn, cIn);
               
               if (targetEllipsoid != null)
               {
                  String newLabel = targetEllipsoid.getLabel();
                  System.out.println("\t\"" + newLabel 
                     + "\" successfully edited\n");
               }
               else
               {
                  System.out.println("\t\"" +  labelIn + "\" not found\n");
               }
               break;
            
            case 'Q':
               break;      
         
            default:
               System.out.println("\t*** invalid code ***\n");
         }
      }
      
      while (!choice.equalsIgnoreCase("Q"));        
   }
   
}
