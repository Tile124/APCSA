
/**
 * Defines Mountain terrain
 *
 * @author Ryan Rodriguez
 * @version 2/9/2019
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
    return ("Mountain land has dimensions " + length + " X " + width + " and has "+ amountOfMountains + " mountains");
    }
   
}
