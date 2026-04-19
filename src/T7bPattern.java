public class T7bPattern {

    public static void main(String[] args){

        String str = "abcbob";

        for (int i =0; i<str.length()-1 ; i++){
            if (str.charAt(i)=='b' && str.charAt(i+2)=='b'){
                System.out.println("True");
            }else {
                System.out.println("False");
            }
        }
    }
}
