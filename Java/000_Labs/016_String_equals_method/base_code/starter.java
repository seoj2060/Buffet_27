/*
 *	Author:  Julian Seo
 *  Date: 10/06/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		
		Scanner sc = new Scanner(System.in);
		
		String WWR = sc.nextLine();

		if(WWR.equals("wizard") || WWR.equals("Wizard")){
		System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if(WWR.equals("warrior") || WWR.equals("Warrior")){
		System.out.println("You've chosen the Warrior! For honor!");
		}
		else if(WWR.equals("rogue") || WWR.equals("Rogue")){
		System.out.println("You've chosen the Rogue! How cunning!");
		}
		else{
		System.out.println("You've decided not to chose a role. Rerun program.");
		}
	}
}