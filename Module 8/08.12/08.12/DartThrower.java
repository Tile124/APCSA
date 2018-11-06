
/**
 * @purpose: To throw a bunch of darts to simulate PI
 *
 * @author Ryan A. Rodriguez
 * @version 11/6/2018
 */
public class DartThrower
{
    private double myPiValue;
    private double myDartThrows;
    
    /**
    * Constructor for objects of type DartThrower
    * @param Amount of dart throws per object
    */
    DartThrower(int dartThrows) {
    myDartThrows = dartThrows;
    calcPi(dartThrows);
}

// Calculates PiValue (Mutator)
public void calcPi(int dartThrows) {
    double xValue = 0;
    double yValue = 0;
    double numberOfHits=0;
    for (int i = 0; i < dartThrows; i++) {
        xValue = Math.pow((2*Math.random()-1), 2);
        yValue = Math.pow((2*Math.random()-1), 2);
        
        if (xValue + yValue <= 1) {
            numberOfHits += 1;
        }
}
myPiValue = (double)((double)(double)numberOfHits / ((double)dartThrows))*4;

}
// getter Methods
public double getPiValue(){
return myPiValue;
}
public double getDartThrows() {
    
    return myDartThrows;
}
}
