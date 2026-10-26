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

        System.out.println("Slot Machine Rules:");
        System.out.println("1. Each player starts with $100.");
        System.out.println("2. Enter a wager.");
        System.out.println("3. The machine rolls 3 numbers from 1 to 10.");
        System.out.println("   a. If two numbers match, you double your wager.");
        System.out.println("   b. If three numbers match, you triple your wager.");
        System.out.println("   c. If none match, you lose your wager.");
        System.out.println("--------------------------------------------------");

        while(money > 0){
            System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
            String answer = sc.next();

            if(answer.equals("y") || answer.equals("Y") || answer.equals("yes") || answer.equals("Yes")){

                System.out.print("You have $" + money + ". How much would you like to wager? ");
                int bet = sc.nextInt();

                while (bet > money || bet < 1) {
                    System.out.print("You only have $" + money + "! Please enter a smaller number: ");
                    bet = sc.nextInt();
                }

                int a = (int)(Math.random() * 10) + 1;
                int b = (int)(Math.random() * 10) + 1;
                int c = (int)(Math.random() * 10) + 1;

                System.out.println();
                System.out.println("Great! Let's play!!!");
                System.out.println("Your rolls are:");
                System.out.println("_______________________");
                System.out.println(" | " + a + " | " + b + " | " + c + " |");
                System.out.println("_______________________");

                if(a == b && b == c){
                    System.out.println("Three numbers match! You win!");
                    money = money + bet * 2;
                } 
				else if (a == b || a == c || b == c){
                    System.out.println("Two numbers match! You win!");
                    money = money + bet;
                }
				else{
                    System.out.println("Didn't win this time, better luck next time!");
                    money = money - bet;
                }

                System.out.println("You now have $" + money + ".");
                System.out.println("--------------------------------------------------");

            } 
			else if(answer.equals("n") || answer.equals("N") || answer.equals("no") || answer.equals("No")){
                System.out.println("Sad to see you go! You still have $" + money + " left. Come again soon! Thanks!");
                break;
            } 
			else{
                System.out.println("That wasn't quite the correct answer. Try again.");
                System.out.println("--------------------------------------------------");
                System.out.println();
            }
        }

        if (money == 0) {
            System.out.println("You've run out of money! Thanks for coming! Come back soon!");
        }
    }
}