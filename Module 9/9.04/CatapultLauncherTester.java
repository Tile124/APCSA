
/**
 * @purpose: to test the Catapult Launcher class
 *
 * @author: Ryan A. Rodriguez
 * @version: 11/15/2018
 */
public class CatapultLauncherTester
{
   public static void main(String[] args) {
       // Creates the objects
    CatapultLauncher[][] catapultArray = new CatapultLauncher[6][6];
    int tempSpeed = 0;
    for (int i = 0; i < catapultArray.length; i++) {
     tempSpeed = 20 + (5 * i);
        for (int b = 0; b < catapultArray.length; b++) {
        catapultArray[i][b] = new CatapultLauncher(tempSpeed, ((5*b)+25));
        }
        
    }
       
    // Prints Output
    System.out.println("                      Projectile Distanc                    ");
        System.out.println("MPH   25 Deg    30 Deg    35 Deg    40 Deg    45 Deg");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        
        for (CatapultLauncher[] catapultVar : catapultArray) {
            
            System.out.printf("%-6.0f ", catapultVar[0].getVeloci());
            for (int i = 1; i < catapultVar.length; i++) {
                catapultVar[i].calculateDistan();
                System.out.printf("%-9.2f ", catapultVar[i].getDistan());
            }
            System.out.printf("\n");
        }
       
    }
}
