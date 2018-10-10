
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
    for (int t = 0; t < convertedDiameters.length; t++) {
        
    System.out.println(convertedDiameters[t]);
}
    
}
    
    public static double[] convertToDiametersM(double[] arrayInput) {
        int startLength = arrayInput.length;
        double[] returnValue = new double[startLength];
        
        for (int i = 0; i < arrayInput.length; i++) {
           
            returnValue[i] = (arrayInput[i]*1000);
            
        }
        return returnValue;
    }
    
    
    public static double calculateSurfaceGravity() {
    
        return 0.0;
    }
    public static void writeResults() {
    
    }
    
    public static void readResults() {
    
    }
    
    public static void printResults() {
        
    }
}
