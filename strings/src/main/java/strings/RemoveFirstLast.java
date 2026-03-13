package strings;

public class RemoveFirstLast {
    public static String removeFirstLast(String s){
        int dim = s.length();
        if(dim > 1){
            if(s.charAt(0) == s.charAt(dim - 1)){
                return s.substring(1, dim - 1);
            }
        }
        return  s;
    }
}
