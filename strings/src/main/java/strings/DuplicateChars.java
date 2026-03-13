package strings;

public class DuplicateChars {
    // Prof solution in the git repository more efficient
    public static char[] duplicateChars(String input){
        int dim = input.length();
        StringBuilder recurring = new StringBuilder();
        for (int i = 0; i < dim; i++) {
            String tmp = input.substring(i, i + 1);
            // String tmp = String.valueOf(input.charAt(i));
            for(int j = i + 1; j < dim; j++){
                if(input.charAt(i) == input.charAt(j)){
                    if(!recurring.toString().contains(tmp)){
                        recurring.append(input.charAt(i));
                    }
                }
            }
        }
        char[] res =  recurring.toString().toCharArray();
        java.util.Arrays.sort(res);
        return res;
    }
}
