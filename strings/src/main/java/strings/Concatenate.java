package strings;

public class Concatenate {
    /*
 versione inefficiente che consuma un sacco di memoria
    public static String concatenate(String[] strings){
       String concat = "";
        for (String string : strings) {
            concat += string;
        }
        return concat;
    }
*/
    public static String concatenate(String[] strings){
        StringBuilder concat = new StringBuilder();
        for (String string : strings) {
            concat.append(string);
        }
        return concat.toString();
    }
}
