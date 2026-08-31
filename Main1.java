import java.util.Scanner;

class Mobile {

    String brand;
    int price;

    Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

    void checkPrice() {
        if (price >= 30000) {
            System.out.println("Premium mobile");
        }
        else {
            System.out.println("Budget mobile");
        }
    }
}

public class Main1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter the price: ");
        int price = sc.nextInt();

        Mobile obj = new Mobile(brand, price);

        System.out.println("\n===== MOBILE DETAILS =====");

        obj.displayDetails();
        obj.checkPrice();

        sc.close();
    }
}