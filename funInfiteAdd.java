import java.util.Scanner;

// 7. Write a program to enter the numbers till the user wants and at the end it
// should display the count of positive, negative and zeros entered.
public class funInfiteAdd {
    public static void main(String[] args) {
       int sum=0;

        while(true){
             Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sum=funAdd(num, sum);

        if(num==0){
            //while loop will break when user enter value a=0
            break;
        }
        



        }
        System.out.println(sum);
        
    }
    public static int funAdd(int a, int sum){
         
        sum=a+sum;
        return sum;
            
        }
    
}
