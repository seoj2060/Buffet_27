/*
 *	Author: Jeongtae Seo
 *  Date: 10/20/26
 * 	Collaborator(s): Julian Seo
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		int money = 100;
		
		System.out.println("Slot Machine Rules: ");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbmers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		System.out.println("--------------------------------------------------");
		System.out.println();
		System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");

		String yes = sc.nextLine();

		System.out.println("You have $100. How much would you like to wager? ");

	}
}