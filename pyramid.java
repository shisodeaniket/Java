public class pyramid {
    public static void main(String[] args) {
        int a=10;
        for(int i=0; i<=a; i++){
            //space part
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
