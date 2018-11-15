
/**
 * @purpose: Launches simulated catapults at different mph and angles to test physics
 *
 * @author: Ryan A. Rodriguez
 * @version: 11/15/2018
 */
public class CatapultLauncher
{
    //important Variables
    private double veloci;
    private double degree;
    private double distan;
    // The Object
    public CatapultLauncher(double veloci1, double degree1) {
    veloci = veloci1;
    degree = degree1;
    }
    // Calculates the distance
    public void calculateDistan() {
    double temp1= Math.pow(veloci, 2);
    double temp2 = Math.sin((2*(Math.toRadians(degree))));
    distan = (temp1 * temp2) / 9.8;
    }
    // getter methods
    public double getVeloci() {
    return veloci;
    }
    public double getDegree() {
    return degree;
    }
    public double getDistan() {
    return distan;
    }
    
    
}
