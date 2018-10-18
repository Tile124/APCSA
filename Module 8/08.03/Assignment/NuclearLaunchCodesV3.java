import java.util.Random;
/*
* The purpose of this program is to generate a Nuclear Launch Code and pin code for personal use by the President.
*@author Ryan A. Rodriguez
*@version 10/17/2018
*/
public class NuclearLaunchCodesV3 {
    
	public NuclearLaunchCodesV3(){

	}


	public static void main(String[] args) {
		NuclearLaunchCodesV3 launchCodes = new NuclearLaunchCodesV3();

		int launchCode = launchCodes.launchCode(), pinCode = launchCodes.pinCode();

		secureOutput(launchCode, pinCode);

	}
// Generate launch code
	public int launchCode() {

		double returnValueDec = Math.ceil(Math.random() * ((9999 - 1000) + 1)) + 1000;
		int returnValue = (int)returnValueDec;

		return returnValue;
	}
// Generate Secure Pin Code
	public int pinCode() {

		double returnValueDec = Math.ceil(Math.random() * ((999 - 100) + 1)) + 100;
		int returnValue = (int)returnValueDec;
		return returnValue;
	}
// Output
	public static void secureOutput(int launchCode, int pinCode)
	{
	        System.out.printf("%-25s", "");
		System.out.printf("%-25s", "TOP SECRET");
		System.out.println("");
		System.out.printf("%-20s", "");
		System.out.printf("%-20s", "Nuclear Launch Codes");
		System.out.println("\n*********************************************************");
		System.out.printf("%-8s\n", "Launch Code: " + launchCode);
		System.out.printf("%-8s\n", "Pin Code: " + pinCode);
	}

}