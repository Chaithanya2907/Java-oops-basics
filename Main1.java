 import java.util.Scanner;
 public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in );
        String name;
        int age;
        int salary;
        int score;
        boolean status;
          int choice;
        do{
           
        System.out.print("Enter your name:");
        name=sc.nextLine();
        System.out.print("Enter your age:");
        age=sc.nextInt();
        System.out.print("Enter your monthly salary:");
        salary=sc.nextInt();
        System.out.print("Enter your credit score:");
        score=sc.nextInt();
        System.out.println("===== LOAN ELIGIBILITY=====");
         System.out.println("Name:" + name);
         status=checkEligibility(age, salary, score);
 System.out.println("Status:" + status);
  System.out.println("1. Check another person");
System.out.println("2. Exit");
System.out.print("Enter your choice: ");
choice = sc.nextInt();
sc.nextLine();
        }
    while (choice==1);
    }
    static boolean checkEligibility(int age, int salary, int score){
    if (age>=21 && salary>=25000 && score>=700){
             return true;
        }
        else{
            return false;
        }
    }

 }