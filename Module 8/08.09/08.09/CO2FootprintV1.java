/**
 * @purpose: To calculate important CO2 information about the footprints of cars related to their enviromental impact on a gallon per gallon basis
 * @author Ryan A. Rodriguez
 * @version 11/1/2018
 */
public class CO2FootprintV1
{
    private double myGallonsUsed, myTonsCO2, myPoundsCO2;
    

    CO2FootprintV1(double gallons)
    {
        /**
        * @param: gallons
        */
        myGallonsUsed = gallons;
    }


    public void calcTonsCO2()
    {
        myTonsCO2 = (8.78 * Math.pow(10, -3)) * myGallonsUsed;
        /**
        * @param: nothing
        */
    }


    public void convertTonsToPounds()
    {
        myPoundsCO2 = myTonsCO2 * 2205;
        /**
        * @param: nothing
        */
    }


    public double getGallons()
    {
        return myGallonsUsed;
        /**
        * @param: nothing
        * @return: gallons used
        */
    }


    public double getTonsCO2()
    {
        return myTonsCO2;
        /**
        * @param: nothing
        * @return: gets tons of CO2
        */
    }


    public double getPoundsCO2()
    {
        return myPoundsCO2;
        /**
        * @param: nothing
        * @return: pounds of CO2
        */
    }
}
