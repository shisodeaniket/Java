import java.util.Scanner;

public class butt {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=3; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int k=2*(n-i); k>0; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            int spaces=2*(i-1);
            for(int k=0; k<spaces; k++){
                System.out.print(" ");
            }
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}