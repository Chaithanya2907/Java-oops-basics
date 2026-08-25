 import java.util.Scanner;

public class Main1 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        int tickets;
        int total;

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();

        System.out.print("Enter tickets: ");
        tickets = sc.nextInt();

        total = calculate_amount(age, tickets);

        System.out.println("\n~~~~~ TICKET DETAILS ~~~~~");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Tickets: " + tickets);
        System.out.println("Total: ₹" + (tickets * 200));
        System.out.println("Final amount: ₹" + total);

        sc.close();
    }

    static int calculate_amount(int age, int tickets) {

        int total = tickets * 200;

        if (age < 5) {
            System.out.println("Discount: 100%");
            total = 0;
        }
        else if (age >= 5 && age <= 12) {
            System.out.println("Discount: 50%");
            total = total / 2;
        }
        else if (age >= 13 && age <= 59) {
            System.out.println("Discount: 0%");
        }
        else {
            System.out.println("Discount: 30%");
            total = total - (total * 30 / 100);
        }

        return total;
    }
}