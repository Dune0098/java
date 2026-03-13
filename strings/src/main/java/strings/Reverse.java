package strings;

public class Reverse {
    public static String reverseCharAt(String string){
        int x = string.length() - 1;
        StringBuilder res = new StringBuilder();
        for(int i = x; i >= 0; i--){
            res.append(string.charAt(i));
        }
        return res.toString();
    }

    public static String reverseStringBuilder(String string){
        /*StringBuilder sb = new StringBuilder(string);
        StringBuilder rev = sb.reverse();
        return rev.toString();*/
        return new StringBuilder(string).reverse().toString();
    }
}
