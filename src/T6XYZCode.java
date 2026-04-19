public class T6XYZCode {
    public static void main(String[] args){
        String str = "abcxyz";

        for (int i =0; i < str.length()-1 ; i++){
        if (str.charAt(i) =='.' && str.charAt(i+1) == 'x' && str.charAt(i+2) == 'y'
                && str.charAt(i+3) == 'z'){
            System.out.println("False");
        }else {
            System.out.println("True");
        }



        }

    }
}
