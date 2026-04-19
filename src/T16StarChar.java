public class T16StarChar {
    public static void main(String[] args){
        String str = "xy*yzz";
        int first = str.indexOf("*");

        String before = str.substring(0,first);
        String after = str.substring(first+1 , str.length()-1);


    }
}
