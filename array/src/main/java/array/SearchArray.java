package array;
import java.util.Arrays;

public class SearchArray {
    public static boolean containsBruteForce(String[] strings, String searched){
        for(String s : strings){
            if(s.equals(searched)){
                return true;
            }
        }

        return  false;
    }
    public static boolean containsBinary(String[] strings, String searched){
        String[] cpy = new String[strings.length];
        System.arraycopy(strings, 0, cpy, 0, strings.length);
        Arrays.sort(cpy);
        return Arrays.binarySearch(cpy, searched) >= 0;
    }
}
