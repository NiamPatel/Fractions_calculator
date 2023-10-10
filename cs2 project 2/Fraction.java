/* The Fraction class represents a simple fraction.
 * Comments in the method bodies show the parts you
 * will need to change during the project.
 */
public class Fraction
{
   private int numerator;
   private int denominator;
   
   public Fraction(int num, int den)
   {
      numerator = num;
      denominator = den;
   }
   
   public int getNumerator()
   {
      return numerator;
   }
   
   public int getDenominator()
   {
      return denominator;
   }
   
   public String toString()
   {
      return numerator + "/" + denominator;
   }
   
   public static int gcd(int a, int b)
   {
      // This returns the greatest common divisor of a and b,
      // which will be useful in your normalize method.  For
      // example, gcd(5, 15) evaluates to 5.  You don't need
      // to change it.
      a = Math.abs(a);
      b = Math.abs(b);
      int max = Math.max(a, b);
      int min = Math.min(a, b);
      while (min != 0) {
         int temp = min;
         min = max % min;
         max = temp;
      }
      return max;
   }

   public void normalize()
   {
      
       if (denominator <= 0){
         numerator = numerator * -1;
         denominator = denominator * -1;
       } 
       int fracgnc = gcd(numerator,denominator);
             numerator = numerator / fracgnc; 
         denominator = denominator / fracgnc;

      /* DONE: Add code here to change the numerator and denominator
       * as needed so that the denominator is positive and the
       * fraction is in lowest terms.  For example, it should
       * change 6/-3 into -2/1, -14/-6 into 7/3.  When the
       * numerator is 0, just set the denominator to 1, for
       * example it should change 0/5 into 0/1.
       */
      
   }
   
   public String getFormattedString()
   {
         String format = "3";
      if (denominator == 1){
         format = "" + numerator;
      }else if ((Math.abs(numerator) < Math.abs(denominator ))){
         format = "" + numerator + "/" + denominator;
      } 
      else if ((Math.abs(numerator) > Math.abs(denominator ))){
         int t = (int) numerator/denominator;
         format = "" + t + "_"+  (Math.abs((denominator * t)- numerator)) + "/" + denominator;
      }
     


      /* DONE: Change this code to format the fraction as a String.
       * This can assume the fraction is already normalized,
       * and should return a formatted String representing
       * the fraction.  It should prefer integers, then 
       * proper fractions, then mixed fractions, and should not
       * return an improper fraction.  For example, 3/1 should
       * return "3", -2/3 should return "-2/3", and 8/3 should
       * return "2_2/3".
       */
     // System.out.println(format);
      
      return format;
   }
}