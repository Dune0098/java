package strings;

public class GoodAroundTheBeginning {
    public static boolean goodAroundTheBeginning(String s){
        if(s.startsWith("good")){
            return true;
        }
        return s.startsWith("good", 1);
    }
}
