package array;

public class CopyArray {
    public static double[] copyArray(double[] v){
        double[] res = new double[v.length];
        System.arraycopy(v, 0, res, 0, v.length);
        return  res;
    }
}
