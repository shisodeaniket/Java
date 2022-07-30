import java.util.Scanner;

//1. Enter 3 numbers from the user & make a function to prfloat their average.

public class funAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextInt();
        float b=sc.nextInt();
        float c=sc.nextInt();
        float sum=funAvgrage(a,b,c);
        System.out.println(sum);

        
    }

    public static float funAvgrage(float a, float b, float c){
        float avg=(a+b+c)/3;
        return avg;
    }
}