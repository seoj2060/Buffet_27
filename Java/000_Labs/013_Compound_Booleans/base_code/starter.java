/*
 *	Author:  Jeongtae Seo
 *  Date: 10/2/26
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your first number: ");
        int first = sc.nextInt();

        System.out.print("Please enter your second number: ");
        int second = sc.nextInt();

        System.out.print("Please enter your third number: ");
        int third = sc.nextInt();

        if (first > second) {
            if (first > third) {
                System.out.println("Your first number is the largest of the three!");
                System.out.println("The number was " + first + ".");
            }
        } else if (second > third) {
            System.out.println("Your second number is the largest of the three!");
            System.out.println("The number was " + second + ".");
        } else {
            System.out.println("Your third number is the largest of the three!");
            System.out.println("The number was " + third + ".");
        }

        if (first < second) {
            if (first < third) {
                System.out.println("Your first number is the smallest of the three!");
                System.out.println("The number was " + first + ".");
            }
        } else if (second < third) {
            System.out.println("Your second number is the smallest of the three!");
            System.out.println("The number was " + second + ".");
        } else {
            System.out.println("Your third number is the smallest of the three!");
            System.out.println("The number was " + third + ".");
        }
    }
}