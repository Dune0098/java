package array;

public class Fibonacci {
    public static long[] fibonacci(int n){
        if(n <= 0){
            return  null;
        }

        long[] res = new long[n];
        res[0] = 0;
        if(n > 1) {
            res[1] = 1;
            for (int i = 2; i < n; i++) {
                res[i] = res[i - 1] + res[i - 2];
            }
        }

        return res;
    }
}
