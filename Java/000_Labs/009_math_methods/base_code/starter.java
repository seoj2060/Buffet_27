/*
 *	Author:  Jeongtae Seo
 *  Date: 09/17/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = Math.max(13-6*11,30%7*(-2));
		double y = Math.sqrt(3*8+31%7);
		double z = Math.pow(37/3,35%21);
		double u = Math.max(Math.pow(2,14%3),Math.sqrt(2*6));
		System.out.println("Maximumx = " + x);
		System.out.println("Square root = " + y);
		System.out.println("Power = " + z);
		System.out.println("Max = " + u);
	}
}
