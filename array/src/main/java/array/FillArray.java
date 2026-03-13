package array;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class FillArray {
    public static double[] fillArray(int size, double value, boolean addNoise){
        double[] res = new double[size];
        Arrays.fill(res, value);
        if(addNoise){
            RandomGenerator rnd = RandomGenerator.getDefault();
            for (int i = 0; i < size; i++) {
                res[i] += rnd.nextDouble(-value, value) * .05;
            }
        }

        return  res;
    }
}
