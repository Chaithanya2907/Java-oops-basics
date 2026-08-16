import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String args[]) {

        Random rn = new Random();
        Scanner sc = new Scanner(System.in);

        String name;
        int choice;
        int number;
        int random;

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.println("Welcome, " + name + "!");
        System.out.println("Do you want to play the game?");
        System.out.println("1. Yes");
        System.out.println("2. No");

        choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Let's start the game!");
        }
        else if (choice == 2) {
            System.out.println("Maybe next time!");
        }

        if (choice == 1) {

            random = rn.nextInt(3) + 1;

            do {
                System.out.print("Choose a number between 1 and 3: ");
                number = sc.nextInt();

                if (number == random) {
                    System.out.println("Correct! You found the number!");
                }
                else {
                    System.out.println("Wrong! Try again.");
                }

            } while (number != random);
        }

        sc.close();
    }
}