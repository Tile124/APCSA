
/**
 * Tests the missileV8 class
 *
 * @author Ryan A. Rodriguez
 * @version 11/1/2018
 */
public class missileV8Tester
{
    
    
    public static void main(String[] args) {
        String missileName;
        double missileSpeed;
        double missilePower;
        double missileRangel;
        double missileFlyTime;
        Object[] dabxdd = new Object[3];
   
        missileV8 missile1 = new missileV8 ("Mini",50.5, 25.5);
        missileV8 missile2 = new missileV8 ("Modera",100.5, 50.5);
        missileV8 missile3 = new missileV8 ("BigBig",500.5, 250.5);
        dabxdd[0] = missile1;
        dabxdd[1] = missile2;
        dabxdd[2] = missile3;
        
        int useVar = Integer.MAX_VALUE;
        double useVar2 = Double.MAX_VALUE;
        
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