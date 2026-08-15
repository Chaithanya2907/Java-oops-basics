 import java.util.Scanner;

public class Main1 {
    public static void main(String args[]) {

        int euc;
        int eb;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        euc = sc.nextInt();

        if (euc <= 100) {
            eb = euc * 2;
        }
        else if (euc <= 200) {
            eb = (100 * 2) + ((euc - 100) * 3);
        }
        else if (euc <= 300) {
            eb = (100 * 2) + (100 * 3) + ((euc - 200) * 5);
        }
        else {
            eb = (100 * 2) + (100 * 3) + (100 * 5) + ((euc - 300) * 7);
        }

        System.out.println("Electricity Bill: ₹" + eb);
    }
}