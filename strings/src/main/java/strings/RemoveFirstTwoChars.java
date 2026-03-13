package strings;

public class RemoveFirstTwoChars {
    public static String removeFirstTwoCharsCharAt(String string){
        StringBuilder sb = new StringBuilder();
        int x = string.length();
        for(int i = 2; i < x; i++){
            sb.append(string.charAt(i));
        }
        return sb.toString();
    }
    public static String removeFirstTwoCharsStringBuilder(String string) {
        /*StringBuilder sb = new StringBuilder(string);
        sb.delete(0, 2);
        return sb.toString();*/
        return new StringBuilder(string).delete(0, 2).toString();
    }
}
