package github;


public class Solid_Rhombus {
    public static void main(String[] args) {
        int n=5;
        //loop for nos of lines
        for (int i=0; i<n; i++){
            //loop for spaces
            int space=(n-i);
            for (int j=0; j<space; j++){
                System.out.print(" ");
                
            }
            //loop for *
            for(int k=0; k<4;k++){
                System.out.print("*");
                
            }
            System.out.println();
            
        }
    }
}
