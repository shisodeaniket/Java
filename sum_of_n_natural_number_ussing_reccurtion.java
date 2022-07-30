
public class sum_of_n_natural_number_ussing_reccurtion {

        public static void main(String[] args) {
        getSum(30,0);// 30= the number upto we want to get sum and 0 isto pass into the sum for initialising the variable 
    }

    public static void getSum(int n, int sum){
        if(n==0){
            //when the recurrsion should end will be decided by the if condition 
            System.out.println(sum);
            return;
        }
        sum=sum+n; //after every recurssion value of n is added into the sum and then decremented by 1f
        n--;  
        getSum(n, sum);
        
    }
}
