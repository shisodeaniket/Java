// 3. Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.Scanner;
public class funLargeNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        funLarge(a,b);
    }

    public static void funLarge(int a, int b){
        if (a==b){
            System.out.println("Both numbers are equal.");
            
        }
        else if (a>b){
            System.out.println(a+" Is large number.");
            return;
        }
        else{
            System.out.println(b+" Is large number.");
            return;
        }
        

    }
}