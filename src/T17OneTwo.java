public class T17OneTwo {
    public static void main(String[] args){
        String str = "abc";
        char first = str.charAt(0);
        char last = str.charAt(str.length()-1);

        String result = last +" "+ str.charAt(1)+" " + first;
        System.out.println(result);
    }
}
