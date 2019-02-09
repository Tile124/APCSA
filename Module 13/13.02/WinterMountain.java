
/**
 * Defines winter mountain
 *
 * @author Ryan Rodriguez
 * @version 2/9/2019
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
    return ("Winter Mountain land has dimensions " + length + " X " + width + " and has "+ amountOfMountains + " mountains with a temperature of " + temperature);
    }
   
}