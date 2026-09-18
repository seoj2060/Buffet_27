/*
 *	Author:  Julian Seo
 *  Date: 09/14/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Welcome to Julian's food court!");
		System.out.println("Here's our menu:");
		double item1Price = 10.89;
		System.out.println("1. Cane's 10pc Chicken Fingers - $" + item1Price);
		double item2Price = 8.59;
		System.out.println("2. In and Out Double-Double Combos - $" + item2Price);
		double item3Price = 2.7;
		System.out.println("3. Diet Coke - $" + item3Price);
		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.println("Who is purchasing?");
		String name = sc.nextLine();
		System.out.println();

		System.out.println("How many Cane's 10pc Chicken Fingers would you like?");
		int item1Amt = sc.nextInt();
		System.out.println();

		System.out.println("How many In and Out Double-Double Combos would you like?");
		int item2Amt = sc.nextInt();
		System.out.println();

		System.out.println("How many Diet Coke would you like?");
		int item3Amt = sc.nextInt();
		System.out.println();
		double grandTotal = (item1Price + item1Amt + item2Price + item2Amt + item3Price + item3Amt);

		System.out.println("How much tips would you like?");
		double tip = sc.nextDouble();
		System.out.println();
		double totaltip = (tip/100)*grandTotal;

		double item1Total = item1Price + item1Amt;
		double item2Total = item2Price + item2Amt;
		double item3Total = item3Price + item3Amt;
		System.out.println("Total is " + (item1Total + item2Total + item3Total + totaltip));
		System.out.println();
		
	}
}