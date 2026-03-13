package array;

public class Splitter {
    public static int[] splitter(int input){
        /*int i = 0;
        int tmp = input;
        while(tmp > 0){
            tmp /= 10;
            i++;
        }
        int[] res = new int[i];
        i--;
        while(input > 0){
            res[i--] = input % 10;
            input /= 10;
        }
        return  res;*/

        String s = Integer.toString(input);
        int[] res = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            res[i] = Character.getNumericValue(s.charAt(i));
        }
        return  res;
    }
}
