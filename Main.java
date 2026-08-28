import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        int unit;
        int choice;
        int bill;
        do {
    
        System.out.print("Enter customer name:");
        name=sc.nextLine();
        System.out.print("Enter units consumed:");
        unit=sc.nextInt();

        bill=calculateBill(unit); 
        System.out.println("=====ELECTRICITY BILL=====");
    System.out.println("Customer:" + name);
    System.out.println("units consumed:" + unit);
    System.out.println("Bill amount:" + bill);
    System.out.println("=====ELECTRICITY BILL=====");
    sc.nextLine();
    System.out.println("1. Calculate another bill");
System.out.println("2. Exit");
System.out.print("Enter your choice: ");
choice = sc.nextInt();
sc.nextLine();
        } 
        while(choice==1);  
    }
     static int calculateBill(int unit){
        int bill=0;
        if(unit>0 && unit<=100){
            bill=unit*2;
        }
        else if(unit>=101 && unit<=200){
            bill=unit*3;
        }
        else if(unit>=201 && unit<=300){
            bill=unit*5;
        }
        else if (unit>300){
            bill=unit*7;
        }
            return bill;
        }
     
    
}