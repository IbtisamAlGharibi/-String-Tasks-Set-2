public class T2HiCounter {
    public static void main(String[] args){
        String str= "Hihihi";

        int count = 0;
        for (int i =0; i<str.length();i++){
            if (str.charAt(i)=='h' && str.charAt(i+10)=='i'){
                count = + 1;
            }
        }

    }
}
