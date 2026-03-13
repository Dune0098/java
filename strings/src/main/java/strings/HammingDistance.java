package strings;

public class HammingDistance {
    public static int hammingDistance(String s1, String s2){
        int dim = s1.length();
        if(dim != s2.length()){
            return -1;
        }
        int distance = 0;
        for(int i = 0; i < dim; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                distance++;
            }
        }
        return distance;
    }
}
