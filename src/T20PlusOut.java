public class T20PlusOut {
    public static void main (String[] args){
        String str = "12xy34";

        for (int i =0; i<str.length()-1;i++){
            if (str.charAt(i) == 'x' && str.charAt(i+1) == 'y' ){
                System.out.println(str.charAt(i));
            }else {
                System.out.println("+");
            }


        }

    }
}
