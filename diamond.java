import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt(); //enter number to print how big diamond we want to print

        //upper half
        //outer loop for nos of line
        for(int i=1; i<=a; i++){
            //spaces k liye loop
            
            for(int j=0; j<=a-i; j++){
                System.out.print(" ");
            }
            //* part 
            for (int k=0; k<i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }


        //lower half
        for(int i=a-1; i>=1; i--){
            for(int j=0; j<=a-i; j++){
                System.out.print(" ");
            }
            //* part 
            for (int k=0; k<i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
    
}
