package strings;

public class EqualIsNot {
    public static boolean equalIsNot(String string){
        /*if(string == null || string.isEmpty()){
            return true;
        }

        int cnot = 0, cis = 0, i = 0;
        while(true){
            i = string.indexOf("not", i);
            if(i == -1){
                break;
            }
            cnot++;
            i += 1;
        }
        i = 0;
        while(true){
            i = string.indexOf("is", i);
            if(i == -1){
                break;
            }
            i += 1;
            cis++;
        }
        return cnot == cis;*/
        // Prof solution is smarter
        if (string == null || string.isEmpty()) {
            return true;
        }

        int indexIs = string.indexOf("is");
        int indexNot = string.indexOf("not");
        while (indexIs != -1 && indexNot != -1) {
            indexIs = string.indexOf("is", indexIs + 2);
            indexNot = string.indexOf("not", indexNot + 3);
        }
        return indexIs == indexNot;
    }
}
