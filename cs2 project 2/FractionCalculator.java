/* Name: Niam Patel
 * CS2 Project 2 Fraction Calculator, Fall 2023
 * Note: Starter file updated 9/27/2023
 */

import java.util.Scanner;

/* This is the main class for your fraction calculator, and
 * only has static methods including main.  Comments in the
 * method bodies show the parts you need to change during
 * the project.
 */
class FractionCalculator {
   static Scanner scanner = new Scanner(System.in);

   public static Fraction parseFraction(String frac)

   {
      int n = 0;
      int d = 0;
      if (frac.indexOf("_") == -1) {
         int i = frac.indexOf("/");
         if (i != -1) {
            n = Integer.parseInt(frac.substring(0, i));//check if the first part is negitive then the whole thing is negitive 
            d = Integer.parseInt(frac.substring(i + 1));
         } else {
            n = Integer.parseInt(frac);
            d = 1; 
         }
      } else {
         int i = frac.indexOf("/");
         int u = frac.indexOf("_");
         int w = Integer.parseInt(frac.substring(0, u));
         n = Integer.parseInt(frac.substring(u + 1, i));
         d = Integer.parseInt(frac.substring(i + 1));
         if (w <= 0){
                  n = d * w + (-1* n);
         }
         else
                  n = d * w + n;


      }

      /*
       * DONE: Change this to construct a new Fraction object
       * representing the given fraction string. For example,
       * using -3/2 notation to mean new Fraction(-3, 2),
       * "5" should return 5/1, "-3/2" should return -3/2,
       * "2_1/2" should return 5/2, "0" should return 0/1,
       * and -2_1/2 should return -5/2.
       */
      Fraction ret = new Fraction(n, d);

      return ret;
   }

   public static Fraction addFractions(Fraction frac1, Fraction frac2) {
      int d1 = frac1.getDenominator();
      int d2 = frac2.getDenominator();
      int n1 = frac1.getNumerator();
      int n2 = frac2.getNumerator();
      int t1 = d1;
      int t2 = d2;
      d1 = d1*d2;
      d2 = d1;
      n1 = t2 * n1;
      n2 = t1 * n2;
      int n = n1 +n2;
      int d = d1;

      /*
       * DONE: Change this to construct and return a new Fraction
       * object representing the result of adding frac1 + frac2.
       * Please normalize your result before returning it.
       */

      Fraction result = new Fraction(n, d); // too simple
      result.normalize();
      return result;
   }

   public static Fraction subtractFractions(Fraction frac1, Fraction frac2) {
      int d1 = frac1.getDenominator();
      int d2 = frac2.getDenominator();
      int n1 = frac1.getNumerator();
      int n2 = frac2.getNumerator();
      int t1 = d1;
      int t2 = d2;
      d1 = d1*d2;
      d2 = d1;
      n1 = t2 * n1;
      n2 = t1 * n2;
      int n = n1 - n2;
      int d = d1;
      /*
       * DONE: Change this to construct and return a new Fraction
       * object representing the result of subtracting frac1 - frac2.
       * Please normalize your result before returning it.
       */

      Fraction result = new Fraction(n, d); // too simple
      result.normalize();

      return result;
   }

   public static Fraction multiplyFractions(Fraction frac1, Fraction frac2) {
      int d1 = frac1.getDenominator();
      int d2 = frac2.getDenominator();
      int n1 = frac1.getNumerator();
      int n2 = frac2.getNumerator();
      int n = n1 * n2;
      int d = d1* d2;
      
      
      
      /*
       * TODO: Change this to construct and return a new Fraction
       * object representing the result of multiplying frac1 * frac2.
       * Please normalize your result before returning it.
       */

      Fraction result = new Fraction(n, d); // too simple
      result.normalize();
      return result;
   }

   public static Fraction divideFractions(Fraction frac1, Fraction frac2) {
      int d1 = frac1.getDenominator();
      int d2 = frac2.getNumerator();
      int n1 = frac1.getNumerator();
      int n2 = frac2.getDenominator();
      int n = n1 * n2;
      int d = d1* d2;
      
      /*
       * DONE: Change this to construct and return a new Fraction
       * object representing the result of dividing frac1 / frac2.
       * Please normalize your result before returning it.
       */

      Fraction result = new Fraction(n, d); // too simple
      result.normalize();
      return result;
   }

   public static Fraction getResult(String left, String operator, String right) {
      /*
       * DONE: Change this to call the appropriate method for the
       * operator instead of always adding, and return the result.
       */
      Fraction leftFraction = parseFraction(left);
      Fraction rightFraction = parseFraction(right);
      Fraction result = null;
      if (operator.equals("+")){
          result = addFractions(leftFraction, rightFraction); 
      }
      else if (operator.equals("-")){
          result = subtractFractions(leftFraction, rightFraction); 
      }
      else if (operator.equals("/")){
          result = divideFractions(leftFraction, rightFraction); 
      }
      else{
          result = multiplyFractions(leftFraction, rightFraction); 
      }
      
         return result;
   }

   public static String produceOutput(String input) {
      int i = 0;
      String o = ""; 
      if (input.contains("+")){
  
         i = input.indexOf("+");
                  o = "+";
      }
      else if (input.contains("- ")){
         i = input.indexOf("- ");
                  o = "-";

      }
      else if (input.contains("*")){
         i = input.indexOf("*");
                  o = "*";

      }
      else if (input.contains("/ ")){
         i = input.indexOf("/ ");
                  o = "/";

      }
      /*
       * DONE: Change the first part of this method to extract substrings
       * from the input for the operator and each operand.
       * The input format is a left operand, a single space,
       * an operator that will be +, -, *, or /, another
       * single space, and a right operand.
       * Example: For input "1_3/4 - -1/4", the first operand
       * should be "1_3/4", the oper2ator should be "-", the
       * third operand should be "-1/4", and this method should
       * return the formatted result "2".s
       */
      String leftOperand = input.substring(0, i-1); 
      String operator = o;
      String rightOperand = input.substring(i+2); 
       // You don't need to change the lines below here
      Fraction result = getResult(leftOperand, operator, rightOperand);
      String formattedResult = result.getFormattedString();
      return formattedResult;
   }

   public static void main(String[] args) {
      // You don't need to change this, because it calls
      // the produceOutput method to do the interesting work.
      String input = scanner.nextLine();
      String output = produceOutput(input);
      System.out.println(output);
   }
}