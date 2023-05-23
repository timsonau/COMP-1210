import java.text.DecimalFormat;
 /**
  *Ellipsoid class containing methods used in the EllipsoidApp.
  *Project 4
  *Heeyoon Son LLB 3
  *02/06/2020
  */
public class Ellipsoid
{  
   //instance variables
   private String label = "";
   private double a = 0;
   private double b = 0;
   private double c = 0;
   //constructor
   
   /**
     * Creates Ellipsoid object.
     * @param labelIn stores first name
     * @param aIn user input a value
     * @param bIn user input b value
     * @param cIn user input c value
     */
   public Ellipsoid(String labelIn, double aIn, double bIn, double cIn)
   {
      setA(aIn);
      setB(bIn);
      setC(cIn);
      setLabel(labelIn);
      
   }
 
  //methods
  
  /**
    *public method.
    *returns field value label
    * @return field label
    */ 
   public String getLabel()
   {
      return label;
   }
   
   /**
     * public method.
     * replaces field value label with user input labelIn
     * @param labelIn user input label value
     * @return label
     */
   public boolean setLabel(String labelIn)
   {  
      boolean isSet = false;
      if (labelIn != null)
      {
         label = labelIn.trim();
         isSet = true;
      }
      return isSet;
   }
    
    /**
     * public method.
     * gets the field value a
     * @return a
     */
   public double getA()
   {
      return a;
   }
   
   /**
     * public method.
     * replaces field value a with user input aIn
     * @param aIn user input a value
     * @return isBGreaterThanZero
     */
   public boolean setA(double aIn)
   {             
      boolean isAGreaterThanZero = false;
      if (aIn > 0)
      {
         a = aIn;
         isAGreaterThanZero = true;
      }
      
      return isAGreaterThanZero;
   }
   
   /**
     * public method.
     * gets the field value b
     * @return b
     */
   public double getB()
   { 
      return b;
   }
   
   /**
     * public method.
     * replaces field value a with user input bIn
     * @param bIn user input b value
     * @return isBGreaterThanZero
     */
   public boolean setB(double bIn)
   {  
      boolean isBGreaterThanZero = false;
      if (bIn > 0)
      {
         b = bIn;
         isBGreaterThanZero = true;
      }
      return isBGreaterThanZero;
   }
   
   /**
     * public method.
     * gets the field value c
     * @return c
     */
   public double getC()
   {
      return c;
   }
   
   /**
     * public method.
     * replaces field value a with user input cIn
     * @param cIn user input c value
     * @return isCGreaterThanZero
     */
   public boolean setC(double cIn)
   {  
      boolean isCGreaterThanZero = false;
      if (cIn > 0)
      {
         c = cIn;
         isCGreaterThanZero = true;
      }
      
      return isCGreaterThanZero;
   }
   
   /**
     *public method that calulates volume of the ellipsoid with aIn bIn cIn.
     *@return volume
     */
   public double volume()
   {
      double volume = 0;
      volume = (4 * Math.PI * a * b * c) / 3;
      return volume;
   }
   
   /**
     *public method that calulates surface area of the ellipsoid 
      with aIn bIn cIn.
     *@return surfaceArea
     */
   public double surfaceArea()
   {  
      double surfaceArea = 0;
      surfaceArea = Math.pow(a * b, 1.6) + Math.pow(a * c, 1.6)
         + Math.pow(b * c, 1.6);
      surfaceArea = Math.pow(surfaceArea / 3, 1 / 1.6);
      surfaceArea = 4 * Math.PI * surfaceArea;
      return surfaceArea;
   }
   
   /**
     *public method that convert the result into string.
     *@return information
     */
   public String toString()
   {
      DecimalFormat dFormat = new DecimalFormat("#,##0.0###");
      String information = "Ellipsoid " + "\"" + label
         + "\"" + " with axes a = " + a + ", " + "b = " + b
         + ", " + "c = " + c + " units has:" + "\n\t";
      information += "volume = "  + dFormat.format(volume()) 
         + " cubic units" + "\n\t";
      information += "surface area = "  + dFormat.format(surfaceArea())
         + " square units"; 
      return information;
   }
}