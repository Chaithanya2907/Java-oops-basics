 import java.util.Scanner;

public class ex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int total = 0;

        do {

            System.out.println("\n===== SHOPPING MENU =====");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. View total");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter item price: ");
                    int price = sc.nextInt();

                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();

                    total = addItem(total, price, quantity);

                    System.out.println("Current total: ₹" + total);
                    break;

                case 2:
                    System.out.print("Enter amount to remove: ");
                    int amount = sc.nextInt();

                    total = removeAmount(total, amount);

                    System.out.println("Current total: ₹" + total);
                    break;

                case 3:
                    System.out.println("Current total: ₹" + total);
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }

    static int addItem(int total, int price, int quantity) {

        total = total + (price * quantity);

        return total;
    }

    static int removeAmount(int total, int amount) {

        if (amount > total) {
            System.out.println("Cannot remove more than the total.");
        }
        else {
            total = total - amount;
        }

        return total;
    }
}