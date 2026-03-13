package array;

public class MatchUp {
    public static int matchUp(int[] v1, int[] v2){
        if(v1.length < v2.length){
            return 0;
        }
        int dim = v1.length;
        int count = 0;
        for(int i = 0; i < dim; i++){
            if(v1[i] != v2[i] && Math.abs(v1[i] - v2[i]) <= 2){
                count++;
            }
        }
        return count;
    }
}
