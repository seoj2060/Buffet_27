/*
 *	Author:  Jeongtae Seo
 *  Date: 10/06/26
*/
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = sc.nextLine();
		
		System.out.println();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String orangespacexylophone = sc.nextLine();
		
		System.out.println();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
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
		
		System.out.println();
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		System.out.println();
		
		int amountofpointsyouleft = 20;
		
		System.out.print("Strength (1-10): ");
		int strength = sc.nextInt();
		
		if(strength > 10 || strength > amountofpointsyouleft){
		System.out.print("Please input a smaller value. Strength (1-40): ");
		strength = sc.nextInt();
		}
		
		amountofpointsyouleft = amountofpointsyouleft - strength;
		System.out.println("You have " + amountofpointsyouleft + " left to spend.");
		
		System.out.println();
		System.out.print("Dexterity (1-10): ");
		int dexterity = sc.nextInt();
		
		if(dexterity > 10 || dexterity > amountofpointsyouleft){
		System.out.print("Please input a smaller value. Dexterity (1-10): ");
		dexterity = sc.nextInt();
		}
		
		amountofpointsyouleft = amountofpointsyouleft - dexterity;
		System.out.println("You have " + amountofpointsyouleft + " left to spend.");
		
		System.out.println();
		System.out.print("Intelligence (1-10): ");
		int intelligence = sc.nextInt();
		
		if(intelligence > 10 || intelligence > amountofpointsyouleft){
		System.out.print("Please input a smaller value. Intelligence (1-10): ");
		intelligence = sc.nextInt();
		}
		
		amountofpointsyouleft = amountofpointsyouleft - intelligence;
		System.out.println("You have " + amountofpointsyouleft + " left to spend.");
		
		System.out.println();
		System.out.print("Charisma (1-10): ");
		int charisma = sc.nextInt();
		
		if(charisma > 10 || charisma > amountofpointsyouleft){
			System.out.print("Please input a smaller value. Charisma (1-10): ");
			charisma = sc.nextInt();
		}
		
		amountofpointsyouleft = amountofpointsyouleft - charisma;


		
		System.out.println();
		System.out.println("--------------------------------------------------");
		System.out.println("You are " + name + ", the " + orangespacexylophone + " of CVHS.");
		System.out.println("You're a " + WWR + " with the following stats!");
		System.out.println("Strength - " + strength);
		System.out.println("Dexterity - " + dexterity);
		System.out.println("Intelligence - " + intelligence);
		System.out.println("Charisma - " + charisma);
		System.out.println();
		System.out.println("Good luck on your quest " + name + "!");
	}
}