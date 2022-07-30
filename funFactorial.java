import java.util.Scanner;

public class funFactorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();         //value ko user se scan kiya
        funFact(r);  //function ko call kiya

    }

    public static void funFact(int fact){
        if (fact<0)
        {System.out.println("OOps!.....Invalid Input");
        
    return;
        }
        int c=1;
           //defining new variable factorial ko save karne k liye
        for (int j=1 ; fact>j; fact--){
            
            c=c*fact;
            
        }
        System.out.println("Factorial is: "+c);
        return;

    }
    
}
