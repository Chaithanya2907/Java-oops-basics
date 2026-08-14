import java.util.Random;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
         int Random_number;
         int guess_num;
         Random random=new Random();
         Scanner sc=new Scanner(System.in);
        System.out.println("Guess a number between 1 and 10:");
        guess_num=sc.nextInt();
        Random_number=random.nextInt(10)+1;
        if (Random_number==guess_num)
        {
            System.out.println("You Won!");
        }
        else{
            System.out.println("You lost");
        }
        
    }
}