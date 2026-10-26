/*
 *	Author: Jeongtae Seo
 *  Date: 10/21/26
 *	Collaborator(s): Julian Seo
*/

import java.util.Scanner;

class starter {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a width: ");
        int width = sc.nextInt();

        System.out.print("Please enter a height: ");
        int height = sc.nextInt();

			int count2 = 0;
			while(true){
				if(count2 == height){
					break;
				}
				int count = 0;
				while(true){
					if(count == width){
						break;
					}
					System.out.print("*");
					count++;
				}
				System.out.println();
				count2++;
			}
        }
	}