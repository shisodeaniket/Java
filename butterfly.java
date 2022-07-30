
public class butterfly {
    public static void main(String args[]){
        int n=5;  //how many number of lines want to print "lines will be doubled", coz of the symmetricity
        //for first part of *
         for (int i=1; i<=n; i++)
         {
             for (int j=1; j<=i; j++){
                 System.out.print("*");
             }
        //part of spaces
        int spaces=(2*(n-i));
        for(int z=1; z<=spaces; z++){
            System.out.print(" ");
        }
        //for second part of *
        for (int j=1; j<=i; j++){
            System.out.print("*");
        }
        
             System.out.println();

         }

         //lower half 
         for (int i=n; i>=1; i--)
         {
             for (int j=1; j<=i; j++){
                 System.out.print("*");
             }
        //part of spaces
        int spaces=(2*(n-i));
        for(int z=1; z<=spaces; z++){
            System.out.print(" ");
        }
        //for second part of *
        for (int j=1; j<=i; j++){
            System.out.print("*");
        }
        
             System.out.println();

         }







    }
    
}