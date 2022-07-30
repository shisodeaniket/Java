public class check_increasing_sorted{
    public static String issorted(int[] arr, int idx){
        if(arr.length==idx-1){
            return "True" ;
        }
        if(arr[idx]<arr[idx+1]){
            issorted(arr, idx+1);
        }else{
            
            return "False";
            }
            return "False";
        }
            
    public static void main(String[] args) {
        int num[]={1,2,3,4};
        System.out.println(issorted(num, 0));

    }
}