public class T14XyzMiddle {
    public static void main(String[] args){
        String str = "AAxyzBB";
        String prefix = "xyz";

        boolean found = false;
        for (int i = 0; i <= str.length() - 3; i++){
            if (str.substring(i, i + 3).equals(prefix)){

                int left = i;
                int right = str.length() - (i + 3);

                if (Math.abs(left - right) <= 1){
                    found = true;
                    break;
                }
            }
        }

        System.out.println(found);

    }
}
