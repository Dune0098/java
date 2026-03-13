package strings;

public class RemoveFirstTwoCharsIf {
    public static String removeFirstTwoCharsIfCharAt(String string) {
        StringBuilder sb = new StringBuilder();
        int x = string.length();
        if(x == 0){
            return "";
        }
        if(string.charAt(0) == 'H'){
            sb.append(string.charAt(0));
        }
        if(x > 1) {
            if (string.charAt(1) == 'e') {
                sb.append(string.charAt(1));
            }
            for (int i = 2; i < x; i++) {
                sb.append(string.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String removeFirstTwoCharsIfStringBuilder(String string){
        StringBuilder sb = new StringBuilder(string);
        if(sb.length() > 1 && sb.charAt(1) != 'e'){
            sb.deleteCharAt(1);
        }
        if(!sb.isEmpty() && sb.charAt(0) != 'H') {
            sb.deleteCharAt(0);
        }
        return  sb.toString();
    }
}


