/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int randomnumbernumbernumber = rand.nextInt(1000) + 1;
		
		System.out.print("Pick a number between 1 - 1000: ");
		int guess = sc.nextInt();
		
		if(guess == randomnumbernumbernumber){
			System.out.println("Your number was correct. The number was " + randomnumbernumbernumber + ".");
		}
		else if(guess < randomnumbernumbernumber){
			System.out.println("Your number was smaller than the number. The number was " + randomnumbernumbernumber + ".");
		}
		else{
			System.out.println("Your number was bigger than the number. The number was " + randomnumbernumbernumber + ".");
		}
	}
}