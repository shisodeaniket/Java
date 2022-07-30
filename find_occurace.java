public class find_occurace {

    public static int smaller=-1; //static variables that can be used and changed statically and not passed with the every recurrsion
    public static int larger=-1;
    public static void occurance(int n, String str){
        
        if (n==str.length()){
            System.out.println("Earlier occurance"+smaller+1);
            System.out.println("Later occuance at"+larger);
            return;
        }
        if('a'==str.charAt(n)){
            if (smaller==-1){
                smaller=n;
            }

            else{
                larger=n;
            }
            
        }
        

        occurance(n+1, str);
    }
    public static void main(String[] args){
        String a="abaacdaefaah";
        occurance(0, a);
        
    }
}
