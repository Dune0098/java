package array;

public class TenRun {
    public static int[] tenRun(int[] v){
        int start = 10;
        for(int i = 0; i < v.length; i++){
            if(v[i] == start){
                while(i < v.length && v[i] != start * 2){
                    v[i++] = start;
                }
                i--;
                start *= 2;
            }
        }
        return v;
    }
}
