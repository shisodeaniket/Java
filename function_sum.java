import java.util.Scanner;


public class function_sum {
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum = sum(a,b); //function ko call kiya 
        System.out.println("print sum: "+sum);
        
    }

    //function ko yha define kiya
    public static int sum(int a, int b){
        int sum=a+b;
    return sum;
    }



}
