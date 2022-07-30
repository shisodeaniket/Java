//4. Write a function that takes in the radius as input and returns the  circumference of a circle.
import java.util.Scanner;
public class funCircumference{
    public static void main(String[] args) {
        System.out.print("Enter radius of Circle > ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        funCircumf(a);
        


    }
    public static void funCircumf(int a){
        double c=(6.28)*a;
        System.out.println("circumference is :"+c);
        

    }
}