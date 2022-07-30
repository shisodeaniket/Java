// 2. Write a function to print the sum of all odd numbers from 1 to n.
import java.util.Scanner;

public class funSumOdd {
    public static void main(String[] args) {
        
        System.out.print("Enter Number> ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=funSumOdds(a);
        System.out.println("sum of all odds number upto "+a+" is:"+sum);

    }

    public static int funSumOdds(int a){
        int sum=0;
        for (int i=1; i<=a; i=i+2){
            sum=sum+i;

        }
        return sum;
    }
    
}
