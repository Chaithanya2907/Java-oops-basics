 import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        double product_price;
        int quantity;
        double total;
        double discount;
        double final_price;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter product price: ");
        product_price = s.nextDouble();

        System.out.print("Enter quantity of product: ");
        quantity = s.nextInt();

        total = product_price * quantity;

        if (total >= 5000) {
            discount = total * 0.20;
        }
        else if (total >= 3000) {
            discount = total * 0.10;
        }
        else if (total >= 1000) {
            discount = total * 0.05;
        }
        else {
            discount = 0;
        }

        final_price = total - discount;

        System.out.println("Total price: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final price: " + final_price);
    }
}