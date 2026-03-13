/*
[GoodAtTheBeginning.java] Write a method accepting a string and returning a boolean value.
The function returns true if "good" appears at the beginning of the string (see String.charAt() method).
*/

package strings;

public class GoodAtTheBeginning {
    public static boolean goodAtTheBeginning(String s){
        if(s.length() < 4){
            return false;
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString().equals("good");
        // return s.startsWith("good");
    }
}
