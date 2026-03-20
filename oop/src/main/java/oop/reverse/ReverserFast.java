package oop.reverse;

public class ReverserFast {
    static String reverseFast(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
