package array;

public class CanBalance {
    public static boolean canBalance(int[] v){
        for (int i = 0; i < v.length; i++) {
            int sum1 = 0;
            for(int j = 0; j < i; j++){
                sum1 += v[j];
            }
            int sum2 = 0;
            for (int j = i; j < v.length; j++) {
                sum2 += v[j];
            }

            if(sum2 == sum1){
                return true;
            }
        }

        return false;
    }
}
