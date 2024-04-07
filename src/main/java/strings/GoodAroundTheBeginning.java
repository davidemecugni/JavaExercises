package strings;

public class GoodAroundTheBeginning {
    public static boolean goodAroundTheBeginning(String string){
        if(string.length() < 4){
            return false;
        }
        return string.startsWith("good") || string.startsWith("good", 1);
    }
}
