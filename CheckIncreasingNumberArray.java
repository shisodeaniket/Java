//import javax.swing.text.StyledEditorKit.BoldAction;

public class CheckIncreasingNumberArray {

    public static boolean isSorted(int arr[], int idx){
        if(idx==arr.length-1){
            return true;

        }
        if(arr[idx]<arr[idx+1]){
            //array is soted till
            return isSorted(arr, idx+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int num[]={1,2,3,1};
        
        System.out.println(isSorted(num, 0));
    }
}
