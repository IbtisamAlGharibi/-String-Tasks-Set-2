public class T15Sandwich {
    public static void main(String[] args){
        String str = "breadjambread";
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");

        String middle =str.substring(first +5,last);
        System.out.println(middle);



    }
}
