// 8. Two numbers are entered by the user, x and n. Write a function to find
// the value of one number raised to the power of another i.e. 𝑥 . 𝑛
import java.util.Scanner;
public class funPower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=Power(a, b);
        System.out.println(sum);



    }
    public static int Power(int a, int b){
        int sum=a;
        for(int i=1; i<b; i++){
            sum=sum*a;
        }
        return sum;

    }
    
}
