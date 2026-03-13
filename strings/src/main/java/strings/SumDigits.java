package strings;

import com.sun.jdi.CharValue;

public class SumDigits {
    public static int sumDigits(String string){
       /* int sum = 0;
        int dim = string.length();
        for (int i = 0; i < dim; i++) {
            if(Character.isDigit(string.charAt(i))){
                sum += Character.getNumericValue(string.charAt(i));
            }
        }
        return  sum;*/
        int sum = 0;
        for(char c : string.toCharArray()){
            if(Character.isDigit(c)){
                sum += c - '0';
            }
        }
        return sum;
    }
}
