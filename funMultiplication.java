import java.util.*;

public class funMultiplication {

    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateMultiplication(a, b); // function ko recall kiya
        System.out.println("Multiplication is: "+sum);
        


        
    }
    //multiplication function ko call kiya
    public static int calculateMultiplication(int a, int b){
        int sum = a*b;
        return sum;
    }
    
}
