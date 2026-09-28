/*
 *	Author: Jeongtae Seo 
 *  Date: 09/23/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner scan = new Scanner(System.in);

    System.out.print("Please input your first number: ");
    int Jeongtae1 = scan.nextInt();
	System.out.println();

    System.out.print("Please input your second number: ");
    int Jeongtae2 = scan.nextInt();
	System.out.println();

    if (Jeongtae1 == Jeongtae2) {
        System.out.println("Your numbers are the same!:>>");
        } 
	if (Jeongtae1 != Jeongtae2) {
        System.out.println("Your numbers are different!;-;");
        }
	}
}
