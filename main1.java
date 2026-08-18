import java.util.Scanner;
public class main1{
    public static void main(String args[]){
        int PIN=1234;
        int p;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("Enter the PIN:");
             p=sc.nextInt();
            if (p==PIN){
                System.out.println("PIN correct!");
                System.out.println("Welcome to ATM");
                break;
            }
            else if (p!=PIN)
                {
                System.out.println("Incorrect PIN!");
                if (i==2){
                  System.out.println("Your card is blocked!");
            }
            else{
                System.out.println("Attempts remaining:" +(2-i));
            }
        }
    }
}
}