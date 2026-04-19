public class T18ZipZap {
    public static void main(String[] args){
        String str = "zipXzap";
        String result = "";

        for (int i =0; i<str.length()-1;i++){

            if (str.charAt(i)=='z' && str.charAt(i+2) == 'p'){
                result = "zp";
                System.out.println(result + str.charAt(i));
            }



        }

    }
}
