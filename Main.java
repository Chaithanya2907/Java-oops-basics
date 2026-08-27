 import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int sum = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print("Enter number " + (i + 1) + ": ");
            num = sc.nextInt();

            sum = sum + num;

            if (num > 0) {
                positive++;
            }
            else if (num < 0) {
                negative++;
            }
            else {
                zero++;
            }
        }

        double average = sum / 10.0;

        System.out.println("\n===== NUMBER ANALYSIS =====");
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zero);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        sc.close();
    }
}