/* This file contains tests for the FractionCalculator class.
 * You can add your own.  Please make sure they pass before submitting your project.
 * Note this class has a main method that runs all the tests.  In
 * Visual Studio Code, the run button uses the main method in
 * whichever class you are looking at.
 * 0 out of 31 of these tests should pass on the starter project.
 */
 
public class Tests {
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
   
   public static void testProduceOutput(String input, String expected)
   {
      // run one test on the produceOutput method and report the result
      String actual = FractionCalculator.produceOutput(input);
      reportResult(input, expected, actual);
   }
   
   public static void main(String[] args)
   {
      System.out.println("Starting to run tests for FractionCalculator:");
      
      testProduceOutput("1/3 + 1/2", "5/6");
      testProduceOutput("1/3 * 1/2", "1/6");
      testProduceOutput("1/2 - 1/3", "1/6");
      testProduceOutput("1/3 / 1/2", "2/3");
      
      testProduceOutput("1 + 2", "3");
      testProduceOutput("2 * 4", "8");
      testProduceOutput("5 - 3", "2");
      testProduceOutput("10 / 2", "5");
      
      testProduceOutput("-1/2 + -1/3", "-5/6");
      testProduceOutput("1/3 - 1/2", "-1/6");
      testProduceOutput("-1/4 * 1/5", "-1/20");
      testProduceOutput("-1/4 / -1/3", "3/4");
      
      testProduceOutput("-5 + 2", "-3");
      testProduceOutput("5 + -2", "3");
      
      testProduceOutput("3/4 - -1/4", "1");
      testProduceOutput("-3/4 / 3/4", "-1");
      
      testProduceOutput("3/5 + 4/5", "1_2/5");
      testProduceOutput("1_3/8 - 1", "3/8");
      testProduceOutput("2/7 * 8", "2_2/7");
      testProduceOutput("1/2 / 3/16", "2_2/3");
      
      testProduceOutput("32768 / -256", "-128");
      testProduceOutput("6_2/3 / 4/5", "8_1/3");

      testProduceOutput("-1_2/3 + 1/3", "-1_1/3");      
      testProduceOutput("0 - 9_3/4", "-9_3/4");
      testProduceOutput("-1_2/3 * -1_1/7", "1_19/21");
      testProduceOutput("-1_2/3 / -1_1/7", "1_11/24");
      
      testProduceOutput("1_7/9 / -4/15", "-6_2/3");
      testProduceOutput("2/3 + 4/5", "1_7/15");
      testProduceOutput("-4_5/6 - -1_2/3", "-3_1/6");
      testProduceOutput("-4_5/6 * 0", "0");
      
      testProduceOutput("-1_19/21 - -1_19/21", "0");

      System.out.println("Finished tests, " + totalCorrect + " out of " + totalRun + " passed.");
   }
   
}