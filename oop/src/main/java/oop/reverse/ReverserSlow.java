package oop.reverse;

public class ReverserSlow {
    static String reverserSlow(String s){
        char[] rev = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            rev[i] = s.charAt(s.length() - i - 1);
        }
        return String.valueOf(rev);
    }
}
