import java.util.Random;
/*
* The purpose of this program is to generate a Nuclear Launch Code and pin code for personal use by the President.
*@author Ryan A. Rodriguez
*@version 10/17/2018
*/
public class NuclearLaunchCodesV3() {
	public NuclearLaunchCodesV3(){

	}


	public static void main(String[] args) {
		NuclearLaunchCodesV3() launchCodes = new NuclearLaunchCodesV3();

		int launchCode = launchCodes.launchCode(), pinCode = launchCodes.pinCode();

		secureOutput(launchCode, pinCode);

	}

	public int launchCode() {

		int returnValue = (Math.random() * ((9999 - 1000) + 1)) + 1000);

		return returnValue;
	}

	public int pinCode() {

		int returnValue = (Math.random() * ((999 - 100) + 1)) + 100);

		return returnValue;
	}

	public void secureOutput(int launchCode, int pinCode){
		System.out.printf("%-25s", "TOP SECRET");
		System.out.println("");
		System.out.printf("%-20s", "Nuclear Launch Codes");
		System.out.println("\n*********************************************************");
		System.out.printf("%-8s", "Launch Code: " + launchCode);
		System.out.printf("%-8s", "Pin Code: " + pinCode);
	}

}