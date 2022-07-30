import java.util.Scanner;

// 5. Write a function that takes in age as input and returns if that person is eligible
//  to vote or not. A person of age > 18 is eligible to vote.

public class funVote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        funVoteAge(a);

        
    }

    public static void funVoteAge(int age){
        if (age>=18){
            System.out.println("You are eligible to vote.");
            return;
        }
        else{
            System.out.println("you are not eligible to vote.");
            return;
        }
    }
    
}
