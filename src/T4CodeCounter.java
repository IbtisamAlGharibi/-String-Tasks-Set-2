public class T4CodeCounter {
    public static void main(String []args){
        String str = "codexxcode";

        int count=0;

        for (int i =0 ; i < str.length()-1; i++){
            if (str.charAt(i) == 'x'){
                count++;
            }
        }
        System.out.println(count);
    }
}
