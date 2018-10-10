import java.io.IOException;
import java.io.PrintWriter;
/**
 * Determines the surface gravity on each planet in our solar system
 *
 * @author Ryan A. Rodriguez
 * @version 10/9/2018
 */
public class PlanetGravity
{
   public static void main(String[] args) {
    String[] planetNames = new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", };
    double[] diameters = new double[]{4880, 12103.6, 12756.3, 6794, 142984, 120536, 51118, 49532};
    double[] mass = new double[]{3.30e23, 4.869e24, 5.972e24, 6.4219e23, 1.900e27, 5.68e26, 8.683e25, 1.0247e26};
    double[] convertedDiameters = convertToDiametersM(diameters);
    double[] surfaceGravity = calculateSurfaceGravity(mass, mass, convertedDiameters);
    printResults();
    
}
    
    public static double[] convertToDiametersM(double[] arrayInput) {
        int startLength = arrayInput.length;
        double[] returnValue = new double[startLength];
        
        for (int i = 0; i < arrayInput.length; i++) {
           
            returnValue[i] = (arrayInput[i]*1000);
            
        }
        return returnValue;
    }
    
    
    public static double[] calculateSurfaceGravity(double[] inputArray, double[] mass, double[] convertedDiameters) {
        double[] surfaceGravity = new double[inputArray.length];
        for (int c = 0; c < inputArray.length; c++) {
            surfaceGravity[c] = ( ( (6.67 * Math.pow(10, -11)) * (mass[c]) ) /( Math.pow((convertedDiameters[c] / 2), 2 ) ) ) ;
        }
        
        return surfaceGravity;
    }
    public static void writeResults(double[] surfaceGravity) throws IOException {
        PrintWriter writeFile = new PrintWriter("PlanetResults.txt");
        for (int a = 0; a < surfaceGravity.length; a++){
            writeFile.println(surfaceGravity[a]);
    }
    writeFile.close();
    }
    
    /*
    public static void readResults() {
    
    }
    */
   
    public static void printResults() {
        System.out.printf("%-23s","\n");
        System.out.printf("%-16S", "Planetary Data");
        System.out.printf("%-16s", "\nPlanet");
        System.out.printf("%-16s", "Diameter(KM)");
        System.out.printf("%-16s", "Mass(KG)");
        System.out.printf("%-16s", "g (m/s^2)");
        System.out.println("\n***************************************************************");
        
    }
}
