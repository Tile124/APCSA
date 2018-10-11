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
        
    }
    
    public static double trialRun(int dartThrows, int trialRuns) {
    double xValue = 0;
    double yValue = 0;
    for (int i = 0; i < dartThrows; i++) {
        xValue = ( 2 * Math.random()) - 1
        // x^2 + y^2 <=1
    }
    
    }
    /*
    public static int[] userInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("How many times should the Dart be thrown?");
        
    return 0;
    }
    */

}
