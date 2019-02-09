
/**
 * Write a description of class WinterMountain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WinterMountain extends Mountain
{
    int temperature;
    int mountainCount;
    int length;
    int width;
    public WinterMountain (int l, int w, int mountainCount, int temperature1)
    {
        super(l,w, mountainCount);
        length = l;
        width = w;
        mountainCount = mountainCount;
        temperature = temperature1;
    }
    
    public String getTemperature() {
    return temperature;
    }
   
}