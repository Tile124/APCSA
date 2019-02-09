
/**
 * Write a description of class Mountain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mountain extends Terrain
{
    int amountOfMountains;
    int length;
    int width;
    public Mountain (int l, int w, int mountainCount)
    {
        super(l,w);
        length = l;
        width = w;
        amountOfMountains = mountainCount;
    }
    
    public String getMountains() {
    return ("Mountain land has dimensions " + length + " X " + width + "and has "+ amountOfMountains + " mountains");
    }
   
}
