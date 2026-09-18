/*
 *	Author: Jeongtae Seo
 *  Date: 09/15/26
 *	Name of the Exercise : guessjuliansfavoritenumber
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");

		int guessjuliansfavoritenumber = sc.nextInt();
		System.out.println();

		System.out.println("Here are the next 5 numbers!");
		System.out.println(guessjuliansfavoritenumber + ", " + (guessjuliansfavoritenumber + 1) + ", " + (guessjuliansfavoritenumber + 2) + ", " + (guessjuliansfavoritenumber + 3) + ", " + (guessjuliansfavoritenumber + 4) + ", " + (guessjuliansfavoritenumber + 5));
		System.out.println();

		System.out.println("Here are the next 5 multiples of " + guessjuliansfavoritenumber + "!");
		System.out.println(guessjuliansfavoritenumber + ", " + (guessjuliansfavoritenumber * 2) + ", " + (guessjuliansfavoritenumber * 3) + ", " + (guessjuliansfavoritenumber * 4) + ", " + (guessjuliansfavoritenumber * 5) + ", " + (guessjuliansfavoritenumber * 6));
		System.out.println();

		System.out.println("Here is " + guessjuliansfavoritenumber + " divided by 100!");
		System.out.println((double) guessjuliansfavoritenumber / 100);
		System.out.println();
		
		System.out.println("Here is " + guessjuliansfavoritenumber + " divided by 10!");
		System.out.println((double) guessjuliansfavoritenumber / 10);
		System.out.println();

	}
}
