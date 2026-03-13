package array;

public class FizzBuzz {
    public static String[] fizzBuzz(int start, int end){
        if(start >= end || start < 0){
            return new String[] {};
        }
        int pos = 0;
        String[] s = new String[end - start];

        for(int i = start; i < end; i++){
            if(i % 3 == 0 && i % 5 == 0){
                s[pos] = "FizzBuzz";
            }
            else if(i % 3 == 0){
                s[pos] = "Fizz";
            }
            else if(i % 5 == 0){
                s[pos] = "Buzz";
            }
            else{
                s[pos] = Integer.toString(i);
            }
            pos++;
        }
        return s;
    }
}
