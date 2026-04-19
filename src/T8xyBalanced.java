public class T8xyBalanced {
    public static void main(String[] args){
        String str = "aaxbby";

        for (int i =0; i<str.length()-1 ; i++){
            if (str.charAt(i)== 'x' && str.charAt(i+1)== 'y' ||
                    str.charAt(i)== 'x' && str.charAt(i+2)== 'y' ||
                    str.charAt(i)== 'x' && str.charAt(i+3)== 'y'){

                System.out.println("True");
            }else {
                System.out.println("False");
            }

        }
    }
}
