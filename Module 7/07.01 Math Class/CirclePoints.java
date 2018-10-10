
/**
 * The circlepoints program will find all the y values on a circle using the increment you provide and the radius you provide
 *
 * @author Ryan Rodriguez
 * @version 10/7/2018
 */
public class CirclePoints
{
    public static void main(String[] args) {
        
        // INPUTS TO CHANGE
        double radius = 1.0; // Radius
        double increment = 0.1; // Increment value
        
        // Variables
        double count = radius;
        double min = radius * -1.0;
        
        // Heading
        System.out.println ("Points on a Circle with a Radius of " + radius);
        System.out.println("***************************************************");
        System.out.printf("%8s", "x1");
        System.out.printf("%8s", "y1");
        System.out.printf("%16s", "x1");
        System.out.printf("%8s", "y2");
        //While loop that does all of the work
        while (count >= min) {
            
            double xSqrt = Math.pow (count, 2); // Raises the radius input radius to a power of two
            double tempRadius = Math.pow(radius, 2); // Raises the radius to a power of two
            double yBeforeSqrt = tempRadius - xSqrt; // The y value before square root
            double y = Math.sqrt(yBeforeSqrt); // y value after square root
            y = Math.round(y * 1000.00) /1000.00; // Rounding the y value to three decimal places for accuracy and readibility
            
            // Output
            System.out.printf("%n%8s", count);
            System.out.printf("%8s", y);
            System.out.printf("%16s", count);
            System.out.printf("%8s", (y*-1.0));
            count = count - increment;
            count = Math.round(count * 100000.00)/100000.00;

        }
        
    }
}
