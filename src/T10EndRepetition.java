public class T10EndRepetition {
    public static void main(String[] args){
        String str = "Hello";
        int n = 3;

        String end = str.substring(str.length()-3, str.length());

        for (int i =0; i<n ; i++){
            System.out.println(end);
        }



    }
}
