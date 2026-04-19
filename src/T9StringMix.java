public class T9StringMix {
    public static void main(String[] args){
        String str = "abc";
        String str2 = "xyz";

        for (int i =0; i<str.length()-1 ; i++){
            for (int j =0; j <str2.length()-1;j++){
                System.out.println(str2.charAt(j));
            }
            System.out.println(str.charAt(i));
            }


        }
}
