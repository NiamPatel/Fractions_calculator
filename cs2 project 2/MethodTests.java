/* This file contains tests for individual methods of
 * the Fraction and FractionCalculator classes.  It does not
 * duplicate the tests in the Tests class, so please make sure
 * they also pass before submitting your project.
 * Note this class has a main method that runs all the tests.  In
 * Visual Studio Code, the run button uses the main method in
 * whichever class you are looking at.
 * 10 out of 53 of these tests should pass on the starter project.
 */
 
public class MethodTests {
   private static int totalRun = 0; // keep track of total tests run
   private static int totalCorrect = 0; // keep track of total tests correct
   
   public static void reportResult(String input, String expected, String actual)
   {
      // compare expected result with actual result, update totals, print feedback
      totalRun++;
      if (expected.equals(actual))
      {
         totalCorrect++;
         System.out.println("Test passed: " + input + " -> " + actual);
      }
      else
      {
         System.out.println("Test failed: " + input + " -> " + actual + ", expected " + expected);
      }
   }
   public static void testGetFormattedString(Fraction fraction, String expected)
   {
      // run one test on getFormattedString method and report result
      String actual = null;
      try {
         actual = fraction.getFormattedString();
      }
      catch (Exception e)
      {
         actual = e.toString();
      }
      reportResult(fraction.toString(), expected, actual); 
   }
   public static void testNormalize(Fraction fraction, String expected)
   {
      // run one test on normalize method and report result
      String actual = null;
      String original = fraction.toString();
      try {
         fraction.normalize();
         actual = fraction.toString();
      }
      catch (Exception e)
      {
         actual = e.toString();
      }
      reportResult(original, expected, actual); 
   }
   public static void testParseFraction(String frac, String expected)
   {
      // run one test on parseFraction method and report result
      String actual = null;
      try {
         Fraction fraction = FractionCalculator.parseFraction(frac);
         actual = fraction.toString();
      }
      catch (Exception e)
      {
         actual = e.toString();
      }
      reportResult(frac, expected, actual); 
   }
   public static void testAddFractions(Fraction left, Fraction right, String expected)
   {
      // run one test on addFractions method and report result
      String actual = null;
      try {
         Fraction fraction = FractionCalculator.addFractions(left, right);
         actual = fraction.toString();
      }
      catch (Exception e)
      {
         actual = e.toString();
      }
      reportResult(left.toString()+" + "+right.toString(), expected, actual);
   }
   public static void testSubtractFractions(Fraction left, Fraction right, String expected)
   {
      // run one test on subtractFractions method and report result
      String actual = null;
      try {
         Fraction fraction = FractionCalculator.subtractFractions(left, right);
         actual = fraction.toString();
      }
      catch (Exception e)
      {
         actual = e.toString();
      }
      reportResult(left.toString()+" - "+right.toString(), expected, actual);
   }
   public static void testMultiplyFractions(Fraction left, Fraction right, String expected)
   {
      // run one test on multiplyFractions method and report result
      String actual = null;
      try {
         Fraction fraction = FractionCalculator.multiplyFractions(left, right);
         actual = fraction.toString();
      }
      catch (Exception e)
      {
         actual = e.toString();
      }
      reportResult(left.toString()+" * "+right.toString(), expected, actual);
   }
   public static void testDivideFractions(Fraction left, Fraction right, String expected)
   {
      // run one test on divideFractions method and report result
      String actual = null;
      try {
         Fraction fraction = FractionCalculator.divideFractions(left, right);
         actual = fraction.toString();
      }
      catch (Exception e)
      {
         actual = e.toString();
      }
      reportResult(left.toString()+" / "+right.toString(), expected, actual);
   }
   public static void testGetResult(String left, String operator, String right, String expected)
   {
      // run one test on getResult method and report result
      String actual = null;
      try {
         Fraction fraction = FractionCalculator.getResult(left, operator, right);
         actual = fraction.toString();
      }
      catch (Exception e)
      {
         actual = e.toString();
      }
      reportResult(left.toString()+" "+operator+" "+right.toString(), expected, actual);
   }
   
