package strings;

public class Palindrome {
    public static boolean isPalindrome(String s){
        /*s = s.toLowerCase();
        int dim = s.length();
        for(int i = 0; i < dim / 2; i++){
            if(s.charAt(i) != s.charAt(dim - i - 1)){
                return false;
            }
        }
        return true;*/

        String reverse = new StringBuilder(s).reverse().toString();
        return reverse.equalsIgnoreCase(s);
    }
}
