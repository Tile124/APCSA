import java.io.IOException;
import java.io.PrintWriter;
/**
 * Determines the surface gravity on each planet in our solar system
 *
 * @author Ryan A. Rodriguez
 * @version 10/8/2018
 */
public class PlanetGravity
{
   public static void main(String[] args) throws IOException {
       // Variables
    String[] planetNames = new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", };
    double[] diameters = new double[]{4880, 12103.6, 12756.3, 6794, 142984, 120536, 51118, 49532};
    double[] mass = new double[]{3.30e23, 4.869e24, 5.972e24, 6.4219e23, 1.900e27, 5.68e26, 8.683e25, 1.0247e26};
    
    // Calls the Methods
    double[] convertedDiameters = convertToDiametersM(diameters);
    double[] surfaceGravity = calculateSurfaceGravity(mass, mass, convertedDiameters);
    writeResults(surfaceGravity);
    printResults(planetNames, diameters, mass, surfaceGravity);
    
}

    // Converts Diameters to Meters
    public static double[] convertToDiametersM(double[] arrayInput) {
        int startLength = arrayInput.length;
        double[] returnValue = new double[startLength];
        
        for (int i = 0; i < arrayInput.length; i++) {
           
            returnValue[i] = (arrayInput[i]*1000);
            
        }
        return returnValue;
    }
    
    // Calculates the surface Gravity
    public static double[] calculateSurfaceGravity(double[] inputArray, double[] mass, double[] convertedDiameters) {
        double[] surfaceGravity = new double[inputArray.length];
        for (int c = 0; c < inputArray.length; c++) {
            surfaceGravity[c] = ( ( (6.67 * Math.pow(10, -11)) * (mass[c]) ) /( Math.pow((convertedDiameters[c] / 2), 2 ) ) ) ;
        }
        
        return surfaceGravity;
    }
    
    // Writes the results
    public static void writeResults(double[] surfaceGravity) throws IOException {
        PrintWriter writeFile = new PrintWriter("PlanetResults.txt");
        for (int a = 0; a < surfaceGravity.length; a++){
            writeFile.println(Math.round(surfaceGravity[a]*100.00)/100.0);
    }
    writeFile.close();
    }
    
    /*
    public static void readResults() {
    
    }
    */
   
   // Output
    public static void printResults(String[] planetNames, double[] diameters, double[] mass, double surfaceGravity[]) {
        System.out.printf("%-23s","\n");
        System.out.printf("%-16S", "Planetary Data");
        System.out.printf("%-16s", "\nPlanet");
        System.out.printf("%-16s", "Diameter(KM)");
        System.out.printf("%-16s", "Mass(KG)");
        System.out.printf("%-16s", "g (m/s^2)");
        System.out.println("\n***************************************************************");
        for (int b = 0; b < surfaceGravity.length; b++) {
            System.out.printf("%-16s", planetNames[b]);
            System.out.printf("%-16s", (int)diameters[b]);
            System.out.printf("%-16s", mass[b]);
            System.out.printf("%-16s", Math.round(surfaceGravity[b] * 100.00) / 100.00);
            System.out.println("");
            
        }
        
    }
}
