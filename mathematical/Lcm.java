package mathematical;

import java.util.Scanner;

/**
 * this class is used to find the LCM of two numbers.
 * In this we use Recursion to find LCM
 * @author yash.porwal_metacube
 *
 */
public class Lcm {
	static Scanner sc = new Scanner(System.in); 
	static int lcm = 1;
	
	/**
	 * this is the constructor which is used to initialize the value to a data member
	 */
	Lcm() {
		lcm = 1; 
	}
	
	/**
	 * this method is finding LCM of two numbers x & y using Recursion
	 * @param x is the input integer
	 * @param y is the input integer
	 * @return the LCM(integer value) of x & y
	 */
	public int findLCM(int x, int y) {
	    if(lcm % x == 0 && lcm % y == 0)
	    {
	        return lcm;
	    }
	    else
	    {
	        lcm++;
	        findLCM(x, y);
	        return lcm;
	    }
	}
	
	public static void main(String[] args) {
		Lcm lcmObj = new Lcm();
		System.out.print("Input 1st number for lcm: ");
		int no1 = sc.nextInt();
		System.out.print("Input 2nd number for lcm: ");
		int no2 = sc.nextInt();
		System.out.println(lcmObj.findLCM(no1, no2));
	}
}
