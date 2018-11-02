
/**
 * MissileV8 calculates missile range based on missile type
 *
 * @author Ryan A. Rodriguez
 * @version 11/1/2018
 */

    public class missileV8 {
       String missileName;
           private double missileSpeed;
           private double missilePower;
           int useVar = Integer.MAX_VALUE;
        double useVar2 = Double.MAX_VALUE;
        
        public missileV8(String Name, double missileSpeed1, double missilePower1) {
           missileName = Name;
           missileSpeed = missileSpeed1;
           missilePower = missilePower1;
        
}
        public String getMissileName() {
            return missileName;
}

public double getMissileSpeed() {
    return missileSpeed;
}

public double getMissilePower() {
return missilePower;
}

public double getMissileRange() {
return missileSpeed * missilePower;

}
public double getMissileFlyTime() {
return (missileSpeed*8*8*8) - missilePower;
}
}

