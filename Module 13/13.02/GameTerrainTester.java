
/**
 * Write a description of class GameTerrainTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameTerrainTester
{
    public static void main(String[] args) {
     Terrain land = new Terrain(500, 999);
     Forest forest = new Forest(99,11,999999);
     WinterMountain winterLand = new WinterMountain(67,68,68,99);
     Mountain mountain = new Mountain(99,99,99);
     
     System.out.println(land.getTerrainSize());
        
    }
}
