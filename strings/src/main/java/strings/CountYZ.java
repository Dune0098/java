package strings;

import java.util.Locale;
import java.util.StringTokenizer;

public class CountYZ {
    public static int countYZ(String string){
        int count = 0;
        StringTokenizer st = new StringTokenizer(string);
        while(st.hasMoreTokens()){
            String tmp = st.nextToken().toLowerCase();
            if(tmp.endsWith("z") ||  tmp.endsWith("y")){
                count++;
            }
        }
        return count;
    }
}
