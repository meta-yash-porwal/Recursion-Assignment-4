package mathematical;

import java.util.Scanner;

/**
 * this class is used to find HCF of two numbers
 * Using Recursion 
 * @author yash.porwal_metacube
 *
 */
public class Hcf {
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * this method is used to find HCF of x and y (integer input variable)
	 * Using Euclid’s algorithm
	 * @param x integer input value
	 * @param y integer input value
	 * @return the HCF (integer value) of x & y.
	 */
	public static int findHCF(int x, int y) {
		if(x == 0){
			return y;
		}else {
			return findHCF(y%x, x);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.print("Input 1st number for hcf: ");
		int no1 = sc.nextInt();
		System.out.print("Input 2nd number for hcf: ");
		int no2 = sc.nextInt();
		System.out.println(findHCF(no1, no2));
	}

}
