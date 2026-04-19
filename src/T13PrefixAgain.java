public class T13PrefixAgain {
    public static void main(String[] args){
        String  str = "abXYabc";
        String prefix = "XY";
        int n = 2;
         int count = 0;
        for (int i = 0; i < str.length()-1;i++){
            if (str.contains(prefix)){
                count++;
            }
        }
        System.out.println(count);

    }
}