   public static void main(String[] args)
   {
      System.out.println("Starting to run method tests for FractionCalculator:");
      
      System.out.println("Starting getFormattedString tests...");
      testGetFormattedString(new Fraction(0, 1), "0");
      testGetFormattedString(new Fraction(1, 1), "1");
      testGetFormattedString(new Fraction(-1, 1), "-1");
      testGetFormattedString(new Fraction(5, 1), "5");
      testGetFormattedString(new Fraction(2, 3), "2/3");
      testGetFormattedString(new Fraction(-3, 4), "-3/4");
      testGetFormattedString(new Fraction(10, 3), "3_1/3");
      testGetFormattedString(new Fraction(-11, 3), "-3_2/3");
      
      System.out.println("Starting normalize tests...");
      testNormalize(new Fraction(0, 1), "0/1");
      testNormalize(new Fraction(-5, 1), "-5/1");
      testNormalize(new Fraction(2, 3), "2/3");
      testNormalize(new Fraction(-3, 2), "-3/2");
      testNormalize(new Fraction(4, 8), "1/2");
      testNormalize(new Fraction(-15, 3), "-5/1");
      testNormalize(new Fraction(64, 256), "1/4");
      
      System.out.println("Starting parseFraction tests...");
      testParseFraction("0", "0/1");
      testParseFraction("-3", "-3/1");
      testParseFraction("2/3", "2/3");
      testParseFraction("-4/5", "-4/5");
      testParseFraction("3_4/3", "13/3");
      testParseFraction("-2_1/5", "-11/5");
      
      System.out.println("Starting addFractions tests...");
      testAddFractions(new Fraction(1, 2), new Fraction(1, 3), "5/6");
      testAddFractions(new Fraction(-1, 2), new Fraction(1, 3), "-1/6");
      testAddFractions(new Fraction(-1, 2), new Fraction(-1, 3), "-5/6");
      testAddFractions(new Fraction(1, 2), new Fraction(1, 2), "1/1");
      testAddFractions(new Fraction(1, 64), new Fraction(-17, 64), "-1/4");
      testAddFractions(new Fraction(7, 11), new Fraction(-7, 11), "0/1");

      System.out.println("Starting subtractFractions tests...");
      testSubtractFractions(new Fraction(1, 2), new Fraction(-1, 3), "5/6");
      testSubtractFractions(new Fraction(-1, 2), new Fraction(-1, 3), "-1/6");
      testSubtractFractions(new Fraction(-1, 2), new Fraction(1, 3), "-5/6");
      testSubtractFractions(new Fraction(1, 2), new Fraction(-1, 2), "1/1");
      testSubtractFractions(new Fraction(1, 64), new Fraction(17, 64), "-1/4");
      testSubtractFractions(new Fraction(7, 11), new Fraction(7, 11), "0/1");
      
      System.out.println("Starting multiplyFractions tests...");
      testMultiplyFractions(new Fraction(2, 1), new Fraction(2, 1), "4/1");
      testMultiplyFractions(new Fraction(-2, 1), new Fraction(2, 1), "-4/1");
      testMultiplyFractions(new Fraction(-2, 1), new Fraction(-2, 1), "4/1");
      testMultiplyFractions(new Fraction(0, 1), new Fraction(7, 11), "0/1");
      testMultiplyFractions(new Fraction(1, 3), new Fraction(1, 4), "1/12");
      testMultiplyFractions(new Fraction(2, 3), new Fraction(4, 5), "8/15");
      testMultiplyFractions(new Fraction(3, 4), new Fraction(4, 3), "1/1");
      testMultiplyFractions(new Fraction(1, 4), new Fraction(-2, 5), "-1/10");
      
      System.out.println("Starting divideFractions tests...");
      testDivideFractions(new Fraction(2, 1), new Fraction(1, 2), "4/1");
      testDivideFractions(new Fraction(-2, 1), new Fraction(1, 2), "-4/1");
      testDivideFractions(new Fraction(-2, 1), new Fraction(-1, 2), "4/1");
      testDivideFractions(new Fraction(0, 1), new Fraction(11, 7), "0/1");
      testDivideFractions(new Fraction(1, 3), new Fraction(4, 1), "1/12");
      testDivideFractions(new Fraction(2, 3), new Fraction(5, 4), "8/15");
      testDivideFractions(new Fraction(3, 4), new Fraction(3, 4), "1/1");
      testDivideFractions(new Fraction(1, 4), new Fraction(-5, 2), "-1/10");
      
      System.out.println("Starting getResult tests...");
      testGetResult("1/2", "+", "1/3", "5/6");
      testGetResult("1/2", "-", "3/5", "-1/10");
      testGetResult("1/2", "*", "3/5", "3/10");
      testGetResult("-1/2", "/", "3/5", "-5/6");

      System.out.println("Finished method tests, " + totalCorrect + " out of " + totalRun + " passed.");
   }
}