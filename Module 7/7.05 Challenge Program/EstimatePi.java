import java.util.Scanner;
/**
 * This program estimates the value of Pi by throwing a simulated dart 
 * that the user specfies
 *
 * @author Ryan A. Rodriguez
 * @version 10/11/2018
 */
public class EstimatePi
{
    public static void main(String[] args) {
    int dartThrows = 0;
    int trials = 0;
    
    Scanner in = new Scanner(System.in);
    System.out.println("How many times should the Dart be thrown?");
    dartThrows = in.nextInt();
    System.out.println("How many times should the trial be run?");
    trials = in.nextInt();
    System.out.println(trialRun(dartThrows, trials));
        
    }
    
    public static double[] trialRun(int dartThrows, int trialRuns) {
    double xValue = 0;
    double yValue = 0;
    int numberOfHits[] = new Int[trialRuns];
    for (int a = 0; a < trialRuns; a++) {
     
    for (int i = 0; i < dartThrows; i++) {
        xValue = Math.pow((2*Math.random()-1), 2);
        yValue = Math.pow((2*Math.random()-1), 2);
        
        if (xValue + yValue <= 1) {
            numberOfHits[a] += 1;
        }
    }
}
    return numberOfHits;
    }
    
    public static double Pi(int numberOfHits, int trialRuns, int dartThrows) {
    
        double returnValue = (numberOfHits / (trialRuns * dartThrows))
        return 0.0;
    }
    
    /*
    public static int[] userInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("How many times should the Dart be thrown?");
        
    return 0;
    }
    */

}
