public class reverse_sting {
    public static void reverse_string(int n, String s){
        if(n==0){
            //System.out.println(s.charAt(n));
            return;
        }
        
        System.out.print(s.charAt(n-1));
        n--;
        reverse_string(n, s);

    }
    public static void main(String[] args) {
        String s="AniketShisode";
        int n=s.length();
        reverse_string(n, s);
    }
}
