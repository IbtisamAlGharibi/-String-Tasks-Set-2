public class T21WordEnds {
    public static void main(String[] args){

        String str = "abcXY123XYijk";
        int word = str.indexOf("xy");
        String before = str.substring(0,word);
        String after = str.substring(word+2 , str.length()-1);

        System.out.println(before + " "+ after);

    }
}
