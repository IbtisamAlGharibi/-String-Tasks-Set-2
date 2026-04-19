public class T3CatDogCounter {
    public static void main(String[] args){
        String str = "catdog";
        int catCount=0;
        int dogCount=0;

        for (int i=0; i < str.length()-1; i++){

            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't') {
                catCount++;
            }
            if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'g'){
                dogCount++;
            }
        }

        if (catCount == dogCount){
            System.out.println("True");

        }else {
            System.out.println("False");
        }


    }
}
