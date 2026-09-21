/*
 *	Author: Julian Seo
 *  Date: 09/18/26
 *	Collaborator(s): Joshua Shin heheheheheh
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers to create a range for your random number"); 
		System.out.print("Please enter an integer: ");
		int integer = sc.nextInt();
		System.out.print("Please enter another integer (bigger than the first): ");
		int number = sc.nextInt();
		System.out.println();
		System.out.println("Your range is " + integer + " to " + number + ".");
		System.out.println("Here are 5 numbers generated in that range.");
		System.out.print((int)(Math.random() * (integer - number) + number) + ", ");
		System.out.print((int)(Math.random() * (integer - number) + number) + ", ");
		System.out.print((int)(Math.random() * (integer - number) + number) + ", ");
		System.out.print((int)(Math.random() * (integer - number) + number) + ", ");
		System.out.print((int)(Math.random() * (integer - number) + number));
		System.out.println();