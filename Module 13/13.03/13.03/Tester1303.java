import java.util.ArrayList;
/**
 * Tests all the other shape classes
 *
 * @Ryan A. Rodriguez
 * @2/12/2019
 */
public class Tester1303
{
    public static void main(String[] args) {
        ArrayList<String> objectCenters = new ArrayList<String>();
        ArrayList<String> objects = new ArrayList<String>();
        Circle2 circle = new Circle2(1, 2, 3);
	Cylinder2 cylinder = new Cylinder2(4, 5, 6, 7);
	Oval2 oval = new Oval2(8, 9, 10, 11);
	OvalCylinder2 ovalCylinder = new OvalCylinder2(12, 13, 14, 15, 16);
	
	objectCenters.add(circle.getCenter());
		objects.add(circle.toString());
		objectCenters.add(cylinder.getCenter());
		objects.add(cylinder.toString());
		objectCenters.add(oval.getCenter());
		objects.add(oval.toString());
		objectCenters.add(ovalCylinder.getCenter());
		objects.add(ovalCylinder.toString());
		
		for (int x = 0; x < 4; x++) {
         

			System.out.print("The ");
			if(x==0){System.out.print("Circle2 ");}
			if (x==1) {System.out.print("Cylinder2 ");} 
			if (x==2) {System.out.print("Oval2 ");} 
			if (x==3) {System.out.print("OvalCylinder2 ");}
			System.out.println(objectCenters.get(x));
		}
    }
}
