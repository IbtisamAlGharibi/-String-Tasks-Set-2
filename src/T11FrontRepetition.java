public class T11FrontRepetition {
    public static void main(String[] args){

        String str = "Chocolate";
        int n = 4;

        String front = str.substring(0,n);

        for (int i =0; i<n ; i++){
            System.out.println(front);
        }
    }
}
