package array;

import java.util.Arrays;

public class DeepCopy {
    public static int[][] deepCopy(int[][] original){
        int[][] cpy = new int[original.length][];
        for (int i = 0; i < original.length; i++) {
            cpy[i] = Arrays.copyOf(original[i], original[i].length);
        }
        return cpy;
    }
}
