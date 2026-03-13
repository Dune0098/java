package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    /*main CopyArray
    public static void main(String[] args) {
        double[] res = CopyArray.copyArray(new double[] {1,2,3});
        System.out.println(Arrays.toString(res));

        res = CopyArray.copyArray(new double[] {1.4,2.2,3.6});
        System.out.println(Arrays.toString(res));

        res = CopyArray.copyArray(new double[] {16,21,11.2,12,14.8954});
        System.out.println(Arrays.toString(res));
    }*/

    /*main FillArray
    public static void main(String[] args) {
        double[] res = FillArray.fillArray(3,0,false);
        System.out.println(Arrays.toString(res));

        res = FillArray.fillArray(5,1,false);
        System.out.println(Arrays.toString(res));

        res = FillArray.fillArray(5, 1, true);
        System.out.println(Arrays.toString(res));

        res = FillArray.fillArray(3, 100, true);
        System.out.println(Arrays.toString(res));
    }*/

    /*main DivideArray
    public static void main(String[] args) {
        System.out.println();
        double[] res = {1,12,11,2,3,4,5};
        System.out.println(Arrays.toString(res));
    }*/

    /*
    Main DivideArrays
    public static void main(String[] args) {
        double[] res = {1,12,11,2,3,4,5};
        double[] res1 = {1,12,11,2,3,4,5};
        res = DivideArrays.divideArrays(res, res1);
        System.out.println(Arrays.toString(res));

    }*/

    /*main Fibonacci
    public static void main(String[] args) {
        long[] res = Fibonacci.fibonacci(20);
        System.out.println(Arrays.toString(res));
    }*/

    /*main BubbleSort
    public static void main(String[] args) {
        int[] arr = new int[] {6, 3, 4, 2, 8, 12, 22, 1};
        //BubbleSort.bubbleSort(arr);
        int[] res = BubbleSort.bubbleSortCopy(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(res));
    }*/

    /*main MoveZeroEnd
    public static void main(String[] args) {
        int[] res = MoveZeroEnd.moveZerosEnd(new int[] {0,0,4,2});
        System.out.println(Arrays.toString(res));
    }*/

    /*main Splitter
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Splitter.splitter(123564)));
    }*/

    /*main TenRun
    public static void main(String[] args) {
        System.out.println(Arrays.toString(TenRun.tenRun(new int[] {10, 1, 9, 20})));
    }*/

    //main FizzBuzz
    public static void main(String[] args) {
        System.out.println((Arrays.toString(FizzBuzz.fizzBuzz(-4,-2))));
    }

    /*Main MatchUp
    public static void main(String[] args) {
        System.out.println((MatchUp.matchUp(new int[] {1,2,3}, new int[] {2,3,3})));
    }*/

    /*public static void main(String[] args) {
        System.out.println(CanBalance.canBalance(new int[] {1,1,1,2,1}));
        System.out.println(CanBalance.canBalance(new int[] {2, 1, 1, 2, 1}));
        System.out.println(CanBalance.canBalance(new int[] {10, 10}));
    }*/

    /*Main SearchArray
    public static void main(String[] args) {
        System.out.println(SearchArray.containsBruteForce(new String[] {"car", "boat", "bike", "plane"}, "bike"));
        System.out.println(SearchArray.containsBruteForce(new String[] {"car", "boat", "bike", "plane"}, "dog"));
        System.out.println(SearchArray.containsBruteForce(new String[] {"car", "boat",
                "bike", "plane"}, "helicopter"));

        System.out.println(SearchArray.containsBinary(new String[] {"car", "boat", "bike", "plane"}, "bike"));
        System.out.println(SearchArray.containsBinary(new String[] {"car", "boat", "bike", "plane"}, "dog"));
        System.out.println(SearchArray.containsBinary(new String[] {"car", "boat",
                "bike", "plane"}, "plane"));

    }*/

    //Main DeepCopy
    /*public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}};
        int[][] res = DeepCopy.deepCopy(arr);
        System.out.println(Arrays.deepToString(res));
        System.out.println(Arrays.deepToString(arr));
    }*/

    /*Main isEveryWhere
    public static void main(String[] args) {
        System.out.println(IsEveryWhere.isEveryWhere(new int[] {1,2,1,3,}, 1));
    }*/
}
