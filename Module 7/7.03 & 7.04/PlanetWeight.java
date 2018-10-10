import java.io.File;
import java.util.Scanner;
import java.io.IOException;
/**
 * Determines your weight on other planets in our solar system
 *
 * @author Ryan Rodriguez
 * @version 10/10/2018
 */
public class PlanetWeight
{
    public static void main (String[] args) throws IOException {
    // Variables
    String[] planetNames = new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", };
    double[] mass = new double[]{3.30e23, 4.869e24, 5.972e24, 6.4219e23, 1.900e27, 5.68e26, 8.683e25, 1.0247e26};
    
    // Calling the other methods
    double[] gravity = readFile(planetNames);
    printResults(gravity,calculateWeightOnPlanets(userInput(), gravity), planetNames);
    
    }
    // Reads the file
    public static double[] readFile (String[] arraySize) throws IOException {
       File surfaceGravity = new File("PlanetResults.txt");
       Scanner inTxtFile = new Scanner(surfaceGravity);
       double[] returnValues = new double[arraySize.length];
       for (int i = 0; i< arraySize.length; i++){
         returnValues[i] = inTxtFile.nextDouble();
        }
        return returnValues;
    }
    // User input
    public static double userInput () {
        Scanner in = new Scanner(System.in);
        System.out.println ("Please enter your weight in Pounds: ");
        double userInput = in.nextDouble();
        return userInput;
    }
    // Creates an array with the values of weight on other planet
    public static double[] calculateWeightOnPlanets(double userWeight, double[] gravity) {
        double[] newWeight = new double[gravity.length];
        double mass = userWeight * 453.59237;
        for (int i = 0; i < gravity.length; i++) {
            
            newWeight[i] = ( ( (userWeight * 453.59237) * (gravity[i]/ 9.79) ) / 453.59237);
            
        }
        
        return newWeight;
    }
    // Output
    public static void printResults(double[] gravity, double[] newWeight, String[] planetNames) {
     System.out.printf("%-18s","\n");
        System.out.printf("%-16S", "Weight on other Planet");
        System.out.printf("%-16s", "\nPlanet");
        System.out.printf("%-16s", "Gravity");
        System.out.printf("%-16s", "Weight (lbs)");
        System.out.println("\n***************************************************************");
        for (int b = 0; b < newWeight.length; b++) {
            System.out.printf("%-16s", planetNames[b]);
            System.out.printf("%-16s", Math.round(gravity[b]*100.00) / 100.00);
            System.out.printf("%-16s", Math.round(newWeight[b]*100.00) / 100.00);
            System.out.println("");
            
        }   
    }
}
