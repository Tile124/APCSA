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
    double piValues[] = Pi(trialRun(dartThrows, trials),trials, dartThrows);
    output(piValues);
    }
    
    // Prints the pi values
    public static void output(double[] piValues) {
    for (int i = 0; i < piValues.length; i++) {
    System.out.println("Trial [ " + (i+1) + " ]: pi = "+ piValues[i]);
    
    }
    }
    
    //Simulates the trial runs
    public static int[] trialRun(int dartThrows, int trialRuns) {
    double xValue = 0;
    double yValue = 0;
    int numberOfHits[] = new int[trialRuns];
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
    
    // Calculates Pi
    public static double[] Pi(int[] numberOfHits, int trialRuns, int dartThrows) {
    double returnValues[] = new double[numberOfHits.length];
    for (int i = 0; i < numberOfHits.length; i++) {
        returnValues[i] = (numberOfHits[i] / (double)dartThrows) *4;
        
    }
    return returnValues;
    }
    
    // Not needed
    /*
    public static int[] userInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("How many times should the Dart be thrown?");
        
    return 0;
    }
    */

}
