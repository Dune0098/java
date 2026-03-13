package array;

public class MoveZeroEnd {
    public static int[] moveZerosEnd(int[] v){
        int dim = v.length;
        int[] arr = new int[dim];
        int j = 0;
        for (int a : v) {
            if(a != 0){
                arr[j++] = a;
            }
        }
        return  arr;
    }
}
