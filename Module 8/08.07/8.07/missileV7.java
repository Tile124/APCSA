
/**
 * MissileV7 calculates missile range based on missile type
 *
 * @author Ryan A. Rodriguez
 * @version 10/28/2018
 */

    public class missileV7 {
       String missileName;
           double missileSpeed;
           double missilePower;
        
        public missileV7(String Name, double missileSpeed1, double missilePower1) {
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

