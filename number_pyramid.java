public class number_pyramid {
    public static void main(String[] args) {
        int n=5;
        int a=0;
        for(int i=0; i<=n; i++){
            
            
        //loop for spaces
            int space=(n-i);
            for(int s=0; s<space; s++){
                System.out.print(" ");
            }
            //loop for number
            
            for(int j=0; j<i; j++){
                System.out.print(a);
                //print spaces after every number
                System.out.print(" ");
                
            }
            System.out.println();
            a++;
        }

    }
}
