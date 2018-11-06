import java.util.Scanner;
import java.util.ArrayList;
/**
 * @purpose: to test the DartThrower class
 *
 * @author Ryan A. Rodriguez
 * @version 11/6/2018
 */
public class DartThrowerTester
{
    public static void main(String[] args) {
        // array of objects
    ArrayList<DartThrower> trialRuns = new ArrayList<DartThrower>();
    
    int dartThrows = 0;
    int trials = 0;
   // input and toString methods
    Scanner in = new Scanner(System.in);
    System.out.println("How many times would you like the dart to be thrown in each trial?");
    dartThrows = in.nextInt();
    System.out.println("How many trials would you like to be run?");
    trials = in.nextInt();
    for (int i = 0; i < trials; i++) {
        trialRuns.add(new DartThrower(trials));
    }
    DartThrower dataRecord;
// Output
   System.out.printf("%-10s", "Trial #");
   System.out.println("PiValue");
   System.out.println("----------------------------------");
   
    for (int abc = 0; abc < trialRuns.size(); abc++)
    {
        // important dataRecord constructor
  dataRecord = trialRuns.get(abc);
   System.out.printf("%-10s",abc+1);
   System.out.print(dataRecord.getPiValue());
   System.out.println();
   
    
}

}
}