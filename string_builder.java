public class string_builder {
    
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder( "Tony");
        //insert string in string
        //sb.insert(2,'n'); 
        //set char in string
        sb.setchar(0, 'S');
        System.out.println(sb);

        // delete the extra string
        sb.delete(2,3);
        System.out.println(sb);


    }
}
