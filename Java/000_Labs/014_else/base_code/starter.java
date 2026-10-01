/*
 *	Author:  Jeongtae SEOSOESOESOESEOSOS
 *  Date: 09/30/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int guessjeongtaesfavoritenumber = (int)(Math.random() * 1000) + 1;

        System.out.print("Pick a number between 1 - 1000: ");
        int hehe = sc.nextInt();

        if (hehe == guessjeongtaesfavoritenumber) {
            System.out.println("Your number was the random number!");
        } else {
            System.out.println("Your number wasn't the random number. The number was " + guessjeongtaesfavoritenumber + ".");
        }
    }
}