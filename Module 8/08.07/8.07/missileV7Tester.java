
/**
 * Tests the missileV7 class
 *
 * @author Ryan A. Rodriguez
 * @version 10/28/2018
 */
public class missileV7Tester
{
    
    
    public static void main(String[] args) {
        String missileName;
        double missileSpeed;
        double missilePower;
        double missileRangel;
        double missileFlyTime;
        missileV7 missile1 = new missileV7 ("Mini",50.5, 25.5);
        missileV7 missile2 = new missileV7 ("Modera",100.5, 50.5);
        missileV7 missile3 = new missileV7 ("BigBig",500.5, 250.5);
        
        System.out.printf("%-16s", "");
        System.out.printf("USA Missiles");
        System.out.println();
        System.out.printf("%-12s","Name" );
        System.out.printf("%-12s","Speed" );
        System.out.printf("%-12s","Power" );
        System.out.printf("%-12s","Range(mi)" );
        System.out.printf("%-12s","Fly Time(s)" );
        System.out.println();
        System.out.println();
        System.out.printf("%-12s", missile1.getMissileName());
        System.out.printf("%-12s", missile1.getMissileSpeed());
        System.out.printf("%-12s", missile1.getMissilePower());
        System.out.printf("%-12s", missile1.getMissileRange());
        System.out.printf("%-12s", missile1.getMissileFlyTime());
        System.out.println();
       System.out.printf("%-12s", missile2.getMissileName());
        System.out.printf("%-12s", missile2.getMissileSpeed());
        System.out.printf("%-12s", missile2.getMissilePower());
        System.out.printf("%-12s", missile2.getMissileRange());
        System.out.printf("%-12s", missile2.getMissileFlyTime());
         System.out.println();
       System.out.printf("%-12s", missile3.getMissileName());
        System.out.printf("%-12s", missile3.getMissileSpeed());
        System.out.printf("%-12s", missile3.getMissilePower());
        System.out.printf("%-12s", missile3.getMissileRange());
        System.out.printf("%-12s", missile3.getMissileFlyTime());
        
}
}