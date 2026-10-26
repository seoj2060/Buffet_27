/*
 *	Author:  Jeongtae Seo
 *  Date: 10/23/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

        int number = (int)(Math.random() * 20) + 1;

        System.out.println("Welcome to the guessing game!");

        while(true){
            System.out.print("Please guess a number: ");
            int x = sc.nextInt();
            if(x < number){
                System.out.println("The number is higher.");
            }
            if(x > number){
                System.out.println("The number is lower.");
            }
            if(x == number){
                System.out.println("You got the number!");
                break;
            }
        }
    }
}