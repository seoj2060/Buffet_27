/*
 *	Author:  Jeongtae Seo
 *  Date: 10/15/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		System.out.print("Please enter your name: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		System.out.println();

		System.out.print("Please enter how many times you'd like to print your name: ");
		int count = sc.nextInt();

		int bob = 0;

		while(bob < count){
			if(bob == count){
				break;
			}
			System.out.println(name);
			bob = bob + 1;

		}
	}
}
