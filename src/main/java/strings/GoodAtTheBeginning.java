package strings;

public class GoodAtTheBeginning {
    public static boolean goodAtTheBeginning(String string){
        if(string.length() < 4){
            return false;
        }
        return string.startsWith("good");
    }
}
