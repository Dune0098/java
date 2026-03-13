package array;

public class BubbleSort {
    public static void bubbleSort(int[] v){
        int dim = v.length;
        for(int i = 0; i < dim - 1; i++){
            for(int j = 0; j < dim - i - 1; j++){
                if(v[j] > v[j + 1]){
                    int tmp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = tmp;
                }
            }
        }
    }
    public static int[] bubbleSortCopy(int[] v){
        int dim = v.length;
        int[] arr = new int[dim];
        System.arraycopy(v, 0, arr, 0, dim);
        for(int i = 0; i < dim - 1; i++){
            for(int j = 0; j < dim - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }
}
